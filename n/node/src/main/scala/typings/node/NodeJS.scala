package typings.node

import org.scalablytyped.runtime.StringDictionary
import typings.node.anon.End
import typings.node.anon.Paths
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.std.BigInt64Array
import typings.std.BigUint64Array
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def getEvalOrigin(): js.UndefOr[String]
    
    /**
      * Name of the script [if this function was defined in a script]
      */
    def getFileName(): String | Null
    
    /**
      * Current function
      */
    def getFunction(): js.UndefOr[js.Function]
    
    /**
      * Name of the current function, typically its name property.
      * If a name property is not available an attempt will be made to try
      * to infer a name from the function's context.
      */
    def getFunctionName(): String | Null
    
    /**
      * Current line number [if this function was defined in a script]
      */
    def getLineNumber(): Double | Null
    
    /**
      * Name of the property [of "this" or one of its prototypes] that holds
      * the current function
      */
    def getMethodName(): String | Null
    
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
    def getTypeName(): String | Null
    
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
      getEvalOrigin: () => js.UndefOr[String],
      getFileName: () => String | Null,
      getFunction: () => js.UndefOr[js.Function],
      getFunctionName: () => String | Null,
      getLineNumber: () => Double | Null,
      getMethodName: () => String | Null,
      getThis: () => Any,
      getTypeName: () => String | Null,
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
      
      inline def setGetEvalOrigin(value: () => js.UndefOr[String]): Self = StObject.set(x, "getEvalOrigin", js.Any.fromFunction0(value))
      
      inline def setGetFileName(value: () => String | Null): Self = StObject.set(x, "getFileName", js.Any.fromFunction0(value))
      
      inline def setGetFunction(value: () => js.UndefOr[js.Function]): Self = StObject.set(x, "getFunction", js.Any.fromFunction0(value))
      
      inline def setGetFunctionName(value: () => String | Null): Self = StObject.set(x, "getFunctionName", js.Any.fromFunction0(value))
      
      inline def setGetLineNumber(value: () => Double | Null): Self = StObject.set(x, "getLineNumber", js.Any.fromFunction0(value))
      
      inline def setGetMethodName(value: () => String | Null): Self = StObject.set(x, "getMethodName", js.Any.fromFunction0(value))
      
      inline def setGetThis(value: () => Any): Self = StObject.set(x, "getThis", js.Any.fromFunction0(value))
      
      inline def setGetTypeName(value: () => String | Null): Self = StObject.set(x, "getTypeName", js.Any.fromFunction0(value))
      
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
    
    var code: js.UndefOr[String] = js.undefined
    
    var errno: js.UndefOr[Double] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var syscall: js.UndefOr[String] = js.undefined
  }
  object ErrnoException {
    
    inline def apply(message: String, name: String): ErrnoException = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrnoException]
    }
    
    extension [Self <: ErrnoException](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setErrno(value: Double): Self = StObject.set(x, "errno", value.asInstanceOf[js.Any])
      
      inline def setErrnoUndefined: Self = StObject.set(x, "errno", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSyscall(value: String): Self = StObject.set(x, "syscall", value.asInstanceOf[js.Any])
      
      inline def setSyscallUndefined: Self = StObject.set(x, "syscall", js.undefined)
    }
  }
  
  trait Module extends StObject {
    
    var children: js.Array[Module]
    
    var exports: Any
    
    var filename: String
    
    var id: String
    
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
    var path: String
    
    var paths: js.Array[String]
    
    def require(id: String): Any
    @JSName("require")
    var require_Original: Require
  }
  object Module {
    
    inline def apply(
      children: js.Array[Module],
      exports: Any,
      filename: String,
      id: String,
      isPreloading: Boolean,
      loaded: Boolean,
      path: String,
      paths: js.Array[String],
      require: Require
    ): Module = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isPreloading = isPreloading.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], require = require.asInstanceOf[js.Any])
      __obj.asInstanceOf[Module]
    }
    
    extension [Self <: Module](x: Self) {
      
      inline def setChildren(value: js.Array[Module]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Module*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setExports(value: Any): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsPreloading(value: Boolean): Self = StObject.set(x, "isPreloading", value.asInstanceOf[js.Any])
      
      inline def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Module): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
      
      inline def setRequire(value: Require): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    }
  }
  
  type ReadOnlyDict[T] = StringDictionary[js.UndefOr[T]]
  
  @js.native
  trait ReadWriteStream
    extends StObject
       with ReadableStream
       with WritableStream
  
  @js.native
  trait ReadableStream
    extends StObject
       with EventEmitter {
    
    def isPaused(): Boolean = js.native
    
    def pause(): this.type = js.native
    
    def pipe[T /* <: WritableStream */](destination: T): T = js.native
    def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    def read(): String | Buffer = js.native
    def read(size: Double): String | Buffer = js.native
    
    var readable: Boolean = js.native
    
    def resume(): this.type = js.native
    
    def setEncoding(encoding: BufferEncoding): this.type = js.native
    
    def unpipe(): this.type = js.native
    def unpipe(destination: WritableStream): this.type = js.native
    
    def unshift(chunk: String): Unit = js.native
    def unshift(chunk: String, encoding: BufferEncoding): Unit = js.native
    def unshift(chunk: js.typedarray.Uint8Array): Unit = js.native
    def unshift(chunk: js.typedarray.Uint8Array, encoding: BufferEncoding): Unit = js.native
    
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
    
    def apply(id: String): Any = js.native
    
    var cache: Dict[NodeModule] = js.native
    
    /**
      * @deprecated
      */
    var extensions: RequireExtensions = js.native
    
    var main: js.UndefOr[Module] = js.native
    
    def resolve(id: String): String = js.native
    def resolve(id: String, options: Paths): String = js.native
    @JSName("resolve")
    var resolve_Original: typings.node.NodeJS.RequireResolve = js.native
  }
  
  trait RequireExtensions
    extends StObject
       with Dict[js.Function2[/* m */ Module, /* filename */ String, Any]] {
    
    @JSName(".js")
    def Dotjs(m: Module, filename: String): Any
    
    @JSName(".json")
    def Dotjson(m: Module, filename: String): Any
    
    @JSName(".node")
    def Dotnode(m: Module, filename: String): Any
  }
  object RequireExtensions {
    
    inline def apply(Dotjs: (Module, String) => Any, Dotjson: (Module, String) => Any, Dotnode: (Module, String) => Any): RequireExtensions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic(".js")(js.Any.fromFunction2(Dotjs))
      __obj.updateDynamic(".json")(js.Any.fromFunction2(Dotjson))
      __obj.updateDynamic(".node")(js.Any.fromFunction2(Dotnode))
      __obj.asInstanceOf[RequireExtensions]
    }
    
    extension [Self <: RequireExtensions](x: Self) {
      
      inline def setDotjs(value: (Module, String) => Any): Self = StObject.set(x, ".js", js.Any.fromFunction2(value))
      
      inline def setDotjson(value: (Module, String) => Any): Self = StObject.set(x, ".json", js.Any.fromFunction2(value))
      
      inline def setDotnode(value: (Module, String) => Any): Self = StObject.set(x, ".node", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait RequireResolve extends StObject {
    
    def apply(id: String): String = js.native
    def apply(id: String, options: Paths): String = js.native
    
    def paths(request: String): js.Array[String] | Null = js.native
  }
  
  type TypedArray = js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | BigUint64Array | BigInt64Array | js.typedarray.Float32Array | js.typedarray.Float64Array
  
  @js.native
  trait WritableStream
    extends StObject
       with EventEmitter {
    
    def end(): this.type = js.native
    def end(cb: js.Function0[Unit]): this.type = js.native
    def end(data: String): this.type = js.native
    def end(data: String, cb: js.Function0[Unit]): this.type = js.native
    def end(data: js.typedarray.Uint8Array): this.type = js.native
    def end(data: js.typedarray.Uint8Array, cb: js.Function0[Unit]): this.type = js.native
    def end(str: String, encoding: Unit, cb: js.Function0[Unit]): this.type = js.native
    def end(str: String, encoding: BufferEncoding): this.type = js.native
    def end(str: String, encoding: BufferEncoding, cb: js.Function0[Unit]): this.type = js.native
    
    var writable: Boolean = js.native
    
    def write(buffer: String): Boolean = js.native
    def write(buffer: String, cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
    def write(buffer: js.typedarray.Uint8Array): Boolean = js.native
    def write(buffer: js.typedarray.Uint8Array, cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
    def write(str: String, encoding: Unit, cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
    def write(str: String, encoding: BufferEncoding): Boolean = js.native
    def write(
      str: String,
      encoding: BufferEncoding,
      cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
    ): Boolean = js.native
  }
}
