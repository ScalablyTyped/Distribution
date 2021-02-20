package typings.phaser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPathConstraint extends StObject {
  
  /* static member */
  var AFTER: Double = js.native
  
  /* static member */
  var BEFORE: Double = js.native
  
  /* static member */
  var NONE: Double = js.native
  
  /* static member */
  var epsilon: Double = js.native
}
object TypeofPathConstraint {
  
  @scala.inline
  def apply(AFTER: Double, BEFORE: Double, NONE: Double, epsilon: Double): TypeofPathConstraint = {
    val __obj = js.Dynamic.literal(AFTER = AFTER.asInstanceOf[js.Any], BEFORE = BEFORE.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], epsilon = epsilon.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPathConstraint]
  }
  
  @scala.inline
  implicit class TypeofPathConstraintMutableBuilder[Self <: TypeofPathConstraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAFTER(value: Double): Self = StObject.set(x, "AFTER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBEFORE(value: Double): Self = StObject.set(x, "BEFORE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEpsilon(value: Double): Self = StObject.set(x, "epsilon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNONE(value: Double): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
  }
}
