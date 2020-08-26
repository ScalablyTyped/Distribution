package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IPosition
import typings.monacoEditor.mod.IRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContentWidgetPosition extends js.Object {
  /**
    * Desired position for the content widget.
    * `preference` will also affect the placement.
    */
  var position: IPosition | Null = js.native
  /**
    * Placement preference for position, in order of preference.
    */
  var preference: js.Array[ContentWidgetPositionPreference] = js.native
  /**
    * Optionally, a range can be provided to further
    * define the position of the content widget.
    */
  var range: js.UndefOr[IRange | Null] = js.native
}

object IContentWidgetPosition {
  @scala.inline
  def apply(preference: js.Array[ContentWidgetPositionPreference]): IContentWidgetPosition = {
    val __obj = js.Dynamic.literal(preference = preference.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContentWidgetPosition]
  }
  @scala.inline
  implicit class IContentWidgetPositionOps[Self <: IContentWidgetPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPreferenceVarargs(value: ContentWidgetPositionPreference*): Self = this.set("preference", js.Array(value :_*))
    @scala.inline
    def setPreference(value: js.Array[ContentWidgetPositionPreference]): Self = this.set("preference", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: IPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setPositionNull: Self = this.set("position", null)
    @scala.inline
    def setRange(value: IRange): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setRangeNull: Self = this.set("range", null)
  }
  
}

