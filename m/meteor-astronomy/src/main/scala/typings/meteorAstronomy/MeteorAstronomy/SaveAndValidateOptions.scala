package typings.meteorAstronomy.MeteorAstronomy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveAndValidateOptions[K] extends js.Object {
  
  var cast: js.UndefOr[Boolean] = js.native
  
  var fields: js.UndefOr[js.Array[K]] = js.native
  
  var simulation: js.UndefOr[Boolean] = js.native
  
  var stopOnFirstError: js.UndefOr[Boolean] = js.native
}
object SaveAndValidateOptions {
  
  @scala.inline
  def apply[K](): SaveAndValidateOptions[K] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveAndValidateOptions[K]]
  }
  
  @scala.inline
  implicit class SaveAndValidateOptionsOps[Self <: SaveAndValidateOptions[_], K] (val x: Self with SaveAndValidateOptions[K]) extends AnyVal {
    
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
    def setCast(value: Boolean): Self = this.set("cast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCast: Self = this.set("cast", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: K*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[K]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setSimulation(value: Boolean): Self = this.set("simulation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimulation: Self = this.set("simulation", js.undefined)
    
    @scala.inline
    def setStopOnFirstError(value: Boolean): Self = this.set("stopOnFirstError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopOnFirstError: Self = this.set("stopOnFirstError", js.undefined)
  }
}
