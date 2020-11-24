package typings.oracleOraclejet.ojganttMod

import typings.oracleOraclejet.mod.JetSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojGanttRowSettableProperties extends JetSettableProperties {
  
  var label: String = js.native
  
  var labelStyle: js.Object = js.native
}
object ojGanttRowSettableProperties {
  
  @scala.inline
  def apply(label: String, labelStyle: js.Object): ojGanttRowSettableProperties = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojGanttRowSettableProperties]
  }
  
  @scala.inline
  implicit class ojGanttRowSettablePropertiesOps[Self <: ojGanttRowSettableProperties] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyle(value: js.Object): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
  }
}
