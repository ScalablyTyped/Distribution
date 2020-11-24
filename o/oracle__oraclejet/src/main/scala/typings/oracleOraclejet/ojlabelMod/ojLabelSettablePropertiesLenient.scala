package typings.oracleOraclejet.ojlabelMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.DefinitionSource
import typings.oracleOraclejet.anon.TooltipHelp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojlabel.ojLabelSettableProperties> */
@js.native
trait ojLabelSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  
  var `for`: js.UndefOr[String | Null] = js.native
  
  var help: js.UndefOr[DefinitionSource] = js.native
  
  var labelId: js.UndefOr[String | Null] = js.native
  
  var showRequired: js.UndefOr[Boolean | Null] = js.native
  
  var translations: js.UndefOr[TooltipHelp] = js.native
}
object ojLabelSettablePropertiesLenient {
  
  @scala.inline
  def apply(): ojLabelSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojLabelSettablePropertiesLenient]
  }
  
  @scala.inline
  implicit class ojLabelSettablePropertiesLenientOps[Self <: ojLabelSettablePropertiesLenient] (val x: Self) extends AnyVal {
    
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
    def setFor(value: String): Self = this.set("for", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFor: Self = this.set("for", js.undefined)
    
    @scala.inline
    def setForNull: Self = this.set("for", null)
    
    @scala.inline
    def setHelp(value: DefinitionSource): Self = this.set("help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelp: Self = this.set("help", js.undefined)
    
    @scala.inline
    def setLabelId(value: String): Self = this.set("labelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelId: Self = this.set("labelId", js.undefined)
    
    @scala.inline
    def setLabelIdNull: Self = this.set("labelId", null)
    
    @scala.inline
    def setShowRequired(value: Boolean): Self = this.set("showRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRequired: Self = this.set("showRequired", js.undefined)
    
    @scala.inline
    def setShowRequiredNull: Self = this.set("showRequired", null)
    
    @scala.inline
    def setTranslations(value: TooltipHelp): Self = this.set("translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
  }
}
