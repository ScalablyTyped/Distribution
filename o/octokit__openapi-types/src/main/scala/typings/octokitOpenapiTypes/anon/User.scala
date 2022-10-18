package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  var change_status: Additions
  
  /**
    * Format: date-time
    * @example 2010-04-14T02:15:15Z
    */
  var committed_at: String
  
  /**
    * Format: uri
    * @example https://api.github.com/gists/aa5a315d61ae9438b18d/57a7f021a713b1c5a6a199b54cc514735d2d462f
    */
  var url: String
  
  var user: Avatarurl | Null
  
  /** @example 57a7f021a713b1c5a6a199b54cc514735d2d462f */
  var version: String
}
object User {
  
  inline def apply(change_status: Additions, committed_at: String, url: String, version: String): User = {
    val __obj = js.Dynamic.literal(change_status = change_status.asInstanceOf[js.Any], committed_at = committed_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], user = null)
    __obj.asInstanceOf[User]
  }
  
  extension [Self <: User](x: Self) {
    
    inline def setChange_status(value: Additions): Self = StObject.set(x, "change_status", value.asInstanceOf[js.Any])
    
    inline def setCommitted_at(value: String): Self = StObject.set(x, "committed_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Avatarurl): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
