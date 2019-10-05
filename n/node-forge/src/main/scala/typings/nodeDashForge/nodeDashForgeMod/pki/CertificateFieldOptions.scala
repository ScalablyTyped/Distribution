package typings.nodeDashForge.nodeDashForgeMod.pki

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateFieldOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var shortName: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object CertificateFieldOptions {
  @scala.inline
  def apply(name: String = null, shortName: String = null, `type`: String = null): CertificateFieldOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (shortName != null) __obj.updateDynamic("shortName")(shortName)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CertificateFieldOptions]
  }
}

