package typings.plottable.buildSrcComponentsWrappedLabelMod

import typings.plottable.buildSrcComponentsLabelMod.Label
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/components/wrappedLabel", "WrappedLabel")
@js.native
class WrappedLabel () extends Label {
  var _maxLines: Double = js.native
  /**
    * Get the label max number of wrapped lines.
    */
  def maxLines(): Double = js.native
  /**
    * Set the label's max number of wrapped lines.
    * @param maxLines
    */
  def maxLines(maxLines: Double): this.type = js.native
}

