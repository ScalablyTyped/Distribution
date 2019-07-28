package typings.atOracleOraclejet.ojvalidationgroupMod

import typings.atOracleOraclejet.atOracleOraclejetMod.JetSettableProperties
import typings.atOracleOraclejet.atOracleOraclejetStrings.invalidHidden
import typings.atOracleOraclejet.atOracleOraclejetStrings.invalidShown
import typings.atOracleOraclejet.atOracleOraclejetStrings.pending
import typings.atOracleOraclejet.atOracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojValidationGroupSettableProperties extends JetSettableProperties {
  val valid: typings.atOracleOraclejet.atOracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
}

object ojValidationGroupSettableProperties {
  @scala.inline
  def apply(valid: valid | pending | invalidHidden | invalidShown): ojValidationGroupSettableProperties = {
    val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojValidationGroupSettableProperties]
  }
}

