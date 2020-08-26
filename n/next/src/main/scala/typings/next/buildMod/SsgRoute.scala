package typings.next.buildMod

import typings.next.nextBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SsgRoute extends js.Object {
  var dataRoute: String = js.native
  var initialRevalidateSeconds: Double | `false` = js.native
  var srcRoute: String | Null = js.native
}

object SsgRoute {
  @scala.inline
  def apply(dataRoute: String, initialRevalidateSeconds: Double | `false`): SsgRoute = {
    val __obj = js.Dynamic.literal(dataRoute = dataRoute.asInstanceOf[js.Any], initialRevalidateSeconds = initialRevalidateSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SsgRoute]
  }
  @scala.inline
  implicit class SsgRouteOps[Self <: SsgRoute] (val x: Self) extends AnyVal {
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
    def setDataRoute(value: String): Self = this.set("dataRoute", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialRevalidateSeconds(value: Double | `false`): Self = this.set("initialRevalidateSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrcRoute(value: String): Self = this.set("srcRoute", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrcRouteNull: Self = this.set("srcRoute", null)
  }
  
}

