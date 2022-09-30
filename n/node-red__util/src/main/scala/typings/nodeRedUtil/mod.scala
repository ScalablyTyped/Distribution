package typings.nodeRedUtil

import org.scalablytyped.runtime.Shortcut
import typings.jsonata.mod.Expression
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.nodeRedRegistry.mod.NodeMessage
import typings.nodeRedUtil.anon.Format
import typings.nodeRedUtil.anon.Id
import typings.nodeRedUtil.anon.IdNode
import typings.nodeRedUtil.anon.Key
import typings.nodeRedUtil.anon.MaxLength
import typings.nodeRedUtil.anon.Msg
import typings.nodeRedUtil.anon.Node
import typings.nodeRedUtil.nodeRedUtilBooleans.`false`
import typings.nodeRedUtil.nodeRedUtilStrings.onComplete
import typings.nodeRedUtil.nodeRedUtilStrings.onReceive
import typings.nodeRedUtil.nodeRedUtilStrings.onSend
import typings.nodeRedUtil.nodeRedUtilStrings.postDeliver
import typings.nodeRedUtil.nodeRedUtilStrings.postInstall
import typings.nodeRedUtil.nodeRedUtilStrings.postReceive
import typings.nodeRedUtil.nodeRedUtilStrings.postUninstall
import typings.nodeRedUtil.nodeRedUtilStrings.preDeliver
import typings.nodeRedUtil.nodeRedUtilStrings.preInstall
import typings.nodeRedUtil.nodeRedUtilStrings.preRoute
import typings.nodeRedUtil.nodeRedUtilStrings.preUninstall
import typings.std.PromiseLike
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@node-red/util", JSImport.Namespace)
  @js.native
  val ^ : UtilModule = js.native
  
  trait CompleteEvent extends StObject {
    
    var error: js.UndefOr[js.Error] = js.undefined
    
    var msg: NodeMessage
    
    var node: IdNode
  }
  object CompleteEvent {
    
    inline def apply(msg: NodeMessage, node: IdNode): CompleteEvent = {
      val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompleteEvent]
    }
    
    extension [Self <: CompleteEvent](x: Self) {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setMsg(value: NodeMessage): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      inline def setNode(value: IdNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  // Used `boolean` in PromiseLike instead of `false` because it caused problems with `async` functions
  type HandlerFunction[T] = js.Function2[
    /* payload */ T, 
    /* callback */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
    Unit | `false` | (PromiseLike[Unit | Boolean])
  ]
  
  // tslint:disable-line:void-return
  @js.native
  trait Hooks extends StObject {
    
    // tslint:disable-line:unified-signatures
    /**
      * Register a new hook handler.
      *
      * @see https://nodered.org/docs/api/hooks/#methods-add
      */
    def add(hookName: String, handlerFunction: HandlerFunction[Any]): Unit = js.native
    // tslint:disable-line:unified-signatures
    /**
      * A node has completed with a message or logged an error for it.
      *
      * The hook is passed a `CompleteEvent`.
      */
    @JSName("add")
    def add_onComplete(hookName: onComplete, handlerFunction: HandlerFunction[CompleteEvent]): Unit = js.native
    // tslint:disable-line:unified-signatures
    /**
      * A message is about to be received by a node.
      *
      * The hook is passed a `ReceiveEvent`.
      *
      * If the hook returns `false`, the messages will not proceed any further.
      */
    @JSName("add")
    def add_onReceive(hookName: onReceive, handlerFunction: HandlerFunction[ReceiveEvent]): Unit = js.native
    /**
      * A node has called `node.send()` with one or more messages.
      *
      * The hook is passed an array of `SendEvent` objects.
      * The messages inside these objects are exactly what the node has passed to `node.send`
      * - meaning there could be duplicate references to the same message object.
      *
      * This hook should complete synchronously in order to avoid unexpected behaviour.
      *
      * If it needs to do asynchronously work, it must clone and replace the message object in the event it receives.
      * It must also set the `cloneMessage` property to `false` to ensure no subsequent cloning happens on the message.
      *
      * If the hook returns `false`, the messages will not proceed any further.
      */
    @JSName("add")
    def add_onSend(hookName: onSend, hookHandler: HandlerFunction[js.Array[SendEvent]]): Unit = js.native
    // tslint:disable-line:unified-signatures
    /**
      * A message has been dispatched to its destination.
      *
      * The hook is passed a single `SendEvent`. The message is delivered asynchronously to the hooks execution.
      */
    @JSName("add")
    def add_postDeliver(hookName: postDeliver, handlerFunction: HandlerFunction[SendEvent]): Unit = js.native
    /**
      * Called after `npm install` finishes installing an npm module.
      *
      * Note if a `preInstall` hook returned `false`, `npm install` will not have been run, but this hook will still get invoked.
      *
      * This hook can be used to run any post-install activity needed.
      *
      * If the hook throws an error, the install will be cleanly failed.
      *
      * If the preceding `npm install` returned an error, this hook will not be invoked.
      */
    @JSName("add")
    def add_postInstall(hookName: postInstall, handlerFunction: HandlerFunction[InstallEvent]): Unit = js.native
    /**
      * A message has been received by a node.
      *
      * The hook is passed `ReceiveEvent` when the message has been given to the node’s `input` handler.
      */
    @JSName("add")
    def add_postReceive(hookName: postReceive, handlerFunction: HandlerFunction[ReceiveEvent]): Unit = js.native
    /**
      * Called after `npm remove` finishes removing an npm module.
      *
      * Note if a `preUninstall` hook returned `false`, `npm remove` will not have been run, but this hook will still get invoked.
      *
      * This hook can be used to run any post-uninstall activity needed.
      *
      * If the hook throws an error, it will be logged, but the uninstall will complete cleanly as we cannot rollback an `npm remove` after it has completed.
      */
    @JSName("add")
    def add_postUninstall(hookName: postUninstall, handlerFunction: HandlerFunction[UninstallEvent]): Unit = js.native
    /**
      * A message is about to be delivered
      *
      * The hook is passed a single `SendEvent`.
      * At this point, the local router has identified the node it is going to send to and set the `destination.node` property of the `SendEvent`.
      *
      * The message will have been cloned if needed.
      *
      * If the hook returns `false`, the messages will not proceed any further.
      */
    @JSName("add")
    def add_preDeliver(hookName: preDeliver, handlerFunction: HandlerFunction[SendEvent]): Unit = js.native
    /**
      * Called before running `npm install` to install an npm module.
      *
      * The hook is passed an `InstallEvent` object that contains information about the module to be installed.
      *
      * The hook can modify the InstallEvent to change how npm is run.
      * For example, the `args` array can be modified to change what arguments are passed to `npm`.
      *
      * If the hook returns `false`, the `npm install` will be skipped and the processing continue as if it had been run.
      * This would allow some alternative mechanism to be used - as long as it results in the module being installed under the expected `node_modules` directory.
      *
      * If the hook throws an error, the install will be cleanly failed.
      */
    @JSName("add")
    def add_preInstall(hookName: preInstall, handlerFunction: HandlerFunction[InstallEvent]): Unit = js.native
    /**
      * A message is about to be routed to its destination.
      *
      * The hook is passed a single `SendEvent`.
      *
      * This hook should complete synchronously in order to avoid unexpected behaviour.
      *
      * If it needs to do asynchronously work, it must clone and replace
      * the message object in the event it receives.
      * It must also set the `cloneMessage` property to `false` to ensure no subsequent cloning happens on the message.
      *
      * If the hook returns `false`, the message will not proceed any further.
      */
    @JSName("add")
    def add_preRoute(hookName: preRoute, handlerFunction: HandlerFunction[SendEvent]): Unit = js.native
    // tslint:disable-line:unified-signatures
    /**
      * Called before running `npm remove` to uninstall an npm module.
      *
      * The hook is passed an `UninstallEvent` object that contains information about the module to be removed.
      *
      * The hook can modify the UninstallEvent to change how npm is run.
      * For example, the args array can be modified to change what arguments are passed to npm.
      *
      * If the hook returns false, the npm remove will be skipped and the processing continue as if it had been run.
      * This would allow some alternative mechanism to be used.
      *
      * If the hook throws an error, the uninstall will be cleanly failed.
      */
    @JSName("add")
    def add_preUninstall(hookName: preUninstall, handlerFunction: HandlerFunction[UninstallEvent]): Unit = js.native
    
    def has(hookName: String): Boolean = js.native
    
    /**
      * Remove a hook handler.
      *
      * Only handlers that were registered with a labelled name (for example `onSend.my-hooks`) can be removed.
      *
      * To remove all hooks with a given label, `*.my-hooks` can be used.
      */
    def remove(hookName: String): Unit = js.native
  }
  
  // tslint:disable-next-line:interface-name
  trait I18n extends StObject {
    
    /**
      * Perform a message catalog lookup.
      */
    @JSName("_")
    def _underscore(id: String): String
    @JSName("_")
    def _underscore(id: String, tplStrs: Record[String, String | Double]): String
    /**
      * Perform a message catalog lookup.
      */
    @JSName("_")
    var _underscore_Original: I18nTFunction
    
    /**
      * Gets a list of languages a given catalog is available in.
      */
    def availableLanguages(namespace: String): js.Array[String]
    
    /**
      * Gets a message catalog.
      */
    def catalog(namespace: String, lang: String): MessageCatalog
    
    /**
      * Register a message catalog with i18n.
      */
    def registerMessageCatalog(namespace: String, dir: String, file: String): js.Promise[Unit]
    
    /**
      * Register multiple message catalogs with i18n.
      */
    def registerMessageCatalogs(catalogs: js.Array[MessageCatalog]): js.Promise[js.Array[js.Object]]
  }
  object I18n {
    
    inline def apply(
      _underscore: (/* id */ String, /* tplStrs */ js.UndefOr[Record[String, String | Double]]) => String,
      availableLanguages: String => js.Array[String],
      catalog: (String, String) => MessageCatalog,
      registerMessageCatalog: (String, String, String) => js.Promise[Unit],
      registerMessageCatalogs: js.Array[MessageCatalog] => js.Promise[js.Array[js.Object]]
    ): I18n = {
      val __obj = js.Dynamic.literal(availableLanguages = js.Any.fromFunction1(availableLanguages), catalog = js.Any.fromFunction2(catalog), registerMessageCatalog = js.Any.fromFunction3(registerMessageCatalog), registerMessageCatalogs = js.Any.fromFunction1(registerMessageCatalogs))
      __obj.updateDynamic("_")(js.Any.fromFunction2(_underscore))
      __obj.asInstanceOf[I18n]
    }
    
    extension [Self <: I18n](x: Self) {
      
      inline def setAvailableLanguages(value: String => js.Array[String]): Self = StObject.set(x, "availableLanguages", js.Any.fromFunction1(value))
      
      inline def setCatalog(value: (String, String) => MessageCatalog): Self = StObject.set(x, "catalog", js.Any.fromFunction2(value))
      
      inline def setRegisterMessageCatalog(value: (String, String, String) => js.Promise[Unit]): Self = StObject.set(x, "registerMessageCatalog", js.Any.fromFunction3(value))
      
      inline def setRegisterMessageCatalogs(value: js.Array[MessageCatalog] => js.Promise[js.Array[js.Object]]): Self = StObject.set(x, "registerMessageCatalogs", js.Any.fromFunction1(value))
      
      inline def set_underscore(value: (/* id */ String, /* tplStrs */ js.UndefOr[Record[String, String | Double]]) => String): Self = StObject.set(x, "_", js.Any.fromFunction2(value))
    }
  }
  
  // tslint:disable-next-line:interface-name
  type I18nTFunction = js.Function2[/* id */ String, /* tplStrs */ js.UndefOr[Record[String, String | Double]], String]
  
  trait InstallEvent extends StObject {
    
    /** Array of args that will be passed to npm */
    var args: js.Array[String]
    
    /** Directory to run the install in */
    var dir: String
    
    var isExisting: js.UndefOr[Boolean] = js.undefined
    
    var isUpgrade: js.UndefOr[Boolean] = js.undefined
    
    /** npm module name */
    var module: String
    
    /** Optional url to install from */
    var url: js.UndefOr[String] = js.undefined
    
    /** Version of the module that is being installed */
    var version: String
  }
  object InstallEvent {
    
    inline def apply(args: js.Array[String], dir: String, module: String, version: String): InstallEvent = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstallEvent]
    }
    
    extension [Self <: InstallEvent](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setIsExisting(value: Boolean): Self = StObject.set(x, "isExisting", value.asInstanceOf[js.Any])
      
      inline def setIsExistingUndefined: Self = StObject.set(x, "isExisting", js.undefined)
      
      inline def setIsUpgrade(value: Boolean): Self = StObject.set(x, "isUpgrade", value.asInstanceOf[js.Any])
      
      inline def setIsUpgradeUndefined: Self = StObject.set(x, "isUpgrade", js.undefined)
      
      inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Log extends StObject {
    
    /** Audit level */
    val AUDIT: Double = js.native
    
    /** Debug level */
    val DEBUG: Double = js.native
    
    /** Error level */
    val ERROR: Double = js.native
    
    /** Fatal level */
    val FATAL: Double = js.native
    
    /** Info level */
    val INFO: Double = js.native
    
    /** Metric level */
    val METRIC: Double = js.native
    
    /** Trace level */
    val TRACE: Double = js.native
    
    /** Warn level */
    val WARN: Double = js.native
    
    /**
      * Perform a message catalog lookup.
      */
    @JSName("_")
    def _underscore(id: String): String = js.native
    @JSName("_")
    def _underscore(id: String, tplStrs: Record[String, String | Double]): String = js.native
    /**
      * Perform a message catalog lookup.
      */
    @JSName("_")
    var _underscore_Original: I18nTFunction = js.native
    
    /**
      * Add a log handler
      * @param - event emitter with `(msg: LogMessageObject) => void` listener on `log` events
      */
    def addHandler(handler: EventEmitter): Unit = js.native
    
    /**
      * Log an audit event.
      */
    def audit(msg: LogMessageObject): Unit = js.native
    def audit(msg: LogMessageObject, req: js.Object): Unit = js.native
    
    /**
      * Log a message at DEBUG level
      */
    def debug(msg: LogMessage): Unit = js.native
    
    /**
      * Log a message at ERROR level
      */
    def error(msg: LogMessage): Unit = js.native
    
    /**
      * Log a message at INFO level
      */
    def info(msg: LogMessage): Unit = js.native
    
    /**
      * Log a message object
      */
    def log(msg: LogMessageObject): Unit = js.native
    
    /**
      * Check if metrics are enabled
      */
    def metric(): Boolean = js.native
    
    /**
      * Remove a log handler
      */
    def removeHandler(handler: EventEmitter): Unit = js.native
    
    /**
      * Log a message at TRACE level
      */
    def trace(msg: LogMessage): Unit = js.native
    
    /**
      * Log a message at WARN level
      */
    def warn(msg: LogMessage): Unit = js.native
  }
  
  type LogMessage = Any
  
  trait LogMessageObject extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var level: Double
    
    var msg: js.UndefOr[LogMessage] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object LogMessageObject {
    
    inline def apply(level: Double): LogMessageObject = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogMessageObject]
    }
    
    extension [Self <: LogMessageObject](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMsg(value: LogMessage): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      inline def setMsgUndefined: Self = StObject.set(x, "msg", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait MessageCatalog extends StObject {
    
    var dir: String
    
    var file: String
    
    var namespace: String
  }
  object MessageCatalog {
    
    inline def apply(dir: String, file: String, namespace: String): MessageCatalog = {
      val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageCatalog]
    }
    
    extension [Self <: MessageCatalog](x: Self) {
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReceiveEvent extends StObject {
    
    var destination: IdNode
    
    var msg: NodeMessage
  }
  object ReceiveEvent {
    
    inline def apply(destination: IdNode, msg: NodeMessage): ReceiveEvent = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiveEvent]
    }
    
    extension [Self <: ReceiveEvent](x: Self) {
      
      inline def setDestination(value: IdNode): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setMsg(value: NodeMessage): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    }
  }
  
  //#region Hook Event Objects
  trait SendEvent extends StObject {
    
    var cloneMessage: Boolean
    
    var destination: Node
    
    var msg: NodeMessage
    
    var source: Id
  }
  object SendEvent {
    
    inline def apply(cloneMessage: Boolean, destination: Node, msg: NodeMessage, source: Id): SendEvent = {
      val __obj = js.Dynamic.literal(cloneMessage = cloneMessage.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendEvent]
    }
    
    extension [Self <: SendEvent](x: Self) {
      
      inline def setCloneMessage(value: Boolean): Self = StObject.set(x, "cloneMessage", value.asInstanceOf[js.Any])
      
      inline def setDestination(value: Node): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setMsg(value: NodeMessage): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Id): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait UninstallEvent extends StObject {
    
    /** Array of args that will be passed to npm */
    var args: js.Array[String]
    
    /** Directory to run the remove in */
    var dir: String
    
    /** npm module name */
    var module: String
  }
  object UninstallEvent {
    
    inline def apply(args: js.Array[String], dir: String, module: String): UninstallEvent = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
      __obj.asInstanceOf[UninstallEvent]
    }
    
    extension [Self <: UninstallEvent](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Util extends StObject {
    
    /**
      * Safely clones a message object. This handles msg.req/msg.res objects that must
      * not be cloned.
      *
      * @param msg - the message object to clone
      * @returns the cloned message
      */
    def cloneMessage[T /* <: NodeMessage */](msg: T): T = js.native
    
    /**
      * Compares two objects, handling various JavaScript types.
      *
      * @param obj1
      * @param obj2
      * @returns whether the two objects are the same
      */
    def compareObjects(obj1: js.Object, obj2: js.Object): Boolean = js.native
    
    /**
      * Encode an object to JSON without losing information about non-JSON types
      * such as Buffer and Function.
      *
      * *This function is closely tied to its reverse within the editor*
      *
      * @param msg
      * @param opts
      * @returns the encoded object
      */
    def encodeObject(msg: Msg): Format = js.native
    def encodeObject(msg: Msg, opts: MaxLength): Format = js.native
    
    /**
      * Converts the provided argument to a Buffer, using type-dependent
      * methods.
      *
      * @param o - the property to convert to a Buffer
      * @returns the Buffer version
      */
    def ensureBuffer(o: Any): Buffer = js.native
    
    /**
      * Converts the provided argument to a String, using type-dependent
      * methods.
      *
      * @param o - the property to convert to a String
      * @returns the stringified version
      */
    def ensureString(o: Any): String = js.native
    
    /**
      * Checks if a String contains any Environment Variable specifiers and returns
      * it with their values substituted in place.
      *
      * For example, if the env var `WHO` is set to `Joe`, the string `Hello ${WHO}!`
      * will return `Hello Joe!`.
      * @param value - the string to parse
      * @param node - the node evaluating the property
      * @returns The parsed string
      */
    def evaluateEnvProperty(value: String, node: typings.nodeRedRegistry.mod.Node[js.Object]): String = js.native
    
    /**
      * Evaluates a JSONata expression.
      * The expression must have been prepared with `prepareJSONataExpression`
      * before passing to this function.
      *
      * @param   expr     - the prepared JSONata expression
      * @param   msg      - the message object to evaluate against
      * @param   callback - (optional) called when the expression is evaluated
      * @returns If no callback was provided, the result of the expression
      */
    def evaluateJSONataExpression(expr: Expression, msg: js.Object): Any = js.native
    def evaluateJSONataExpression(
      expr: Expression,
      msg: js.Object,
      callback: js.Function2[/* err */ js.Error | Null, /* resp */ Any, Unit]
    ): Unit = js.native
    
    /**
      * Evaluates a property value according to its type.
      *
      * @param   value    - the raw value
      * @param   type     - the type of the value
      * @param   node     - the node evaluating the property
      * @param   msg      - the message object to evaluate against
      * @param   callback - (optional) called when the property is evaluated
      * @returns The evaluted property, if no `callback` is provided
      */
    def evaluateNodeProperty(value: String, `type`: String, node: typings.nodeRedRegistry.mod.Node[js.Object], msg: js.Object): Any = js.native
    def evaluateNodeProperty(
      value: String,
      `type`: String,
      node: typings.nodeRedRegistry.mod.Node[js.Object],
      msg: js.Object,
      callback: js.Function2[/* err */ js.Error | Null, /* result */ Any, Unit]
    ): Unit = js.native
    
    /**
      * Generates a psuedo-unique-random id.
      * @returns a random-ish id
      */
    def generateId(): String = js.native
    
    /**
      * Gets a property of a message object.
      *
      * Unlike `getObjectProperty`, this function will strip `msg.` from the
      * front of the property expression if present.
      *
      * @param msg - the message object
      * @param expr - the property expression
      * @returns the message property, or undefined if it does not exist
      */
    def getMessageProperty(msg: js.Object, expr: String): Any = js.native
    
    /**
      * Gets a property of an object.
      *
      * @param msg - the object
      * @param expr - the property expression
      * @returns the object property, or undefined if it does not exist
      */
    def getObjectProperty(msg: js.Object, expr: String): Any = js.native
    
    /**
      * Get value of environment variable.
      * @param node - accessing node
      * @param name - name of variable
      * @returns value of env var
      */
    def getSetting(node: typings.nodeRedRegistry.mod.Node[js.Object], name: String): String = js.native
    
    /**
      * Normalise a node type name to camel case.
      *
      * For example: `a-random node type` will normalise to `aRandomNodeType`
      *
      * @param name - the node type
      * @returns The normalised name
      */
    def normaliseNodeTypeName(name: String): String = js.native
    
    /**
      * Parses a property expression, such as `msg.foo.bar[3]` to validate it
      * and convert it to a canonical version expressed as an Array of property
      * names.
      *
      * For example, `a["b"].c` returns `['a','b','c']`
      *
      * @param str - the property expression
      * @returns the normalised expression
      */
    def normalisePropertyExpression(str: String): js.Array[String | Double] = js.native
    
    /**
      * Parses a context property string, as generated by the TypedInput, to extract
      * the store name if present.
      *
      * For example, `#:(file)::foo` results in ` { store: "file", key: "foo" }`.
      *
      * @param key - the context property string to parse
      * @returns The parsed property
      */
    def parseContextStore(key: String): Key = js.native
    
    /**
      * Prepares a JSONata expression for evaluation.
      * This attaches Node-RED specific functions to the expression.
      *
      * @param value - the JSONata expression
      * @param node  - the node evaluating the property
      * @returns The JSONata expression that can be evaluated
      */
    def prepareJSONataExpression(value: String, node: typings.nodeRedRegistry.mod.Node[js.Object]): Expression = js.native
    
    /**
      * Sets a property of a message object.
      *
      * Unlike `setObjectProperty`, this function will strip `msg.` from the
      * front of the property expression if present.
      *
      * @param  msg           - the message object
      * @param  prop          - the property expression
      * @param  value         - the value to set
      * @param  createMissing - whether to create missing parent properties
      */
    def setMessageProperty(msg: js.Object, prop: String, value: Any): Boolean = js.native
    def setMessageProperty(msg: js.Object, prop: String, value: Any, createMissing: Boolean): Boolean = js.native
    
    /**
      * Sets a property of an object.
      *
      * @param  msg           - the object
      * @param  prop          - the property expression
      * @param  value         - the value to set
      * @param  createMissing - whether to create missing parent properties
      */
    def setObjectProperty(msg: js.Object, prop: String, value: Any): Boolean = js.native
    def setObjectProperty(msg: js.Object, prop: String, value: Any, createMissing: Boolean): Boolean = js.native
  }
  
  //#endregion
  trait UtilModule extends StObject {
    
    /**
      * Runtime hooks engine
      */
    var hooks: Hooks
    
    /**
      * Internationalization utilities
      */
    var i18n: I18n
    
    /**
      * Initialise the module with the runtime settings
      * @param settings
      */
    def init(
      settings: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify runtime.LocalSettings */ Any
    ): Unit
    
    /**
      * Logging utilities
      */
    var log: Log
    
    /**
      * General utilities
      */
    var util: Util
  }
  object UtilModule {
    
    inline def apply(
      hooks: Hooks,
      i18n: I18n,
      init: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify runtime.LocalSettings */ Any => Unit,
      log: Log,
      util: Util
    ): UtilModule = {
      val __obj = js.Dynamic.literal(hooks = hooks.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], init = js.Any.fromFunction1(init), log = log.asInstanceOf[js.Any], util = util.asInstanceOf[js.Any])
      __obj.asInstanceOf[UtilModule]
    }
    
    extension [Self <: UtilModule](x: Self) {
      
      inline def setHooks(value: Hooks): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setI18n(value: I18n): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setInit(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify runtime.LocalSettings */ Any => Unit
      ): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      inline def setLog(value: Log): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setUtil(value: Util): Self = StObject.set(x, "util", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = UtilModule
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: UtilModule = ^
}
