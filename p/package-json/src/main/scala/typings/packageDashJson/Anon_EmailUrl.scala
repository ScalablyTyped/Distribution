package typings.packageDashJson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EmailUrl extends js.Object {
  val email: String
  val url: js.UndefOr[String] = js.undefined
}

object Anon_EmailUrl {
  @scala.inline
  def apply(email: String, url: String = null): Anon_EmailUrl = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EmailUrl]
  }
}

