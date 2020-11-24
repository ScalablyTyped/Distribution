package typings.places.mod

import typings.places.anon.Prefix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutompleteOptions extends js.Object {
  
  var autoselect: Boolean = js.native
  
  var cssClasses: Prefix = js.native
  
  var debug: Boolean = js.native
  
  var hint: Boolean = js.native
}
object AutompleteOptions {
  
  @scala.inline
  def apply(autoselect: Boolean, cssClasses: Prefix, debug: Boolean, hint: Boolean): AutompleteOptions = {
    val __obj = js.Dynamic.literal(autoselect = autoselect.asInstanceOf[js.Any], cssClasses = cssClasses.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], hint = hint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutompleteOptions]
  }
  
  @scala.inline
  implicit class AutompleteOptionsOps[Self <: AutompleteOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoselect(value: Boolean): Self = this.set("autoselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssClasses(value: Prefix): Self = this.set("cssClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHint(value: Boolean): Self = this.set("hint", value.asInstanceOf[js.Any])
  }
}
