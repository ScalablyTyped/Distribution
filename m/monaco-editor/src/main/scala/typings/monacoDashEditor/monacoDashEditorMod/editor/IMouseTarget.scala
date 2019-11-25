package typings.monacoDashEditor.monacoDashEditorMod.editor

import typings.monacoDashEditor.monacoDashEditorMod.Position
import typings.monacoDashEditor.monacoDashEditorMod.Range
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMouseTarget extends js.Object {
  /**
    * Some extra detail.
    */
  val detail: js.Any
  /**
    * The target element
    */
  val element: Element | Null
  /**
    * Desired mouse column (e.g. when position.column gets clamped to text length -- clicking after text on a line).
    */
  val mouseColumn: Double
  /**
    * The 'approximate' editor position
    */
  val position: Position | Null
  /**
    * The 'approximate' editor range
    */
  val range: Range | Null
  /**
    * The target type
    */
  val `type`: MouseTargetType
}

object IMouseTarget {
  @scala.inline
  def apply(
    detail: js.Any,
    mouseColumn: Double,
    `type`: MouseTargetType,
    element: Element = null,
    position: Position = null,
    range: Range = null
  ): IMouseTarget = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], mouseColumn = mouseColumn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseTarget]
  }
}

