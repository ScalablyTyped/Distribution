package typings.oracleOraclejet.ojthematicmapMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.Location
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.off
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojthematicmap.ojThematicMapLinkSettableProperties> */
trait ojThematicMapLinkSettablePropertiesLenient
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var endLocation: js.UndefOr[Location] = js.undefined
  
  var selectable: js.UndefOr[auto | off] = js.undefined
  
  var shortDesc: js.UndefOr[String] = js.undefined
  
  var startLocation: js.UndefOr[Location] = js.undefined
  
  var svgClassName: js.UndefOr[String] = js.undefined
  
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object ojThematicMapLinkSettablePropertiesLenient {
  
  inline def apply(): ojThematicMapLinkSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojThematicMapLinkSettablePropertiesLenient]
  }
  
  extension [Self <: ojThematicMapLinkSettablePropertiesLenient](x: Self) {
    
    inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setEndLocation(value: Location): Self = StObject.set(x, "endLocation", value.asInstanceOf[js.Any])
    
    inline def setEndLocationUndefined: Self = StObject.set(x, "endLocation", js.undefined)
    
    inline def setSelectable(value: auto | off): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setShortDesc(value: String): Self = StObject.set(x, "shortDesc", value.asInstanceOf[js.Any])
    
    inline def setShortDescUndefined: Self = StObject.set(x, "shortDesc", js.undefined)
    
    inline def setStartLocation(value: Location): Self = StObject.set(x, "startLocation", value.asInstanceOf[js.Any])
    
    inline def setStartLocationUndefined: Self = StObject.set(x, "startLocation", js.undefined)
    
    inline def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
    
    inline def setSvgClassNameUndefined: Self = StObject.set(x, "svgClassName", js.undefined)
    
    inline def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
    
    inline def setSvgStyleUndefined: Self = StObject.set(x, "svgStyle", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
