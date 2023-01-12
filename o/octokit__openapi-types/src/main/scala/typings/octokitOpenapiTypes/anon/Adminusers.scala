package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Adminusers extends StObject {
  
  var admin_users: js.UndefOr[Double] = js.undefined
  
  var suspended_users: js.UndefOr[Double] = js.undefined
  
  var total_users: js.UndefOr[Double] = js.undefined
}
object Adminusers {
  
  inline def apply(): Adminusers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Adminusers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Adminusers] (val x: Self) extends AnyVal {
    
    inline def setAdmin_users(value: Double): Self = StObject.set(x, "admin_users", value.asInstanceOf[js.Any])
    
    inline def setAdmin_usersUndefined: Self = StObject.set(x, "admin_users", js.undefined)
    
    inline def setSuspended_users(value: Double): Self = StObject.set(x, "suspended_users", value.asInstanceOf[js.Any])
    
    inline def setSuspended_usersUndefined: Self = StObject.set(x, "suspended_users", js.undefined)
    
    inline def setTotal_users(value: Double): Self = StObject.set(x, "total_users", value.asInstanceOf[js.Any])
    
    inline def setTotal_usersUndefined: Self = StObject.set(x, "total_users", js.undefined)
  }
}
