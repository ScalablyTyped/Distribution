package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificationControl extends js.Object {
  // Certification control name
  var name: js.UndefOr[String] = js.undefined
  // URL for the Microsoft Service Trust Portal
  var url: js.UndefOr[String] = js.undefined
}

object CertificationControl {
  @scala.inline
  def apply(name: String = null, url: String = null): CertificationControl = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificationControl]
  }
}

