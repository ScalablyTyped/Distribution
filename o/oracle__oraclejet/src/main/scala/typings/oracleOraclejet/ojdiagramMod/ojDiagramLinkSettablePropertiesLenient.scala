package typings.oracleOraclejet.ojdiagramMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.arrow
import typings.oracleOraclejet.oracleOraclejetStrings.arrowConcave
import typings.oracleOraclejet.oracleOraclejetStrings.arrowOpen
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.circle
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.rectangle
import typings.oracleOraclejet.oracleOraclejetStrings.rectangleRounded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojdiagram.ojDiagramLinkSettableProperties> */
trait ojDiagramLinkSettablePropertiesLenient
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var endConnectorType: js.UndefOr[arrow | arrowConcave | arrowOpen | circle | none | rectangle | rectangleRounded] = js.undefined
  
  var endNode: js.UndefOr[Any] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var labelStyle: js.UndefOr[js.Object | Null] = js.undefined
  
  var selectable: js.UndefOr[auto | off] = js.undefined
  
  var shortDesc: js.UndefOr[String] = js.undefined
  
  var startConnectorType: js.UndefOr[arrow | arrowConcave | arrowOpen | circle | none | rectangle | rectangleRounded] = js.undefined
  
  var startNode: js.UndefOr[Any] = js.undefined
  
  var svgClassName: js.UndefOr[String] = js.undefined
  
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object ojDiagramLinkSettablePropertiesLenient {
  
  inline def apply(): ojDiagramLinkSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojDiagramLinkSettablePropertiesLenient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ojDiagramLinkSettablePropertiesLenient] (val x: Self) extends AnyVal {
    
    inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setEndConnectorType(value: arrow | arrowConcave | arrowOpen | circle | none | rectangle | rectangleRounded): Self = StObject.set(x, "endConnectorType", value.asInstanceOf[js.Any])
    
    inline def setEndConnectorTypeUndefined: Self = StObject.set(x, "endConnectorType", js.undefined)
    
    inline def setEndNode(value: Any): Self = StObject.set(x, "endNode", value.asInstanceOf[js.Any])
    
    inline def setEndNodeUndefined: Self = StObject.set(x, "endNode", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    inline def setLabelStyleNull: Self = StObject.set(x, "labelStyle", null)
    
    inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSelectable(value: auto | off): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setShortDesc(value: String): Self = StObject.set(x, "shortDesc", value.asInstanceOf[js.Any])
    
    inline def setShortDescUndefined: Self = StObject.set(x, "shortDesc", js.undefined)
    
    inline def setStartConnectorType(value: arrow | arrowConcave | arrowOpen | circle | none | rectangle | rectangleRounded): Self = StObject.set(x, "startConnectorType", value.asInstanceOf[js.Any])
    
    inline def setStartConnectorTypeUndefined: Self = StObject.set(x, "startConnectorType", js.undefined)
    
    inline def setStartNode(value: Any): Self = StObject.set(x, "startNode", value.asInstanceOf[js.Any])
    
    inline def setStartNodeUndefined: Self = StObject.set(x, "startNode", js.undefined)
    
    inline def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
    
    inline def setSvgClassNameUndefined: Self = StObject.set(x, "svgClassName", js.undefined)
    
    inline def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
    
    inline def setSvgStyleUndefined: Self = StObject.set(x, "svgStyle", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
