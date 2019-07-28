package typings.atOracleOraclejet.ojformlayoutMod

import typings.atOracleOraclejet.atOracleOraclejetMod.JetSettableProperties
import typings.atOracleOraclejet.atOracleOraclejetStrings.column
import typings.atOracleOraclejet.atOracleOraclejetStrings.row
import typings.atOracleOraclejet.atOracleOraclejetStrings.start
import typings.atOracleOraclejet.atOracleOraclejetStrings.top
import typings.atOracleOraclejet.atOracleOraclejetStrings.truncate
import typings.atOracleOraclejet.atOracleOraclejetStrings.wrap
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
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], labelEdge = labelEdge.asInstanceOf[js.Any], labelWidth = labelWidth, labelWrapping = labelWrapping.asInstanceOf[js.Any], maxColumns = maxColumns)
  
    __obj.asInstanceOf[ojFormLayoutSettableProperties]
  }
}

