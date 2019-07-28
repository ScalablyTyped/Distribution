package typings.phaser.PhaserNs.PhysicsNs.ImpactNs.ComponentsNs

import typings.phaser.PhaserNs.GameObjectsNs.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Impact Debug component.
  * Should be applied as a mixin.
  */
trait Debug extends js.Object {
  /**
    * [description]
    */
  var debugBodyColor: Double
  /**
    * [description]
    */
  var debugShowBody: Boolean
  /**
    * [description]
    */
  var debugShowVelocity: Boolean
  /**
    * [description]
    * @param showBody [description]
    * @param showVelocity [description]
    * @param bodyColor [description]
    */
  def setDebug(showBody: Boolean, showVelocity: Boolean, bodyColor: Double): GameObject
  /**
    * [description]
    * @param value [description]
    */
  def setDebugBodyColor(value: Double): GameObject
}

object Debug {
  @scala.inline
  def apply(
    debugBodyColor: Double,
    debugShowBody: Boolean,
    debugShowVelocity: Boolean,
    setDebug: (Boolean, Boolean, Double) => GameObject,
    setDebugBodyColor: Double => GameObject
  ): Debug = {
    val __obj = js.Dynamic.literal(debugBodyColor = debugBodyColor, debugShowBody = debugShowBody, debugShowVelocity = debugShowVelocity, setDebug = js.Any.fromFunction3(setDebug), setDebugBodyColor = js.Any.fromFunction1(setDebugBodyColor))
  
    __obj.asInstanceOf[Debug]
  }
}

