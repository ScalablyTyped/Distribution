package typings.oracleOraclejet.ojganttMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojgantt.ojGanttRowSettableProperties> */
trait ojGanttRowSettablePropertiesLenient
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var label: js.UndefOr[String] = js.undefined
  
  var labelStyle: js.UndefOr[js.Object] = js.undefined
}
object ojGanttRowSettablePropertiesLenient {
  
  inline def apply(): ojGanttRowSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojGanttRowSettablePropertiesLenient]
  }
  
  extension [Self <: ojGanttRowSettablePropertiesLenient](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
