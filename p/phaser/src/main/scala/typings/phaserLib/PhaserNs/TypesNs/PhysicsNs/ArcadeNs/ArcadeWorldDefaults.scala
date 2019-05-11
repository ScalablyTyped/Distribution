package typings
package phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcadeWorldDefaults extends js.Object {
  /**
    * The color of dynamic body outlines when rendered to the debug display.
    */
  var bodyDebugColor: scala.Double
  /**
    * Set to `true` to render dynamic body outlines to the debug display.
    */
  var debugShowBody: scala.Boolean
  /**
    * Set to `true` to render static body outlines to the debug display.
    */
  var debugShowStaticBody: scala.Boolean
  /**
    * Set to `true` to render body velocity markers to the debug display.
    */
  var debugShowVelocity: scala.Boolean
  /**
    * The color of static body outlines when rendered to the debug display.
    */
  var staticBodyDebugColor: scala.Double
  /**
    * The color of the velocity markers when rendered to the debug display.
    */
  var velocityDebugColor: scala.Double
}

object ArcadeWorldDefaults {
  @scala.inline
  def apply(
    bodyDebugColor: scala.Double,
    debugShowBody: scala.Boolean,
    debugShowStaticBody: scala.Boolean,
    debugShowVelocity: scala.Boolean,
    staticBodyDebugColor: scala.Double,
    velocityDebugColor: scala.Double
  ): ArcadeWorldDefaults = {
    val __obj = js.Dynamic.literal(bodyDebugColor = bodyDebugColor, debugShowBody = debugShowBody, debugShowStaticBody = debugShowStaticBody, debugShowVelocity = debugShowVelocity, staticBodyDebugColor = staticBodyDebugColor, velocityDebugColor = velocityDebugColor)
  
    __obj.asInstanceOf[ArcadeWorldDefaults]
  }
}

