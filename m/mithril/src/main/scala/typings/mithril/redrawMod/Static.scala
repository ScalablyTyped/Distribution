package typings.mithril.redrawMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Static extends js.Object {
  var redraw: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof redraw */ js.Any
  var render: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof render */ js.Any
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
}

