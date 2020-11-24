package typings.parse.mod.global.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CascadeSaveOption extends js.Object {
  
  /** If `false`, nested objects will not be saved (default is `true`). */
  var cascadeSave: js.UndefOr[Boolean] = js.native
}
object CascadeSaveOption {
  
  @scala.inline
  def apply(): CascadeSaveOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CascadeSaveOption]
  }
  
  @scala.inline
  implicit class CascadeSaveOptionOps[Self <: CascadeSaveOption] (val x: Self) extends AnyVal {
    
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
    def setCascadeSave(value: Boolean): Self = this.set("cascadeSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCascadeSave: Self = this.set("cascadeSave", js.undefined)
  }
}
