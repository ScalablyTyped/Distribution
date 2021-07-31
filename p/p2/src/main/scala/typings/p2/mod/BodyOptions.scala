package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyOptions extends StObject {
  
  var allowSleep: js.UndefOr[Boolean] = js.undefined
  
  var angle: js.UndefOr[Double] = js.undefined
  
  var angularDamping: js.UndefOr[Double] = js.undefined
  
  var angularForce: js.UndefOr[Double] = js.undefined
  
  var angularVelocity: js.UndefOr[Double] = js.undefined
  
  var ccdIterations: js.UndefOr[Double] = js.undefined
  
  var ccdSpeedThreshold: js.UndefOr[Double] = js.undefined
  
  var collisionResponse: js.UndefOr[Boolean] = js.undefined
  
  var fixedRotation: js.UndefOr[Boolean] = js.undefined
  
  var fixedX: js.UndefOr[Boolean] = js.undefined
  
  var fixedY: js.UndefOr[Boolean] = js.undefined
  
  var force: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var gravityScale: js.UndefOr[Double] = js.undefined
  
  var id: js.UndefOr[Double] = js.undefined
  
  var mass: js.UndefOr[Double] = js.undefined
  
  var position: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var sleepSpeedLimit: js.UndefOr[Double] = js.undefined
  
  var sleepTimeLimit: js.UndefOr[Double] = js.undefined
  
  var velocity: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}
object BodyOptions {
  
  @scala.inline
  def apply(): BodyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodyOptions]
  }
  
  @scala.inline
  implicit class BodyOptionsMutableBuilder[Self <: BodyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowSleep(value: Boolean): Self = StObject.set(x, "allowSleep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSleepUndefined: Self = StObject.set(x, "allowSleep", js.undefined)
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setAngularDamping(value: Double): Self = StObject.set(x, "angularDamping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngularDampingUndefined: Self = StObject.set(x, "angularDamping", js.undefined)
    
    @scala.inline
    def setAngularForce(value: Double): Self = StObject.set(x, "angularForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngularForceUndefined: Self = StObject.set(x, "angularForce", js.undefined)
    
    @scala.inline
    def setAngularVelocity(value: Double): Self = StObject.set(x, "angularVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngularVelocityUndefined: Self = StObject.set(x, "angularVelocity", js.undefined)
    
    @scala.inline
    def setCcdIterations(value: Double): Self = StObject.set(x, "ccdIterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCcdIterationsUndefined: Self = StObject.set(x, "ccdIterations", js.undefined)
    
    @scala.inline
    def setCcdSpeedThreshold(value: Double): Self = StObject.set(x, "ccdSpeedThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCcdSpeedThresholdUndefined: Self = StObject.set(x, "ccdSpeedThreshold", js.undefined)
    
    @scala.inline
    def setCollisionResponse(value: Boolean): Self = StObject.set(x, "collisionResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollisionResponseUndefined: Self = StObject.set(x, "collisionResponse", js.undefined)
    
    @scala.inline
    def setFixedRotation(value: Boolean): Self = StObject.set(x, "fixedRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedRotationUndefined: Self = StObject.set(x, "fixedRotation", js.undefined)
    
    @scala.inline
    def setFixedX(value: Boolean): Self = StObject.set(x, "fixedX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedXUndefined: Self = StObject.set(x, "fixedX", js.undefined)
    
    @scala.inline
    def setFixedY(value: Boolean): Self = StObject.set(x, "fixedY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedYUndefined: Self = StObject.set(x, "fixedY", js.undefined)
    
    @scala.inline
    def setForce(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    @scala.inline
    def setGravityScale(value: Double): Self = StObject.set(x, "gravityScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGravityScaleUndefined: Self = StObject.set(x, "gravityScale", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMassUndefined: Self = StObject.set(x, "mass", js.undefined)
    
    @scala.inline
    def setPosition(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setSleepSpeedLimit(value: Double): Self = StObject.set(x, "sleepSpeedLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSleepSpeedLimitUndefined: Self = StObject.set(x, "sleepSpeedLimit", js.undefined)
    
    @scala.inline
    def setSleepTimeLimit(value: Double): Self = StObject.set(x, "sleepTimeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSleepTimeLimitUndefined: Self = StObject.set(x, "sleepTimeLimit", js.undefined)
    
    @scala.inline
    def setVelocity(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
  }
}
