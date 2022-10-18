package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFileLoaderUploadOptionsMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(opt_options: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(opt_options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/file-loader/UploadOptions", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with UploadOptions {
    def this(opt_options: Any) = this()
    
    /* CompleteClass */
    var accept: js.Array[String] = js.native
    
    /* CompleteClass */
    var maxFileSize: Double = js.native
    
    /* CompleteClass */
    var maxFiles: Double = js.native
    
    /* CompleteClass */
    var maxTotalSize: Double = js.native
    
    /* CompleteClass */
    var timeout: Double = js.native
  }
  @JSImport("@nginstack/web-framework/lib/file-loader/UploadOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait UploadOptions extends StObject {
    
    var accept: js.Array[String]
    
    var maxFileSize: Double
    
    var maxFiles: Double
    
    var maxTotalSize: Double
    
    var timeout: Double
  }
  object UploadOptions {
    
    inline def apply(
      accept: js.Array[String],
      maxFileSize: Double,
      maxFiles: Double,
      maxTotalSize: Double,
      timeout: Double
    ): UploadOptions = {
      val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], maxFileSize = maxFileSize.asInstanceOf[js.Any], maxFiles = maxFiles.asInstanceOf[js.Any], maxTotalSize = maxTotalSize.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadOptions]
    }
    
    extension [Self <: UploadOptions](x: Self) {
      
      inline def setAccept(value: js.Array[String]): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptVarargs(value: String*): Self = StObject.set(x, "accept", js.Array(value*))
      
      inline def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
      
      inline def setMaxFiles(value: Double): Self = StObject.set(x, "maxFiles", value.asInstanceOf[js.Any])
      
      inline def setMaxTotalSize(value: Double): Self = StObject.set(x, "maxTotalSize", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
}
