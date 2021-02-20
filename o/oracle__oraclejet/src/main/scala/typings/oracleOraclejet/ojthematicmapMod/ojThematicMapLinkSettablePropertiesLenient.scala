package typings.oracleOraclejet.ojthematicmapMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.Location
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.off
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojthematicmap.ojThematicMapLinkSettableProperties> */
@js.native
trait ojThematicMapLinkSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  
  var categories: js.UndefOr[js.Array[String]] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var endLocation: js.UndefOr[Location] = js.native
  
  var selectable: js.UndefOr[auto | off] = js.native
  
  var shortDesc: js.UndefOr[String] = js.native
  
  var startLocation: js.UndefOr[Location] = js.native
  
  var svgClassName: js.UndefOr[String] = js.native
  
  var svgStyle: js.UndefOr[js.Object] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object ojThematicMapLinkSettablePropertiesLenient {
  
  @scala.inline
  def apply(): ojThematicMapLinkSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojThematicMapLinkSettablePropertiesLenient]
  }
  
  @scala.inline
  implicit class ojThematicMapLinkSettablePropertiesLenientMutableBuilder[Self <: ojThematicMapLinkSettablePropertiesLenient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setEndLocation(value: Location): Self = StObject.set(x, "endLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndLocationUndefined: Self = StObject.set(x, "endLocation", js.undefined)
    
    @scala.inline
    def setSelectable(value: auto | off): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    @scala.inline
    def setShortDesc(value: String): Self = StObject.set(x, "shortDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDescUndefined: Self = StObject.set(x, "shortDesc", js.undefined)
    
    @scala.inline
    def setStartLocation(value: Location): Self = StObject.set(x, "startLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartLocationUndefined: Self = StObject.set(x, "startLocation", js.undefined)
    
    @scala.inline
    def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgClassNameUndefined: Self = StObject.set(x, "svgClassName", js.undefined)
    
    @scala.inline
    def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgStyleUndefined: Self = StObject.set(x, "svgStyle", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
