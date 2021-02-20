package typings.oracleOraclejet.ojdiagramMod

import typings.oracleOraclejet.anon.Opacity
import typings.oracleOraclejet.anon.`6`
import typings.oracleOraclejet.mod.JetSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.connected
import typings.oracleOraclejet.oracleOraclejetStrings.disjoint
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojDiagramNodeSettableProperties extends JetSettableProperties {
  
  var categories: js.UndefOr[js.Array[String]] = js.native
  
  var descendantsConnectivity: js.UndefOr[connected | disjoint | unknown] = js.native
  
  var icon: js.UndefOr[Opacity] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var labelStyle: js.UndefOr[js.Object | Null] = js.native
  
  var overview: js.UndefOr[`6`] = js.native
  
  var selectable: js.UndefOr[auto | off] = js.native
  
  var shortDesc: js.UndefOr[String] = js.native
  
  var showDisclosure: js.UndefOr[on | off] = js.native
}
object ojDiagramNodeSettableProperties {
  
  @scala.inline
  def apply(): ojDiagramNodeSettableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojDiagramNodeSettableProperties]
  }
  
  @scala.inline
  implicit class ojDiagramNodeSettablePropertiesMutableBuilder[Self <: ojDiagramNodeSettableProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setDescendantsConnectivity(value: connected | disjoint | unknown): Self = StObject.set(x, "descendantsConnectivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescendantsConnectivityUndefined: Self = StObject.set(x, "descendantsConnectivity", js.undefined)
    
    @scala.inline
    def setIcon(value: Opacity): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
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
    def setOverview(value: `6`): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
    
    @scala.inline
    def setSelectable(value: auto | off): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    @scala.inline
    def setShortDesc(value: String): Self = StObject.set(x, "shortDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDescUndefined: Self = StObject.set(x, "shortDesc", js.undefined)
    
    @scala.inline
    def setShowDisclosure(value: on | off): Self = StObject.set(x, "showDisclosure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDisclosureUndefined: Self = StObject.set(x, "showDisclosure", js.undefined)
  }
}
