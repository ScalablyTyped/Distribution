package typings.oracleOraclejet.ojvalidationgroupMod

import typings.oracleOraclejet.mod.JetSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typings.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typings.oracleOraclejet.oracleOraclejetStrings.pending
import typings.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojValidationGroupSettableProperties extends JetSettableProperties {
  val valid: typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
}

object ojValidationGroupSettableProperties {
  @scala.inline
  def apply(valid: valid | pending | invalidHidden | invalidShown): ojValidationGroupSettableProperties = {
    val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojValidationGroupSettableProperties]
  }
}

