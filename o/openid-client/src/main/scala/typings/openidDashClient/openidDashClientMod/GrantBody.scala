package typings.openidDashClient.openidDashClientMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrantBody
  extends /* key */ StringDictionary[js.Any] {
  var grant_type: String
}

object GrantBody {
  @scala.inline
  def apply(grant_type: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): GrantBody = {
    val __obj = js.Dynamic.literal(grant_type = grant_type)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[GrantBody]
  }
}

