package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyOptions extends js.Object {
  
  var allowSleep: js.UndefOr[Boolean] = js.native
  
  var angle: js.UndefOr[Double] = js.native
  
  var angularDamping: js.UndefOr[Double] = js.native
  
  var angularForce: js.UndefOr[Double] = js.native
  
  var angularVelocity: js.UndefOr[Double] = js.native
  
  var ccdIterations: js.UndefOr[Double] = js.native
  
  var ccdSpeedThreshold: js.UndefOr[Double] = js.native
  
  var collisionResponse: js.UndefOr[Boolean] = js.native
  
  var fixedRotation: js.UndefOr[Boolean] = js.native
  
  var fixedX: js.UndefOr[Boolean] = js.native
  
  var fixedY: js.UndefOr[Boolean] = js.native
  
  var force: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var gravityScale: js.UndefOr[Double] = js.native
  
  var id: js.UndefOr[Double] = js.native
  
  var mass: js.UndefOr[Double] = js.native
  
  var position: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var sleepSpeedLimit: js.UndefOr[Double] = js.native
  
  var sleepTimeLimit: js.UndefOr[Double] = js.native
  
  var velocity: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}
object BodyOptions {
  
  @scala.inline
  def apply(): BodyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodyOptions]
  }
  
  @scala.inline
  implicit class BodyOptionsOps[Self <: BodyOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowSleep(value: Boolean): Self = this.set("allowSleep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSleep: Self = this.set("allowSleep", js.undefined)
    
    @scala.inline
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    
    @scala.inline
    def setAngularDamping(value: Double): Self = this.set("angularDamping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngularDamping: Self = this.set("angularDamping", js.undefined)
    
    @scala.inline
    def setAngularForce(value: Double): Self = this.set("angularForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngularForce: Self = this.set("angularForce", js.undefined)
    
    @scala.inline
    def setAngularVelocity(value: Double): Self = this.set("angularVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngularVelocity: Self = this.set("angularVelocity", js.undefined)
    
    @scala.inline
    def setCcdIterations(value: Double): Self = this.set("ccdIterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCcdIterations: Self = this.set("ccdIterations", js.undefined)
    
    @scala.inline
    def setCcdSpeedThreshold(value: Double): Self = this.set("ccdSpeedThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCcdSpeedThreshold: Self = this.set("ccdSpeedThreshold", js.undefined)
    
    @scala.inline
    def setCollisionResponse(value: Boolean): Self = this.set("collisionResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollisionResponse: Self = this.set("collisionResponse", js.undefined)
    
    @scala.inline
    def setFixedRotation(value: Boolean): Self = this.set("fixedRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedRotation: Self = this.set("fixedRotation", js.undefined)
    
    @scala.inline
    def setFixedX(value: Boolean): Self = this.set("fixedX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedX: Self = this.set("fixedX", js.undefined)
    
    @scala.inline
    def setFixedY(value: Boolean): Self = this.set("fixedY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedY: Self = this.set("fixedY", js.undefined)
    
    @scala.inline
    def setForce(value: js.Tuple2[Double, Double]): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    
    @scala.inline
    def setGravityScale(value: Double): Self = this.set("gravityScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGravityScale: Self = this.set("gravityScale", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setMass(value: Double): Self = this.set("mass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMass: Self = this.set("mass", js.undefined)
    
    @scala.inline
    def setPosition(value: js.Tuple2[Double, Double]): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setSleepSpeedLimit(value: Double): Self = this.set("sleepSpeedLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSleepSpeedLimit: Self = this.set("sleepSpeedLimit", js.undefined)
    
    @scala.inline
    def setSleepTimeLimit(value: Double): Self = this.set("sleepTimeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSleepTimeLimit: Self = this.set("sleepTimeLimit", js.undefined)
    
    @scala.inline
    def setVelocity(value: js.Tuple2[Double, Double]): Self = this.set("velocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVelocity: Self = this.set("velocity", js.undefined)
  }
}
