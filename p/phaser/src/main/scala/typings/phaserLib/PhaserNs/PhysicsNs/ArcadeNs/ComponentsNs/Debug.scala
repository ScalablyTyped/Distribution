package typings
package phaserLib.PhaserNs.PhysicsNs.ArcadeNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods used for setting the debug properties of an Arcade Physics Body.
  */
trait Debug extends js.Object {
  /**
    * The color of the body outline when it renders to the debug display.
    */
  var debugBodyColor: scala.Double
  /**
    * Set to `true` to have this body render its outline to the debug display.
    */
  var debugShowBody: scala.Boolean
  /**
    * Set to `true` to have this body render a velocity marker to the debug display.
    */
  var debugShowVelocity: scala.Boolean
  /**
    * Sets the debug values of this body.
    * 
    * Bodies will only draw their debug if debug has been enabled for Arcade Physics as a whole.
    * Note that there is a performance cost in drawing debug displays. It should never be used in production.
    * @param showBody Set to `true` to have this body render its outline to the debug display.
    * @param showVelocity Set to `true` to have this body render a velocity marker to the debug display.
    * @param bodyColor The color of the body outline when rendered to the debug display.
    */
  def setDebug(showBody: scala.Boolean, showVelocity: scala.Boolean, bodyColor: scala.Double): this.type
  /**
    * Sets the color of the body outline when it renders to the debug display.
    * @param value The color of the body outline when rendered to the debug display.
    */
  def setDebugBodyColor(value: scala.Double): this.type
}

object Debug {
  @scala.inline
  def apply(
    debugBodyColor: scala.Double,
    debugShowBody: scala.Boolean,
    debugShowVelocity: scala.Boolean,
    setDebug: (scala.Boolean, scala.Boolean, scala.Double) => Debug,
    setDebugBodyColor: scala.Double => Debug
  ): Debug = {
    val __obj = js.Dynamic.literal(debugBodyColor = debugBodyColor, debugShowBody = debugShowBody, debugShowVelocity = debugShowVelocity, setDebug = js.Any.fromFunction3(setDebug), setDebugBodyColor = js.Any.fromFunction1(setDebugBodyColor))
  
    __obj.asInstanceOf[Debug]
  }
}

