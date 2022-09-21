package typings.minio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LockConfig extends StObject {
  
  var mode: Mode
  
  var unit: LockUnit
  
  var validity: Double
}
object LockConfig {
  
  inline def apply(mode: Mode, unit: LockUnit, validity: Double): LockConfig = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], validity = validity.asInstanceOf[js.Any])
    __obj.asInstanceOf[LockConfig]
  }
  
  extension [Self <: LockConfig](x: Self) {
    
    inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: LockUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setValidity(value: Double): Self = StObject.set(x, "validity", value.asInstanceOf[js.Any])
  }
}
