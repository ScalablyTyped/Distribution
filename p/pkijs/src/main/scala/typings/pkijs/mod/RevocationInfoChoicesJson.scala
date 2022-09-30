package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevocationInfoChoicesJson extends StObject {
  
  var crls: js.Array[CertificateRevocationListJson]
  
  var otherRevocationInfos: js.Array[OtherRevocationInfoFormatJson]
}
object RevocationInfoChoicesJson {
  
  inline def apply(
    crls: js.Array[CertificateRevocationListJson],
    otherRevocationInfos: js.Array[OtherRevocationInfoFormatJson]
  ): RevocationInfoChoicesJson = {
    val __obj = js.Dynamic.literal(crls = crls.asInstanceOf[js.Any], otherRevocationInfos = otherRevocationInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevocationInfoChoicesJson]
  }
  
  extension [Self <: RevocationInfoChoicesJson](x: Self) {
    
    inline def setCrls(value: js.Array[CertificateRevocationListJson]): Self = StObject.set(x, "crls", value.asInstanceOf[js.Any])
    
    inline def setCrlsVarargs(value: CertificateRevocationListJson*): Self = StObject.set(x, "crls", js.Array(value*))
    
    inline def setOtherRevocationInfos(value: js.Array[OtherRevocationInfoFormatJson]): Self = StObject.set(x, "otherRevocationInfos", value.asInstanceOf[js.Any])
    
    inline def setOtherRevocationInfosVarargs(value: OtherRevocationInfoFormatJson*): Self = StObject.set(x, "otherRevocationInfos", js.Array(value*))
  }
}
