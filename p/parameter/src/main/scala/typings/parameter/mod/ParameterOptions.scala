package typings.parameter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterOptions extends js.Object {
  
  /**
    * convert primitive params to specific type.
    * @default false
    */
  var convert: js.UndefOr[Boolean] = js.native
  
  /**
    * translate function
    */
  var translate: js.UndefOr[ParameterTranslateFunction] = js.native
  
  /**
    * config whether to validate the passed in value must be a object
    * @default false
    */
  var validateRoot: js.UndefOr[Boolean] = js.native
  
  /**
    * convert empty string(''), NaN, Null to undefined, this option can make rule.required more powerful,
    * **This may change the original input params.**
    * @default false
    */
  var widelyUndefined: js.UndefOr[Boolean] = js.native
}
object ParameterOptions {
  
  @scala.inline
  def apply(): ParameterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterOptions]
  }
  
  @scala.inline
  implicit class ParameterOptionsOps[Self <: ParameterOptions] (val x: Self) extends AnyVal {
    
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
    def setConvert(value: Boolean): Self = this.set("convert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvert: Self = this.set("convert", js.undefined)
    
    @scala.inline
    def setTranslate(value: ParameterTranslateFunction): Self = this.set("translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
    
    @scala.inline
    def setValidateRoot(value: Boolean): Self = this.set("validateRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateRoot: Self = this.set("validateRoot", js.undefined)
    
    @scala.inline
    def setWidelyUndefined(value: Boolean): Self = this.set("widelyUndefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidelyUndefined: Self = this.set("widelyUndefined", js.undefined)
  }
}
