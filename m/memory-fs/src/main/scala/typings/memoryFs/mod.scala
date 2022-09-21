package typings.memoryFs

import typings.memoryFs.anon.End
import typings.memoryFs.anon.IsBlockDevice
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("memory-fs", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with MemoryFileSystem {
    def this(data: Any) = this()
  }
  
  @js.native
  trait MemoryFileSystem extends StObject {
    
    def _remove(_path: String, name: String, testFn: js.Function1[/* part */ String, Boolean]): Unit = js.native
    
    def createReadStream(path: String): Any = js.native
    def createReadStream(path: String, options: End): Any = js.native
    
    def createWriteStream(path: String): Any = js.native
    def createWriteStream(path: String, options: Any): Any = js.native
    
    var data: Any = js.native
    
    def exists(path: String, callback: js.Function1[/* isExist */ Boolean, Unit]): Unit = js.native
    
    def existsSync(_path: String): Boolean = js.native
    
    def join(path: String, request: String): String = js.native
    
    def meta(_path: String): Any = js.native
    
    def mkdir(path: String, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
    def mkdir(
      path: String,
      optArg: js.Object,
      callback: js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[Any], Unit]
    ): Unit = js.native
    
    def mkdirSync(_path: String): Unit = js.native
    
    def mkdirp(
      path: String,
      callback: js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[Any], Unit]
    ): Unit = js.native
    
    def mkdirpSync(_path: String): Unit = js.native
    
    def normalize(path: String): String = js.native
    
    def pathToArray(path: String): js.Array[String] = js.native
    
    def readFile(
      path: String,
      callback: js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[Any], Unit]
    ): Unit = js.native
    def readFile(
      path: String,
      optArg: js.Object,
      callback: js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[Any], Unit]
    ): Unit = js.native
    
    def readFileSync(_path: String): Any = js.native
    def readFileSync(_path: String, encoding: String): Any = js.native
    
    def readdir(
      path: String,
      callback: js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[Any], Unit]
    ): Unit = js.native
    
    def readdirSync(_path: String): js.Array[String] = js.native
    
    def readlink(
      path: String,
      callback: js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[Any], Unit]
    ): Unit = js.native
    
    def readlinkSync(_path: String): String = js.native
    
    def rmdir(
      path: String,
      callback: js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[Any], Unit]
    ): Unit = js.native
    
    def rmdirSync(_path: String): Unit = js.native
    
    def stat(
      path: String,
      callback: js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[Any], Unit]
    ): Unit = js.native
    
    def statSync(_path: String): IsBlockDevice = js.native
    
    def unlink(
      path: String,
      callback: js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[Any], Unit]
    ): Unit = js.native
    
    def unlinkSync(_path: String): Unit = js.native
    
    def writeFile(path: String, content: String, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    def writeFile(
      path: String,
      content: String,
      encoding: String,
      callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    def writeFile(path: String, content: Buffer, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    def writeFile(
      path: String,
      content: Buffer,
      encoding: String,
      callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    
    def writeFileSync(_path: String, content: String): Unit = js.native
    def writeFileSync(_path: String, content: String, encoding: String): Unit = js.native
    def writeFileSync(_path: String, content: Buffer): Unit = js.native
    def writeFileSync(_path: String, content: Buffer, encoding: String): Unit = js.native
  }
}
