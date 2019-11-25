package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverviewRulerPosition extends js.Object {
  /**
    * Height of the overview ruler
    */
  val height: Double
  /**
    * Right position for the overview ruler
    */
  val right: Double
  /**
    * Top position for the overview ruler
    */
  val top: Double
  /**
    * Width of the overview ruler
    */
  val width: Double
}

object OverviewRulerPosition {
  @scala.inline
  def apply(height: Double, right: Double, top: Double, width: Double): OverviewRulerPosition = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OverviewRulerPosition]
  }
}

