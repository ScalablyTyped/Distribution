package typings.mithril.requestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Static extends js.Object {
  var jsonp: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof jsonp */ js.Any
  var request: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof request */ js.Any
}

object Static {
  @scala.inline
  def apply(
    jsonp: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof jsonp */ js.Any,
    request: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof request */ js.Any
  ): Static = {
    val __obj = js.Dynamic.literal(jsonp = jsonp.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Static]
  }
}

