package typings.phaser.Phaser.Physics.Impact.Components

import typings.phaser.Phaser.GameObjects.GameObject
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
  var checkAgainst: Double
  /**
    * [description]
    */
  def setAvsB(): GameObject
  /**
    * [description]
    */
  def setBvsA(): GameObject
  /**
    * [description]
    */
  def setCheckAgainstA(): GameObject
  /**
    * [description]
    */
  def setCheckAgainstB(): GameObject
  /**
    * [description]
    */
  def setCheckAgainstNone(): GameObject
}

object CheckAgainst {
  @scala.inline
  def apply(
    checkAgainst: Double,
    setAvsB: () => GameObject,
    setBvsA: () => GameObject,
    setCheckAgainstA: () => GameObject,
    setCheckAgainstB: () => GameObject,
    setCheckAgainstNone: () => GameObject
  ): CheckAgainst = {
    val __obj = js.Dynamic.literal(checkAgainst = checkAgainst.asInstanceOf[js.Any], setAvsB = js.Any.fromFunction0(setAvsB), setBvsA = js.Any.fromFunction0(setBvsA), setCheckAgainstA = js.Any.fromFunction0(setCheckAgainstA), setCheckAgainstB = js.Any.fromFunction0(setCheckAgainstB), setCheckAgainstNone = js.Any.fromFunction0(setCheckAgainstNone))
  
    __obj.asInstanceOf[CheckAgainst]
  }
}

