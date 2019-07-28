package typings.pnpapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Extensions extends js.Object {
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_Extensions {
  @scala.inline
  def apply(extensions: js.Array[String] = null): Anon_Extensions = {
    val __obj = js.Dynamic.literal()
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    __obj.asInstanceOf[Anon_Extensions]
  }
}

