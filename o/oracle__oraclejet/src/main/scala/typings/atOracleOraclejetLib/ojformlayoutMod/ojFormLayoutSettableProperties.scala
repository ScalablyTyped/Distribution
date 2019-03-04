package typings
package atOracleOraclejetLib.ojformlayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojFormLayoutSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.JetSettableProperties {
  var direction: atOracleOraclejetLib.atOracleOraclejetLibStrings.column | atOracleOraclejetLib.atOracleOraclejetLibStrings.row
  var labelEdge: atOracleOraclejetLib.atOracleOraclejetLibStrings.start | atOracleOraclejetLib.atOracleOraclejetLibStrings.top
  var labelWidth: java.lang.String
  var labelWrapping: atOracleOraclejetLib.atOracleOraclejetLibStrings.truncate | atOracleOraclejetLib.atOracleOraclejetLibStrings.wrap
  var maxColumns: scala.Double
}

object ojFormLayoutSettableProperties {
  @scala.inline
  def apply(
    direction: atOracleOraclejetLib.atOracleOraclejetLibStrings.column | atOracleOraclejetLib.atOracleOraclejetLibStrings.row,
    labelEdge: atOracleOraclejetLib.atOracleOraclejetLibStrings.start | atOracleOraclejetLib.atOracleOraclejetLibStrings.top,
    labelWidth: java.lang.String,
    labelWrapping: atOracleOraclejetLib.atOracleOraclejetLibStrings.truncate | atOracleOraclejetLib.atOracleOraclejetLibStrings.wrap,
    maxColumns: scala.Double
  ): ojFormLayoutSettableProperties = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], labelEdge = labelEdge.asInstanceOf[js.Any], labelWidth = labelWidth, labelWrapping = labelWrapping.asInstanceOf[js.Any], maxColumns = maxColumns)
  
    __obj.asInstanceOf[ojFormLayoutSettableProperties]
  }
}

