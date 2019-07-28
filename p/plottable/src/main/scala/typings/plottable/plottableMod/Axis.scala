package typings.plottable.plottableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "Axis")
@js.native
class Axis[D] protected ()
  extends typings.plottable.buildSrcAxesAxisMod.Axis[D] {
  /**
    * Constructs an Axis.
    * An Axis is a visual representation of a Scale.
    *
    * @constructor
    * @param {Scale} scale
    * @param {AxisOrientation} orientation Orientation of this Axis.
    */
  def this(
    scale: typings.plottable.buildSrcScalesScaleMod.Scale[D, Double],
    orientation: typings.plottable.buildSrcAxesAxisMod.AxisOrientation
  ) = this()
}

/* static members */
@JSImport("plottable", "Axis")
@js.native
object Axis extends js.Object {
  /**
    * The css class applied to each annotation circle, which denotes which tick is being annotated.
    */
  var ANNOTATION_CIRCLE_CLASS: String = js.native
  /**
    * The css class applied to each annotation label, which shows the formatted annotation text.
    */
  var ANNOTATION_LABEL_CLASS: String = js.native
  /**
    * The css class applied to each annotation line, which extends from the axis to the rect.
    */
  var ANNOTATION_LINE_CLASS: String = js.native
  /**
    * The css class applied to each annotation rect, which surrounds the annotation label.
    */
  var ANNOTATION_RECT_CLASS: String = js.native
  /**
    * The css class applied to each end tick mark (the line on the end tick).
    */
  var END_TICK_MARK_CLASS: String = js.native
  /**
    * The css class applied to each tick label (the text associated with the tick).
    */
  var TICK_LABEL_CLASS: String = js.native
  /**
    * The css class applied to each tick mark (the line on the tick).
    */
  var TICK_MARK_CLASS: String = js.native
  var _ANNOTATION_LABEL_PADDING: js.Any = js.native
}

