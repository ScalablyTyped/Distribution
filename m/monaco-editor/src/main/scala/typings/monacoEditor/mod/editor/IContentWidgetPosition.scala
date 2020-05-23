package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IPosition
import typings.monacoEditor.mod.IRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContentWidgetPosition extends js.Object {
  /**
    * Desired position for the content widget.
    * `preference` will also affect the placement.
    */
  var position: IPosition | Null
  /**
    * Placement preference for position, in order of preference.
    */
  var preference: js.Array[ContentWidgetPositionPreference]
  /**
    * Optionally, a range can be provided to further
    * define the position of the content widget.
    */
  var range: js.UndefOr[IRange | Null] = js.undefined
}

object IContentWidgetPosition {
  @scala.inline
  def apply(
    preference: js.Array[ContentWidgetPositionPreference],
    position: IPosition = null,
    range: js.UndefOr[Null | IRange] = js.undefined
  ): IContentWidgetPosition = {
    val __obj = js.Dynamic.literal(preference = preference.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContentWidgetPosition]
  }
}

