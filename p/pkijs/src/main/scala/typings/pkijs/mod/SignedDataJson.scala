package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignedDataJson extends StObject {
  
  var certificates: js.UndefOr[js.Array[CertificateSetItemJson]] = js.undefined
  
  var crls: js.UndefOr[js.Array[SignedDataCRLJson]] = js.undefined
  
  var digestAlgorithms: js.Array[AlgorithmIdentifierJson]
  
  var encapContentInfo: EncapsulatedContentInfoJson
  
  var ocsps: js.UndefOr[js.Array[BasicOCSPResponseJson]] = js.undefined
  
  var signerInfos: js.Array[SignerInfoJson]
  
  var version: Double
}
object SignedDataJson {
  
  inline def apply(
    digestAlgorithms: js.Array[AlgorithmIdentifierJson],
    encapContentInfo: EncapsulatedContentInfoJson,
    signerInfos: js.Array[SignerInfoJson],
    version: Double
  ): SignedDataJson = {
    val __obj = js.Dynamic.literal(digestAlgorithms = digestAlgorithms.asInstanceOf[js.Any], encapContentInfo = encapContentInfo.asInstanceOf[js.Any], signerInfos = signerInfos.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedDataJson]
  }
  
  extension [Self <: SignedDataJson](x: Self) {
    
    inline def setCertificates(value: js.Array[CertificateSetItemJson]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesUndefined: Self = StObject.set(x, "certificates", js.undefined)
    
    inline def setCertificatesVarargs(value: CertificateSetItemJson*): Self = StObject.set(x, "certificates", js.Array(value*))
    
    inline def setCrls(value: js.Array[SignedDataCRLJson]): Self = StObject.set(x, "crls", value.asInstanceOf[js.Any])
    
    inline def setCrlsUndefined: Self = StObject.set(x, "crls", js.undefined)
    
    inline def setCrlsVarargs(value: SignedDataCRLJson*): Self = StObject.set(x, "crls", js.Array(value*))
    
    inline def setDigestAlgorithms(value: js.Array[AlgorithmIdentifierJson]): Self = StObject.set(x, "digestAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setDigestAlgorithmsVarargs(value: AlgorithmIdentifierJson*): Self = StObject.set(x, "digestAlgorithms", js.Array(value*))
    
    inline def setEncapContentInfo(value: EncapsulatedContentInfoJson): Self = StObject.set(x, "encapContentInfo", value.asInstanceOf[js.Any])
    
    inline def setOcsps(value: js.Array[BasicOCSPResponseJson]): Self = StObject.set(x, "ocsps", value.asInstanceOf[js.Any])
    
    inline def setOcspsUndefined: Self = StObject.set(x, "ocsps", js.undefined)
    
    inline def setOcspsVarargs(value: BasicOCSPResponseJson*): Self = StObject.set(x, "ocsps", js.Array(value*))
    
    inline def setSignerInfos(value: js.Array[SignerInfoJson]): Self = StObject.set(x, "signerInfos", value.asInstanceOf[js.Any])
    
    inline def setSignerInfosVarargs(value: SignerInfoJson*): Self = StObject.set(x, "signerInfos", js.Array(value*))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
