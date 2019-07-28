package typings.plottable.buildSrcComponentsLabelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/components/label", "AxisLabel")
@js.native
/**
  * @constructor
  * @param {string} [text]
  * @param {number} [angle] One of -90/0/90. 0 is horizontal.
  */
class AxisLabel () extends Label {
  def this(text: String) = this()
  def this(text: String, angle: Double) = this()
}

/* static members */
@JSImport("plottable/build/src/components/label", "AxisLabel")
@js.native
object AxisLabel extends js.Object {
  var AXIS_LABEL_CLASS: String = js.native
}

