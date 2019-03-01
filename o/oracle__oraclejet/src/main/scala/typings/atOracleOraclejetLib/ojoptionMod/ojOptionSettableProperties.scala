package typings
package atOracleOraclejetLib.ojoptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojOptionSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.JetSettableProperties {
  var disabled: scala.Boolean
  var value: js.Any
}

object ojOptionSettableProperties {
  @scala.inline
  def apply(disabled: scala.Boolean, value: js.Any): ojOptionSettableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ojOptionSettableProperties]
  }
}

