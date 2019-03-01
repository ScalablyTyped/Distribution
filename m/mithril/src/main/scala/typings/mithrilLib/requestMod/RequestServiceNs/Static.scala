package typings
package mithrilLib.requestMod.RequestServiceNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("jsonp")(jsonp)
    __obj.updateDynamic("request")(request)
    __obj.asInstanceOf[Static]
  }
}

