package typings
package phaserLib.PhaserNs.PhysicsNs.ImpactNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Impact Check Against component.
  * Should be applied as a mixin.
  */
trait CheckAgainst extends js.Object {
  /**
    * [description]
    */
  var checkAgainst: scala.Double
  /**
    * [description]
    */
  def setAvsB(): phaserLib.PhaserNs.GameObjectsNs.GameObject
  /**
    * [description]
    */
  def setBvsA(): phaserLib.PhaserNs.GameObjectsNs.GameObject
  /**
    * [description]
    */
  def setCheckAgainstA(): phaserLib.PhaserNs.GameObjectsNs.GameObject
  /**
    * [description]
    */
  def setCheckAgainstB(): phaserLib.PhaserNs.GameObjectsNs.GameObject
  /**
    * [description]
    */
  def setCheckAgainstNone(): phaserLib.PhaserNs.GameObjectsNs.GameObject
}

object CheckAgainst {
  @scala.inline
  def apply(
    checkAgainst: scala.Double,
    setAvsB: () => phaserLib.PhaserNs.GameObjectsNs.GameObject,
    setBvsA: () => phaserLib.PhaserNs.GameObjectsNs.GameObject,
    setCheckAgainstA: () => phaserLib.PhaserNs.GameObjectsNs.GameObject,
    setCheckAgainstB: () => phaserLib.PhaserNs.GameObjectsNs.GameObject,
    setCheckAgainstNone: () => phaserLib.PhaserNs.GameObjectsNs.GameObject
  ): CheckAgainst = {
    val __obj = js.Dynamic.literal(checkAgainst = checkAgainst, setAvsB = js.Any.fromFunction0(setAvsB), setBvsA = js.Any.fromFunction0(setBvsA), setCheckAgainstA = js.Any.fromFunction0(setCheckAgainstA), setCheckAgainstB = js.Any.fromFunction0(setCheckAgainstB), setCheckAgainstNone = js.Any.fromFunction0(setCheckAgainstNone))
  
    __obj.asInstanceOf[CheckAgainst]
  }
}

