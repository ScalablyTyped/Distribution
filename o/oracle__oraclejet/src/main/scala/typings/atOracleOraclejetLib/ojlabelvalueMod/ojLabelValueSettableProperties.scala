package typings
package atOracleOraclejetLib.ojlabelvalueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojLabelValueSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.JetSettableProperties {
  var labelEdge: atOracleOraclejetLib.atOracleOraclejetLibStrings.start | atOracleOraclejetLib.atOracleOraclejetLibStrings.top | atOracleOraclejetLib.atOracleOraclejetLibStrings.inherit
  var labelWidth: java.lang.String
}

object ojLabelValueSettableProperties {
  @scala.inline
  def apply(
    labelEdge: atOracleOraclejetLib.atOracleOraclejetLibStrings.start | atOracleOraclejetLib.atOracleOraclejetLibStrings.top | atOracleOraclejetLib.atOracleOraclejetLibStrings.inherit,
    labelWidth: java.lang.String
  ): ojLabelValueSettableProperties = {
    val __obj = js.Dynamic.literal(labelEdge = labelEdge.asInstanceOf[js.Any], labelWidth = labelWidth)
  
    __obj.asInstanceOf[ojLabelValueSettableProperties]
  }
}

