package typings.plottable.buildSrcComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/components", "AxisLabel")
@js.native
/**
  * @constructor
  * @param {string} [text]
  * @param {number} [angle] One of -90/0/90. 0 is horizontal.
  */
class AxisLabel ()
  extends typings.plottable.buildSrcComponentsLabelMod.AxisLabel {
  def this(text: String) = this()
  def this(text: String, angle: Double) = this()
}

/* static members */
@JSImport("plottable/build/src/components", "AxisLabel")
@js.native
object AxisLabel extends js.Object {
  var AXIS_LABEL_CLASS: String = js.native
}

