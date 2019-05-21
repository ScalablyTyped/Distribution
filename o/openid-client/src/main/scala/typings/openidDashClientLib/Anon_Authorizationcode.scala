package typings
package openidDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Authorizationcode
  extends /* name */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] {
  val grant_type: openidDashClientLib.openidDashClientLibStrings.authorization_code | openidDashClientLib.openidDashClientLibStrings.client_credentials | openidDashClientLib.openidDashClientLibStrings.password | openidDashClientLib.openidDashClientLibStrings.refresh_token | java.lang.String
}

object Anon_Authorizationcode {
  @scala.inline
  def apply(
    grant_type: openidDashClientLib.openidDashClientLibStrings.authorization_code | openidDashClientLib.openidDashClientLibStrings.client_credentials | openidDashClientLib.openidDashClientLibStrings.password | openidDashClientLib.openidDashClientLibStrings.refresh_token | java.lang.String,
    StringDictionary: /* name */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] = null
  ): Anon_Authorizationcode = {
    val __obj = js.Dynamic.literal(grant_type = grant_type.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Authorizationcode]
  }
}

