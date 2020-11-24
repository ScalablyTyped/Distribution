package typings.phonon.Phonon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*** Options ***/
@js.native
trait PhononOptions extends js.Object {
  
  var i18n: js.UndefOr[PhononI18nOptions | Null] = js.native
  
  var navigator: js.UndefOr[PhononNavigatorOptions] = js.native
}
object PhononOptions {
  
  @scala.inline
  def apply(): PhononOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhononOptions]
  }
  
  @scala.inline
  implicit class PhononOptionsOps[Self <: PhononOptions] (val x: Self) extends AnyVal {
    
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
    def setI18n(value: PhononI18nOptions): Self = this.set("i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteI18n: Self = this.set("i18n", js.undefined)
    
    @scala.inline
    def setI18nNull: Self = this.set("i18n", null)
    
    @scala.inline
    def setNavigator(value: PhononNavigatorOptions): Self = this.set("navigator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigator: Self = this.set("navigator", js.undefined)
  }
}
