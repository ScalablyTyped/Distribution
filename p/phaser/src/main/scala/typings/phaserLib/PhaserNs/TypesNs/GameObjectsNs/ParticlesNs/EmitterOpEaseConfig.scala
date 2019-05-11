package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines an operation yielding a value incremented continuously across a range.
  */
trait EmitterOpEaseConfig extends js.Object {
  /**
    * The name of the easing function.
    */
  var ease: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ending value.
    */
  var end: scala.Double
  /**
    * The starting value.
    */
  var start: scala.Double
}

object EmitterOpEaseConfig {
  @scala.inline
  def apply(end: scala.Double, start: scala.Double, ease: java.lang.String = null): EmitterOpEaseConfig = {
    val __obj = js.Dynamic.literal(end = end, start = start)
    if (ease != null) __obj.updateDynamic("ease")(ease)
    __obj.asInstanceOf[EmitterOpEaseConfig]
  }
}

