package typings.oracleOraclejet.ojlabelvalueMod

import typings.oracleOraclejet.mod.JetSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.inherit
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojLabelValueSettableProperties extends JetSettableProperties {
  
  var labelEdge: start | top | inherit = js.native
  
  var labelWidth: String = js.native
}
object ojLabelValueSettableProperties {
  
  @scala.inline
  def apply(labelEdge: start | top | inherit, labelWidth: String): ojLabelValueSettableProperties = {
    val __obj = js.Dynamic.literal(labelEdge = labelEdge.asInstanceOf[js.Any], labelWidth = labelWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojLabelValueSettableProperties]
  }
  
  @scala.inline
  implicit class ojLabelValueSettablePropertiesOps[Self <: ojLabelValueSettableProperties] (val x: Self) extends AnyVal {
    
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
    def setLabelEdge(value: start | top | inherit): Self = this.set("labelEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelWidth(value: String): Self = this.set("labelWidth", value.asInstanceOf[js.Any])
  }
}
