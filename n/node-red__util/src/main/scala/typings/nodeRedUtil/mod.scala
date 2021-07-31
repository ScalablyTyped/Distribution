package typings.nodeRedUtil

import org.scalablytyped.runtime.Shortcut
import typings.jsonata.mod.Expression
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.nodeRedRegistry.mod.Node
import typings.nodeRedRegistry.mod.NodeMessage
import typings.nodeRedUtil.anon.Format
import typings.nodeRedUtil.anon.Key
import typings.nodeRedUtil.anon.MaxLength
import typings.nodeRedUtil.anon.Msg
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@node-red/util", JSImport.Namespace)
  @js.native
  val ^ : UtilModule = js.native
  
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
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class I18nMutableBuilder[Self <: I18n] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailableLanguages(value: String => js.Array[String]): Self = StObject.set(x, "availableLanguages", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCatalog(value: (String, String) => MessageCatalog): Self = StObject.set(x, "catalog", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRegisterMessageCatalog(value: (String, String, String) => js.Promise[Unit]): Self = StObject.set(x, "registerMessageCatalog", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRegisterMessageCatalogs(value: js.Array[MessageCatalog] => js.Promise[js.Array[js.Object]]): Self = StObject.set(x, "registerMessageCatalogs", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_underscore(value: (/* id */ String, /* tplStrs */ js.UndefOr[Record[String, String | Double]]) => String): Self = StObject.set(x, "_", js.Any.fromFunction2(value))
    }
  }
  
  // tslint:disable-next-line:interface-name
  type I18nTFunction = js.Function2[/* id */ String, /* tplStrs */ js.UndefOr[Record[String, String | Double]], String]
  
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
  
  type LogMessage = js.Any
  
  trait LogMessageObject extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var level: Double
    
    var msg: js.UndefOr[LogMessage] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object LogMessageObject {
    
    @scala.inline
    def apply(level: Double): LogMessageObject = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogMessageObject]
    }
    
    @scala.inline
    implicit class LogMessageObjectMutableBuilder[Self <: LogMessageObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsg(value: LogMessage): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgUndefined: Self = StObject.set(x, "msg", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait MessageCatalog extends StObject {
    
    var dir: String
    
    var file: String
    
    var namespace: String
  }
  object MessageCatalog {
    
    @scala.inline
    def apply(dir: String, file: String, namespace: String): MessageCatalog = {
      val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageCatalog]
    }
    
    @scala.inline
    implicit class MessageCatalogMutableBuilder[Self <: MessageCatalog] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
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
    def ensureBuffer(o: js.Any): Buffer = js.native
    
    /**
      * Converts the provided argument to a String, using type-dependent
      * methods.
      *
      * @param o - the property to convert to a String
      * @returns the stringified version
      */
    def ensureString(o: js.Any): String = js.native
    
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
    def evaluateEnvProperty(value: String, node: Node[js.Object]): String = js.native
    
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
    def evaluateJSONataExpression(expr: Expression, msg: js.Object): js.Any = js.native
    def evaluateJSONataExpression(
      expr: Expression,
      msg: js.Object,
      callback: js.Function2[/* err */ Error | Null, /* resp */ js.Any, Unit]
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
    def evaluateNodeProperty(value: String, `type`: String, node: Node[js.Object], msg: js.Object): js.Any = js.native
    def evaluateNodeProperty(
      value: String,
      `type`: String,
      node: Node[js.Object],
      msg: js.Object,
      callback: js.Function2[/* err */ Error | Null, /* result */ js.Any, Unit]
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
    def getMessageProperty(msg: js.Object, expr: String): js.Any = js.native
    
    /**
      * Gets a property of an object.
      *
      * @param msg - the object
      * @param expr - the property expression
      * @returns the object property, or undefined if it does not exist
      */
    def getObjectProperty(msg: js.Object, expr: String): js.Any = js.native
    
    /**
      * Get value of environment variable.
      * @param node - accessing node
      * @param name - name of variable
      * @returns value of env var
      */
    def getSetting(node: Node[js.Object], name: String): String = js.native
    
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
    def prepareJSONataExpression(value: String, node: Node[js.Object]): Expression = js.native
    
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
    def setMessageProperty(msg: js.Object, prop: String, value: js.Any): Boolean = js.native
    def setMessageProperty(msg: js.Object, prop: String, value: js.Any, createMissing: Boolean): Boolean = js.native
    
    /**
      * Sets a property of an object.
      *
      * @param  msg           - the object
      * @param  prop          - the property expression
      * @param  value         - the value to set
      * @param  createMissing - whether to create missing parent properties
      */
    def setObjectProperty(msg: js.Object, prop: String, value: js.Any): Boolean = js.native
    def setObjectProperty(msg: js.Object, prop: String, value: js.Any, createMissing: Boolean): Boolean = js.native
  }
  
  trait UtilModule extends StObject {
    
    /**
      * Internationalization utilities
      */
    var i18n: I18n
    
    /**
      * Initialise the module with the runtime settings
      * @param settings
      */
    def init(
      settings: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify runtime.LocalSettings */ js.Any
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
    
    @scala.inline
    def apply(
      i18n: I18n,
      init: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify runtime.LocalSettings */ js.Any => Unit,
      log: Log,
      util: Util
    ): UtilModule = {
      val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any], init = js.Any.fromFunction1(init), log = log.asInstanceOf[js.Any], util = util.asInstanceOf[js.Any])
      __obj.asInstanceOf[UtilModule]
    }
    
    @scala.inline
    implicit class UtilModuleMutableBuilder[Self <: UtilModule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setI18n(value: I18n): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInit(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify runtime.LocalSettings */ js.Any => Unit
      ): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLog(value: Log): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtil(value: Util): Self = StObject.set(x, "util", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = UtilModule
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: UtilModule = ^
}
