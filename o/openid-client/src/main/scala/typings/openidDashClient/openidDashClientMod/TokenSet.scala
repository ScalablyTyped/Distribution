package typings.openidDashClient.openidDashClientMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openid-client", "TokenSet")
@js.native
class TokenSet () extends js.Object {
  val access_token: js.UndefOr[String] = js.native
  val id_token: js.UndefOr[String] = js.native
  val refresh_token: js.UndefOr[String] = js.native
  val token_type: js.UndefOr[String] = js.native
  def claims(): StringDictionary[js.UndefOr[js.Object | Null]] = js.native
  def expired(): Boolean = js.native
}

