package typings.atOracleOraclejet.ojoptionMod

import typings.atOracleOraclejet.atOracleOraclejetMod.JetSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojOptionSettableProperties extends JetSettableProperties {
  var disabled: Boolean
  var value: js.Any
}

object ojOptionSettableProperties {
  @scala.inline
  def apply(disabled: Boolean, value: js.Any): ojOptionSettableProperties = {
    val __obj = js.Dynamic.literal(disabled = disabled, value = value)
  
    __obj.asInstanceOf[ojOptionSettableProperties]
  }
}

