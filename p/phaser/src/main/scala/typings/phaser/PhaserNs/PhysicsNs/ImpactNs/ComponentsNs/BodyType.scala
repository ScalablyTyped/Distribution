package typings.phaser.PhaserNs.PhysicsNs.ImpactNs.ComponentsNs

import typings.phaser.PhaserNs.GameObjectsNs.GameObject
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
  def getBodyType(): Double
  /**
    * [description]
    */
  def setTypeA(): GameObject
  /**
    * [description]
    */
  def setTypeB(): GameObject
  /**
    * [description]
    */
  def setTypeNone(): GameObject
}

object BodyType {
  @scala.inline
  def apply(
    getBodyType: () => Double,
    setTypeA: () => GameObject,
    setTypeB: () => GameObject,
    setTypeNone: () => GameObject
  ): BodyType = {
    val __obj = js.Dynamic.literal(getBodyType = js.Any.fromFunction0(getBodyType), setTypeA = js.Any.fromFunction0(setTypeA), setTypeB = js.Any.fromFunction0(setTypeB), setTypeNone = js.Any.fromFunction0(setTypeNone))
  
    __obj.asInstanceOf[BodyType]
  }
}

