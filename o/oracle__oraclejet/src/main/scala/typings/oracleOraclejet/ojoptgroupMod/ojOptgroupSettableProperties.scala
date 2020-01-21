package typings.oracleOraclejet.ojoptgroupMod

import typings.oracleOraclejet.mod.JetSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojOptgroupSettableProperties extends JetSettableProperties {
  var disabled: Boolean
  var label: String
}

object ojOptgroupSettableProperties {
  @scala.inline
  def apply(disabled: Boolean, label: String): ojOptgroupSettableProperties = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojOptgroupSettableProperties]
  }
}

