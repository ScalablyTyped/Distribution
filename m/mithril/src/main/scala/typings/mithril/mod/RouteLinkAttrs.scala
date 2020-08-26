package typings.mithril.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteLinkAttrs extends Attributes {
  var href: String = js.native
  var options: js.UndefOr[RouteOptions] = js.native
  var selector: js.UndefOr[String | (ComponentTypes[_, js.Object])] = js.native
}

object RouteLinkAttrs {
  @scala.inline
  def apply(href: String): RouteLinkAttrs = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteLinkAttrs]
  }
  @scala.inline
  implicit class RouteLinkAttrsOps[Self <: RouteLinkAttrs] (val x: Self) extends AnyVal {
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
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: RouteOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setSelectorFunction1(value: /* vnode */ Vnode[_, js.Object] => Component[_, js.Object]): Self = this.set("selector", js.Any.fromFunction1(value))
    @scala.inline
    def setSelector(value: String | (ComponentTypes[_, js.Object])): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
  }
  
}

