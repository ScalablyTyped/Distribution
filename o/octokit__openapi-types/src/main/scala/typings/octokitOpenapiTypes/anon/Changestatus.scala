package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Changestatus extends StObject {
  
  var change_status: js.UndefOr[Additions] = js.undefined
  
  /** Format: date-time */
  var committed_at: js.UndefOr[String] = js.undefined
  
  /** Format: uri */
  var url: js.UndefOr[String] = js.undefined
  
  var user: js.UndefOr[Avatarurl | Null] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object Changestatus {
  
  inline def apply(): Changestatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Changestatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Changestatus] (val x: Self) extends AnyVal {
    
    inline def setChange_status(value: Additions): Self = StObject.set(x, "change_status", value.asInstanceOf[js.Any])
    
    inline def setChange_statusUndefined: Self = StObject.set(x, "change_status", js.undefined)
    
    inline def setCommitted_at(value: String): Self = StObject.set(x, "committed_at", value.asInstanceOf[js.Any])
    
    inline def setCommitted_atUndefined: Self = StObject.set(x, "committed_at", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUser(value: Avatarurl): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
