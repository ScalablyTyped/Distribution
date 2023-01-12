package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISignedData extends StObject {
  
  var certificates: js.UndefOr[js.Array[CertificateSetItem]] = js.undefined
  
  var crls: js.UndefOr[js.Array[SignedDataCRL]] = js.undefined
  
  var digestAlgorithms: js.Array[AlgorithmIdentifier]
  
  var encapContentInfo: EncapsulatedContentInfo
  
  var ocsps: js.UndefOr[js.Array[BasicOCSPResponse]] = js.undefined
  
  var signerInfos: js.Array[SignerInfo]
  
  var version: Double
}
object ISignedData {
  
  inline def apply(
    digestAlgorithms: js.Array[AlgorithmIdentifier],
    encapContentInfo: EncapsulatedContentInfo,
    signerInfos: js.Array[SignerInfo],
    version: Double
  ): ISignedData = {
    val __obj = js.Dynamic.literal(digestAlgorithms = digestAlgorithms.asInstanceOf[js.Any], encapContentInfo = encapContentInfo.asInstanceOf[js.Any], signerInfos = signerInfos.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISignedData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISignedData] (val x: Self) extends AnyVal {
    
    inline def setCertificates(value: js.Array[CertificateSetItem]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesUndefined: Self = StObject.set(x, "certificates", js.undefined)
    
    inline def setCertificatesVarargs(value: CertificateSetItem*): Self = StObject.set(x, "certificates", js.Array(value*))
    
    inline def setCrls(value: js.Array[SignedDataCRL]): Self = StObject.set(x, "crls", value.asInstanceOf[js.Any])
    
    inline def setCrlsUndefined: Self = StObject.set(x, "crls", js.undefined)
    
    inline def setCrlsVarargs(value: SignedDataCRL*): Self = StObject.set(x, "crls", js.Array(value*))
    
    inline def setDigestAlgorithms(value: js.Array[AlgorithmIdentifier]): Self = StObject.set(x, "digestAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setDigestAlgorithmsVarargs(value: AlgorithmIdentifier*): Self = StObject.set(x, "digestAlgorithms", js.Array(value*))
    
    inline def setEncapContentInfo(value: EncapsulatedContentInfo): Self = StObject.set(x, "encapContentInfo", value.asInstanceOf[js.Any])
    
    inline def setOcsps(value: js.Array[BasicOCSPResponse]): Self = StObject.set(x, "ocsps", value.asInstanceOf[js.Any])
    
    inline def setOcspsUndefined: Self = StObject.set(x, "ocsps", js.undefined)
    
    inline def setOcspsVarargs(value: BasicOCSPResponse*): Self = StObject.set(x, "ocsps", js.Array(value*))
    
    inline def setSignerInfos(value: js.Array[SignerInfo]): Self = StObject.set(x, "signerInfos", value.asInstanceOf[js.Any])
    
    inline def setSignerInfosVarargs(value: SignerInfo*): Self = StObject.set(x, "signerInfos", js.Array(value*))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
