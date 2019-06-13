package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificationControl extends js.Object {
  /** Certification control name */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** URL for the Microsoft Service Trust Portal */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object CertificationControl {
  @scala.inline
  def apply(name: java.lang.String = null, url: java.lang.String = null): CertificationControl = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[CertificationControl]
  }
}

