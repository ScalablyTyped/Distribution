package typings.mithril.requestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends js.Object {
  var jsonp: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof jsonp */ js.Any = js.native
  var request: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof request */ js.Any = js.native
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
    def setJsonp(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof jsonp */ js.Any): Self = this.set("jsonp", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof request */ js.Any): Self = this.set("request", value.asInstanceOf[js.Any])
  }
  
}

