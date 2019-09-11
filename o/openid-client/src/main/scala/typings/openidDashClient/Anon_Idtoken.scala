package typings.openidDashClient

import org.scalablytyped.runtime.StringDictionary
import typings.openidDashClient.openidDashClientMod.ClaimsParameterMember
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Idtoken extends js.Object {
  var id_token: js.UndefOr[StringDictionary[Null | ClaimsParameterMember]] = js.undefined
  var userinfo: js.UndefOr[StringDictionary[Null | ClaimsParameterMember]] = js.undefined
}

object Anon_Idtoken {
  @scala.inline
  def apply(
    id_token: StringDictionary[Null | ClaimsParameterMember] = null,
    userinfo: StringDictionary[Null | ClaimsParameterMember] = null
  ): Anon_Idtoken = {
    val __obj = js.Dynamic.literal()
    if (id_token != null) __obj.updateDynamic("id_token")(id_token)
    if (userinfo != null) __obj.updateDynamic("userinfo")(userinfo)
    __obj.asInstanceOf[Anon_Idtoken]
  }
}

