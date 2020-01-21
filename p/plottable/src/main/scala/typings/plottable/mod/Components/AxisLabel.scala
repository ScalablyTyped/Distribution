package typings.plottable.mod.Components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "Components.AxisLabel")
@js.native
/**
  * @constructor
  * @param {string} [text]
  * @param {number} [angle] One of -90/0/90. 0 is horizontal.
  */
class AxisLabel ()
  extends typings.plottable.componentsMod.AxisLabel {
  def this(text: String) = this()
  def this(text: String, angle: Double) = this()
}

/* static members */
@JSImport("plottable", "Components.AxisLabel")
@js.native
object AxisLabel extends js.Object {
  var AXIS_LABEL_CLASS: String = js.native
}

