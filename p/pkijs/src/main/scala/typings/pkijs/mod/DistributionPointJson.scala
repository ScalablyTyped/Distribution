package typings.pkijs.mod

import typings.asn1js.mod.BitStringJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionPointJson extends StObject {
  
  var cRLIssuer: js.UndefOr[js.Array[GeneralNameJson]] = js.undefined
  
  var distributionPoint: js.UndefOr[DistributionPointNameJson] = js.undefined
  
  var reasons: js.UndefOr[BitStringJson] = js.undefined
}
object DistributionPointJson {
  
  inline def apply(): DistributionPointJson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistributionPointJson]
  }
  
  extension [Self <: DistributionPointJson](x: Self) {
    
    inline def setCRLIssuer(value: js.Array[GeneralNameJson]): Self = StObject.set(x, "cRLIssuer", value.asInstanceOf[js.Any])
    
    inline def setCRLIssuerUndefined: Self = StObject.set(x, "cRLIssuer", js.undefined)
    
    inline def setCRLIssuerVarargs(value: GeneralNameJson*): Self = StObject.set(x, "cRLIssuer", js.Array(value*))
    
    inline def setDistributionPoint(value: DistributionPointNameJson): Self = StObject.set(x, "distributionPoint", value.asInstanceOf[js.Any])
    
    inline def setDistributionPointUndefined: Self = StObject.set(x, "distributionPoint", js.undefined)
    
    inline def setDistributionPointVarargs(value: GeneralNameJson*): Self = StObject.set(x, "distributionPoint", js.Array(value*))
    
    inline def setReasons(value: BitStringJson): Self = StObject.set(x, "reasons", value.asInstanceOf[js.Any])
    
    inline def setReasonsUndefined: Self = StObject.set(x, "reasons", js.undefined)
  }
}
