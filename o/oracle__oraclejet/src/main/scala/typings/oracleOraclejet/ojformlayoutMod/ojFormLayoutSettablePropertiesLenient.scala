package typings.oracleOraclejet.ojformlayoutMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.column
import typings.oracleOraclejet.oracleOraclejetStrings.row
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.top
import typings.oracleOraclejet.oracleOraclejetStrings.truncate
import typings.oracleOraclejet.oracleOraclejetStrings.wrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojformlayout.ojFormLayoutSettableProperties> */
@js.native
trait ojFormLayoutSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  
  var direction: js.UndefOr[column | row] = js.native
  
  var labelEdge: js.UndefOr[start | top] = js.native
  
  var labelWidth: js.UndefOr[String] = js.native
  
  var labelWrapping: js.UndefOr[truncate | wrap] = js.native
  
  var maxColumns: js.UndefOr[Double] = js.native
}
object ojFormLayoutSettablePropertiesLenient {
  
  @scala.inline
  def apply(): ojFormLayoutSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojFormLayoutSettablePropertiesLenient]
  }
  
  @scala.inline
  implicit class ojFormLayoutSettablePropertiesLenientOps[Self <: ojFormLayoutSettablePropertiesLenient] (val x: Self) extends AnyVal {
    
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
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setLabelEdge(value: start | top): Self = this.set("labelEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelEdge: Self = this.set("labelEdge", js.undefined)
    
    @scala.inline
    def setLabelWidth(value: String): Self = this.set("labelWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelWidth: Self = this.set("labelWidth", js.undefined)
    
    @scala.inline
    def setLabelWrapping(value: truncate | wrap): Self = this.set("labelWrapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelWrapping: Self = this.set("labelWrapping", js.undefined)
    
    @scala.inline
    def setMaxColumns(value: Double): Self = this.set("maxColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxColumns: Self = this.set("maxColumns", js.undefined)
  }
}
