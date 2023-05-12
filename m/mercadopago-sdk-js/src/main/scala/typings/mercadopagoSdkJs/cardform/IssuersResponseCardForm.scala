package typings.mercadopagoSdkJs.cardform

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuersResponseCardForm extends StObject {
  
  var id: String
  
  var merchant_account_id: String
  
  var name: String
  
  var processing_mode: String
  
  var thumbnail: String
}
object IssuersResponseCardForm {
  
  inline def apply(id: String, merchant_account_id: String, name: String, processing_mode: String, thumbnail: String): IssuersResponseCardForm = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], merchant_account_id = merchant_account_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], processing_mode = processing_mode.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuersResponseCardForm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IssuersResponseCardForm] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMerchant_account_id(value: String): Self = StObject.set(x, "merchant_account_id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProcessing_mode(value: String): Self = StObject.set(x, "processing_mode", value.asInstanceOf[js.Any])
    
    inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
  }
}
