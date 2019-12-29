package typings.next

import typings.next.distLibCheckDashCustomDashRoutesMod.Redirect
import typings.next.distLibCheckDashCustomDashRoutesMod.Rewrite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Redirects extends js.Object {
  var redirects: js.Array[Redirect]
  var rewrites: js.Array[Rewrite]
}

object Anon_Redirects {
  @scala.inline
  def apply(redirects: js.Array[Redirect], rewrites: js.Array[Rewrite]): Anon_Redirects = {
    val __obj = js.Dynamic.literal(redirects = redirects.asInstanceOf[js.Any], rewrites = rewrites.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Redirects]
  }
}

