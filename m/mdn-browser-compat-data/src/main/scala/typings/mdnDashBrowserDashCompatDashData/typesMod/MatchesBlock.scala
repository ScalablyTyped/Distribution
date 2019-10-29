package typings.mdnDashBrowserDashCompatDashData.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchesBlock extends js.Object {
  var keywords: js.UndefOr[js.Array[String]] = js.undefined
  var regex_token: js.UndefOr[String] = js.undefined
  var regex_value: js.UndefOr[String] = js.undefined
}

object MatchesBlock {
  @scala.inline
  def apply(keywords: js.Array[String] = null, regex_token: String = null, regex_value: String = null): MatchesBlock = {
    val __obj = js.Dynamic.literal()
    if (keywords != null) __obj.updateDynamic("keywords")(keywords)
    if (regex_token != null) __obj.updateDynamic("regex_token")(regex_token)
    if (regex_value != null) __obj.updateDynamic("regex_value")(regex_value)
    __obj.asInstanceOf[MatchesBlock]
  }
}

