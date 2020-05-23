package typings.openidClient.anon

import org.scalablytyped.runtime.StringDictionary
import typings.openidClient.mod.ClaimsParameterMember
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Idtoken extends js.Object {
  var id_token: js.UndefOr[StringDictionary[Null | ClaimsParameterMember]] = js.undefined
  var userinfo: js.UndefOr[StringDictionary[Null | ClaimsParameterMember]] = js.undefined
}

object Idtoken {
  @scala.inline
  def apply(
    id_token: StringDictionary[Null | ClaimsParameterMember] = null,
    userinfo: StringDictionary[Null | ClaimsParameterMember] = null
  ): Idtoken = {
    val __obj = js.Dynamic.literal()
    if (id_token != null) __obj.updateDynamic("id_token")(id_token.asInstanceOf[js.Any])
    if (userinfo != null) __obj.updateDynamic("userinfo")(userinfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Idtoken]
  }
}

