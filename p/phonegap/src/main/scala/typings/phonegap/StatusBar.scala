package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Defined in lib.d.ts
interface LocalStorage {
  key;
  getItem;
  setItem;
  removeItem;
  clear;
}
*/
@js.native
trait StatusBar extends js.Object {
  var isVisible: Boolean = js.native
  def backgroundColorByHexString(hexString: String): Unit = js.native
  def backgroundColorByName(colorname: String): Unit = js.native
  def hide(): Unit = js.native
  def overlaysWebView(doOverlay: Boolean): Unit = js.native
  def show(): Unit = js.native
  def styleBlackOpaque(): Unit = js.native
  def styleBlackTranslucent(): Unit = js.native
  def styleDefault(): Unit = js.native
  def styleLightContent(): Unit = js.native
}

object StatusBar {
  @scala.inline
  def apply(
    backgroundColorByHexString: String => Unit,
    backgroundColorByName: String => Unit,
    hide: () => Unit,
    isVisible: Boolean,
    overlaysWebView: Boolean => Unit,
    show: () => Unit,
    styleBlackOpaque: () => Unit,
    styleBlackTranslucent: () => Unit,
    styleDefault: () => Unit,
    styleLightContent: () => Unit
  ): StatusBar = {
    val __obj = js.Dynamic.literal(backgroundColorByHexString = js.Any.fromFunction1(backgroundColorByHexString), backgroundColorByName = js.Any.fromFunction1(backgroundColorByName), hide = js.Any.fromFunction0(hide), isVisible = isVisible.asInstanceOf[js.Any], overlaysWebView = js.Any.fromFunction1(overlaysWebView), show = js.Any.fromFunction0(show), styleBlackOpaque = js.Any.fromFunction0(styleBlackOpaque), styleBlackTranslucent = js.Any.fromFunction0(styleBlackTranslucent), styleDefault = js.Any.fromFunction0(styleDefault), styleLightContent = js.Any.fromFunction0(styleLightContent))
    __obj.asInstanceOf[StatusBar]
  }
  @scala.inline
  implicit class StatusBarOps[Self <: StatusBar] (val x: Self) extends AnyVal {
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
    def setBackgroundColorByHexString(value: String => Unit): Self = this.set("backgroundColorByHexString", js.Any.fromFunction1(value))
    @scala.inline
    def setBackgroundColorByName(value: String => Unit): Self = this.set("backgroundColorByName", js.Any.fromFunction1(value))
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverlaysWebView(value: Boolean => Unit): Self = this.set("overlaysWebView", js.Any.fromFunction1(value))
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    @scala.inline
    def setStyleBlackOpaque(value: () => Unit): Self = this.set("styleBlackOpaque", js.Any.fromFunction0(value))
    @scala.inline
    def setStyleBlackTranslucent(value: () => Unit): Self = this.set("styleBlackTranslucent", js.Any.fromFunction0(value))
    @scala.inline
    def setStyleDefault(value: () => Unit): Self = this.set("styleDefault", js.Any.fromFunction0(value))
    @scala.inline
    def setStyleLightContent(value: () => Unit): Self = this.set("styleLightContent", js.Any.fromFunction0(value))
  }
  
}

