package typings.mithril.redrawMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends js.Object {
  var redraw: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof redraw */ js.Any = js.native
  var render: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof render */ js.Any = js.native
}

object Static {
  @scala.inline
  def apply(
    redraw: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof redraw */ js.Any,
    render: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof render */ js.Any
  ): Static = {
    val __obj = js.Dynamic.literal(redraw = redraw.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
    __obj.asInstanceOf[Static]
  }
  @scala.inline
  implicit class StaticOps[Self <: Static] (val x: Self) extends AnyVal {
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
    def setRedraw(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof redraw */ js.Any): Self = this.set("redraw", value.asInstanceOf[js.Any])
    @scala.inline
    def setRender(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof render */ js.Any): Self = this.set("render", value.asInstanceOf[js.Any])
  }
  
}

