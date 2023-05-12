package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminPull extends StObject {
  
  /** @description The previous version of the team member's `admin` permission on a repository, if the action was `edited`. */
  var admin: js.UndefOr[Boolean] = js.undefined
  
  /** @description The previous version of the team member's `pull` permission on a repository, if the action was `edited`. */
  var pull: js.UndefOr[Boolean] = js.undefined
  
  /** @description The previous version of the team member's `push` permission on a repository, if the action was `edited`. */
  var push: js.UndefOr[Boolean] = js.undefined
}
object AdminPull {
  
  inline def apply(): AdminPull = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminPull]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdminPull] (val x: Self) extends AnyVal {
    
    inline def setAdmin(value: Boolean): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
    
    inline def setAdminUndefined: Self = StObject.set(x, "admin", js.undefined)
    
    inline def setPull(value: Boolean): Self = StObject.set(x, "pull", value.asInstanceOf[js.Any])
    
    inline def setPullUndefined: Self = StObject.set(x, "pull", js.undefined)
    
    inline def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
  }
}
