package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TranslateTextGlossaryConfig extends js.Object {
  
  /**
    * Required. The `glossary` to be applied for this translation. The format depends on glossary: - User provided custom glossary:
    * `projects/{project-number-or-id}/locations/{location-id}/glossaries/{glossary-id}`
    */
  var glossary: js.UndefOr[String] = js.native
  
  /** Optional. Indicates match is case-insensitive. Default value is false if missing. */
  var ignoreCase: js.UndefOr[Boolean] = js.native
}
object TranslateTextGlossaryConfig {
  
  @scala.inline
  def apply(): TranslateTextGlossaryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranslateTextGlossaryConfig]
  }
  
  @scala.inline
  implicit class TranslateTextGlossaryConfigOps[Self <: TranslateTextGlossaryConfig] (val x: Self) extends AnyVal {
    
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
    def setGlossary(value: String): Self = this.set("glossary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlossary: Self = this.set("glossary", js.undefined)
    
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = this.set("ignoreCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreCase: Self = this.set("ignoreCase", js.undefined)
  }
}
