package typings.nginstackEngine

import typings.nginstackEngine.nginstackEngineStrings.bzip2
import typings.nginstackEngine.nginstackEngineStrings.create
import typings.nginstackEngine.nginstackEngineStrings.deflate
import typings.nginstackEngine.nginstackEngineStrings.unzip
import typings.nginstackEngine.nginstackEngineStrings.zip
import typings.nginstackEngine.nginstackEngineStrings.zstd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCompressZipFileMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/compress/ZipFile", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ZipFile
  @JSImport("@nginstack/engine/lib/compress/ZipFile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait ZipFile extends StObject {
    
    def close(): Unit = js.native
    
    def extract(path: String, pathToExtract: String): Unit = js.native
    
    def extractAll(path: String): Unit = js.native
    
    def getFileNames(): js.Array[String] = js.native
    
    def open(path: String, mode: create | zip | unzip): Unit = js.native
    def open(path: String, mode: create | zip | unzip, options: ZipFileOptions): Unit = js.native
    
    def write(paths: String): Unit = js.native
    def write(paths: js.Array[String]): Unit = js.native
    
    def writeString(string: String, fileName: String): Unit = js.native
  }
  
  trait ZipFileOptions extends StObject {
    
    var level: js.UndefOr[Double] = js.undefined
    
    var method: js.UndefOr[deflate | bzip2 | zstd] = js.undefined
  }
  object ZipFileOptions {
    
    inline def apply(): ZipFileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZipFileOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZipFileOptions] (val x: Self) extends AnyVal {
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMethod(value: deflate | bzip2 | zstd): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    }
  }
}
