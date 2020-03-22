package typings.oracleOraclejet.ojvalidationgroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typings.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typings.oracleOraclejet.oracleOraclejetStrings.pending
import typings.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojvalidationgroup.ojValidationGroupSettableProperties> */
trait ojValidationGroupSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var valid: js.UndefOr[
    typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
  ] = js.undefined
}

object ojValidationGroupSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    valid: valid | pending | invalidHidden | invalidShown = null
  ): ojValidationGroupSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (valid != null) __obj.updateDynamic("valid")(valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojValidationGroupSettablePropertiesLenient]
  }
}

