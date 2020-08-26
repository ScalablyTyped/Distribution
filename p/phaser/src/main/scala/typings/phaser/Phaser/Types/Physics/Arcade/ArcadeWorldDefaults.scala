package typings.phaser.Phaser.Types.Physics.Arcade

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArcadeWorldDefaults extends js.Object {
  /**
    * The color of dynamic body outlines when rendered to the debug display.
    */
  var bodyDebugColor: Double = js.native
  /**
    * Set to `true` to render dynamic body outlines to the debug display.
    */
  var debugShowBody: Boolean = js.native
  /**
    * Set to `true` to render static body outlines to the debug display.
    */
  var debugShowStaticBody: Boolean = js.native
  /**
    * Set to `true` to render body velocity markers to the debug display.
    */
  var debugShowVelocity: Boolean = js.native
  /**
    * The color of static body outlines when rendered to the debug display.
    */
  var staticBodyDebugColor: Double = js.native
  /**
    * The color of the velocity markers when rendered to the debug display.
    */
  var velocityDebugColor: Double = js.native
}

object ArcadeWorldDefaults {
  @scala.inline
  def apply(
    bodyDebugColor: Double,
    debugShowBody: Boolean,
    debugShowStaticBody: Boolean,
    debugShowVelocity: Boolean,
    staticBodyDebugColor: Double,
    velocityDebugColor: Double
  ): ArcadeWorldDefaults = {
    val __obj = js.Dynamic.literal(bodyDebugColor = bodyDebugColor.asInstanceOf[js.Any], debugShowBody = debugShowBody.asInstanceOf[js.Any], debugShowStaticBody = debugShowStaticBody.asInstanceOf[js.Any], debugShowVelocity = debugShowVelocity.asInstanceOf[js.Any], staticBodyDebugColor = staticBodyDebugColor.asInstanceOf[js.Any], velocityDebugColor = velocityDebugColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcadeWorldDefaults]
  }
  @scala.inline
  implicit class ArcadeWorldDefaultsOps[Self <: ArcadeWorldDefaults] (val x: Self) extends AnyVal {
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
    def setBodyDebugColor(value: Double): Self = this.set("bodyDebugColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebugShowBody(value: Boolean): Self = this.set("debugShowBody", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebugShowStaticBody(value: Boolean): Self = this.set("debugShowStaticBody", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebugShowVelocity(value: Boolean): Self = this.set("debugShowVelocity", value.asInstanceOf[js.Any])
    @scala.inline
    def setStaticBodyDebugColor(value: Double): Self = this.set("staticBodyDebugColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setVelocityDebugColor(value: Double): Self = this.set("velocityDebugColor", value.asInstanceOf[js.Any])
  }
  
}

