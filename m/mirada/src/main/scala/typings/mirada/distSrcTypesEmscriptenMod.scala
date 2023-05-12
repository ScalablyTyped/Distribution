package typings.mirada

import typings.mirada.anon.Encoding
import typings.mirada.anon.Kind
import typings.mirada.anon.Module
import typings.std.MessageEvent
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesEmscriptenMod {
  
  trait CCallOpts extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
  }
  object CCallOpts {
    
    inline def apply(): CCallOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CCallOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CCallOpts] (val x: Self) extends AnyVal {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    }
  }
  
  @js.native
  trait EmscriptenModule extends StObject {
    
    var ALLOC_DYNAMIC: Double = js.native
    
    var ALLOC_NONE: Double = js.native
    
    var ALLOC_NORMAL: Double = js.native
    
    var ALLOC_STACK: Double = js.native
    
    var ALLOC_STATIC: Double = js.native
    
    var FAST_MEMORY: Double = js.native
    
    var FHEAP: js.typedarray.Float64Array = js.native
    
    var HEAP: js.typedarray.Int32Array = js.native
    
    var HEAP16: js.typedarray.Int16Array = js.native
    
    var HEAP32: js.typedarray.Int32Array = js.native
    
    var HEAP8: js.typedarray.Int8Array = js.native
    
    var HEAPF32: js.typedarray.Float32Array = js.native
    
    var HEAPF64: js.typedarray.Float64Array = js.native
    
    var HEAPU16: js.typedarray.Uint16Array = js.native
    
    var HEAPU32: js.typedarray.Uint32Array = js.native
    
    var HEAPU8: js.typedarray.Uint8Array = js.native
    
    var IHEAP: js.typedarray.Int32Array = js.native
    
    var Runtime: Any = js.native
    
    var TOTAL_MEMORY: Double = js.native
    
    var TOTAL_STACK: Double = js.native
    
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
    
    def ccall(
      ident: String,
      returnType: Null,
      argTypes: js.Array[ValueType],
      args: js.Array[TypeCompatibleWithC]
    ): Any = js.native
    def ccall(
      ident: String,
      returnType: Null,
      argTypes: js.Array[ValueType],
      args: js.Array[TypeCompatibleWithC],
      opts: CCallOpts
    ): Any = js.native
    def ccall(
      ident: String,
      returnType: ValueType,
      argTypes: js.Array[ValueType],
      args: js.Array[TypeCompatibleWithC]
    ): Any = js.native
    def ccall(
      ident: String,
      returnType: ValueType,
      argTypes: js.Array[ValueType],
      args: js.Array[TypeCompatibleWithC],
      opts: CCallOpts
    ): Any = js.native
    
    def cwrap(ident: String, returnType: Null, argTypes: js.Array[ValueType]): js.Function1[/* repeated */ Any, Any] = js.native
    def cwrap(ident: String, returnType: Null, argTypes: js.Array[ValueType], opts: CCallOpts): js.Function1[/* repeated */ Any, Any] = js.native
    def cwrap(ident: String, returnType: ValueType, argTypes: js.Array[ValueType]): js.Function1[/* repeated */ Any, Any] = js.native
    def cwrap(ident: String, returnType: ValueType, argTypes: js.Array[ValueType], opts: CCallOpts): js.Function1[/* repeated */ Any, Any] = js.native
    
    def destroy(`object`: js.Object): Unit = js.native
    
    var environment: EnvironmentType = js.native
    
    var filePackagePrefixURL: String = js.native
    
    def getPreloadedPackage(remotePackageName: String, remotePackageSize: Double): js.typedarray.ArrayBuffer = js.native
    
    def getValue(ptr: Double, `type`: String): Double = js.native
    def getValue(ptr: Double, `type`: String, noSafe: Boolean): Double = js.native
    
    def instantiateWasm(imports: WebAssemblyImports, successCallback: js.Function1[/* module */ WebAssemblyModule, Unit]): WebAssemblyExports = js.native
    
    def intArrayFromString(stringy: String): js.Array[Double] = js.native
    def intArrayFromString(stringy: String, dontAddNull: Boolean): js.Array[Double] = js.native
    def intArrayFromString(stringy: String, dontAddNull: Boolean, length: Double): js.Array[Double] = js.native
    def intArrayFromString(stringy: String, dontAddNull: Unit, length: Double): js.Array[Double] = js.native
    
    def intArrayToString(array: js.Array[Double]): String = js.native
    
    def locateFile(url: String): String = js.native
    
    var logReadFiles: Boolean = js.native
    
    var noExitRuntime: Boolean = js.native
    
    var noInitialRun: Boolean = js.native
    
    def onAbort(what: Any): Unit = js.native
    
    def onCustomMessage(event: MessageEvent[Any]): Unit = js.native
    
    def onRuntimeInitialized(): Unit = js.native
    
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
    
    var wasmBinary: js.typedarray.ArrayBuffer = js.native
    
    def writeArrayToMemory(array: js.Array[Double], buffer: Double): Unit = js.native
    
    def writeAsciiToMemory(str: String, buffer: Double, dontAddNull: Boolean): Unit = js.native
    
    def writeStringToMemory(str: String, buffer: Double, dontAddNull: Boolean): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mirada.miradaStrings.WEB
    - typings.mirada.miradaStrings.NODE
    - typings.mirada.miradaStrings.SHELL
    - typings.mirada.miradaStrings.WORKER
  */
  trait EnvironmentType extends StObject
  object EnvironmentType {
    
    inline def NODE: typings.mirada.miradaStrings.NODE = "NODE".asInstanceOf[typings.mirada.miradaStrings.NODE]
    
    inline def SHELL: typings.mirada.miradaStrings.SHELL = "SHELL".asInstanceOf[typings.mirada.miradaStrings.SHELL]
    
    inline def WEB: typings.mirada.miradaStrings.WEB = "WEB".asInstanceOf[typings.mirada.miradaStrings.WEB]
    
    inline def WORKER: typings.mirada.miradaStrings.WORKER = "WORKER".asInstanceOf[typings.mirada.miradaStrings.WORKER]
  }
  
  @js.native
  trait FS extends StObject {
    
    def allocate(stream: FSStream, offset: Double, length: Double): Unit = js.native
    
    def analyzePath(p: String): Any = js.native
    
    def chdir(path: String): Unit = js.native
    
    def chmod(path: String, mode: Double): Unit = js.native
    def chmod(path: String, mode: Double, dontFollow: Boolean): Unit = js.native
    
    def chown(path: String, uid: Double, gid: Double): Unit = js.native
    def chown(path: String, uid: Double, gid: Double, dontFollow: Boolean): Unit = js.native
    
    def close(stream: FSStream): Unit = js.native
    
    def createDataFile(
      parent: String,
      name: String,
      data: js.typedarray.ArrayBufferView,
      canRead: Boolean,
      canWrite: Boolean,
      canOwn: Boolean
    ): Unit = js.native
    
    def createLazyFile(parent: String, name: String, url: String, canRead: Boolean, canWrite: Boolean): FSNode = js.native
    def createLazyFile(parent: FSNode, name: String, url: String, canRead: Boolean, canWrite: Boolean): FSNode = js.native
    
    def createPreloadedFile(parent: String, name: String, url: String, canRead: Boolean, canWrite: Boolean): Unit = js.native
    def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit]
    ): Unit = js.native
    def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: js.Function0[Unit]
    ): Unit = js.native
    def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: js.Function0[Unit],
      dontCreateFile: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: js.Function0[Unit],
      dontCreateFile: Boolean,
      canOwn: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: js.Function0[Unit],
      dontCreateFile: Unit,
      canOwn: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: Unit,
      dontCreateFile: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: Unit,
      dontCreateFile: Boolean,
      canOwn: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: Unit,
      dontCreateFile: Unit,
      canOwn: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: Unit,
      onerror: js.Function0[Unit]
    ): Unit = js.native
    def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: Unit,
      onerror: js.Function0[Unit],
      dontCreateFile: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: Unit,
      onerror: js.Function0[Unit],
      dontCreateFile: Boolean,
      canOwn: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: Unit,
      onerror: js.Function0[Unit],
      dontCreateFile: Unit,
      canOwn: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: Unit,
      onerror: Unit,
      dontCreateFile: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: Unit,
      onerror: Unit,
      dontCreateFile: Boolean,
      canOwn: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: String,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: Unit,
      onerror: Unit,
      dontCreateFile: Unit,
      canOwn: Boolean
    ): Unit = js.native
    def createPreloadedFile(parent: FSNode, name: String, url: String, canRead: Boolean, canWrite: Boolean): Unit = js.native
    def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit]
    ): Unit = js.native
    def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: js.Function0[Unit]
    ): Unit = js.native
    def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: js.Function0[Unit],
      dontCreateFile: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: js.Function0[Unit],
      dontCreateFile: Boolean,
      canOwn: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: js.Function0[Unit],
      dontCreateFile: Unit,
      canOwn: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: Unit,
      dontCreateFile: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: Unit,
      dontCreateFile: Boolean,
      canOwn: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: js.Function0[Unit],
      onerror: Unit,
      dontCreateFile: Unit,
      canOwn: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: Unit,
      onerror: js.Function0[Unit]
    ): Unit = js.native
    def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: Unit,
      onerror: js.Function0[Unit],
      dontCreateFile: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: Unit,
      onerror: js.Function0[Unit],
      dontCreateFile: Boolean,
      canOwn: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: Unit,
      onerror: js.Function0[Unit],
      dontCreateFile: Unit,
      canOwn: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: Unit,
      onerror: Unit,
      dontCreateFile: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: Unit,
      onerror: Unit,
      dontCreateFile: Boolean,
      canOwn: Boolean
    ): Unit = js.native
    def createPreloadedFile(
      parent: FSNode,
      name: String,
      url: String,
      canRead: Boolean,
      canWrite: Boolean,
      onload: Unit,
      onerror: Unit,
      dontCreateFile: Unit,
      canOwn: Boolean
    ): Unit = js.native
    
    def cwd(): String = js.native
    
    def fchmod(fd: Double, mode: Double): Unit = js.native
    
    def fchown(fd: Double, uid: Double, gid: Double): Unit = js.native
    
    def ftruncate(fd: Double, len: Double): Unit = js.native
    
    def getPath(node: FSNode): String = js.native
    
    def init(
      input: js.Function0[Double],
      output: js.Function1[/* c */ Double, Any],
      error: js.Function1[/* c */ Double, Any]
    ): Unit = js.native
    
    def ioctl(stream: FSStream, cmd: Any, arg: Any): Any = js.native
    
    def isBlkdev(mode: Double): Boolean = js.native
    
    def isChrdev(mode: Double): Boolean = js.native
    
    def isDir(mode: Double): Boolean = js.native
    
    def isFIFO(mode: Double): Boolean = js.native
    
    def isFile(mode: Double): Boolean = js.native
    
    def isLink(mode: Double): Boolean = js.native
    
    def isSocket(mode: Double): Boolean = js.native
    
    def lchmod(path: String, mode: Double): Unit = js.native
    
    def lchown(path: String, uid: Double, gid: Double): Unit = js.native
    
    def llseek(stream: FSStream, offset: Double, whence: Double): Any = js.native
    
    def lookupPath(path: String, opts: Any): Lookup = js.native
    
    def lstat(path: String): Any = js.native
    
    def major(dev: Double): Double = js.native
    
    def makedev(ma: Double, mi: Double): Double = js.native
    
    def minor(dev: Double): Double = js.native
    
    def mkdev(path: String): Any = js.native
    def mkdev(path: String, mode: Double): Any = js.native
    def mkdev(path: String, mode: Double, dev: Double): Any = js.native
    def mkdev(path: String, mode: Unit, dev: Double): Any = js.native
    
    def mkdir(path: String): Any = js.native
    def mkdir(path: String, mode: Double): Any = js.native
    
    def mmap(
      stream: FSStream,
      buffer: js.typedarray.ArrayBufferView,
      offset: Double,
      length: Double,
      position: Double,
      prot: Double,
      flags: Double
    ): Any = js.native
    
    def mount(`type`: Any, opts: Any, mountpoint: String): Any = js.native
    
    def open(path: String, flags: String): FSStream = js.native
    def open(path: String, flags: String, mode: Double): FSStream = js.native
    def open(path: String, flags: String, mode: Double, fd_start: Double): FSStream = js.native
    def open(path: String, flags: String, mode: Double, fd_start: Double, fd_end: Double): FSStream = js.native
    def open(path: String, flags: String, mode: Double, fd_start: Unit, fd_end: Double): FSStream = js.native
    def open(path: String, flags: String, mode: Unit, fd_start: Double): FSStream = js.native
    def open(path: String, flags: String, mode: Unit, fd_start: Double, fd_end: Double): FSStream = js.native
    def open(path: String, flags: String, mode: Unit, fd_start: Unit, fd_end: Double): FSStream = js.native
    
    def read(stream: FSStream, buffer: js.typedarray.ArrayBufferView, offset: Double, length: Double): Double = js.native
    def read(
      stream: FSStream,
      buffer: js.typedarray.ArrayBufferView,
      offset: Double,
      length: Double,
      position: Double
    ): Double = js.native
    
    def readFile(path: String): js.typedarray.ArrayBufferView = js.native
    def readFile(path: String, opts: Encoding): js.typedarray.ArrayBufferView = js.native
    
    def readdir(path: String): js.Array[String] = js.native
    
    def readlink(path: String): String = js.native
    
    def registerDevice(dev: Double, ops: Any): Unit = js.native
    
    def rename(old_path: String, new_path: String): Unit = js.native
    
    def rmdir(path: String): Unit = js.native
    
    def stat(path: String): Any = js.native
    def stat(path: String, dontFollow: Boolean): Any = js.native
    
    def symlink(oldpath: String, newpath: String): Any = js.native
    
    def syncfs(callback: js.Function1[/* e */ Any, Any]): Unit = js.native
    def syncfs(callback: js.Function1[/* e */ Any, Any], populate: Boolean): Unit = js.native
    def syncfs(populate: Boolean, callback: js.Function1[/* e */ Any, Any]): Unit = js.native
    
    def truncate(path: String, len: Double): Unit = js.native
    
    def unlink(path: String): Unit = js.native
    
    def unmount(mountpoint: String): Unit = js.native
    
    def utime(path: String, atime: Double, mtime: Double): Unit = js.native
    
    def write(stream: FSStream, buffer: js.typedarray.ArrayBufferView, offset: Double, length: Double): Double = js.native
    def write(
      stream: FSStream,
      buffer: js.typedarray.ArrayBufferView,
      offset: Double,
      length: Double,
      position: Double
    ): Double = js.native
    def write(
      stream: FSStream,
      buffer: js.typedarray.ArrayBufferView,
      offset: Double,
      length: Double,
      position: Double,
      canOwn: Boolean
    ): Double = js.native
    def write(
      stream: FSStream,
      buffer: js.typedarray.ArrayBufferView,
      offset: Double,
      length: Double,
      position: Unit,
      canOwn: Boolean
    ): Double = js.native
    
    def writeFile(path: String, data: String): Unit = js.native
    def writeFile(path: String, data: String, opts: Encoding): Unit = js.native
    def writeFile(path: String, data: js.typedarray.ArrayBufferView): Unit = js.native
    def writeFile(path: String, data: js.typedarray.ArrayBufferView, opts: Encoding): Unit = js.native
  }
  
  trait FSNode extends StObject
  
  trait FSStream extends StObject
  
  trait Lookup extends StObject {
    
    var node: FSNode
    
    var path: String
  }
  object Lookup {
    
    inline def apply(node: FSNode, path: String): Lookup = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lookup]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Lookup] (val x: Self) extends AnyVal {
      
      inline def setNode(value: FSNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  type TypeCompatibleWithC = Double | String | js.Array[Any] | Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typings.mirada.miradaStrings.number
    - typings.mirada.miradaStrings.string
    - typings.mirada.miradaStrings.array
    - typings.mirada.miradaStrings.boolean
  */
  trait ValueType extends StObject
  object ValueType {
    
    inline def array: typings.mirada.miradaStrings.array = "array".asInstanceOf[typings.mirada.miradaStrings.array]
    
    inline def boolean: typings.mirada.miradaStrings.boolean = "boolean".asInstanceOf[typings.mirada.miradaStrings.boolean]
    
    inline def number: typings.mirada.miradaStrings.number = "number".asInstanceOf[typings.mirada.miradaStrings.number]
    
    inline def string: typings.mirada.miradaStrings.string = "string".asInstanceOf[typings.mirada.miradaStrings.string]
  }
  
  type WebAssemblyExports = js.Array[Module]
  
  type WebAssemblyImports = js.Array[Kind]
  
  trait WebAssemblyModule extends StObject
}
