package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadedFileMod {
  
  inline def apply(name: Any, contentFileName: Any, contentType: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], contentFileName.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/file-loader/LoadedFile", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with LoadedFile {
    def this(name: Any, contentFileName: Any, contentType: Any) = this()
    
    /* private */ /* CompleteClass */
    var contentFileName_ : Any = js.native
    
    /* CompleteClass */
    var contentType: String = js.native
    
    /* private */ /* CompleteClass */
    var contentType_ : Any = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* private */ /* CompleteClass */
    var name_ : Any = js.native
    
    /* CompleteClass */
    var sha256: String = js.native
    
    /* CompleteClass */
    var size: Double = js.native
  }
  @JSImport("@nginstack/web-framework/lib/file-loader/LoadedFile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait LoadedFile extends StObject {
    
    /* private */ var contentFileName_ : Any
    
    var contentType: String
    
    /* private */ var contentType_ : Any
    
    var name: String
    
    /* private */ var name_ : Any
    
    var sha256: String
    
    var size: Double
  }
  object LoadedFile {
    
    inline def apply(
      contentFileName_ : Any,
      contentType: String,
      contentType_ : Any,
      name: String,
      name_ : Any,
      sha256: String,
      size: Double
    ): LoadedFile = {
      val __obj = js.Dynamic.literal(contentFileName_ = contentFileName_.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], contentType_ = contentType_.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], name_ = name_.asInstanceOf[js.Any], sha256 = sha256.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadedFile]
    }
    
    extension [Self <: LoadedFile](x: Self) {
      
      inline def setContentFileName_(value: Any): Self = StObject.set(x, "contentFileName_", value.asInstanceOf[js.Any])
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentType_(value: Any): Self = StObject.set(x, "contentType_", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setName_(value: Any): Self = StObject.set(x, "name_", value.asInstanceOf[js.Any])
      
      inline def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
