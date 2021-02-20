package typings.oracleOraclejet.ojthematicmapMod

import typings.oracleOraclejet.anon.Location
import typings.oracleOraclejet.mod.JetSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.off
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojThematicMapLinkSettableProperties extends JetSettableProperties {
  
  var categories: js.Array[String] = js.native
  
  var color: String = js.native
  
  var endLocation: Location = js.native
  
  var selectable: auto | off = js.native
  
  var shortDesc: String = js.native
  
  var startLocation: Location = js.native
  
  var svgClassName: String = js.native
  
  var svgStyle: js.Object = js.native
  
  var width: Double = js.native
}
object ojThematicMapLinkSettableProperties {
  
  @scala.inline
  def apply(
    categories: js.Array[String],
    color: String,
    endLocation: Location,
    selectable: auto | off,
    shortDesc: String,
    startLocation: Location,
    svgClassName: String,
    svgStyle: js.Object,
    width: Double
  ): ojThematicMapLinkSettableProperties = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], endLocation = endLocation.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], shortDesc = shortDesc.asInstanceOf[js.Any], startLocation = startLocation.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojThematicMapLinkSettableProperties]
  }
  
  @scala.inline
  implicit class ojThematicMapLinkSettablePropertiesMutableBuilder[Self <: ojThematicMapLinkSettableProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndLocation(value: Location): Self = StObject.set(x, "endLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectable(value: auto | off): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDesc(value: String): Self = StObject.set(x, "shortDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartLocation(value: Location): Self = StObject.set(x, "startLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
