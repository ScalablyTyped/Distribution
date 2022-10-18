package typings.next

import typings.std.MessageEvent
import typings.std.WebAssembly.Exports
import typings.std.WebAssembly.Imports
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EmscriptenWasm {
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.nextStrings.WEB
    - typings.next.nextStrings.NODE
    - typings.next.nextStrings.SHELL
    - typings.next.nextStrings.WORKER
  */
  trait EnvironmentType extends StObject
  object EnvironmentType {
    
    inline def NODE: typings.next.nextStrings.NODE = "NODE".asInstanceOf[typings.next.nextStrings.NODE]
    
    inline def SHELL: typings.next.nextStrings.SHELL = "SHELL".asInstanceOf[typings.next.nextStrings.SHELL]
    
    inline def WEB: typings.next.nextStrings.WEB = "WEB".asInstanceOf[typings.next.nextStrings.WEB]
    
    inline def WORKER: typings.next.nextStrings.WORKER = "WORKER".asInstanceOf[typings.next.nextStrings.WORKER]
  }
  
  @js.native
  trait Module extends StObject {
    
    var ALLOC_DYNAMIC: Double = js.native
    
    var ALLOC_NONE: Double = js.native
    
    var ALLOC_NORMAL: Double = js.native
    
    var ALLOC_STACK: Double = js.native
    
    var ALLOC_STATIC: Double = js.native
    
    var FAST_MEMORY: Double = js.native
    
    var FHEAP: js.typedarray.Float64Array = js.native
    
    // USE_TYPED_ARRAYS == 1
    var HEAP: js.typedarray.Int32Array = js.native
    
    var HEAP16: js.typedarray.Int16Array = js.native
    
    var HEAP32: js.typedarray.Int32Array = js.native
    
    // USE_TYPED_ARRAYS == 2
    var HEAP8: js.typedarray.Int8Array = js.native
    
    var HEAPF32: js.typedarray.Float32Array = js.native
    
    var HEAPF64: js.typedarray.Float64Array = js.native
    
    var HEAPU16: js.typedarray.Uint16Array = js.native
    
    var HEAPU32: js.typedarray.Uint32Array = js.native
    
    var HEAPU8: js.typedarray.Uint8Array = js.native
    
    var IHEAP: js.typedarray.Int32Array = js.native
    
    def Pointer_stringify(ptr: Double): String = js.native
    def Pointer_stringify(ptr: Double, length: Double): String = js.native
    
    var Runtime: Any = js.native
    
    var TOTAL_MEMORY: Double = js.native
    
    var TOTAL_STACK: Double = js.native
    
    def UTF16ToString(ptr: Double): String = js.native
    
    def UTF32ToString(ptr: Double): String = js.native
    
    def _free(ptr: Double): Unit = js.native
    
    def _malloc(size: Double): Double = js.native
    
    def addOnExit(cb: js.Function0[Any]): Unit = js.native
    
    def addOnInit(cb: js.Function0[Any]): Unit = js.native
    
    def addOnPostRun(cb: js.Function0[Any]): Unit = js.native
    
    def addOnPreMain(cb: js.Function0[Any]): Unit = js.native
    
    def addOnPreRun(cb: js.Function0[Any]): Unit = js.native
    
    def addRunDependency(id: Any): Unit = js.native
    
    def allocate(slab: Any, types: String, allocator: Double, ptr: Double): Double = js.native
    def allocate(slab: Any, types: js.Array[String], allocator: Double, ptr: Double): Double = js.native
    
    var arguments: js.Array[String] = js.native
    
    def ccall(ident: String, returnType: String, argTypes: js.Array[String], args: js.Array[Any]): Any = js.native
    def ccall(ident: String, returnType: Null, argTypes: js.Array[String], args: js.Array[Any]): Any = js.native
    
    def cwrap(ident: String, returnType: String, argTypes: js.Array[String]): Any = js.native
    def cwrap(ident: String, returnType: Null, argTypes: js.Array[String]): Any = js.native
    
    def destroy(`object`: js.Object): Unit = js.native
    
    var environment: EnvironmentType = js.native
    
    var filePackagePrefixURL: String = js.native
    
    def getPreloadedPackage(remotePackageName: String, remotePackageSize: Double): js.typedarray.ArrayBuffer = js.native
    
    def getValue(ptr: Double, `type`: String): Double = js.native
    def getValue(ptr: Double, `type`: String, noSafe: Boolean): Double = js.native
    
    def instantiateWasm(imports: Imports, successCallback: js.Function1[/* module */ this.type, Unit]): Exports = js.native
    
    // Tools
    def intArrayFromString(stringy: String): js.Array[Double] = js.native
    def intArrayFromString(stringy: String, dontAddNull: Boolean): js.Array[Double] = js.native
    def intArrayFromString(stringy: String, dontAddNull: Boolean, length: Double): js.Array[Double] = js.native
    def intArrayFromString(stringy: String, dontAddNull: Unit, length: Double): js.Array[Double] = js.native
    
    def intArrayToString(array: js.Array[Double]): String = js.native
    
    def locateFile(url: String): String = js.native
    
    var logReadFiles: Boolean = js.native
    
    var noExitRuntime: Boolean = js.native
    
    var noInitialRun: Boolean = js.native
    
    def onCustomMessage(event: MessageEvent[Any]): Unit = js.native
    
    // Augmentations below by @surma.
    def onRuntimeInitialized(): Unit | Null = js.native
    
    var postRun: js.Array[js.Function0[Unit]] = js.native
    
    var preInit: js.Array[js.Function0[Unit]] = js.native
    
    var preRun: js.Array[js.Function0[Unit]] = js.native
    
    var preinitializedWebGLContext: WebGLRenderingContext = js.native
    
    var preloadedAudios: Any = js.native
    
    var preloadedImages: Any = js.native
    
    def print(str: String): Unit = js.native
    
    def printErr(str: String): Unit = js.native
    
    def removeRunDependency(id: Any): Unit = js.native
    
    def setValue(ptr: Double, value: Any, `type`: String): Unit = js.native
    def setValue(ptr: Double, value: Any, `type`: String, noSafe: Boolean): Unit = js.native
    
    def stringToUTF16(str: String, outPtr: Double): Unit = js.native
    
    def stringToUTF32(str: String, outPtr: Double): Unit = js.native
    
    var wasmBinary: js.typedarray.ArrayBuffer = js.native
    
    def writeArrayToMemory(array: js.Array[Double], buffer: Double): Unit = js.native
    
    def writeAsciiToMemory(str: String, buffer: Double, dontAddNull: Boolean): Unit = js.native
    
    def writeStringToMemory(str: String, buffer: Double, dontAddNull: Boolean): Unit = js.native
  }
  
  type ModuleFactory[T /* <: Module */] = js.Function1[/* moduleOverrides */ js.UndefOr[ModuleOpts], js.Promise[T]]
  
  // Options object for modularized Emscripten files. Shoe-horned by @surma.
  // FIXME: This an incomplete definition!
  trait ModuleOpts extends StObject {
    
    var locateFile: js.UndefOr[js.Function1[/* url */ String, String]] = js.undefined
    
    var mainScriptUrlOrBlob: js.UndefOr[String] = js.undefined
    
    var noInitialRun: js.UndefOr[Boolean] = js.undefined
    
    var onRuntimeInitialized: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ModuleOpts {
    
    inline def apply(): ModuleOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModuleOpts]
    }
    
    extension [Self <: ModuleOpts](x: Self) {
      
      inline def setLocateFile(value: /* url */ String => String): Self = StObject.set(x, "locateFile", js.Any.fromFunction1(value))
      
      inline def setLocateFileUndefined: Self = StObject.set(x, "locateFile", js.undefined)
      
      inline def setMainScriptUrlOrBlob(value: String): Self = StObject.set(x, "mainScriptUrlOrBlob", value.asInstanceOf[js.Any])
      
      inline def setMainScriptUrlOrBlobUndefined: Self = StObject.set(x, "mainScriptUrlOrBlob", js.undefined)
      
      inline def setNoInitialRun(value: Boolean): Self = StObject.set(x, "noInitialRun", value.asInstanceOf[js.Any])
      
      inline def setNoInitialRunUndefined: Self = StObject.set(x, "noInitialRun", js.undefined)
      
      inline def setOnRuntimeInitialized(value: () => Unit): Self = StObject.set(x, "onRuntimeInitialized", js.Any.fromFunction0(value))
      
      inline def setOnRuntimeInitializedUndefined: Self = StObject.set(x, "onRuntimeInitialized", js.undefined)
    }
  }
}
