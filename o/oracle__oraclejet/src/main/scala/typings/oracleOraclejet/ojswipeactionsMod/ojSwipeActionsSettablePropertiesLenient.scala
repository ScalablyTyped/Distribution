package typings.oracleOraclejet.ojswipeactionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.AriaHideActionsDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojswipeactions.ojSwipeActionsSettableProperties> */
trait ojSwipeActionsSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var translations: js.UndefOr[AriaHideActionsDescription] = js.undefined
}

object ojSwipeActionsSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    translations: AriaHideActionsDescription = null
  ): ojSwipeActionsSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojSwipeActionsSettablePropertiesLenient]
  }
}

