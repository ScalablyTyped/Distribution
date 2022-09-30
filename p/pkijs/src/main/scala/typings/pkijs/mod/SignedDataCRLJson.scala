package typings.pkijs.mod

import typings.asn1js.mod.BitStringJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.pkijs.mod.CertificateRevocationListJson
  - typings.pkijs.mod.OtherRevocationInfoFormatJson
*/
trait SignedDataCRLJson extends StObject
object SignedDataCRLJson {
  
  inline def CertificateRevocationListJson(
    issuer: RelativeDistinguishedNamesJson,
    signature: AlgorithmIdentifierJson,
    signatureAlgorithm: AlgorithmIdentifierJson,
    signatureValue: BitStringJson,
    tbs: String,
    thisUpdate: TimeJson,
    version: Double
  ): typings.pkijs.mod.CertificateRevocationListJson = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any], signatureValue = signatureValue.asInstanceOf[js.Any], tbs = tbs.asInstanceOf[js.Any], thisUpdate = thisUpdate.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pkijs.mod.CertificateRevocationListJson]
  }
  
  inline def OtherRevocationInfoFormatJson(otherRevInfoFormat: String): typings.pkijs.mod.OtherRevocationInfoFormatJson = {
    val __obj = js.Dynamic.literal(otherRevInfoFormat = otherRevInfoFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pkijs.mod.OtherRevocationInfoFormatJson]
  }
}
