package typings.pickadate.Pickadate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeKlassOptions extends KlassOptions {
   // default 'picker picker--time'
  // List of times
  var list: js.UndefOr[String] = js.undefined
   // default 'picker__list'
  var listItem: js.UndefOr[String] = js.undefined
   // default 'picker__list-item'
  // Time states
  var viewset: js.UndefOr[String] = js.undefined
}

object TimeKlassOptions {
  @scala.inline
  def apply(
    active: String = null,
    box: String = null,
    buttonClear: String = null,
    disabled: String = null,
    focused: String = null,
    frame: String = null,
    highlighted: String = null,
    holder: String = null,
    input: String = null,
    list: String = null,
    listItem: String = null,
    now: String = null,
    opened: String = null,
    picker: String = null,
    selected: String = null,
    viewset: String = null,
    wrap: String = null
  ): TimeKlassOptions = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active)
    if (box != null) __obj.updateDynamic("box")(box)
    if (buttonClear != null) __obj.updateDynamic("buttonClear")(buttonClear)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (focused != null) __obj.updateDynamic("focused")(focused)
    if (frame != null) __obj.updateDynamic("frame")(frame)
    if (highlighted != null) __obj.updateDynamic("highlighted")(highlighted)
    if (holder != null) __obj.updateDynamic("holder")(holder)
    if (input != null) __obj.updateDynamic("input")(input)
    if (list != null) __obj.updateDynamic("list")(list)
    if (listItem != null) __obj.updateDynamic("listItem")(listItem)
    if (now != null) __obj.updateDynamic("now")(now)
    if (opened != null) __obj.updateDynamic("opened")(opened)
    if (picker != null) __obj.updateDynamic("picker")(picker)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    if (viewset != null) __obj.updateDynamic("viewset")(viewset)
    if (wrap != null) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[TimeKlassOptions]
  }
}

