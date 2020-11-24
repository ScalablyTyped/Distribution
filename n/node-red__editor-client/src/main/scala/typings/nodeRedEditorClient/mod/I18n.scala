package typings.nodeRedEditorClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:interface-name
@js.native
trait I18n extends js.Object {
  
  def lang(): String = js.native
}
object I18n {
  
  @scala.inline
  def apply(lang: () => String): I18n = {
    val __obj = js.Dynamic.literal(lang = js.Any.fromFunction0(lang))
    __obj.asInstanceOf[I18n]
  }
  
  @scala.inline
  implicit class I18nOps[Self <: I18n] (val x: Self) extends AnyVal {
    
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
    def setLang(value: () => String): Self = this.set("lang", js.Any.fromFunction0(value))
  }
}
