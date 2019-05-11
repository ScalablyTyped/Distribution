package typings
package phaserLib.PhaserNs.PhysicsNs.ImpactNs.ComponentsNs

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
  var debugBodyColor: scala.Double
  /**
    * [description]
    */
  var debugShowBody: scala.Boolean
  /**
    * [description]
    */
  var debugShowVelocity: scala.Boolean
  /**
    * [description]
    * @param showBody [description]
    * @param showVelocity [description]
    * @param bodyColor [description]
    */
  def setDebug(showBody: scala.Boolean, showVelocity: scala.Boolean, bodyColor: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject
  /**
    * [description]
    * @param value [description]
    */
  def setDebugBodyColor(value: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject
}

object Debug {
  @scala.inline
  def apply(
    debugBodyColor: scala.Double,
    debugShowBody: scala.Boolean,
    debugShowVelocity: scala.Boolean,
    setDebug: (scala.Boolean, scala.Boolean, scala.Double) => phaserLib.PhaserNs.GameObjectsNs.GameObject,
    setDebugBodyColor: scala.Double => phaserLib.PhaserNs.GameObjectsNs.GameObject
  ): Debug = {
    val __obj = js.Dynamic.literal(debugBodyColor = debugBodyColor, debugShowBody = debugShowBody, debugShowVelocity = debugShowVelocity, setDebug = js.Any.fromFunction3(setDebug), setDebugBodyColor = js.Any.fromFunction1(setDebugBodyColor))
  
    __obj.asInstanceOf[Debug]
  }
}

