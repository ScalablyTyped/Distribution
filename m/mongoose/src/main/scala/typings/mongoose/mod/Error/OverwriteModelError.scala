package typings.mongoose.mod.Error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverwriteModelError
  extends typings.mongoose.mod.Error {
  
  @JSName("name")
  var name_OverwriteModelError: typings.mongoose.mongooseStrings.OverwriteModelError = js.native
}
object OverwriteModelError {
  
  @scala.inline
  def apply(name: typings.mongoose.mongooseStrings.OverwriteModelError): OverwriteModelError = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverwriteModelError]
  }
  
  @scala.inline
  implicit class OverwriteModelErrorOps[Self <: OverwriteModelError] (val x: Self) extends AnyVal {
    
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
    def setName(value: typings.mongoose.mongooseStrings.OverwriteModelError): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
