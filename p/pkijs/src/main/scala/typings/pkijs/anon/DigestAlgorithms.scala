package typings.pkijs.anon

import typings.pkijs.mod.EncapsulatedContentInfoSchema
import typings.pkijs.mod.RevocationInfoChoicesSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DigestAlgorithms extends StObject {
  
  var certificates: js.UndefOr[String] = js.undefined
  
  var crls: js.UndefOr[RevocationInfoChoicesSchema] = js.undefined
  
  var digestAlgorithms: js.UndefOr[String] = js.undefined
  
  var encapContentInfo: js.UndefOr[EncapsulatedContentInfoSchema] = js.undefined
  
  var signerInfos: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object DigestAlgorithms {
  
  inline def apply(): DigestAlgorithms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DigestAlgorithms]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DigestAlgorithms] (val x: Self) extends AnyVal {
    
    inline def setCertificates(value: String): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesUndefined: Self = StObject.set(x, "certificates", js.undefined)
    
    inline def setCrls(value: RevocationInfoChoicesSchema): Self = StObject.set(x, "crls", value.asInstanceOf[js.Any])
    
    inline def setCrlsUndefined: Self = StObject.set(x, "crls", js.undefined)
    
    inline def setDigestAlgorithms(value: String): Self = StObject.set(x, "digestAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setDigestAlgorithmsUndefined: Self = StObject.set(x, "digestAlgorithms", js.undefined)
    
    inline def setEncapContentInfo(value: EncapsulatedContentInfoSchema): Self = StObject.set(x, "encapContentInfo", value.asInstanceOf[js.Any])
    
    inline def setEncapContentInfoUndefined: Self = StObject.set(x, "encapContentInfo", js.undefined)
    
    inline def setSignerInfos(value: String): Self = StObject.set(x, "signerInfos", value.asInstanceOf[js.Any])
    
    inline def setSignerInfosUndefined: Self = StObject.set(x, "signerInfos", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
