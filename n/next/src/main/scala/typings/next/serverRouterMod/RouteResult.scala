package typings.next.serverRouterMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteResult extends js.Object {
  var finished: Boolean = js.native
  var pathname: js.UndefOr[String] = js.native
  var query: js.UndefOr[StringDictionary[String]] = js.native
}

object RouteResult {
  @scala.inline
  def apply(finished: Boolean): RouteResult = {
    val __obj = js.Dynamic.literal(finished = finished.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteResult]
  }
  @scala.inline
  implicit class RouteResultOps[Self <: RouteResult] (val x: Self) extends AnyVal {
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
    def setFinished(value: Boolean): Self = this.set("finished", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathname(value: String): Self = this.set("pathname", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathname: Self = this.set("pathname", js.undefined)
    @scala.inline
    def setQuery(value: StringDictionary[String]): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
  }
  
}

