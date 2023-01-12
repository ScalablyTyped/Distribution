package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMailMailMessagePartMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/mail/MailMessagePart", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with MailMessagePart {
    
    /* CompleteClass */
    var boundary: String = js.native
    
    /* CompleteClass */
    var charset: String = js.native
    
    /* CompleteClass */
    var content: String = js.native
    
    /* CompleteClass */
    var contentID: String = js.native
    
    /* CompleteClass */
    var defaultCharset: String = js.native
    
    /* CompleteClass */
    var description: String = js.native
    
    /* CompleteClass */
    var disposition: String = js.native
    
    /* CompleteClass */
    var encoding: String = js.native
    
    /* CompleteClass */
    var fileName: String = js.native
    
    /* CompleteClass */
    var headers: js.Array[Any] = js.native
    
    /* CompleteClass */
    var level: Double = js.native
    
    /* CompleteClass */
    var ownerMessagePart: MailMessagePart = js.native
    
    /* CompleteClass */
    var partBody: String = js.native
    
    /* CompleteClass */
    var postPart: String = js.native
    
    /* CompleteClass */
    var prePart: String = js.native
    
    /* CompleteClass */
    var primary: String = js.native
    
    /* CompleteClass */
    var secondary: String = js.native
  }
  @JSImport("@nginstack/engine/lib/mail/MailMessagePart", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait MailMessagePart extends StObject {
    
    var boundary: String
    
    var charset: String
    
    var content: String
    
    var contentID: String
    
    var defaultCharset: String
    
    var description: String
    
    var disposition: String
    
    var encoding: String
    
    var fileName: String
    
    var headers: js.Array[Any]
    
    var level: Double
    
    var ownerMessagePart: MailMessagePart
    
    var partBody: String
    
    var postPart: String
    
    var prePart: String
    
    var primary: String
    
    var secondary: String
  }
  object MailMessagePart {
    
    inline def apply(
      boundary: String,
      charset: String,
      content: String,
      contentID: String,
      defaultCharset: String,
      description: String,
      disposition: String,
      encoding: String,
      fileName: String,
      headers: js.Array[Any],
      level: Double,
      ownerMessagePart: MailMessagePart,
      partBody: String,
      postPart: String,
      prePart: String,
      primary: String,
      secondary: String
    ): MailMessagePart = {
      val __obj = js.Dynamic.literal(boundary = boundary.asInstanceOf[js.Any], charset = charset.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentID = contentID.asInstanceOf[js.Any], defaultCharset = defaultCharset.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], disposition = disposition.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ownerMessagePart = ownerMessagePart.asInstanceOf[js.Any], partBody = partBody.asInstanceOf[js.Any], postPart = postPart.asInstanceOf[js.Any], prePart = prePart.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any])
      __obj.asInstanceOf[MailMessagePart]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MailMessagePart] (val x: Self) extends AnyVal {
      
      inline def setBoundary(value: String): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentID(value: String): Self = StObject.set(x, "contentID", value.asInstanceOf[js.Any])
      
      inline def setDefaultCharset(value: String): Self = StObject.set(x, "defaultCharset", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDisposition(value: String): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: js.Array[Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersVarargs(value: Any*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setOwnerMessagePart(value: MailMessagePart): Self = StObject.set(x, "ownerMessagePart", value.asInstanceOf[js.Any])
      
      inline def setPartBody(value: String): Self = StObject.set(x, "partBody", value.asInstanceOf[js.Any])
      
      inline def setPostPart(value: String): Self = StObject.set(x, "postPart", value.asInstanceOf[js.Any])
      
      inline def setPrePart(value: String): Self = StObject.set(x, "prePart", value.asInstanceOf[js.Any])
      
      inline def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setSecondary(value: String): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    }
  }
}
