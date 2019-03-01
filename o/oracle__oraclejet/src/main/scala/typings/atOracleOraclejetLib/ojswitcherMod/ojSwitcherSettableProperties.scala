package typings
package atOracleOraclejetLib.ojswitcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojSwitcherSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.JetSettableProperties {
  var value: java.lang.String
}

object ojSwitcherSettableProperties {
  @scala.inline
  def apply(value: java.lang.String): ojSwitcherSettableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ojSwitcherSettableProperties]
  }
}

