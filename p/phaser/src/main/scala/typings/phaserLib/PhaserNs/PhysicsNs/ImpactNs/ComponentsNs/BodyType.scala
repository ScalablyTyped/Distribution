package typings
package phaserLib.PhaserNs.PhysicsNs.ImpactNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Impact Body Type component.
  * Should be applied as a mixin.
  */
trait BodyType extends js.Object {
  /**
    * [description]
    */
  def getBodyType(): scala.Double
  /**
    * [description]
    */
  def setTypeA(): phaserLib.PhaserNs.GameObjectsNs.GameObject
  /**
    * [description]
    */
  def setTypeB(): phaserLib.PhaserNs.GameObjectsNs.GameObject
  /**
    * [description]
    */
  def setTypeNone(): phaserLib.PhaserNs.GameObjectsNs.GameObject
}

object BodyType {
  @scala.inline
  def apply(
    getBodyType: () => scala.Double,
    setTypeA: () => phaserLib.PhaserNs.GameObjectsNs.GameObject,
    setTypeB: () => phaserLib.PhaserNs.GameObjectsNs.GameObject,
    setTypeNone: () => phaserLib.PhaserNs.GameObjectsNs.GameObject
  ): BodyType = {
    val __obj = js.Dynamic.literal(getBodyType = js.Any.fromFunction0(getBodyType), setTypeA = js.Any.fromFunction0(setTypeA), setTypeB = js.Any.fromFunction0(setTypeB), setTypeNone = js.Any.fromFunction0(setTypeNone))
  
    __obj.asInstanceOf[BodyType]
  }
}

