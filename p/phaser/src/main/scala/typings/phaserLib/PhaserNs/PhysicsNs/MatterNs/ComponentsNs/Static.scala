package typings
package phaserLib.PhaserNs.PhysicsNs.MatterNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [description]
  */
trait Static extends js.Object {
  /**
    * [description]
    */
  def isStatic(): scala.Boolean
  /**
    * [description]
    * @param value [description]
    */
  def setStatic(value: scala.Boolean): phaserLib.PhaserNs.GameObjectsNs.GameObject
}

object Static {
  @scala.inline
  def apply(
    isStatic: () => scala.Boolean,
    setStatic: scala.Boolean => phaserLib.PhaserNs.GameObjectsNs.GameObject
  ): Static = {
    val __obj = js.Dynamic.literal(isStatic = js.Any.fromFunction0(isStatic), setStatic = js.Any.fromFunction1(setStatic))
  
    __obj.asInstanceOf[Static]
  }
}

