package typings.node

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.node.anon.End
import typings.node.anon.Paths
import typings.node.anon.Transfer
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.node.globalsMod.NodeJS.CallSite
import typings.node.globalsMod.NodeJS.Module
import typings.node.globalsMod.NodeJS.Require
import typings.node.nodeConsoleMod.global.Console_
import typings.node.nodeConsoleMod.global.console.ConsoleConstructorOptions
import typings.node.processMod.global.NodeJS.Process
import typings.std.Error
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalsMod {
  
  @JSImport("node/globals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("node/globals", "AbortController")
  @js.native
  open class AbortControllerCls ()
    extends StObject
       with AbortController {
    
    /**
      * Invoking this method will set this object's AbortSignal's aborted flag and signal to any observers that the associated activity is to be aborted.
      */
    /* CompleteClass */
    override def abort(): Unit = js.native
    
    /**
      * Returns the AbortSignal object associated with this object.
      */
    /* CompleteClass */
    override val signal: AbortSignal = js.native
  }
  
  /** A signal object that allows you to communicate with a DOM request (such as a Fetch) and abort it if required via an AbortController object. */
  trait AbortSignal extends StObject {
    
    /**
      * Returns true if this AbortSignal's AbortController has signaled to abort, and false otherwise.
      */
    val aborted: Boolean
  }
  object AbortSignal {
    
    inline def apply(aborted: Boolean): AbortSignal = {
      val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbortSignal]
    }
    
    @JSImport("node/globals", "AbortSignal")
    @js.native
    val ^ : js.Any = js.native
    
    // TODO: Add abort() static
    inline def timeout(milliseconds: Double): AbortSignal = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[AbortSignal]
    
    extension [Self <: AbortSignal](x: Self) {
      
      inline def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("node/globals", "AbortSignal")
  @js.native
  open class AbortSignalCls ()
    extends StObject
       with AbortSignal {
    
    /**
      * Returns true if this AbortSignal's AbortController has signaled to abort, and false otherwise.
      */
    /* CompleteClass */
    override val aborted: Boolean = js.native
  }
  
  object console extends Shortcut {
    
    @JSImport("node/globals", "console")
    @js.native
    val ^ : Console_ = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("node/globals", "console.Console")
    @js.native
    open class Console protected ()
      extends StObject
         with Console_ {
      def this(options: ConsoleConstructorOptions) = this()
      def this(stdout: WritableStream[Any]) = this()
      def this(stdout: WritableStream[Any], stderr: WritableStream[Any]) = this()
      def this(stdout: WritableStream[Any], stderr: Unit, ignoreErrors: Boolean) = this()
      def this(stdout: WritableStream[Any], stderr: WritableStream[Any], ignoreErrors: Boolean) = this()
    }
    
    type _To = Console_
    
    /* This means you don't have to write `^`, but can instead just say `console.foo` */
    override def _to: Console_ = ^
  }
  
  @JSImport("node/globals", "__dirname")
  @js.native
  def dirname: java.lang.String = js.native
  
  inline def dirname_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__dirname")(x.asInstanceOf[js.Any])
  
  // Same as module.exports
  @JSImport("node/globals", "exports")
  @js.native
  def exports: Any = js.native
  inline def exports_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exports")(x.asInstanceOf[js.Any])
  
  @JSImport("node/globals", "__filename")
  @js.native
  def filename: java.lang.String = js.native
  
  inline def filename_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__filename")(x.asInstanceOf[js.Any])
  
  /**
    * Only available if `--expose-gc` is passed to the process.
    */
  @JSImport("node/globals", "gc")
  @js.native
  def gc: js.UndefOr[js.Function0[Unit]] = js.native
  inline def gc_=(x: js.UndefOr[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gc")(x.asInstanceOf[js.Any])
  
  @JSImport("node/globals", "module")
  @js.native
  def module: NodeModule = js.native
  inline def module_=(x: NodeModule): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("module")(x.asInstanceOf[js.Any])
  
  @JSImport("node/globals", "process")
  @js.native
  def process: Process = js.native
  inline def process_=(x: Process): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("process")(x.asInstanceOf[js.Any])
  
  @JSImport("node/globals", "require")
  @js.native
  def require: NodeRequire = js.native
  inline def require_=(x: NodeRequire): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("require")(x.asInstanceOf[js.Any])
  
  //#endregion ArrayLike.at() end
  /**
    * @since v17.0.0
    *
    * Creates a deep clone of an object.
    */
  inline def structuredClone[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("structuredClone")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def structuredClone[T](value: T, transfer: Transfer): T = (^.asInstanceOf[js.Dynamic].applyDynamic("structuredClone")(value.asInstanceOf[js.Any], transfer.asInstanceOf[js.Any])).asInstanceOf[T]
  
  //#region borrowed
  // from https://github.com/microsoft/TypeScript/blob/38da7c600c83e7b31193a62495239a0fe478cb67/lib/lib.webworker.d.ts#L633 until moved to separate lib
  /** A controller object that allows you to abort one or more DOM requests as and when desired. */
  trait AbortController extends StObject {
    
    /**
      * Invoking this method will set this object's AbortSignal's aborted flag and signal to any observers that the associated activity is to be aborted.
      */
    def abort(): Unit
    
    /**
      * Returns the AbortSignal object associated with this object.
      */
    val signal: AbortSignal
  }
  object AbortController {
    
    inline def apply(abort: () => Unit, signal: AbortSignal): AbortController = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), signal = signal.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbortController]
    }
    
    extension [Self <: AbortController](x: Self) {
      
      inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    }
  }
  
  type Array[T] = RelativeIndexable[T]
  
  type BigInt64Array = RelativeIndexable[js.BigInt]
  
  type BigUint64Array = RelativeIndexable[js.BigInt]
  
  @js.native
  trait ErrorConstructor extends StObject {
    
    /** Create .stack property on a target object */
    def captureStackTrace(targetObject: js.Object): Unit = js.native
    def captureStackTrace(targetObject: js.Object, constructorOpt: js.Function): Unit = js.native
    
    /**
      * Optional override for formatting stack traces
      *
      * @see https://v8.dev/docs/stack-trace-api#customizing-stack-traces
      */
    var prepareStackTrace: js.UndefOr[js.Function2[/* err */ js.Error, /* stackTraces */ Array[CallSite], Any]] = js.native
    
    var stackTraceLimit: Double = js.native
  }
  
  type Float32Array = RelativeIndexable[Double]
  
  type Float64Array = RelativeIndexable[Double]
  
  type Int16Array = RelativeIndexable[Double]
  
  type Int32Array = RelativeIndexable[Double]
  
  type Int8Array = RelativeIndexable[Double]
  
  /*----------------------------------------------*
  *                                               *
  *               GLOBAL INTERFACES               *
  *                                               *
  *-----------------------------------------------*/
  object NodeJS {
    
    type ArrayBufferView = TypedArray | js.typedarray.DataView
    
    trait CallSite extends StObject {
      
      /**
        * Current column number [if this function was defined in a script]
        */
      def getColumnNumber(): Double | Null
      
      /**
        * A call site object representing the location where eval was called
        * [if this function was created using a call to eval]
        */
      def getEvalOrigin(): js.UndefOr[java.lang.String]
      
      /**
        * Name of the script [if this function was defined in a script]
        */
      def getFileName(): java.lang.String | Null
      
      /**
        * Current function
        */
      def getFunction(): js.UndefOr[js.Function]
      
      /**
        * Name of the current function, typically its name property.
        * If a name property is not available an attempt will be made to try
        * to infer a name from the function's context.
        */
      def getFunctionName(): java.lang.String | Null
      
      /**
        * Current line number [if this function was defined in a script]
        */
      def getLineNumber(): Double | Null
      
      /**
        * Name of the property [of "this" or one of its prototypes] that holds
        * the current function
        */
      def getMethodName(): java.lang.String | Null
      
      /**
        * Value of "this"
        */
      def getThis(): Any
      
      /**
        * Type of "this" as a string.
        * This is the name of the function stored in the constructor field of
        * "this", if available.  Otherwise the object's [[Class]] internal
        * property.
        */
      def getTypeName(): java.lang.String | Null
      
      /**
        * Is this a constructor call?
        */
      def isConstructor(): Boolean
      
      /**
        * Does this call take place in code defined by a call to eval?
        */
      def isEval(): Boolean
      
      /**
        * Is this call in native V8 code?
        */
      def isNative(): Boolean
      
      /**
        * Is this a toplevel invocation, that is, is "this" the global object?
        */
      def isToplevel(): Boolean
    }
    object CallSite {
      
      inline def apply(
        getColumnNumber: () => Double | Null,
        getEvalOrigin: () => js.UndefOr[java.lang.String],
        getFileName: () => java.lang.String | Null,
        getFunction: () => js.UndefOr[js.Function],
        getFunctionName: () => java.lang.String | Null,
        getLineNumber: () => Double | Null,
        getMethodName: () => java.lang.String | Null,
        getThis: () => Any,
        getTypeName: () => java.lang.String | Null,
        isConstructor: () => Boolean,
        isEval: () => Boolean,
        isNative: () => Boolean,
        isToplevel: () => Boolean
      ): CallSite = {
        val __obj = js.Dynamic.literal(getColumnNumber = js.Any.fromFunction0(getColumnNumber), getEvalOrigin = js.Any.fromFunction0(getEvalOrigin), getFileName = js.Any.fromFunction0(getFileName), getFunction = js.Any.fromFunction0(getFunction), getFunctionName = js.Any.fromFunction0(getFunctionName), getLineNumber = js.Any.fromFunction0(getLineNumber), getMethodName = js.Any.fromFunction0(getMethodName), getThis = js.Any.fromFunction0(getThis), getTypeName = js.Any.fromFunction0(getTypeName), isConstructor = js.Any.fromFunction0(isConstructor), isEval = js.Any.fromFunction0(isEval), isNative = js.Any.fromFunction0(isNative), isToplevel = js.Any.fromFunction0(isToplevel))
        __obj.asInstanceOf[CallSite]
      }
      
      extension [Self <: CallSite](x: Self) {
        
        inline def setGetColumnNumber(value: () => Double | Null): Self = StObject.set(x, "getColumnNumber", js.Any.fromFunction0(value))
        
        inline def setGetEvalOrigin(value: () => js.UndefOr[java.lang.String]): Self = StObject.set(x, "getEvalOrigin", js.Any.fromFunction0(value))
        
        inline def setGetFileName(value: () => java.lang.String | Null): Self = StObject.set(x, "getFileName", js.Any.fromFunction0(value))
        
        inline def setGetFunction(value: () => js.UndefOr[js.Function]): Self = StObject.set(x, "getFunction", js.Any.fromFunction0(value))
        
        inline def setGetFunctionName(value: () => java.lang.String | Null): Self = StObject.set(x, "getFunctionName", js.Any.fromFunction0(value))
        
        inline def setGetLineNumber(value: () => Double | Null): Self = StObject.set(x, "getLineNumber", js.Any.fromFunction0(value))
        
        inline def setGetMethodName(value: () => java.lang.String | Null): Self = StObject.set(x, "getMethodName", js.Any.fromFunction0(value))
        
        inline def setGetThis(value: () => Any): Self = StObject.set(x, "getThis", js.Any.fromFunction0(value))
        
        inline def setGetTypeName(value: () => java.lang.String | Null): Self = StObject.set(x, "getTypeName", js.Any.fromFunction0(value))
        
        inline def setIsConstructor(value: () => Boolean): Self = StObject.set(x, "isConstructor", js.Any.fromFunction0(value))
        
        inline def setIsEval(value: () => Boolean): Self = StObject.set(x, "isEval", js.Any.fromFunction0(value))
        
        inline def setIsNative(value: () => Boolean): Self = StObject.set(x, "isNative", js.Any.fromFunction0(value))
        
        inline def setIsToplevel(value: () => Boolean): Self = StObject.set(x, "isToplevel", js.Any.fromFunction0(value))
      }
    }
    
    type Dict[T] = StringDictionary[js.UndefOr[T]]
    
    trait ErrnoException
      extends StObject
         with Error {
      
      var code: js.UndefOr[java.lang.String] = js.undefined
      
      var errno: js.UndefOr[Double] = js.undefined
      
      var path: js.UndefOr[java.lang.String] = js.undefined
      
      var syscall: js.UndefOr[java.lang.String] = js.undefined
    }
    object ErrnoException {
      
      inline def apply(message: java.lang.String, name: java.lang.String): ErrnoException = {
        val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[ErrnoException]
      }
      
      extension [Self <: ErrnoException](x: Self) {
        
        inline def setCode(value: java.lang.String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
        
        inline def setErrno(value: Double): Self = StObject.set(x, "errno", value.asInstanceOf[js.Any])
        
        inline def setErrnoUndefined: Self = StObject.set(x, "errno", js.undefined)
        
        inline def setPath(value: java.lang.String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setSyscall(value: java.lang.String): Self = StObject.set(x, "syscall", value.asInstanceOf[js.Any])
        
        inline def setSyscallUndefined: Self = StObject.set(x, "syscall", js.undefined)
      }
    }
    
    trait Module extends StObject {
      
      var children: Array[Module]
      
      var exports: Any
      
      var filename: java.lang.String
      
      var id: java.lang.String
      
      /**
        * `true` if the module is running during the Node.js preload
        */
      var isPreloading: Boolean
      
      var loaded: Boolean
      
      /** @deprecated since v14.6.0 Please use `require.main` and `module.children` instead. */
      var parent: js.UndefOr[Module | Null] = js.undefined
      
      /**
        * @since v11.14.0
        *
        * The directory name of the module. This is usually the same as the path.dirname() of the module.id.
        */
      var path: java.lang.String
      
      var paths: Array[java.lang.String]
      
      def require(id: java.lang.String): Any
      @JSName("require")
      var require_Original: Require
    }
    object Module {
      
      inline def apply(
        children: Array[Module],
        exports: Any,
        filename: java.lang.String,
        id: java.lang.String,
        isPreloading: Boolean,
        loaded: Boolean,
        path: java.lang.String,
        paths: Array[java.lang.String],
        require: Require
      ): Module = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isPreloading = isPreloading.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], require = require.asInstanceOf[js.Any])
        __obj.asInstanceOf[Module]
      }
      
      extension [Self <: Module](x: Self) {
        
        inline def setChildren(value: Array[Module]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setExports(value: Any): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
        
        inline def setFilename(value: java.lang.String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
        
        inline def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIsPreloading(value: Boolean): Self = StObject.set(x, "isPreloading", value.asInstanceOf[js.Any])
        
        inline def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
        
        inline def setParent(value: Module): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
        
        inline def setParentNull: Self = StObject.set(x, "parent", null)
        
        inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
        
        inline def setPath(value: java.lang.String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPaths(value: Array[java.lang.String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
        
        inline def setRequire(value: Require): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
      }
    }
    
    type ReadOnlyDict[T] = StringDictionary[js.UndefOr[T]]
    
    @js.native
    trait ReadWriteStream
      extends StObject
         with ReadableStream
         with typings.node.globalsMod.NodeJS.WritableStream
    
    @js.native
    trait ReadableStream
      extends StObject
         with EventEmitter {
      
      def isPaused(): Boolean = js.native
      
      def pause(): this.type = js.native
      
      def pipe[T /* <: typings.node.globalsMod.NodeJS.WritableStream */](destination: T): T = js.native
      def pipe[T /* <: typings.node.globalsMod.NodeJS.WritableStream */](destination: T, options: End): T = js.native
      
      def read(): java.lang.String | Buffer = js.native
      def read(size: Double): java.lang.String | Buffer = js.native
      
      var readable: Boolean = js.native
      
      def resume(): this.type = js.native
      
      def setEncoding(encoding: BufferEncoding): this.type = js.native
      
      def unpipe(): this.type = js.native
      def unpipe(destination: typings.node.globalsMod.NodeJS.WritableStream): this.type = js.native
      
      def unshift(chunk: java.lang.String): Unit = js.native
      def unshift(chunk: java.lang.String, encoding: BufferEncoding): Unit = js.native
      def unshift(chunk: Uint8Array): Unit = js.native
      def unshift(chunk: Uint8Array, encoding: BufferEncoding): Unit = js.native
      
      def wrap(oldStream: ReadableStream): this.type = js.native
    }
    
    trait RefCounted extends StObject {
      
      def ref(): this.type
      
      def unref(): this.type
    }
    object RefCounted {
      
      inline def apply(ref: () => RefCounted, unref: () => RefCounted): RefCounted = {
        val __obj = js.Dynamic.literal(ref = js.Any.fromFunction0(ref), unref = js.Any.fromFunction0(unref))
        __obj.asInstanceOf[RefCounted]
      }
      
      extension [Self <: RefCounted](x: Self) {
        
        inline def setRef(value: () => RefCounted): Self = StObject.set(x, "ref", js.Any.fromFunction0(value))
        
        inline def setUnref(value: () => RefCounted): Self = StObject.set(x, "unref", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait Require extends StObject {
      
      def apply(id: java.lang.String): Any = js.native
      
      var cache: Dict[NodeModule] = js.native
      
      /**
        * @deprecated
        */
      var extensions: RequireExtensions = js.native
      
      var main: js.UndefOr[Module] = js.native
      
      def resolve(id: java.lang.String): java.lang.String = js.native
      def resolve(id: java.lang.String, options: Paths): java.lang.String = js.native
      @JSName("resolve")
      var resolve_Original: typings.node.globalsMod.NodeJS.RequireResolve = js.native
    }
    
    trait RequireExtensions
      extends StObject
         with Dict[js.Function2[/* m */ Module, /* filename */ java.lang.String, Any]] {
      
      @JSName(".js")
      def Dotjs(m: Module, filename: java.lang.String): Any
      
      @JSName(".json")
      def Dotjson(m: Module, filename: java.lang.String): Any
      
      @JSName(".node")
      def Dotnode(m: Module, filename: java.lang.String): Any
    }
    object RequireExtensions {
      
      inline def apply(
        Dotjs: (Module, java.lang.String) => Any,
        Dotjson: (Module, java.lang.String) => Any,
        Dotnode: (Module, java.lang.String) => Any
      ): RequireExtensions = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic(".js")(js.Any.fromFunction2(Dotjs))
        __obj.updateDynamic(".json")(js.Any.fromFunction2(Dotjson))
        __obj.updateDynamic(".node")(js.Any.fromFunction2(Dotnode))
        __obj.asInstanceOf[RequireExtensions]
      }
      
      extension [Self <: RequireExtensions](x: Self) {
        
        inline def setDotjs(value: (Module, java.lang.String) => Any): Self = StObject.set(x, ".js", js.Any.fromFunction2(value))
        
        inline def setDotjson(value: (Module, java.lang.String) => Any): Self = StObject.set(x, ".json", js.Any.fromFunction2(value))
        
        inline def setDotnode(value: (Module, java.lang.String) => Any): Self = StObject.set(x, ".node", js.Any.fromFunction2(value))
      }
    }
    
    @js.native
    trait RequireResolve extends StObject {
      
      def apply(id: java.lang.String): java.lang.String = js.native
      def apply(id: java.lang.String, options: Paths): java.lang.String = js.native
      
      def paths(request: java.lang.String): Array[java.lang.String] | Null = js.native
    }
    
    type TypedArray = Uint8Array | Uint8ClampedArray | Uint16Array | Uint32Array | Int8Array | Int16Array | Int32Array | BigUint64Array | BigInt64Array | Float32Array | Float64Array
    
    @js.native
    trait WritableStream
      extends StObject
         with EventEmitter {
      
      def end(): this.type = js.native
      def end(cb: js.Function0[Unit]): this.type = js.native
      def end(data: java.lang.String): this.type = js.native
      def end(data: java.lang.String, cb: js.Function0[Unit]): this.type = js.native
      def end(data: Uint8Array): this.type = js.native
      def end(data: Uint8Array, cb: js.Function0[Unit]): this.type = js.native
      def end(str: java.lang.String, encoding: Unit, cb: js.Function0[Unit]): this.type = js.native
      def end(str: java.lang.String, encoding: BufferEncoding): this.type = js.native
      def end(str: java.lang.String, encoding: BufferEncoding, cb: js.Function0[Unit]): this.type = js.native
      
      var writable: Boolean = js.native
      
      def write(buffer: java.lang.String): Boolean = js.native
      def write(buffer: java.lang.String, cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
      def write(buffer: Uint8Array): Boolean = js.native
      def write(buffer: Uint8Array, cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
      def write(
        str: java.lang.String,
        encoding: Unit,
        cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
      ): Boolean = js.native
      def write(str: java.lang.String, encoding: BufferEncoding): Boolean = js.native
      def write(
        str: java.lang.String,
        encoding: BufferEncoding,
        cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
      ): Boolean = js.native
    }
  }
  
  type NodeModule = Module
  
  /*-----------------------------------------------*
    *                                               *
    *                   GLOBAL                      *
    *                                               *
    ------------------------------------------------*/
  // For backwards compability
  type NodeRequire = Require
  
  type ReadonlyArray[T] = RelativeIndexable[T]
  
  //#endregion borrowed
  //#region ArrayLike.at()
  trait RelativeIndexable[T] extends StObject {
    
    /**
      * Takes an integer value and returns the item at that index,
      * allowing for positive and negative integers.
      * Negative integers count back from the last item in the array.
      */
    def at(index: Double): js.UndefOr[T]
  }
  object RelativeIndexable {
    
    inline def apply[T](at: Double => js.UndefOr[T]): RelativeIndexable[T] = {
      val __obj = js.Dynamic.literal(at = js.Any.fromFunction1(at))
      __obj.asInstanceOf[RelativeIndexable[T]]
    }
    
    extension [Self <: RelativeIndexable[?], T](x: Self & RelativeIndexable[T]) {
      
      inline def setAt(value: Double => js.UndefOr[T]): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
    }
  }
  
  type RequireResolve = typings.node.globalsMod.NodeJS.RequireResolve
  
  type String = RelativeIndexable[java.lang.String]
  
  type Uint16Array = RelativeIndexable[Double]
  
  type Uint32Array = RelativeIndexable[Double]
  
  type Uint8Array = RelativeIndexable[Double]
  
  type Uint8ClampedArray = RelativeIndexable[Double]
}
