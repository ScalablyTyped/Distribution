package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Confirmdelete extends StObject {
  
  /** @description Allow deletion if the specified analysis is the last in a set. If you attempt to delete the final analysis in a set without setting this parameter to `true`, you'll get a 400 response with the message: `Analysis is last of its type and deletion may result in the loss of historical alert data. Please specify confirm_delete.` */
  var confirm_delete: js.UndefOr[String | Null] = js.undefined
}
object Confirmdelete {
  
  inline def apply(): Confirmdelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Confirmdelete]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Confirmdelete] (val x: Self) extends AnyVal {
    
    inline def setConfirm_delete(value: String): Self = StObject.set(x, "confirm_delete", value.asInstanceOf[js.Any])
    
    inline def setConfirm_deleteNull: Self = StObject.set(x, "confirm_delete", null)
    
    inline def setConfirm_deleteUndefined: Self = StObject.set(x, "confirm_delete", js.undefined)
  }
}
