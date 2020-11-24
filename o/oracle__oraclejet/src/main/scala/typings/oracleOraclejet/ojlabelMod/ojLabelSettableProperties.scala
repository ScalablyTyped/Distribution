package typings.oracleOraclejet.ojlabelMod

import typings.oracleOraclejet.anon.DefinitionSource
import typings.oracleOraclejet.anon.TooltipHelp
import typings.oracleOraclejet.mod.baseComponentSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojLabelSettableProperties extends baseComponentSettableProperties {
  
  var `for`: String | Null = js.native
  
  var help: DefinitionSource = js.native
  
  var labelId: String | Null = js.native
  
  var showRequired: Boolean | Null = js.native
  
  @JSName("translations")
  var translations_ojLabelSettableProperties: TooltipHelp = js.native
}
object ojLabelSettableProperties {
  
  @scala.inline
  def apply(help: DefinitionSource, translations: TooltipHelp): ojLabelSettableProperties = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojLabelSettableProperties]
  }
  
  @scala.inline
  implicit class ojLabelSettablePropertiesOps[Self <: ojLabelSettableProperties] (val x: Self) extends AnyVal {
    
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
    def setHelp(value: DefinitionSource): Self = this.set("help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslations(value: TooltipHelp): Self = this.set("translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFor(value: String): Self = this.set("for", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForNull: Self = this.set("for", null)
    
    @scala.inline
    def setLabelId(value: String): Self = this.set("labelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelIdNull: Self = this.set("labelId", null)
    
    @scala.inline
    def setShowRequired(value: Boolean): Self = this.set("showRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowRequiredNull: Self = this.set("showRequired", null)
  }
}
