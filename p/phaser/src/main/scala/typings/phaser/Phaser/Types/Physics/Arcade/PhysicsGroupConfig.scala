package typings.phaser.Phaser.Types.Physics.Arcade

import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Geom.Rectangle
import typings.phaser.Phaser.Types.GameObjects.Group.GroupCallback
import typings.phaser.Phaser.Types.GameObjects.Group.GroupMultipleCreateCallback
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined phaser.Phaser.Types.GameObjects.Group.GroupConfig & {  collideWorldBounds :boolean | undefined,   customBoundsRectangle :phaser.Phaser.Geom.Rectangle | undefined,   accelerationX :number | undefined,   accelerationY :number | undefined,   allowDrag :boolean | undefined,   allowGravity :boolean | undefined,   allowRotation :boolean | undefined,   bounceX :number | undefined,   bounceY :number | undefined,   dragX :number | undefined,   dragY :number | undefined,   enable :boolean | undefined,   gravityX :number | undefined,   gravityY :number | undefined,   frictionX :number | undefined,   frictionY :number | undefined,   velocityX :number | undefined,   velocityY :number | undefined,   angularVelocity :number | undefined,   angularAcceleration :number | undefined,   angularDrag :number | undefined,   mass :number | undefined,   immovable :boolean | undefined} */
@js.native
trait PhysicsGroupConfig extends js.Object {
  
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#acceleration acceleration.x}.
    */
  var accelerationX: js.UndefOr[Double] = js.native
  
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#acceleration acceleration.y}.
    */
  var accelerationY: js.UndefOr[Double] = js.native
  
  /**
    * Sets {@link Phaser.GameObjects.Group#active}.
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#allowDrag}.
    */
  var allowDrag: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#allowGravity}.
    */
  var allowGravity: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#allowRotation}.
    */
  var allowRotation: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#angularAcceleration}.
    */
  var angularAcceleration: js.UndefOr[Double] = js.native
  
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#angularDrag}.
    */
  var angularDrag: js.UndefOr[Double] = js.native
  
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#angularVelocity}.
    */
  var angularVelocity: js.UndefOr[Double] = js.native
  
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#bounce bounce.x}.
    */
  var bounceX: js.UndefOr[Double] = js.native
  
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#bounce bounce.y}.
    */
  var bounceY: js.UndefOr[Double] = js.native
  
  /**
    * Sets {@link Phaser.GameObjects.Group#classType}.
    */
  var classType: js.UndefOr[js.Function] = js.native
  
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#collideWorldBounds}.
    */
  var collideWorldBounds: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets {@link Phaser.GameObjects.Group#createCallback}.
    */
  var createCallback: js.UndefOr[GroupCallback] = js.native
  
  /**
    * Sets {@link Phaser.GameObjects.Group#createMultipleCallback}.
    */
  var createMultipleCallback: js.UndefOr[GroupMultipleCreateCallback] = js.native
  
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#setBoundsRectangle setBoundsRectangle}.
    */
  var customBoundsRectangle: js.UndefOr[Rectangle] = js.native
  
  /**
    * Sets {@link Phaser.GameObjects.Group#defaultFrame}.
    */
  var defaultFrame: js.UndefOr[String | integer] = js.native
  
  /**
    * Sets {@link Phaser.GameObjects.Group#defaultKey}.
    */
  var defaultKey: js.UndefOr[String] = js.native
  
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#drag drag.x}.
    */
  var dragX: js.UndefOr[Double] = js.native
  
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#drag drag.y}.
    */
  var dragY: js.UndefOr[Double] = js.native
  
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#enable enable}.
    */
  var enable: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#friction friction.x}.
    */
  var frictionX: js.UndefOr[Double] = js.native
  
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#friction friction.y}.
    */
  var frictionY: js.UndefOr[Double] = js.native
  
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#gravity gravity.x}.
    */
  var gravityX: js.UndefOr[Double] = js.native
  
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#gravity gravity.y}.
    */
  var gravityY: js.UndefOr[Double] = js.native
  
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#immovable}.
    */
  var immovable: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#mass}.
    */
  var mass: js.UndefOr[Double] = js.native
  
  /**
    * Sets {@link Phaser.GameObjects.Group#maxSize}.
    */
  var maxSize: js.UndefOr[Double] = js.native
  
  /**
    * Sets {@link Phaser.GameObjects.Group#name}.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Sets {@link Phaser.GameObjects.Group#removeCallback}.
    */
  var removeCallback: js.UndefOr[GroupCallback] = js.native
  
  /**
    * Sets {@link Phaser.GameObjects.Group#runChildUpdate}.
    */
  var runChildUpdate: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#velocity velocity.x}.
    */
  var velocityX: js.UndefOr[Double] = js.native
  
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#velocity velocity.y}.
    */
  var velocityY: js.UndefOr[Double] = js.native
}
object PhysicsGroupConfig {
  
  @scala.inline
  def apply(): PhysicsGroupConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhysicsGroupConfig]
  }
  
  @scala.inline
  implicit class PhysicsGroupConfigOps[Self <: PhysicsGroupConfig] (val x: Self) extends AnyVal {
    
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
    def setAccelerationX(value: Double): Self = this.set("accelerationX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccelerationX: Self = this.set("accelerationX", js.undefined)
    
    @scala.inline
    def setAccelerationY(value: Double): Self = this.set("accelerationY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccelerationY: Self = this.set("accelerationY", js.undefined)
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setAllowDrag(value: Boolean): Self = this.set("allowDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDrag: Self = this.set("allowDrag", js.undefined)
    
    @scala.inline
    def setAllowGravity(value: Boolean): Self = this.set("allowGravity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowGravity: Self = this.set("allowGravity", js.undefined)
    
    @scala.inline
    def setAllowRotation(value: Boolean): Self = this.set("allowRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowRotation: Self = this.set("allowRotation", js.undefined)
    
    @scala.inline
    def setAngularAcceleration(value: Double): Self = this.set("angularAcceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngularAcceleration: Self = this.set("angularAcceleration", js.undefined)
    
    @scala.inline
    def setAngularDrag(value: Double): Self = this.set("angularDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngularDrag: Self = this.set("angularDrag", js.undefined)
    
    @scala.inline
    def setAngularVelocity(value: Double): Self = this.set("angularVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngularVelocity: Self = this.set("angularVelocity", js.undefined)
    
    @scala.inline
    def setBounceX(value: Double): Self = this.set("bounceX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounceX: Self = this.set("bounceX", js.undefined)
    
    @scala.inline
    def setBounceY(value: Double): Self = this.set("bounceY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounceY: Self = this.set("bounceY", js.undefined)
    
    @scala.inline
    def setClassType(value: js.Function): Self = this.set("classType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassType: Self = this.set("classType", js.undefined)
    
    @scala.inline
    def setCollideWorldBounds(value: Boolean): Self = this.set("collideWorldBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollideWorldBounds: Self = this.set("collideWorldBounds", js.undefined)
    
    @scala.inline
    def setCreateCallback(value: /* item */ GameObject => Unit): Self = this.set("createCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreateCallback: Self = this.set("createCallback", js.undefined)
    
    @scala.inline
    def setCreateMultipleCallback(value: /* items */ js.Array[GameObject] => Unit): Self = this.set("createMultipleCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreateMultipleCallback: Self = this.set("createMultipleCallback", js.undefined)
    
    @scala.inline
    def setCustomBoundsRectangle(value: Rectangle): Self = this.set("customBoundsRectangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomBoundsRectangle: Self = this.set("customBoundsRectangle", js.undefined)
    
    @scala.inline
    def setDefaultFrame(value: String | integer): Self = this.set("defaultFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultFrame: Self = this.set("defaultFrame", js.undefined)
    
    @scala.inline
    def setDefaultKey(value: String): Self = this.set("defaultKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultKey: Self = this.set("defaultKey", js.undefined)
    
    @scala.inline
    def setDragX(value: Double): Self = this.set("dragX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragX: Self = this.set("dragX", js.undefined)
    
    @scala.inline
    def setDragY(value: Double): Self = this.set("dragY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragY: Self = this.set("dragY", js.undefined)
    
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    
    @scala.inline
    def setFrictionX(value: Double): Self = this.set("frictionX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrictionX: Self = this.set("frictionX", js.undefined)
    
    @scala.inline
    def setFrictionY(value: Double): Self = this.set("frictionY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrictionY: Self = this.set("frictionY", js.undefined)
    
    @scala.inline
    def setGravityX(value: Double): Self = this.set("gravityX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGravityX: Self = this.set("gravityX", js.undefined)
    
    @scala.inline
    def setGravityY(value: Double): Self = this.set("gravityY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGravityY: Self = this.set("gravityY", js.undefined)
    
    @scala.inline
    def setImmovable(value: Boolean): Self = this.set("immovable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImmovable: Self = this.set("immovable", js.undefined)
    
    @scala.inline
    def setMass(value: Double): Self = this.set("mass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMass: Self = this.set("mass", js.undefined)
    
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRemoveCallback(value: /* item */ GameObject => Unit): Self = this.set("removeCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveCallback: Self = this.set("removeCallback", js.undefined)
    
    @scala.inline
    def setRunChildUpdate(value: Boolean): Self = this.set("runChildUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunChildUpdate: Self = this.set("runChildUpdate", js.undefined)
    
    @scala.inline
    def setVelocityX(value: Double): Self = this.set("velocityX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVelocityX: Self = this.set("velocityX", js.undefined)
    
    @scala.inline
    def setVelocityY(value: Double): Self = this.set("velocityY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVelocityY: Self = this.set("velocityY", js.undefined)
  }
}
