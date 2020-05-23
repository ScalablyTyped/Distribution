package typings.oracleOraclejet.ojlabelMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.DefinitionSource
import typings.oracleOraclejet.anon.TooltipHelp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojlabel.ojLabelSettableProperties> */
trait ojLabelSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var `for`: js.UndefOr[String] = js.undefined
  var help: js.UndefOr[DefinitionSource] = js.undefined
  var labelId: js.UndefOr[String] = js.undefined
  var showRequired: js.UndefOr[Boolean] = js.undefined
  var translations: js.UndefOr[TooltipHelp] = js.undefined
}

object ojLabelSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    `for`: String = null,
    help: DefinitionSource = null,
    labelId: String = null,
    showRequired: js.UndefOr[Boolean] = js.undefined,
    translations: TooltipHelp = null
  ): ojLabelSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`for` != null) __obj.updateDynamic("for")(`for`.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (labelId != null) __obj.updateDynamic("labelId")(labelId.asInstanceOf[js.Any])
    if (!js.isUndefined(showRequired)) __obj.updateDynamic("showRequired")(showRequired.get.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojLabelSettablePropertiesLenient]
  }
}

