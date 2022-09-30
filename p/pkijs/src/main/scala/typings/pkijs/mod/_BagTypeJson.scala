package typings.pkijs.mod

import typings.asn1js.mod.BaseBlockJson
import typings.asn1js.mod.LocalBaseBlockJson
import typings.asn1js.mod.OctetStringJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _BagTypeJson extends StObject
object _BagTypeJson {
  
  inline def CRLBagJson(crlId: String, crlValue: Any): typings.pkijs.mod.CRLBagJson = {
    val __obj = js.Dynamic.literal(crlId = crlId.asInstanceOf[js.Any], crlValue = crlValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pkijs.mod.CRLBagJson]
  }
  
  inline def CertBagJson(certId: String, certValue: Any): typings.pkijs.mod.CertBagJson = {
    val __obj = js.Dynamic.literal(certId = certId.asInstanceOf[js.Any], certValue = certValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pkijs.mod.CertBagJson]
  }
  
  inline def PKCS8ShroudedKeyBagJson(encryptedData: OctetStringJson, encryptionAlgorithm: AlgorithmIdentifierJson): typings.pkijs.mod.PKCS8ShroudedKeyBagJson = {
    val __obj = js.Dynamic.literal(encryptedData = encryptedData.asInstanceOf[js.Any], encryptionAlgorithm = encryptionAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pkijs.mod.PKCS8ShroudedKeyBagJson]
  }
  
  inline def PrivateKeyInfoJson(privateKey: OctetStringJson, privateKeyAlgorithm: AlgorithmIdentifierJson, version: Double): typings.pkijs.mod.PrivateKeyInfoJson = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], privateKeyAlgorithm = privateKeyAlgorithm.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pkijs.mod.PrivateKeyInfoJson]
  }
  
  inline def SafeContentsJson(safeBags: js.Array[SafeBagJson]): typings.pkijs.mod.SafeContentsJson = {
    val __obj = js.Dynamic.literal(safeBags = safeBags.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pkijs.mod.SafeContentsJson]
  }
  
  inline def SecretBagJson(secretTypeId: String, secretValue: BaseBlockJson[LocalBaseBlockJson]): typings.pkijs.mod.SecretBagJson = {
    val __obj = js.Dynamic.literal(secretTypeId = secretTypeId.asInstanceOf[js.Any], secretValue = secretValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pkijs.mod.SecretBagJson]
  }
}
