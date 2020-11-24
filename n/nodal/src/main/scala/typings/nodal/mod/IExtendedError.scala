package typings.nodal.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IExtendedError extends Error {
  
  var details: js.UndefOr[js.Object] = js.native
  
  var notFound: js.UndefOr[Boolean] = js.native
}
object IExtendedError {
  
  @scala.inline
  def apply(message: String, name: String): IExtendedError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExtendedError]
  }
  
  @scala.inline
  implicit class IExtendedErrorOps[Self <: IExtendedError] (val x: Self) extends AnyVal {
    
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
    def setDetails(value: js.Object): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    
    @scala.inline
    def setNotFound(value: Boolean): Self = this.set("notFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotFound: Self = this.set("notFound", js.undefined)
  }
}
