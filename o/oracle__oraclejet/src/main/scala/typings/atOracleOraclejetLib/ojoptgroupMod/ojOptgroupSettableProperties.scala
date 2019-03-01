package typings
package atOracleOraclejetLib.ojoptgroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojOptgroupSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.JetSettableProperties {
  var disabled: scala.Boolean
  var label: java.lang.String
}

object ojOptgroupSettableProperties {
  @scala.inline
  def apply(disabled: scala.Boolean, label: java.lang.String): ojOptgroupSettableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[ojOptgroupSettableProperties]
  }
}

