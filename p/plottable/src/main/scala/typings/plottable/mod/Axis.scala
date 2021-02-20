package typings.plottable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable", "Axis")
@js.native
class Axis[D] protected ()
  extends typings.plottable.axisMod.Axis[D] {
  /**
    * Constructs an Axis.
    * An Axis is a visual representation of a Scale.
    *
    * @constructor
    * @param {Scale} scale
    * @param {AxisOrientation} orientation Orientation of this Axis.
    */
  def this(
    scale: typings.plottable.scaleMod.Scale[D, Double],
    orientation: typings.plottable.axisMod.AxisOrientation
  ) = this()
}
/* static members */
object Axis {
  
  @JSImport("plottable", "Axis")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The css class applied to each annotation circle, which denotes which tick is being annotated.
    */
  @JSImport("plottable", "Axis.ANNOTATION_CIRCLE_CLASS")
  @js.native
  def ANNOTATION_CIRCLE_CLASS: String = js.native
  @scala.inline
  def ANNOTATION_CIRCLE_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANNOTATION_CIRCLE_CLASS")(x.asInstanceOf[js.Any])
  
  /**
    * The css class applied to each annotation label, which shows the formatted annotation text.
    */
  @JSImport("plottable", "Axis.ANNOTATION_LABEL_CLASS")
  @js.native
  def ANNOTATION_LABEL_CLASS: String = js.native
  @scala.inline
  def ANNOTATION_LABEL_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANNOTATION_LABEL_CLASS")(x.asInstanceOf[js.Any])
  
  /**
    * The css class applied to each annotation line, which extends from the axis to the rect.
    */
  @JSImport("plottable", "Axis.ANNOTATION_LINE_CLASS")
  @js.native
  def ANNOTATION_LINE_CLASS: String = js.native
  @scala.inline
  def ANNOTATION_LINE_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANNOTATION_LINE_CLASS")(x.asInstanceOf[js.Any])
  
  /**
    * The css class applied to each annotation rect, which surrounds the annotation label.
    */
  @JSImport("plottable", "Axis.ANNOTATION_RECT_CLASS")
  @js.native
  def ANNOTATION_RECT_CLASS: String = js.native
  @scala.inline
  def ANNOTATION_RECT_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANNOTATION_RECT_CLASS")(x.asInstanceOf[js.Any])
  
  /**
    * The css class applied to each end tick mark (the line on the end tick).
    */
  @JSImport("plottable", "Axis.END_TICK_MARK_CLASS")
  @js.native
  def END_TICK_MARK_CLASS: String = js.native
  @scala.inline
  def END_TICK_MARK_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("END_TICK_MARK_CLASS")(x.asInstanceOf[js.Any])
  
  /**
    * The css class applied to each tick label (the text associated with the tick).
    */
  @JSImport("plottable", "Axis.TICK_LABEL_CLASS")
  @js.native
  def TICK_LABEL_CLASS: String = js.native
  @scala.inline
  def TICK_LABEL_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TICK_LABEL_CLASS")(x.asInstanceOf[js.Any])
  
  /**
    * The css class applied to each tick mark (the line on the tick).
    */
  @JSImport("plottable", "Axis.TICK_MARK_CLASS")
  @js.native
  def TICK_MARK_CLASS: String = js.native
  @scala.inline
  def TICK_MARK_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TICK_MARK_CLASS")(x.asInstanceOf[js.Any])
  
  @JSImport("plottable", "Axis._ANNOTATION_LABEL_PADDING")
  @js.native
  def _ANNOTATION_LABEL_PADDING: js.Any = js.native
  @scala.inline
  def _ANNOTATION_LABEL_PADDING_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ANNOTATION_LABEL_PADDING")(x.asInstanceOf[js.Any])
}
