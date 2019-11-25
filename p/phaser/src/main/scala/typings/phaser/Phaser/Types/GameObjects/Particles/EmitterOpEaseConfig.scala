package typings.phaser.Phaser.Types.GameObjects.Particles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines an operation yielding a value incremented continuously across a range.
  */
trait EmitterOpEaseConfig extends _EmitterOpOnUpdateType {
  /**
    * The name of the easing function.
    */
  var ease: js.UndefOr[String] = js.undefined
  /**
    * The ending value.
    */
  var end: Double
  /**
    * The starting value.
    */
  var start: Double
}

object EmitterOpEaseConfig {
  @scala.inline
  def apply(end: Double, start: Double, ease: String = null): EmitterOpEaseConfig = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitterOpEaseConfig]
  }
}

