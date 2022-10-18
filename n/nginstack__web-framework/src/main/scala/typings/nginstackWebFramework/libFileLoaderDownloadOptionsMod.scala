package typings.nginstackWebFramework

import typings.nginstackWebFramework.anon.FileName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFileLoaderDownloadOptionsMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(opt_options: FileName): Unit = ^.asInstanceOf[js.Dynamic].apply(opt_options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/file-loader/DownloadOptions", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DownloadOptions {
    def this(opt_options: FileName) = this()
    
    /* CompleteClass */
    var fileName: String = js.native
  }
  @JSImport("@nginstack/web-framework/lib/file-loader/DownloadOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DownloadOptions extends StObject {
    
    var fileName: String
  }
  object DownloadOptions {
    
    inline def apply(fileName: String): DownloadOptions = {
      val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadOptions]
    }
    
    extension [Self <: DownloadOptions](x: Self) {
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    }
  }
}
