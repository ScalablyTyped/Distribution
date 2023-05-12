package typings.phaser.Phaser.Types.GameObjects.Particles

import typings.phaser.Phaser.GameObjects.Particles.EmitterColorOp
import typings.phaser.Phaser.GameObjects.Particles.EmitterOp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticleEmitterOps extends StObject {
  
  /**
    * The accelerationX EmitterOp instance. This is an onEmit and onUpdate operator.
    */
  var accelerationX: EmitterOp
  
  /**
    * The accelerationY EmitterOp instance. This is an onEmit and onUpdate operator.
    */
  var accelerationY: EmitterOp
  
  /**
    * The alpha EmitterOp instance. This is an onEmit and onUpdate operator.
    */
  var alpha: EmitterOp
  
  /**
    * The angle EmitterOp instance. This is an onEmit operator only.
    */
  var angle: EmitterOp
  
  /**
    * The bounce EmitterOp instance. This is an onEmit and onUpdate operator.
    */
  var bounce: EmitterOp
  
  /**
    * The color EmitterColorOp instance. This is an onEmit and onUpdate operator.
    */
  var color: EmitterColorOp
  
  /**
    * The delay EmitterOp instance. This is an onEmit operator only.
    */
  var delay: EmitterOp
  
  /**
    * The hold EmitterOp instance. This is an onEmit operator only.
    */
  var hold: EmitterOp
  
  /**
    * The lifespan EmitterOp instance. This is an onEmit operator only.
    */
  var lifespan: EmitterOp
  
  /**
    * The maxVelocityX EmitterOp instance. This is an onEmit and onUpdate operator.
    */
  var maxVelocityX: EmitterOp
  
  /**
    * The maxVelocityY EmitterOp instance. This is an onEmit and onUpdate operator.
    */
  var maxVelocityY: EmitterOp
  
  /**
    * The moveToX EmitterOp instance. This is an onEmit and onUpdate operator.
    */
  var moveToX: EmitterOp
  
  /**
    * The moveToY EmitterOp instance. This is an onEmit and onUpdate operator.
    */
  var moveToY: EmitterOp
  
  /**
    * The quantity EmitterOp instance. This is an onEmit operator only.
    */
  var quantity: EmitterOp
  
  /**
    * The rotate EmitterOp instance. This is an onEmit and onUpdate operator.
    */
  var rotate: EmitterOp
  
  /**
    * The scaleX EmitterOp instance. This is an onEmit and onUpdate operator.
    */
  var scaleX: EmitterOp
  
  /**
    * The scaleY EmitterOp instance. This is an onEmit and onUpdate operator.
    */
  var scaleY: EmitterOp
  
  /**
    * The speedX EmitterOp instance. This is an onEmit operator only.
    */
  var speedX: EmitterOp
  
  /**
    * The speedY EmitterOp instance. This is an onEmit operator only.
    */
  var speedY: EmitterOp
  
  /**
    * The tint EmitterOp instance. This is an onEmit and onUpdate operator.
    */
  var tint: EmitterOp
  
  /**
    * The x EmitterOp instance. This is an onEmit and onUpdate operator.
    */
  var x: EmitterOp
  
  /**
    * The y EmitterOp instance. This is an onEmit and onUpdate operator.
    */
  var y: EmitterOp
}
object ParticleEmitterOps {
  
  inline def apply(
    accelerationX: EmitterOp,
    accelerationY: EmitterOp,
    alpha: EmitterOp,
    angle: EmitterOp,
    bounce: EmitterOp,
    color: EmitterColorOp,
    delay: EmitterOp,
    hold: EmitterOp,
    lifespan: EmitterOp,
    maxVelocityX: EmitterOp,
    maxVelocityY: EmitterOp,
    moveToX: EmitterOp,
    moveToY: EmitterOp,
    quantity: EmitterOp,
    rotate: EmitterOp,
    scaleX: EmitterOp,
    scaleY: EmitterOp,
    speedX: EmitterOp,
    speedY: EmitterOp,
    tint: EmitterOp,
    x: EmitterOp,
    y: EmitterOp
  ): ParticleEmitterOps = {
    val __obj = js.Dynamic.literal(accelerationX = accelerationX.asInstanceOf[js.Any], accelerationY = accelerationY.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], bounce = bounce.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], hold = hold.asInstanceOf[js.Any], lifespan = lifespan.asInstanceOf[js.Any], maxVelocityX = maxVelocityX.asInstanceOf[js.Any], maxVelocityY = maxVelocityY.asInstanceOf[js.Any], moveToX = moveToX.asInstanceOf[js.Any], moveToY = moveToY.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], speedX = speedX.asInstanceOf[js.Any], speedY = speedY.asInstanceOf[js.Any], tint = tint.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticleEmitterOps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParticleEmitterOps] (val x: Self) extends AnyVal {
    
    inline def setAccelerationX(value: EmitterOp): Self = StObject.set(x, "accelerationX", value.asInstanceOf[js.Any])
    
    inline def setAccelerationY(value: EmitterOp): Self = StObject.set(x, "accelerationY", value.asInstanceOf[js.Any])
    
    inline def setAlpha(value: EmitterOp): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAngle(value: EmitterOp): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setBounce(value: EmitterOp): Self = StObject.set(x, "bounce", value.asInstanceOf[js.Any])
    
    inline def setColor(value: EmitterColorOp): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDelay(value: EmitterOp): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setHold(value: EmitterOp): Self = StObject.set(x, "hold", value.asInstanceOf[js.Any])
    
    inline def setLifespan(value: EmitterOp): Self = StObject.set(x, "lifespan", value.asInstanceOf[js.Any])
    
    inline def setMaxVelocityX(value: EmitterOp): Self = StObject.set(x, "maxVelocityX", value.asInstanceOf[js.Any])
    
    inline def setMaxVelocityY(value: EmitterOp): Self = StObject.set(x, "maxVelocityY", value.asInstanceOf[js.Any])
    
    inline def setMoveToX(value: EmitterOp): Self = StObject.set(x, "moveToX", value.asInstanceOf[js.Any])
    
    inline def setMoveToY(value: EmitterOp): Self = StObject.set(x, "moveToY", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: EmitterOp): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setRotate(value: EmitterOp): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setScaleX(value: EmitterOp): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleY(value: EmitterOp): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    inline def setSpeedX(value: EmitterOp): Self = StObject.set(x, "speedX", value.asInstanceOf[js.Any])
    
    inline def setSpeedY(value: EmitterOp): Self = StObject.set(x, "speedY", value.asInstanceOf[js.Any])
    
    inline def setTint(value: EmitterOp): Self = StObject.set(x, "tint", value.asInstanceOf[js.Any])
    
    inline def setX(value: EmitterOp): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: EmitterOp): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
