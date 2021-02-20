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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojdiagram.ojDiagramLinkSettableProperties> */
@js.native
trait ojDiagramLinkSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  
  var categories: js.UndefOr[js.Array[String]] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var endConnectorType: js.UndefOr[arrow | arrowConcave | arrowOpen | circle | none | rectangle | rectangleRounded] = js.native
  
  var endNode: js.UndefOr[js.Any] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var labelStyle: js.UndefOr[js.Object | Null] = js.native
  
  var selectable: js.UndefOr[auto | off] = js.native
  
  var shortDesc: js.UndefOr[String] = js.native
  
  var startConnectorType: js.UndefOr[arrow | arrowConcave | arrowOpen | circle | none | rectangle | rectangleRounded] = js.native
  
  var startNode: js.UndefOr[js.Any] = js.native
  
  var svgClassName: js.UndefOr[String] = js.native
  
  var svgStyle: js.UndefOr[js.Object] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object ojDiagramLinkSettablePropertiesLenient {
  
  @scala.inline
  def apply(): ojDiagramLinkSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojDiagramLinkSettablePropertiesLenient]
  }
  
  @scala.inline
  implicit class ojDiagramLinkSettablePropertiesLenientMutableBuilder[Self <: ojDiagramLinkSettablePropertiesLenient] (val x: Self) extends AnyVal {
    
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
    def setEndConnectorType(value: arrow | arrowConcave | arrowOpen | circle | none | rectangle | rectangleRounded): Self = StObject.set(x, "endConnectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndConnectorTypeUndefined: Self = StObject.set(x, "endConnectorType", js.undefined)
    
    @scala.inline
    def setEndNode(value: js.Any): Self = StObject.set(x, "endNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndNodeUndefined: Self = StObject.set(x, "endNode", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyleNull: Self = StObject.set(x, "labelStyle", null)
    
    @scala.inline
    def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setSelectable(value: auto | off): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    @scala.inline
    def setShortDesc(value: String): Self = StObject.set(x, "shortDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDescUndefined: Self = StObject.set(x, "shortDesc", js.undefined)
    
    @scala.inline
    def setStartConnectorType(value: arrow | arrowConcave | arrowOpen | circle | none | rectangle | rectangleRounded): Self = StObject.set(x, "startConnectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartConnectorTypeUndefined: Self = StObject.set(x, "startConnectorType", js.undefined)
    
    @scala.inline
    def setStartNode(value: js.Any): Self = StObject.set(x, "startNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartNodeUndefined: Self = StObject.set(x, "startNode", js.undefined)
    
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
