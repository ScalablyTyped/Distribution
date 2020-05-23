package typings.pnpapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extensions extends js.Object {
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
}

object Extensions {
  @scala.inline
  def apply(extensions: js.Array[String] = null): Extensions = {
    val __obj = js.Dynamic.literal()
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extensions]
  }
}

