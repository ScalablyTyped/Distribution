package typings.mobxReactDevtools.mod

import typings.mobxReactDevtools.anon.Bottom
import typings.mobxReactDevtools.mobxReactDevtoolsStrings.bottomLeft
import typings.mobxReactDevtools.mobxReactDevtoolsStrings.bottomRight
import typings.mobxReactDevtools.mobxReactDevtoolsStrings.topLeft
import typings.mobxReactDevtools.mobxReactDevtoolsStrings.topRight
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDevToolProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var highlightTimeout: js.UndefOr[Double] = js.native
  var noPanel: js.UndefOr[Boolean] = js.native
  var position: js.UndefOr[topRight | bottomRight | bottomLeft | topLeft | Bottom] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object IDevToolProps {
  @scala.inline
  def apply(): IDevToolProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDevToolProps]
  }
  @scala.inline
  implicit class IDevToolPropsOps[Self <: IDevToolProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setHighlightTimeout(value: Double): Self = this.set("highlightTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightTimeout: Self = this.set("highlightTimeout", js.undefined)
    @scala.inline
    def setNoPanel(value: Boolean): Self = this.set("noPanel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoPanel: Self = this.set("noPanel", js.undefined)
    @scala.inline
    def setPosition(value: topRight | bottomRight | bottomLeft | topLeft | Bottom): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

