package typings.oracleOraclejet.ojganttMod

import typings.oracleOraclejet.mod.JetSettableProperties
import org.scalablytyped.runtime.StObject
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
  implicit class ojGanttRowSettablePropertiesMutableBuilder[Self <: ojGanttRowSettableProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
  }
}
