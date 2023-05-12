package typings.pkijs.mod

import typings.std.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvelopedDataDecryptBaseParams extends StObject {
  
  var preDefinedData: js.UndefOr[BufferSource] = js.undefined
  
  var recipientCertificate: js.UndefOr[Certificate] = js.undefined
}
object EnvelopedDataDecryptBaseParams {
  
  inline def apply(): EnvelopedDataDecryptBaseParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopedDataDecryptBaseParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvelopedDataDecryptBaseParams] (val x: Self) extends AnyVal {
    
    inline def setPreDefinedData(value: BufferSource): Self = StObject.set(x, "preDefinedData", value.asInstanceOf[js.Any])
    
    inline def setPreDefinedDataUndefined: Self = StObject.set(x, "preDefinedData", js.undefined)
    
    inline def setRecipientCertificate(value: Certificate): Self = StObject.set(x, "recipientCertificate", value.asInstanceOf[js.Any])
    
    inline def setRecipientCertificateUndefined: Self = StObject.set(x, "recipientCertificate", js.undefined)
  }
}
