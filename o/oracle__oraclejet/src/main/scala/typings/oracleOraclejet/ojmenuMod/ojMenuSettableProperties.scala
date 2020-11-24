package typings.oracleOraclejet.ojmenuMod

import typings.oracleOraclejet.anon.AriaFocusSkipLink
import typings.oracleOraclejet.mod.baseComponentSettableProperties
import typings.oracleOraclejet.ojmenuMod.ojMenu.OpenOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojMenuSettableProperties extends baseComponentSettableProperties {
  
  var disabled: Boolean = js.native
  
  var openOptions: OpenOptions = js.native
  
  @JSName("translations")
  var translations_ojMenuSettableProperties: AriaFocusSkipLink = js.native
}
object ojMenuSettableProperties {
  
  @scala.inline
  def apply(disabled: Boolean, openOptions: OpenOptions, translations: AriaFocusSkipLink): ojMenuSettableProperties = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], openOptions = openOptions.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojMenuSettableProperties]
  }
  
  @scala.inline
  implicit class ojMenuSettablePropertiesOps[Self <: ojMenuSettableProperties] (val x: Self) extends AnyVal {
    
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
    def setOpenOptions(value: OpenOptions): Self = this.set("openOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslations(value: AriaFocusSkipLink): Self = this.set("translations", value.asInstanceOf[js.Any])
  }
}
