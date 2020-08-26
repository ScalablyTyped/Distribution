package typings.mirrorx.mod

import typings.history.mod.LocationDescriptor
import typings.history.mod.LocationState
import typings.react.mod.AnchorHTMLAttributes
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkProps extends AnchorHTMLAttributes[HTMLAnchorElement] {
  var replace: js.UndefOr[Boolean] = js.native
  var to: LocationDescriptor[LocationState] = js.native
}

object LinkProps {
  @scala.inline
  def apply(to: LocationDescriptor[LocationState]): LinkProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkProps]
  }
  @scala.inline
  implicit class LinkPropsOps[Self <: LinkProps] (val x: Self) extends AnyVal {
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
    def setTo(value: LocationDescriptor[LocationState]): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplace(value: Boolean): Self = this.set("replace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
  }
  
}

