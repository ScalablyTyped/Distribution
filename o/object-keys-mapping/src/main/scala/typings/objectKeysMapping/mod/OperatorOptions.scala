package typings.objectKeysMapping.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperatorOptions extends js.Object {
  
  var camelcase: js.UndefOr[Boolean] = js.native
  
  var mapping: js.UndefOr[js.Object] = js.native
}
object OperatorOptions {
  
  @scala.inline
  def apply(): OperatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperatorOptions]
  }
  
  @scala.inline
  implicit class OperatorOptionsOps[Self <: OperatorOptions] (val x: Self) extends AnyVal {
    
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
    def setCamelcase(value: Boolean): Self = this.set("camelcase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCamelcase: Self = this.set("camelcase", js.undefined)
    
    @scala.inline
    def setMapping(value: js.Object): Self = this.set("mapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapping: Self = this.set("mapping", js.undefined)
  }
}
