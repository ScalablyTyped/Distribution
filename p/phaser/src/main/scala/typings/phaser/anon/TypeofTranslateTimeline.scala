package typings.phaser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTranslateTimeline extends StObject {
  
  /* static member */
  var ENTRIES: Double
  
  /* static member */
  var PREV_TIME: Double
  
  /* static member */
  var PREV_X: Double
  
  /* static member */
  var PREV_Y: Double
  
  /* static member */
  var X: Double
  
  /* static member */
  var Y: Double
}
object TypeofTranslateTimeline {
  
  inline def apply(ENTRIES: Double, PREV_TIME: Double, PREV_X: Double, PREV_Y: Double, X: Double, Y: Double): TypeofTranslateTimeline = {
    val __obj = js.Dynamic.literal(ENTRIES = ENTRIES.asInstanceOf[js.Any], PREV_TIME = PREV_TIME.asInstanceOf[js.Any], PREV_X = PREV_X.asInstanceOf[js.Any], PREV_Y = PREV_Y.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTranslateTimeline]
  }
  
  extension [Self <: TypeofTranslateTimeline](x: Self) {
    
    inline def setENTRIES(value: Double): Self = StObject.set(x, "ENTRIES", value.asInstanceOf[js.Any])
    
    inline def setPREV_TIME(value: Double): Self = StObject.set(x, "PREV_TIME", value.asInstanceOf[js.Any])
    
    inline def setPREV_X(value: Double): Self = StObject.set(x, "PREV_X", value.asInstanceOf[js.Any])
    
    inline def setPREV_Y(value: Double): Self = StObject.set(x, "PREV_Y", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
  }
}
