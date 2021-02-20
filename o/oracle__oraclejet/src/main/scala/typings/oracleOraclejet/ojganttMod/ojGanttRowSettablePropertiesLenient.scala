package typings.oracleOraclejet.ojganttMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojgantt.ojGanttRowSettableProperties> */
@js.native
trait ojGanttRowSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  
  var label: js.UndefOr[String] = js.native
  
  var labelStyle: js.UndefOr[js.Object] = js.native
}
object ojGanttRowSettablePropertiesLenient {
  
  @scala.inline
  def apply(): ojGanttRowSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojGanttRowSettablePropertiesLenient]
  }
  
  @scala.inline
  implicit class ojGanttRowSettablePropertiesLenientMutableBuilder[Self <: ojGanttRowSettablePropertiesLenient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
