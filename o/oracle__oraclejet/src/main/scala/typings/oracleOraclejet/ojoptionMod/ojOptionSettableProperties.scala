package typings.oracleOraclejet.ojoptionMod

import typings.oracleOraclejet.mod.JetSettableProperties
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
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojOptionSettableProperties]
  }
}

