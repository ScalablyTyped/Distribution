package typings.oracleOraclejet.ojlegendMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojlegend.ojLegendSectionSettableProperties> */
@js.native
trait ojLegendSectionSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  
  var collapsible: js.UndefOr[on | off] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var textHalign: js.UndefOr[center | end | start] = js.native
  
  var textStyle: js.UndefOr[js.Object] = js.native
}
object ojLegendSectionSettablePropertiesLenient {
  
  @scala.inline
  def apply(): ojLegendSectionSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojLegendSectionSettablePropertiesLenient]
  }
  
  @scala.inline
  implicit class ojLegendSectionSettablePropertiesLenientOps[Self <: ojLegendSectionSettablePropertiesLenient] (val x: Self) extends AnyVal {
    
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
    def setCollapsible(value: on | off): Self = this.set("collapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsible: Self = this.set("collapsible", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextHalign(value: center | end | start): Self = this.set("textHalign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextHalign: Self = this.set("textHalign", js.undefined)
    
    @scala.inline
    def setTextStyle(value: js.Object): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
  }
}
