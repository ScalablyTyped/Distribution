package typings.openidDashClient

import org.scalablytyped.runtime.StringDictionary
import typings.openidDashClient.openidDashClientStrings.authorization_code
import typings.openidDashClient.openidDashClientStrings.client_credentials
import typings.openidDashClient.openidDashClientStrings.password
import typings.openidDashClient.openidDashClientStrings.refresh_token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Authorizationcode
  extends /* name */ StringDictionary[js.UndefOr[String]] {
  val grant_type: authorization_code | client_credentials | password | refresh_token | String
}

object Anon_Authorizationcode {
  @scala.inline
  def apply(
    grant_type: authorization_code | client_credentials | password | refresh_token | String,
    StringDictionary: /* name */ StringDictionary[js.UndefOr[String]] = null
  ): Anon_Authorizationcode = {
    val __obj = js.Dynamic.literal(grant_type = grant_type.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Authorizationcode]
  }
}

