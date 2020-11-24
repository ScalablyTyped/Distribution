package typings.meteorUniverseI18n.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTranslationParams
  extends /* key */ StringDictionary[js.Any] {
  
  var _locale: js.UndefOr[String] = js.native
  
  var _namespace: js.UndefOr[String] = js.native
}
object GetTranslationParams {
  
  @scala.inline
  def apply(): GetTranslationParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTranslationParams]
  }
  
  @scala.inline
  implicit class GetTranslationParamsOps[Self <: GetTranslationParams] (val x: Self) extends AnyVal {
    
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
    def set_locale(value: String): Self = this.set("_locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_locale: Self = this.set("_locale", js.undefined)
    
    @scala.inline
    def set_namespace(value: String): Self = this.set("_namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_namespace: Self = this.set("_namespace", js.undefined)
  }
}
