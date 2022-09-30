package typings.pkijs.anon

import typings.pkijs.mod.Certificate
import typings.std.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreDefinedData extends StObject {
  
  var preDefinedData: js.UndefOr[BufferSource] = js.undefined
  
  var recipientCertificate: js.UndefOr[Certificate] = js.undefined
  
  var recipientPrivateKey: js.UndefOr[BufferSource] = js.undefined
}
object PreDefinedData {
  
  inline def apply(): PreDefinedData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreDefinedData]
  }
  
  extension [Self <: PreDefinedData](x: Self) {
    
    inline def setPreDefinedData(value: BufferSource): Self = StObject.set(x, "preDefinedData", value.asInstanceOf[js.Any])
    
    inline def setPreDefinedDataUndefined: Self = StObject.set(x, "preDefinedData", js.undefined)
    
    inline def setRecipientCertificate(value: Certificate): Self = StObject.set(x, "recipientCertificate", value.asInstanceOf[js.Any])
    
    inline def setRecipientCertificateUndefined: Self = StObject.set(x, "recipientCertificate", js.undefined)
    
    inline def setRecipientPrivateKey(value: BufferSource): Self = StObject.set(x, "recipientPrivateKey", value.asInstanceOf[js.Any])
    
    inline def setRecipientPrivateKeyUndefined: Self = StObject.set(x, "recipientPrivateKey", js.undefined)
  }
}
