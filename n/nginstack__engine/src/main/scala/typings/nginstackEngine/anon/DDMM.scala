package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DDMM extends StObject {
  
  var DDMM: Double
  
  var DDMMYYYY: Double
  
  var MMMYYYY: Double
  
  var MMYYYY: Double
  
  var WWYYYY: Double
  
  var YYYYWW: Double
}
object DDMM {
  
  inline def apply(DDMM: Double, DDMMYYYY: Double, MMMYYYY: Double, MMYYYY: Double, WWYYYY: Double, YYYYWW: Double): DDMM = {
    val __obj = js.Dynamic.literal(DDMM = DDMM.asInstanceOf[js.Any], DDMMYYYY = DDMMYYYY.asInstanceOf[js.Any], MMMYYYY = MMMYYYY.asInstanceOf[js.Any], MMYYYY = MMYYYY.asInstanceOf[js.Any], WWYYYY = WWYYYY.asInstanceOf[js.Any], YYYYWW = YYYYWW.asInstanceOf[js.Any])
    __obj.asInstanceOf[DDMM]
  }
  
  extension [Self <: DDMM](x: Self) {
    
    inline def setDDMM(value: Double): Self = StObject.set(x, "DDMM", value.asInstanceOf[js.Any])
    
    inline def setDDMMYYYY(value: Double): Self = StObject.set(x, "DDMMYYYY", value.asInstanceOf[js.Any])
    
    inline def setMMMYYYY(value: Double): Self = StObject.set(x, "MMMYYYY", value.asInstanceOf[js.Any])
    
    inline def setMMYYYY(value: Double): Self = StObject.set(x, "MMYYYY", value.asInstanceOf[js.Any])
    
    inline def setWWYYYY(value: Double): Self = StObject.set(x, "WWYYYY", value.asInstanceOf[js.Any])
    
    inline def setYYYYWW(value: Double): Self = StObject.set(x, "YYYYWW", value.asInstanceOf[js.Any])
  }
}
