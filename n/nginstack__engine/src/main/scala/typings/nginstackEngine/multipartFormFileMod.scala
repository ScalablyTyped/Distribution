package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multipartFormFileMod {
  
  inline def apply(name: String, filePath: String): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(name: String, filePath: String, contentType: String): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/multipart/MultipartFormFile", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with MultipartFormFile {
    def this(name: String, filePath: String) = this()
    def this(name: String, filePath: String, contentType: String) = this()
    
    /* CompleteClass */
    var contentType: String = js.native
    
    /* private */ /* CompleteClass */
    var contentType_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var filePath_ : Any = js.native
    
    /* CompleteClass */
    override def moveTo(filePath: String): Boolean = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* private */ /* CompleteClass */
    var name_ : Any = js.native
    
    /* CompleteClass */
    var size: Double = js.native
  }
  @JSImport("@nginstack/engine/lib/multipart/MultipartFormFile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait MultipartFormFile extends StObject {
    
    var contentType: String
    
    /* private */ var contentType_ : Any
    
    /* private */ var filePath_ : Any
    
    def moveTo(filePath: String): Boolean
    
    var name: String
    
    /* private */ var name_ : Any
    
    var size: Double
  }
  object MultipartFormFile {
    
    inline def apply(
      contentType: String,
      contentType_ : Any,
      filePath_ : Any,
      moveTo: String => Boolean,
      name: String,
      name_ : Any,
      size: Double
    ): MultipartFormFile = {
      val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], contentType_ = contentType_.asInstanceOf[js.Any], filePath_ = filePath_.asInstanceOf[js.Any], moveTo = js.Any.fromFunction1(moveTo), name = name.asInstanceOf[js.Any], name_ = name_.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultipartFormFile]
    }
    
    extension [Self <: MultipartFormFile](x: Self) {
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentType_(value: Any): Self = StObject.set(x, "contentType_", value.asInstanceOf[js.Any])
      
      inline def setFilePath_(value: Any): Self = StObject.set(x, "filePath_", value.asInstanceOf[js.Any])
      
      inline def setMoveTo(value: String => Boolean): Self = StObject.set(x, "moveTo", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setName_(value: Any): Self = StObject.set(x, "name_", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
