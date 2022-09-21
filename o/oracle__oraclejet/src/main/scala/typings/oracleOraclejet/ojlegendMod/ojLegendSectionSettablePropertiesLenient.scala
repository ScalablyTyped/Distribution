package typings.oracleOraclejet.ojlegendMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojlegend.ojLegendSectionSettableProperties> */
trait ojLegendSectionSettablePropertiesLenient
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var collapsible: js.UndefOr[on | off] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var textHalign: js.UndefOr[center | end | start] = js.undefined
  
  var textStyle: js.UndefOr[js.Object] = js.undefined
}
object ojLegendSectionSettablePropertiesLenient {
  
  inline def apply(): ojLegendSectionSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojLegendSectionSettablePropertiesLenient]
  }
  
  extension [Self <: ojLegendSectionSettablePropertiesLenient](x: Self) {
    
    inline def setCollapsible(value: on | off): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
    
    inline def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextHalign(value: center | end | start): Self = StObject.set(x, "textHalign", value.asInstanceOf[js.Any])
    
    inline def setTextHalignUndefined: Self = StObject.set(x, "textHalign", js.undefined)
    
    inline def setTextStyle(value: js.Object): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
