package typings.openseadragon.anon

import typings.openseadragon.mod.ButtonEvent
import typings.openseadragon.mod.EventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends js.Object {
  var element: js.UndefOr[typings.std.Element] = js.native
  var fadeDelay: js.UndefOr[Double] = js.native
  var fadeLength: js.UndefOr[Double] = js.native
  var onBlur: js.UndefOr[EventHandler[ButtonEvent]] = js.native
  var onClick: js.UndefOr[EventHandler[ButtonEvent]] = js.native
  var onEnter: js.UndefOr[EventHandler[ButtonEvent]] = js.native
  var onExit: js.UndefOr[EventHandler[ButtonEvent]] = js.native
  var onFocus: js.UndefOr[EventHandler[ButtonEvent]] = js.native
  var onPress: js.UndefOr[EventHandler[ButtonEvent]] = js.native
  var onRelease: js.UndefOr[EventHandler[ButtonEvent]] = js.native
  var srcDown: js.UndefOr[String] = js.native
  var srcGroup: js.UndefOr[String] = js.native
  var srcHover: js.UndefOr[String] = js.native
  var srcRest: js.UndefOr[String] = js.native
  var tooltip: js.UndefOr[String] = js.native
}

object Element {
  @scala.inline
  def apply(): Element = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Element]
  }
  @scala.inline
  implicit class ElementOps[Self <: Element] (val x: Self) extends AnyVal {
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
    def setElement(value: typings.std.Element): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setFadeDelay(value: Double): Self = this.set("fadeDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFadeDelay: Self = this.set("fadeDelay", js.undefined)
    @scala.inline
    def setFadeLength(value: Double): Self = this.set("fadeLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFadeLength: Self = this.set("fadeLength", js.undefined)
    @scala.inline
    def setOnBlur(value: ButtonEvent => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnClick(value: ButtonEvent => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnEnter(value: ButtonEvent => Unit): Self = this.set("onEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEnter: Self = this.set("onEnter", js.undefined)
    @scala.inline
    def setOnExit(value: ButtonEvent => Unit): Self = this.set("onExit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnExit: Self = this.set("onExit", js.undefined)
    @scala.inline
    def setOnFocus(value: ButtonEvent => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnPress(value: ButtonEvent => Unit): Self = this.set("onPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    @scala.inline
    def setOnRelease(value: ButtonEvent => Unit): Self = this.set("onRelease", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRelease: Self = this.set("onRelease", js.undefined)
    @scala.inline
    def setSrcDown(value: String): Self = this.set("srcDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrcDown: Self = this.set("srcDown", js.undefined)
    @scala.inline
    def setSrcGroup(value: String): Self = this.set("srcGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrcGroup: Self = this.set("srcGroup", js.undefined)
    @scala.inline
    def setSrcHover(value: String): Self = this.set("srcHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrcHover: Self = this.set("srcHover", js.undefined)
    @scala.inline
    def setSrcRest(value: String): Self = this.set("srcRest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrcRest: Self = this.set("srcRest", js.undefined)
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
  
}

