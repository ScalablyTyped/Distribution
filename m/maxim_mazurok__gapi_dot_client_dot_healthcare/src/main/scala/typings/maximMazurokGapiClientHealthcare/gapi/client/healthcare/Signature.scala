package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Signature extends StObject {
  
  /** Optional. An image of the user's signature. */
  var image: js.UndefOr[Image] = js.undefined
  
  /** Optional. Metadata associated with the user's signature. For example, the user's name or the user's title. */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Optional. Timestamp of the signature. */
  var signatureTime: js.UndefOr[String] = js.undefined
  
  /** Required. User's UUID provided by the client. */
  var userId: js.UndefOr[String] = js.undefined
}
object Signature {
  
  inline def apply(): Signature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Signature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Signature] (val x: Self) extends AnyVal {
    
    inline def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setMetadata(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setSignatureTime(value: String): Self = StObject.set(x, "signatureTime", value.asInstanceOf[js.Any])
    
    inline def setSignatureTimeUndefined: Self = StObject.set(x, "signatureTime", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
