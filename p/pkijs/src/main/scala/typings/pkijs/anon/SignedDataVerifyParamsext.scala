package typings.pkijs.anon

import typings.pkijs.mod.Certificate
import typings.pkijs.mod.CertificateChainValidationEngine
import typings.pkijs.mod.FindIssuerCallback
import typings.pkijs.mod.FindOriginCallback
import typings.pkijs.mod.ICryptoEngine
import typings.pkijs.pkijsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.SignedDataVerifyParams & {  extendedMode :false | undefined} */
trait SignedDataVerifyParamsext extends StObject {
  
  var checkChain: js.UndefOr[Boolean] = js.undefined
  
  var checkDate: js.UndefOr[js.Date] = js.undefined
  
  var data: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  var extendedMode: js.UndefOr[Boolean] & js.UndefOr[`false`]
  
  var findIssuer: js.UndefOr[FindIssuerCallback | Null] = js.undefined
  
  var findOrigin: js.UndefOr[FindOriginCallback | Null] = js.undefined
  
  var passedWhenNotRevValues: js.UndefOr[Boolean] = js.undefined
  
  var signer: js.UndefOr[Double] = js.undefined
  
  var trustedCerts: js.UndefOr[js.Array[Certificate]] = js.undefined
}
object SignedDataVerifyParamsext {
  
  inline def apply(extendedMode: js.UndefOr[Boolean] & js.UndefOr[`false`]): SignedDataVerifyParamsext = {
    val __obj = js.Dynamic.literal(extendedMode = extendedMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedDataVerifyParamsext]
  }
  
  extension [Self <: SignedDataVerifyParamsext](x: Self) {
    
    inline def setCheckChain(value: Boolean): Self = StObject.set(x, "checkChain", value.asInstanceOf[js.Any])
    
    inline def setCheckChainUndefined: Self = StObject.set(x, "checkChain", js.undefined)
    
    inline def setCheckDate(value: js.Date): Self = StObject.set(x, "checkDate", value.asInstanceOf[js.Any])
    
    inline def setCheckDateUndefined: Self = StObject.set(x, "checkDate", js.undefined)
    
    inline def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setExtendedMode(value: js.UndefOr[Boolean] & js.UndefOr[`false`]): Self = StObject.set(x, "extendedMode", value.asInstanceOf[js.Any])
    
    inline def setFindIssuer(
      value: (/* certificate */ Certificate, /* validationEngine */ CertificateChainValidationEngine, /* crypto */ js.UndefOr[ICryptoEngine]) => js.Promise[js.Array[Certificate]]
    ): Self = StObject.set(x, "findIssuer", js.Any.fromFunction3(value))
    
    inline def setFindIssuerNull: Self = StObject.set(x, "findIssuer", null)
    
    inline def setFindIssuerUndefined: Self = StObject.set(x, "findIssuer", js.undefined)
    
    inline def setFindOrigin(
      value: (/* certificate */ Certificate, /* validationEngine */ CertificateChainValidationEngine) => String
    ): Self = StObject.set(x, "findOrigin", js.Any.fromFunction2(value))
    
    inline def setFindOriginNull: Self = StObject.set(x, "findOrigin", null)
    
    inline def setFindOriginUndefined: Self = StObject.set(x, "findOrigin", js.undefined)
    
    inline def setPassedWhenNotRevValues(value: Boolean): Self = StObject.set(x, "passedWhenNotRevValues", value.asInstanceOf[js.Any])
    
    inline def setPassedWhenNotRevValuesUndefined: Self = StObject.set(x, "passedWhenNotRevValues", js.undefined)
    
    inline def setSigner(value: Double): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
    
    inline def setSignerUndefined: Self = StObject.set(x, "signer", js.undefined)
    
    inline def setTrustedCerts(value: js.Array[Certificate]): Self = StObject.set(x, "trustedCerts", value.asInstanceOf[js.Any])
    
    inline def setTrustedCertsUndefined: Self = StObject.set(x, "trustedCerts", js.undefined)
    
    inline def setTrustedCertsVarargs(value: Certificate*): Self = StObject.set(x, "trustedCerts", js.Array(value*))
  }
}
