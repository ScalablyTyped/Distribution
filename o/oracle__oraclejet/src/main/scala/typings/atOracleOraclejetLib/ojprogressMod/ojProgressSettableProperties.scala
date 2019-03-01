package typings
package atOracleOraclejetLib.ojprogressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojProgressSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentSettableProperties {
  var max: scala.Double
  @JSName("translations")
  var translations_ojProgressSettableProperties: atOracleOraclejetLib.Anon_AriaIndeterminateProgressText
  var `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.bar | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle
  var value: scala.Double
}

object ojProgressSettableProperties {
  @scala.inline
  def apply(
    max: scala.Double,
    translations: atOracleOraclejetLib.Anon_AriaIndeterminateProgressText,
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.bar | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle,
    value: scala.Double
  ): ojProgressSettableProperties = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("translations")(translations)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ojProgressSettableProperties]
  }
}

