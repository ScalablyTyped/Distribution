package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromAdminPull extends StObject {
  
  var from: AdminPull
}
object FromAdminPull {
  
  inline def apply(from: AdminPull): FromAdminPull = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromAdminPull]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FromAdminPull] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: AdminPull): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
  }
}
