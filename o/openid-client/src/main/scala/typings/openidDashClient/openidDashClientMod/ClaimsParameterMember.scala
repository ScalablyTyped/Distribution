package typings.openidDashClient.openidDashClientMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClaimsParameterMember
  extends /* key */ StringDictionary[js.Any] {
  var essential: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  var values: js.UndefOr[js.Array[String]] = js.undefined
}

object ClaimsParameterMember {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    essential: js.UndefOr[Boolean] = js.undefined,
    value: String = null,
    values: js.Array[String] = null
  ): ClaimsParameterMember = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(essential)) __obj.updateDynamic("essential")(essential)
    if (value != null) __obj.updateDynamic("value")(value)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[ClaimsParameterMember]
  }
}

