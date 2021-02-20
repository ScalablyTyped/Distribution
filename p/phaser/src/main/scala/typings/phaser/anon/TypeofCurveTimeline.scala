package typings.phaser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCurveTimeline extends StObject {
  
  /* static member */
  var BEZIER: Double = js.native
  
  /* static member */
  var BEZIER_SIZE: Double = js.native
  
  /* static member */
  var LINEAR: Double = js.native
  
  /* static member */
  var STEPPED: Double = js.native
}
object TypeofCurveTimeline {
  
  @scala.inline
  def apply(BEZIER: Double, BEZIER_SIZE: Double, LINEAR: Double, STEPPED: Double): TypeofCurveTimeline = {
    val __obj = js.Dynamic.literal(BEZIER = BEZIER.asInstanceOf[js.Any], BEZIER_SIZE = BEZIER_SIZE.asInstanceOf[js.Any], LINEAR = LINEAR.asInstanceOf[js.Any], STEPPED = STEPPED.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCurveTimeline]
  }
  
  @scala.inline
  implicit class TypeofCurveTimelineMutableBuilder[Self <: TypeofCurveTimeline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBEZIER(value: Double): Self = StObject.set(x, "BEZIER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBEZIER_SIZE(value: Double): Self = StObject.set(x, "BEZIER_SIZE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLINEAR(value: Double): Self = StObject.set(x, "LINEAR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTEPPED(value: Double): Self = StObject.set(x, "STEPPED", value.asInstanceOf[js.Any])
  }
}
