package typings.muicss.reactMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsProps extends HTMLAttributes[HTMLDivElement] {
  var defaultSelectedIndex: js.UndefOr[Double] = js.native
  var justified: js.UndefOr[Boolean] = js.native
  var selectedIndex: js.UndefOr[Double] = js.native
}

object TabsProps {
  @scala.inline
  def apply(): TabsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsProps]
  }
  @scala.inline
  implicit class TabsPropsOps[Self <: TabsProps] (val x: Self) extends AnyVal {
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
    def setDefaultSelectedIndex(value: Double): Self = this.set("defaultSelectedIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSelectedIndex: Self = this.set("defaultSelectedIndex", js.undefined)
    @scala.inline
    def setJustified(value: Boolean): Self = this.set("justified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJustified: Self = this.set("justified", js.undefined)
    @scala.inline
    def setSelectedIndex(value: Double): Self = this.set("selectedIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedIndex: Self = this.set("selectedIndex", js.undefined)
  }
  
}

