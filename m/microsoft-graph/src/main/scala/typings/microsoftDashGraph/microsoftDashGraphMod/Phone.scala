package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Phone extends js.Object {
  var language: js.UndefOr[String] = js.undefined
  // The phone number.
  var number: js.UndefOr[String] = js.undefined
  var region: js.UndefOr[String] = js.undefined
  /**
    * The type of phone number. The possible values are: home, business, mobile, other, assistant, homeFax, businessFax,
    * otherFax, pager, radio.
    */
  var `type`: js.UndefOr[PhoneType] = js.undefined
}

object Phone {
  @scala.inline
  def apply(language: String = null, number: String = null, region: String = null, `type`: PhoneType = null): Phone = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language)
    if (number != null) __obj.updateDynamic("number")(number)
    if (region != null) __obj.updateDynamic("region")(region)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Phone]
  }
}

