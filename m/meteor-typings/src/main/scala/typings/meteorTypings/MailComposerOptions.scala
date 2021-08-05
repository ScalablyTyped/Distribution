package typings.meteorTypings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailComposerOptions extends StObject {
  
  var charset: String
  
  var encoding: String
  
  var escapeSMTP: Boolean
  
  var forceEmbeddedImages: Boolean
  
  var keepBcc: Boolean
}
object MailComposerOptions {
  
  inline def apply(
    charset: String,
    encoding: String,
    escapeSMTP: Boolean,
    forceEmbeddedImages: Boolean,
    keepBcc: Boolean
  ): MailComposerOptions = {
    val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], escapeSMTP = escapeSMTP.asInstanceOf[js.Any], forceEmbeddedImages = forceEmbeddedImages.asInstanceOf[js.Any], keepBcc = keepBcc.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailComposerOptions]
  }
  
  extension [Self <: MailComposerOptions](x: Self) {
    
    inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEscapeSMTP(value: Boolean): Self = StObject.set(x, "escapeSMTP", value.asInstanceOf[js.Any])
    
    inline def setForceEmbeddedImages(value: Boolean): Self = StObject.set(x, "forceEmbeddedImages", value.asInstanceOf[js.Any])
    
    inline def setKeepBcc(value: Boolean): Self = StObject.set(x, "keepBcc", value.asInstanceOf[js.Any])
  }
}
