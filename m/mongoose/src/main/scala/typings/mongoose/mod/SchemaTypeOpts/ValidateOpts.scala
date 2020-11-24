package typings.mongoose.mod.SchemaTypeOpts

import typings.mongoose.mongooseBooleans.`false`
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateOpts extends ValidateOptsBase {
  
  /** deprecated */
  var isAsync: js.UndefOr[`false`] = js.native
  
  var validator: js.UndefOr[RegExp | ValidateFn[_]] = js.native
}
object ValidateOpts {
  
  @scala.inline
  def apply(): ValidateOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateOpts]
  }
  
  @scala.inline
  implicit class ValidateOptsOps[Self <: ValidateOpts] (val x: Self) extends AnyVal {
    
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
    def setIsAsync(value: `false`): Self = this.set("isAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAsync: Self = this.set("isAsync", js.undefined)
    
    @scala.inline
    def setValidatorFunction1(value: _ => Boolean): Self = this.set("validator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidator(value: RegExp | ValidateFn[_]): Self = this.set("validator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidator: Self = this.set("validator", js.undefined)
  }
}
