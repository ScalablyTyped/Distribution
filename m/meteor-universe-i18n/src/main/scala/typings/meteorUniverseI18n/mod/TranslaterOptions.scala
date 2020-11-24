package typings.meteorUniverseI18n.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TranslaterOptions extends js.Object {
  
  var _locale: js.UndefOr[String] = js.native
  
  var _purify: js.UndefOr[Boolean] = js.native
}
object TranslaterOptions {
  
  @scala.inline
  def apply(): TranslaterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranslaterOptions]
  }
  
  @scala.inline
  implicit class TranslaterOptionsOps[Self <: TranslaterOptions] (val x: Self) extends AnyVal {
    
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
    def set_purify(value: Boolean): Self = this.set("_purify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_purify: Self = this.set("_purify", js.undefined)
  }
}
