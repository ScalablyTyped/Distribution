package typings.officeJsPreview.OfficeExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides an option for suppressing an error when the object that is used to set multiple properties tries to set read-only properties.
  */
@js.native
trait UpdateOptions extends js.Object {
  
  /**
    * Throw an error if the passed-in property list includes read-only properties (default = true).
    */
  var throwOnReadOnly: js.UndefOr[Boolean] = js.native
}
object UpdateOptions {
  
  @scala.inline
  def apply(): UpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOptions]
  }
  
  @scala.inline
  implicit class UpdateOptionsOps[Self <: UpdateOptions] (val x: Self) extends AnyVal {
    
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
    def setThrowOnReadOnly(value: Boolean): Self = this.set("throwOnReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrowOnReadOnly: Self = this.set("throwOnReadOnly", js.undefined)
  }
}
