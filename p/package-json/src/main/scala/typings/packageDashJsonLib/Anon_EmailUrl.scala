package typings
package packageDashJsonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EmailUrl extends js.Object {
  val email: java.lang.String
  val url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_EmailUrl {
  @scala.inline
  def apply(email: java.lang.String, url: java.lang.String = null): Anon_EmailUrl = {
    val __obj = js.Dynamic.literal(email = email)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_EmailUrl]
  }
}

