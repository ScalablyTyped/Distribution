package typings.next

import typings.next.distNextDashServerServerNextDashServerMod.Redirect
import typings.next.distNextDashServerServerNextDashServerMod.Rewrite
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
    val __obj = js.Dynamic.literal(redirects = redirects, rewrites = rewrites)
  
    __obj.asInstanceOf[Anon_Redirects]
  }
}

