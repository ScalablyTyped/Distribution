package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.ISignedData> */
trait SignedDataParameters extends StObject {
  
  var certificates: js.UndefOr[js.Array[CertificateSetItem]] = js.undefined
  
  var crls: js.UndefOr[js.Array[SignedDataCRL]] = js.undefined
  
  var digestAlgorithms: js.UndefOr[js.Array[AlgorithmIdentifier]] = js.undefined
  
  var encapContentInfo: js.UndefOr[EncapsulatedContentInfo] = js.undefined
  
  var ocsps: js.UndefOr[js.Array[BasicOCSPResponse]] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var signerInfos: js.UndefOr[js.Array[SignerInfo]] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object SignedDataParameters {
  
  inline def apply(): SignedDataParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignedDataParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignedDataParameters] (val x: Self) extends AnyVal {
    
    inline def setCertificates(value: js.Array[CertificateSetItem]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesUndefined: Self = StObject.set(x, "certificates", js.undefined)
    
    inline def setCertificatesVarargs(value: CertificateSetItem*): Self = StObject.set(x, "certificates", js.Array(value*))
    
    inline def setCrls(value: js.Array[SignedDataCRL]): Self = StObject.set(x, "crls", value.asInstanceOf[js.Any])
    
    inline def setCrlsUndefined: Self = StObject.set(x, "crls", js.undefined)
    
    inline def setCrlsVarargs(value: SignedDataCRL*): Self = StObject.set(x, "crls", js.Array(value*))
    
    inline def setDigestAlgorithms(value: js.Array[AlgorithmIdentifier]): Self = StObject.set(x, "digestAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setDigestAlgorithmsUndefined: Self = StObject.set(x, "digestAlgorithms", js.undefined)
    
    inline def setDigestAlgorithmsVarargs(value: AlgorithmIdentifier*): Self = StObject.set(x, "digestAlgorithms", js.Array(value*))
    
    inline def setEncapContentInfo(value: EncapsulatedContentInfo): Self = StObject.set(x, "encapContentInfo", value.asInstanceOf[js.Any])
    
    inline def setEncapContentInfoUndefined: Self = StObject.set(x, "encapContentInfo", js.undefined)
    
    inline def setOcsps(value: js.Array[BasicOCSPResponse]): Self = StObject.set(x, "ocsps", value.asInstanceOf[js.Any])
    
    inline def setOcspsUndefined: Self = StObject.set(x, "ocsps", js.undefined)
    
    inline def setOcspsVarargs(value: BasicOCSPResponse*): Self = StObject.set(x, "ocsps", js.Array(value*))
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSignerInfos(value: js.Array[SignerInfo]): Self = StObject.set(x, "signerInfos", value.asInstanceOf[js.Any])
    
    inline def setSignerInfosUndefined: Self = StObject.set(x, "signerInfos", js.undefined)
    
    inline def setSignerInfosVarargs(value: SignerInfo*): Self = StObject.set(x, "signerInfos", js.Array(value*))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
