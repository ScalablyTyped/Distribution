package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentElement[K2] extends StObject {
  
  var componentElement: typings.std.Element = js.native
  
  var rowData: typings.oracleOraclejet.ojganttMod.ojGantt.Row[K2] = js.native
}
object ComponentElement {
  
  @scala.inline
  def apply[K2](componentElement: typings.std.Element, rowData: typings.oracleOraclejet.ojganttMod.ojGantt.Row[K2]): ComponentElement[K2] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentElement[K2]]
  }
  
  @scala.inline
  implicit class ComponentElementMutableBuilder[Self <: ComponentElement[_], K2] (val x: Self with ComponentElement[K2]) extends AnyVal {
    
    @scala.inline
    def setComponentElement(value: typings.std.Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowData(value: typings.oracleOraclejet.ojganttMod.ojGantt.Row[K2]): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
  }
}
