package typings.next

import typings.next.distLibCheckDashCustomDashRoutesMod.Header
import typings.next.distLibCheckDashCustomDashRoutesMod.Redirect
import typings.next.distLibCheckDashCustomDashRoutesMod.Rewrite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Headers extends js.Object {
  var headers: js.Array[Header]
  var redirects: js.Array[Redirect]
  var rewrites: js.Array[Rewrite]
}

object Anon_Headers {
  @scala.inline
  def apply(headers: js.Array[Header], redirects: js.Array[Redirect], rewrites: js.Array[Rewrite]): Anon_Headers = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], redirects = redirects.asInstanceOf[js.Any], rewrites = rewrites.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Headers]
  }
}

