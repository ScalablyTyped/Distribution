package typings.nodal.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExtendedError
  extends StObject
     with Error {
  
  var details: js.UndefOr[js.Object] = js.undefined
  
  var notFound: js.UndefOr[Boolean] = js.undefined
}
object IExtendedError {
  
  inline def apply(message: String, name: String): IExtendedError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExtendedError]
  }
  
  extension [Self <: IExtendedError](x: Self) {
    
    inline def setDetails(value: js.Object): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setNotFound(value: Boolean): Self = StObject.set(x, "notFound", value.asInstanceOf[js.Any])
    
    inline def setNotFoundUndefined: Self = StObject.set(x, "notFound", js.undefined)
  }
}
