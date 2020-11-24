package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaseSensitive extends js.Object {
  
  @JSName("$caseSensitive")
  var $caseSensitive: js.UndefOr[Boolean] = js.native
  
  @JSName("$diacriticSensitive")
  var $diacriticSensitive: js.UndefOr[Boolean] = js.native
  
  @JSName("$language")
  var $language: js.UndefOr[String] = js.native
  
  @JSName("$search")
  var $search: String = js.native
}
object CaseSensitive {
  
  @scala.inline
  def apply($search: String): CaseSensitive = {
    val __obj = js.Dynamic.literal($search = $search.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaseSensitive]
  }
  
  @scala.inline
  implicit class CaseSensitiveOps[Self <: CaseSensitive] (val x: Self) extends AnyVal {
    
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
    def set$search(value: String): Self = this.set("$search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$caseSensitive(value: Boolean): Self = this.set("$caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$caseSensitive: Self = this.set("$caseSensitive", js.undefined)
    
    @scala.inline
    def set$diacriticSensitive(value: Boolean): Self = this.set("$diacriticSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$diacriticSensitive: Self = this.set("$diacriticSensitive", js.undefined)
    
    @scala.inline
    def set$language(value: String): Self = this.set("$language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$language: Self = this.set("$language", js.undefined)
  }
}
