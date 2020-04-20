package typings.phaser.Phaser.Physics.Arcade.Components

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
  var debugBodyColor: Double
  /**
    * Set to `true` to have this body render its outline to the debug display.
    */
  var debugShowBody: Boolean
  /**
    * Set to `true` to have this body render a velocity marker to the debug display.
    */
  var debugShowVelocity: Boolean
  /**
    * Sets the debug values of this body.
    * 
    * Bodies will only draw their debug if debug has been enabled for Arcade Physics as a whole.
    * Note that there is a performance cost in drawing debug displays. It should never be used in production.
    * @param showBody Set to `true` to have this body render its outline to the debug display.
    * @param showVelocity Set to `true` to have this body render a velocity marker to the debug display.
    * @param bodyColor The color of the body outline when rendered to the debug display.
    */
  def setDebug(showBody: Boolean, showVelocity: Boolean, bodyColor: Double): this.type
  /**
    * Sets the color of the body outline when it renders to the debug display.
    * @param value The color of the body outline when rendered to the debug display.
    */
  def setDebugBodyColor(value: Double): this.type
}

object Debug {
  @scala.inline
  def apply(
    debugBodyColor: Double,
    debugShowBody: Boolean,
    debugShowVelocity: Boolean,
    setDebug: (Boolean, Boolean, Double) => Debug,
    setDebugBodyColor: Double => Debug
  ): Debug = {
    val __obj = js.Dynamic.literal(debugBodyColor = debugBodyColor.asInstanceOf[js.Any], debugShowBody = debugShowBody.asInstanceOf[js.Any], debugShowVelocity = debugShowVelocity.asInstanceOf[js.Any], setDebug = js.Any.fromFunction3(setDebug), setDebugBodyColor = js.Any.fromFunction1(setDebugBodyColor))
    __obj.asInstanceOf[Debug]
  }
}

