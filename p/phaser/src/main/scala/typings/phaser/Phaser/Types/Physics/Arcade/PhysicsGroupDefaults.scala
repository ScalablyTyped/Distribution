package typings.phaser.Phaser.Types.Physics.Arcade

import typings.phaser.Phaser.Geom.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhysicsGroupDefaults extends js.Object {
  
  /**
    * As {@link Phaser.Physics.Arcade.Body#setAccelerationX}.
    */
  var setAccelerationX: Double = js.native
  
  /**
    * As {@link Phaser.Physics.Arcade.Body#setAccelerationY}.
    */
  var setAccelerationY: Double = js.native
  
  /**
    * As {@link Phaser.Physics.Arcade.Body#setAllowDrag}.
    */
  var setAllowDrag: Boolean = js.native
  
  /**
    * As {@link Phaser.Physics.Arcade.Body#setAllowGravity}.
    */
  var setAllowGravity: Boolean = js.native
  
  /**
    * As {@link Phaser.Physics.Arcade.Body#setAllowRotation}.
    */
  var setAllowRotation: Boolean = js.native
  
  /**
    * As {@link Phaser.Physics.Arcade.Body#setAngularAcceleration}.
    */
  var setAngularAcceleration: Double = js.native
  
  /**
    * As {@link Phaser.Physics.Arcade.Body#setAngularDrag}.
    */
  var setAngularDrag: Double = js.native
  
  /**
    * As {@link Phaser.Physics.Arcade.Body#setAngularVelocity}.
    */
  var setAngularVelocity: Double = js.native
  
  /**
    * As {@link Phaser.Physics.Arcade.Body#setBounceX}.
    */
  var setBounceX: Double = js.native
  
  /**
    * As {@link Phaser.Physics.Arcade.Body#setBounceY}.
    */
  var setBounceY: Double = js.native
  
  /**
    * As {@link Phaser.Physics.Arcade.Body#setBoundsRectangle}.
    */
  var setBoundsRectangle: Rectangle = js.native
  
  /**
    * As {@link Phaser.Physics.Arcade.Body#setCollideWorldBounds}.
    */
  var setCollideWorldBounds: Boolean = js.native
  
  /**
    * As {@link Phaser.Physics.Arcade.Body#setDragX}.
    */
  var setDragX: Double = js.native
  
  /**
    * As {@link Phaser.Physics.Arcade.Body#setDragY}.
    */
  var setDragY: Double = js.native
  
  /**
    * As {@link Phaser.Physics.Arcade.Body#setEnable}.
    */
  var setEnable: Boolean = js.native
  
  /**
    * As {@link Phaser.Physics.Arcade.Body#setFrictionX}.
    */
  var setFrictionX: Double = js.native
  
  /**
    * As {@link Phaser.Physics.Arcade.Body#setFrictionY}.
    */
  var setFrictionY: Double = js.native
  
  /**
    * As {@link Phaser.Physics.Arcade.Body#setGravityX}.
    */
  var setGravityX: Double = js.native
  
  /**
    * As {@link Phaser.Physics.Arcade.Body#setGravityY}.
    */
  var setGravityY: Double = js.native
  
  /**
    * As {@link Phaser.Physics.Arcade.Body#setImmovable}.
    */
  var setImmovable: Boolean = js.native
  
  /**
    * As {@link Phaser.Physics.Arcade.Body#setMass}.
    */
  var setMass: Double = js.native
  
  /**
    * As {@link Phaser.Physics.Arcade.Body#setVelocityX}.
    */
  var setVelocityX: Double = js.native
  
  /**
    * As {@link Phaser.Physics.Arcade.Body#setVelocityY}.
    */
  var setVelocityY: Double = js.native
}
object PhysicsGroupDefaults {
  
  @scala.inline
  def apply(
    setAccelerationX: Double,
    setAccelerationY: Double,
    setAllowDrag: Boolean,
    setAllowGravity: Boolean,
    setAllowRotation: Boolean,
    setAngularAcceleration: Double,
    setAngularDrag: Double,
    setAngularVelocity: Double,
    setBounceX: Double,
    setBounceY: Double,
    setBoundsRectangle: Rectangle,
    setCollideWorldBounds: Boolean,
    setDragX: Double,
    setDragY: Double,
    setEnable: Boolean,
    setFrictionX: Double,
    setFrictionY: Double,
    setGravityX: Double,
    setGravityY: Double,
    setImmovable: Boolean,
    setMass: Double,
    setVelocityX: Double,
    setVelocityY: Double
  ): PhysicsGroupDefaults = {
    val __obj = js.Dynamic.literal(setAccelerationX = setAccelerationX.asInstanceOf[js.Any], setAccelerationY = setAccelerationY.asInstanceOf[js.Any], setAllowDrag = setAllowDrag.asInstanceOf[js.Any], setAllowGravity = setAllowGravity.asInstanceOf[js.Any], setAllowRotation = setAllowRotation.asInstanceOf[js.Any], setAngularAcceleration = setAngularAcceleration.asInstanceOf[js.Any], setAngularDrag = setAngularDrag.asInstanceOf[js.Any], setAngularVelocity = setAngularVelocity.asInstanceOf[js.Any], setBounceX = setBounceX.asInstanceOf[js.Any], setBounceY = setBounceY.asInstanceOf[js.Any], setBoundsRectangle = setBoundsRectangle.asInstanceOf[js.Any], setCollideWorldBounds = setCollideWorldBounds.asInstanceOf[js.Any], setDragX = setDragX.asInstanceOf[js.Any], setDragY = setDragY.asInstanceOf[js.Any], setEnable = setEnable.asInstanceOf[js.Any], setFrictionX = setFrictionX.asInstanceOf[js.Any], setFrictionY = setFrictionY.asInstanceOf[js.Any], setGravityX = setGravityX.asInstanceOf[js.Any], setGravityY = setGravityY.asInstanceOf[js.Any], setImmovable = setImmovable.asInstanceOf[js.Any], setMass = setMass.asInstanceOf[js.Any], setVelocityX = setVelocityX.asInstanceOf[js.Any], setVelocityY = setVelocityY.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsGroupDefaults]
  }
  
  @scala.inline
  implicit class PhysicsGroupDefaultsOps[Self <: PhysicsGroupDefaults] (val x: Self) extends AnyVal {
    
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
    def setSetAccelerationX(value: Double): Self = this.set("setAccelerationX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAccelerationY(value: Double): Self = this.set("setAccelerationY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAllowDrag(value: Boolean): Self = this.set("setAllowDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAllowGravity(value: Boolean): Self = this.set("setAllowGravity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAllowRotation(value: Boolean): Self = this.set("setAllowRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAngularAcceleration(value: Double): Self = this.set("setAngularAcceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAngularDrag(value: Double): Self = this.set("setAngularDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAngularVelocity(value: Double): Self = this.set("setAngularVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetBounceX(value: Double): Self = this.set("setBounceX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetBounceY(value: Double): Self = this.set("setBounceY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetBoundsRectangle(value: Rectangle): Self = this.set("setBoundsRectangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetCollideWorldBounds(value: Boolean): Self = this.set("setCollideWorldBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDragX(value: Double): Self = this.set("setDragX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDragY(value: Double): Self = this.set("setDragY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetEnable(value: Boolean): Self = this.set("setEnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFrictionX(value: Double): Self = this.set("setFrictionX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFrictionY(value: Double): Self = this.set("setFrictionY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetGravityX(value: Double): Self = this.set("setGravityX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetGravityY(value: Double): Self = this.set("setGravityY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetImmovable(value: Boolean): Self = this.set("setImmovable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetMass(value: Double): Self = this.set("setMass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetVelocityX(value: Double): Self = this.set("setVelocityX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetVelocityY(value: Double): Self = this.set("setVelocityY", value.asInstanceOf[js.Any])
  }
}
