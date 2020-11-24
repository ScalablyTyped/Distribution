package typings.mobxStateTree.typeCheckerMod

import typings.mobxStateTree.typeMod.IAnyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IValidationContextEntry extends js.Object {
  
  /** Subpath where the validation should be run, or an empty string to validate it all */
  var path: String = js.native
  
  /** Type to validate the subpath against */
  var `type`: IAnyType = js.native
}
object IValidationContextEntry {
  
  @scala.inline
  def apply(path: String, `type`: IAnyType): IValidationContextEntry = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidationContextEntry]
  }
  
  @scala.inline
  implicit class IValidationContextEntryOps[Self <: IValidationContextEntry] (val x: Self) extends AnyVal {
    
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: IAnyType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
