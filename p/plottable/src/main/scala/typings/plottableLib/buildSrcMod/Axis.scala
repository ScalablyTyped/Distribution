package typings
package plottableLib.buildSrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src", "Axis")
@js.native
class Axis[D] protected ()
  extends plottableLib.buildSrcAxesAxisMod.Axis[D] {
  /**
       * Constructs an Axis.
       * An Axis is a visual representation of a Scale.
       *
       * @constructor
       * @param {Scale} scale
       * @param {AxisOrientation} orientation Orientation of this Axis.
       */
  def this(scale: plottableLib.buildSrcScalesScaleMod.Scale[D, scala.Double], orientation: plottableLib.buildSrcAxesAxisMod.AxisOrientation) = this()
}

@JSImport("plottable/build/src", "Axis")
@js.native
object Axis extends js.Object {
  /**
       * The css class applied to each annotation circle, which denotes which tick is being annotated.
       */
  var ANNOTATION_CIRCLE_CLASS: java.lang.String = js.native
  /**
       * The css class applied to each annotation label, which shows the formatted annotation text.
       */
  var ANNOTATION_LABEL_CLASS: java.lang.String = js.native
  /**
       * The css class applied to each annotation line, which extends from the axis to the rect.
       */
  var ANNOTATION_LINE_CLASS: java.lang.String = js.native
  /**
       * The css class applied to each annotation rect, which surrounds the annotation label.
       */
  var ANNOTATION_RECT_CLASS: java.lang.String = js.native
  /**
       * The css class applied to each end tick mark (the line on the end tick).
       */
  var END_TICK_MARK_CLASS: java.lang.String = js.native
  /**
       * The css class applied to each tick label (the text associated with the tick).
       */
  var TICK_LABEL_CLASS: java.lang.String = js.native
  /**
       * The css class applied to each tick mark (the line on the tick).
       */
  var TICK_MARK_CLASS: java.lang.String = js.native
  var _ANNOTATION_LABEL_PADDING: js.Any = js.native
}

