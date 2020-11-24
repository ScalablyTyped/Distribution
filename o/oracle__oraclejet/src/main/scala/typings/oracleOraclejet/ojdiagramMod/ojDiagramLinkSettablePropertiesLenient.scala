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
  implicit class ojDiagramLinkSettablePropertiesLenientOps[Self <: ojDiagramLinkSettablePropertiesLenient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setEndConnectorType(value: arrow | arrowConcave | arrowOpen | circle | none | rectangle | rectangleRounded): Self = this.set("endConnectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndConnectorType: Self = this.set("endConnectorType", js.undefined)
    
    @scala.inline
    def setEndNode(value: js.Any): Self = this.set("endNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndNode: Self = this.set("endNode", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelStyle(value: js.Object): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    
    @scala.inline
    def setLabelStyleNull: Self = this.set("labelStyle", null)
    
    @scala.inline
    def setSelectable(value: auto | off): Self = this.set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    
    @scala.inline
    def setShortDesc(value: String): Self = this.set("shortDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortDesc: Self = this.set("shortDesc", js.undefined)
    
    @scala.inline
    def setStartConnectorType(value: arrow | arrowConcave | arrowOpen | circle | none | rectangle | rectangleRounded): Self = this.set("startConnectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartConnectorType: Self = this.set("startConnectorType", js.undefined)
    
    @scala.inline
    def setStartNode(value: js.Any): Self = this.set("startNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartNode: Self = this.set("startNode", js.undefined)
    
    @scala.inline
    def setSvgClassName(value: String): Self = this.set("svgClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSvgClassName: Self = this.set("svgClassName", js.undefined)
    
    @scala.inline
    def setSvgStyle(value: js.Object): Self = this.set("svgStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSvgStyle: Self = this.set("svgStyle", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
