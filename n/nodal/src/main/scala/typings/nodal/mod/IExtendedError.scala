package typings.nodal.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
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
  implicit class IExtendedErrorMutableBuilder[Self <: IExtendedError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: js.Object): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setNotFound(value: Boolean): Self = StObject.set(x, "notFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotFoundUndefined: Self = StObject.set(x, "notFound", js.undefined)
  }
}
