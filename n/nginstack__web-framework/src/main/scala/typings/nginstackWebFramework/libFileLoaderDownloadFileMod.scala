package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFileLoaderDownloadFileMod {
  
  inline def apply(name: String, contentFileName: String, contentType: String): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], contentFileName.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/file-loader/DownloadFile", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with DownloadFile {
    def this(name: String, contentFileName: String, contentType: String) = this()
    
    /* CompleteClass */
    override def openFile(): typings.nginstackEngine.libIoFileMod.^ = js.native
  }
  @JSImport("@nginstack/web-framework/lib/file-loader/DownloadFile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DownloadFile extends StObject {
    
    def openFile(): typings.nginstackEngine.libIoFileMod.^
  }
  object DownloadFile {
    
    inline def apply(openFile: () => typings.nginstackEngine.libIoFileMod.^): DownloadFile = {
      val __obj = js.Dynamic.literal(openFile = js.Any.fromFunction0(openFile))
      __obj.asInstanceOf[DownloadFile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DownloadFile] (val x: Self) extends AnyVal {
      
      inline def setOpenFile(value: () => typings.nginstackEngine.libIoFileMod.^): Self = StObject.set(x, "openFile", js.Any.fromFunction0(value))
    }
  }
}
