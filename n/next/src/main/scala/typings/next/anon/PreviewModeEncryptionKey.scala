package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviewModeEncryptionKey extends StObject {
  
  var previewModeEncryptionKey: String
  
  var previewModeId: String
  
  var previewModeSigningKey: String
}
object PreviewModeEncryptionKey {
  
  inline def apply(previewModeEncryptionKey: String, previewModeId: String, previewModeSigningKey: String): PreviewModeEncryptionKey = {
    val __obj = js.Dynamic.literal(previewModeEncryptionKey = previewModeEncryptionKey.asInstanceOf[js.Any], previewModeId = previewModeId.asInstanceOf[js.Any], previewModeSigningKey = previewModeSigningKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewModeEncryptionKey]
  }
  
  extension [Self <: PreviewModeEncryptionKey](x: Self) {
    
    inline def setPreviewModeEncryptionKey(value: String): Self = StObject.set(x, "previewModeEncryptionKey", value.asInstanceOf[js.Any])
    
    inline def setPreviewModeId(value: String): Self = StObject.set(x, "previewModeId", value.asInstanceOf[js.Any])
    
    inline def setPreviewModeSigningKey(value: String): Self = StObject.set(x, "previewModeSigningKey", value.asInstanceOf[js.Any])
  }
}
