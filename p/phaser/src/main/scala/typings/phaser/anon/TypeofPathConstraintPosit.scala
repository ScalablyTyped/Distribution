package typings.phaser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPathConstraintPosit extends StObject {
  
  /* static member */
  var ENTRIES: Double
  
  /* static member */
  var PREV_TIME: Double
  
  /* static member */
  var PREV_VALUE: Double
  
  /* static member */
  var VALUE: Double
}
object TypeofPathConstraintPosit {
  
  inline def apply(ENTRIES: Double, PREV_TIME: Double, PREV_VALUE: Double, VALUE: Double): TypeofPathConstraintPosit = {
    val __obj = js.Dynamic.literal(ENTRIES = ENTRIES.asInstanceOf[js.Any], PREV_TIME = PREV_TIME.asInstanceOf[js.Any], PREV_VALUE = PREV_VALUE.asInstanceOf[js.Any], VALUE = VALUE.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPathConstraintPosit]
  }
  
  extension [Self <: TypeofPathConstraintPosit](x: Self) {
    
    inline def setENTRIES(value: Double): Self = StObject.set(x, "ENTRIES", value.asInstanceOf[js.Any])
    
    inline def setPREV_TIME(value: Double): Self = StObject.set(x, "PREV_TIME", value.asInstanceOf[js.Any])
    
    inline def setPREV_VALUE(value: Double): Self = StObject.set(x, "PREV_VALUE", value.asInstanceOf[js.Any])
    
    inline def setVALUE(value: Double): Self = StObject.set(x, "VALUE", value.asInstanceOf[js.Any])
  }
}
