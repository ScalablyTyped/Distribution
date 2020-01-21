package typings.oracleOraclejet.ojformlayoutMod

import typings.oracleOraclejet.mod.JetSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.column
import typings.oracleOraclejet.oracleOraclejetStrings.row
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.top
import typings.oracleOraclejet.oracleOraclejetStrings.truncate
import typings.oracleOraclejet.oracleOraclejetStrings.wrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojFormLayoutSettableProperties extends JetSettableProperties {
  var direction: column | row
  var labelEdge: start | top
  var labelWidth: String
  var labelWrapping: truncate | wrap
  var maxColumns: Double
}

object ojFormLayoutSettableProperties {
  @scala.inline
  def apply(
    direction: column | row,
    labelEdge: start | top,
    labelWidth: String,
    labelWrapping: truncate | wrap,
    maxColumns: Double
  ): ojFormLayoutSettableProperties = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], labelEdge = labelEdge.asInstanceOf[js.Any], labelWidth = labelWidth.asInstanceOf[js.Any], labelWrapping = labelWrapping.asInstanceOf[js.Any], maxColumns = maxColumns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojFormLayoutSettableProperties]
  }
}

