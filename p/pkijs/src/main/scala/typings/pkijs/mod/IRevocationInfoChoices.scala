package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRevocationInfoChoices extends StObject {
  
  var crls: js.Array[CertificateRevocationList]
  
  var otherRevocationInfos: js.Array[OtherRevocationInfoFormat]
}
object IRevocationInfoChoices {
  
  inline def apply(
    crls: js.Array[CertificateRevocationList],
    otherRevocationInfos: js.Array[OtherRevocationInfoFormat]
  ): IRevocationInfoChoices = {
    val __obj = js.Dynamic.literal(crls = crls.asInstanceOf[js.Any], otherRevocationInfos = otherRevocationInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRevocationInfoChoices]
  }
  
  extension [Self <: IRevocationInfoChoices](x: Self) {
    
    inline def setCrls(value: js.Array[CertificateRevocationList]): Self = StObject.set(x, "crls", value.asInstanceOf[js.Any])
    
    inline def setCrlsVarargs(value: CertificateRevocationList*): Self = StObject.set(x, "crls", js.Array(value*))
    
    inline def setOtherRevocationInfos(value: js.Array[OtherRevocationInfoFormat]): Self = StObject.set(x, "otherRevocationInfos", value.asInstanceOf[js.Any])
    
    inline def setOtherRevocationInfosVarargs(value: OtherRevocationInfoFormat*): Self = StObject.set(x, "otherRevocationInfos", js.Array(value*))
  }
}
