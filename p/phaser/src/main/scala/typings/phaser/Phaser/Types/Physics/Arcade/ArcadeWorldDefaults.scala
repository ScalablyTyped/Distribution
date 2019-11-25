package typings.phaser.Phaser.Types.Physics.Arcade

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcadeWorldDefaults extends js.Object {
  /**
    * The color of dynamic body outlines when rendered to the debug display.
    */
  var bodyDebugColor: Double
  /**
    * Set to `true` to render dynamic body outlines to the debug display.
    */
  var debugShowBody: Boolean
  /**
    * Set to `true` to render static body outlines to the debug display.
    */
  var debugShowStaticBody: Boolean
  /**
    * Set to `true` to render body velocity markers to the debug display.
    */
  var debugShowVelocity: Boolean
  /**
    * The color of static body outlines when rendered to the debug display.
    */
  var staticBodyDebugColor: Double
  /**
    * The color of the velocity markers when rendered to the debug display.
    */
  var velocityDebugColor: Double
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
}

