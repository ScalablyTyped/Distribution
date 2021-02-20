package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactMaterialOptions extends StObject {
  
  var friction: js.UndefOr[Double] = js.native
  
  var frictionRelaxation: js.UndefOr[Double] = js.native
  
  var frictionStiffness: js.UndefOr[Double] = js.native
  
  var relaxation: js.UndefOr[Double] = js.native
  
  var restitution: js.UndefOr[Double] = js.native
  
  var stiffness: js.UndefOr[Double] = js.native
  
  var surfaceVelocity: js.UndefOr[Double] = js.native
}
object ContactMaterialOptions {
  
  @scala.inline
  def apply(): ContactMaterialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactMaterialOptions]
  }
  
  @scala.inline
  implicit class ContactMaterialOptionsMutableBuilder[Self <: ContactMaterialOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrictionRelaxation(value: Double): Self = StObject.set(x, "frictionRelaxation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrictionRelaxationUndefined: Self = StObject.set(x, "frictionRelaxation", js.undefined)
    
    @scala.inline
    def setFrictionStiffness(value: Double): Self = StObject.set(x, "frictionStiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrictionStiffnessUndefined: Self = StObject.set(x, "frictionStiffness", js.undefined)
    
    @scala.inline
    def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
    
    @scala.inline
    def setRelaxation(value: Double): Self = StObject.set(x, "relaxation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelaxationUndefined: Self = StObject.set(x, "relaxation", js.undefined)
    
    @scala.inline
    def setRestitution(value: Double): Self = StObject.set(x, "restitution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestitutionUndefined: Self = StObject.set(x, "restitution", js.undefined)
    
    @scala.inline
    def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStiffnessUndefined: Self = StObject.set(x, "stiffness", js.undefined)
    
    @scala.inline
    def setSurfaceVelocity(value: Double): Self = StObject.set(x, "surfaceVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurfaceVelocityUndefined: Self = StObject.set(x, "surfaceVelocity", js.undefined)
  }
}
