package typings.oracleOraclejet.ojcollapsibleMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.disclosureIcon
import typings.oracleOraclejet.oracleOraclejetStrings.header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojcollapsible.ojCollapsibleSettableProperties> */
@js.native
trait ojCollapsibleSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var expandArea: js.UndefOr[header | disclosureIcon] = js.native
  
  var expanded: js.UndefOr[Boolean] = js.native
  
  var translations: js.UndefOr[js.Object | Null] = js.native
}
object ojCollapsibleSettablePropertiesLenient {
  
  @scala.inline
  def apply(): ojCollapsibleSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojCollapsibleSettablePropertiesLenient]
  }
  
  @scala.inline
  implicit class ojCollapsibleSettablePropertiesLenientOps[Self <: ojCollapsibleSettablePropertiesLenient] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setExpandArea(value: header | disclosureIcon): Self = this.set("expandArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandArea: Self = this.set("expandArea", js.undefined)
    
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    
    @scala.inline
    def setTranslations(value: js.Object): Self = this.set("translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
    
    @scala.inline
    def setTranslationsNull: Self = this.set("translations", null)
  }
}
