package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactMaterialOptions extends js.Object {
  
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
  implicit class ContactMaterialOptionsOps[Self <: ContactMaterialOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFriction(value: Double): Self = this.set("friction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFriction: Self = this.set("friction", js.undefined)
    
    @scala.inline
    def setFrictionRelaxation(value: Double): Self = this.set("frictionRelaxation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrictionRelaxation: Self = this.set("frictionRelaxation", js.undefined)
    
    @scala.inline
    def setFrictionStiffness(value: Double): Self = this.set("frictionStiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrictionStiffness: Self = this.set("frictionStiffness", js.undefined)
    
    @scala.inline
    def setRelaxation(value: Double): Self = this.set("relaxation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelaxation: Self = this.set("relaxation", js.undefined)
    
    @scala.inline
    def setRestitution(value: Double): Self = this.set("restitution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestitution: Self = this.set("restitution", js.undefined)
    
    @scala.inline
    def setStiffness(value: Double): Self = this.set("stiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStiffness: Self = this.set("stiffness", js.undefined)
    
    @scala.inline
    def setSurfaceVelocity(value: Double): Self = this.set("surfaceVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSurfaceVelocity: Self = this.set("surfaceVelocity", js.undefined)
  }
}
