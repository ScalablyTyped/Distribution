package typings.nodeDashForge.nodeDashForgeMod.pki

import typings.nodeDashForge.nodeDashForgeMod.asn1.Class
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateField extends CertificateFieldOptions {
  var extensions: js.UndefOr[js.Array[_]] = js.undefined
  var value: js.UndefOr[js.Array[_] | String] = js.undefined
  var valueConstructed: js.UndefOr[Boolean] = js.undefined
  var valueTagClass: js.UndefOr[Class] = js.undefined
}

object CertificateField {
  @scala.inline
  def apply(
    extensions: js.Array[_] = null,
    name: String = null,
    shortName: String = null,
    `type`: String = null,
    value: js.Array[_] | String = null,
    valueConstructed: js.UndefOr[Boolean] = js.undefined,
    valueTagClass: Class = null
  ): CertificateField = {
    val __obj = js.Dynamic.literal()
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (shortName != null) __obj.updateDynamic("shortName")(shortName.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(valueConstructed)) __obj.updateDynamic("valueConstructed")(valueConstructed.asInstanceOf[js.Any])
    if (valueTagClass != null) __obj.updateDynamic("valueTagClass")(valueTagClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateField]
  }
}

