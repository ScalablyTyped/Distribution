package typings.openfin.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LEI extends /* key */ StringDictionary[String] {
  var LEI: js.UndefOr[String] = js.undefined
  var PERMID: js.UndefOr[String] = js.undefined
}

object LEI {
  @scala.inline
  def apply(
    LEI: String = null,
    PERMID: String = null,
    StringDictionary: /* name */ StringDictionary[String] = null
  ): LEI = {
    val __obj = js.Dynamic.literal()
    if (LEI != null) __obj.updateDynamic("LEI")(LEI.asInstanceOf[js.Any])
    if (PERMID != null) __obj.updateDynamic("PERMID")(PERMID.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[LEI]
  }
}

