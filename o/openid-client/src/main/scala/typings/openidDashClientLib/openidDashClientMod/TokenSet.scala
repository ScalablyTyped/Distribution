package typings
package openidDashClientLib.openidDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openid-client", "TokenSet")
@js.native
class TokenSet () extends js.Object {
  val access_token: js.UndefOr[java.lang.String] = js.native
  val id_token: js.UndefOr[java.lang.String] = js.native
  val refresh_token: js.UndefOr[java.lang.String] = js.native
  val token_type: js.UndefOr[java.lang.String] = js.native
  def claims(): org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Object | scala.Null]] = js.native
  def expired(): scala.Boolean = js.native
}

