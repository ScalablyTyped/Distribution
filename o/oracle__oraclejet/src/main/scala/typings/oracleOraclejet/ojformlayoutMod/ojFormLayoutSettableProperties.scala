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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojFormLayoutSettableProperties extends JetSettableProperties {
  
  var direction: column | row = js.native
  
  var labelEdge: start | top = js.native
  
  var labelWidth: String = js.native
  
  var labelWrapping: truncate | wrap = js.native
  
  var maxColumns: Double = js.native
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
  
  @scala.inline
  implicit class ojFormLayoutSettablePropertiesOps[Self <: ojFormLayoutSettableProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDirection(value: column | row): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelEdge(value: start | top): Self = this.set("labelEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelWidth(value: String): Self = this.set("labelWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelWrapping(value: truncate | wrap): Self = this.set("labelWrapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxColumns(value: Double): Self = this.set("maxColumns", value.asInstanceOf[js.Any])
  }
}
