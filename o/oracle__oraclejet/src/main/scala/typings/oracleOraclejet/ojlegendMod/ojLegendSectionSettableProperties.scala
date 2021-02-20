package typings.oracleOraclejet.ojlegendMod

import typings.oracleOraclejet.mod.JetSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojLegendSectionSettableProperties extends JetSettableProperties {
  
  var collapsible: js.UndefOr[on | off] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var textHalign: js.UndefOr[center | end | start] = js.native
  
  var textStyle: js.UndefOr[js.Object] = js.native
}
object ojLegendSectionSettableProperties {
  
  @scala.inline
  def apply(): ojLegendSectionSettableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojLegendSectionSettableProperties]
  }
  
  @scala.inline
  implicit class ojLegendSectionSettablePropertiesMutableBuilder[Self <: ojLegendSectionSettableProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapsible(value: on | off): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextHalign(value: center | end | start): Self = StObject.set(x, "textHalign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextHalignUndefined: Self = StObject.set(x, "textHalign", js.undefined)
    
    @scala.inline
    def setTextStyle(value: js.Object): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
