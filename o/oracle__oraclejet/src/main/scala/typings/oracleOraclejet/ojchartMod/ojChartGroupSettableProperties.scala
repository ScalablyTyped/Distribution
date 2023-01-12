package typings.oracleOraclejet.ojchartMod

import typings.oracleOraclejet.mod.JetSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.inherit
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ojChartGroupSettableProperties
  extends StObject
     with JetSettableProperties {
  
  var drilling: js.UndefOr[on | off | inherit] = js.undefined
  
  var labelStyle: js.UndefOr[js.Object] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var shortDesc: js.UndefOr[String] = js.undefined
}
object ojChartGroupSettableProperties {
  
  inline def apply(): ojChartGroupSettableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojChartGroupSettableProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ojChartGroupSettableProperties] (val x: Self) extends AnyVal {
    
    inline def setDrilling(value: on | off | inherit): Self = StObject.set(x, "drilling", value.asInstanceOf[js.Any])
    
    inline def setDrillingUndefined: Self = StObject.set(x, "drilling", js.undefined)
    
    inline def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setShortDesc(value: String): Self = StObject.set(x, "shortDesc", value.asInstanceOf[js.Any])
    
    inline def setShortDescUndefined: Self = StObject.set(x, "shortDesc", js.undefined)
  }
}
