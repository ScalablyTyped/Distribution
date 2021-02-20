package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Changestatus extends StObject {
  
  var change_status: Additions = js.native
  
  var committed_at: String = js.native
  
  var url: String = js.native
  
  var user: Avatarurl = js.native
  
  var version: String = js.native
}
object Changestatus {
  
  @scala.inline
  def apply(change_status: Additions, committed_at: String, url: String, user: Avatarurl, version: String): Changestatus = {
    val __obj = js.Dynamic.literal(change_status = change_status.asInstanceOf[js.Any], committed_at = committed_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Changestatus]
  }
  
  @scala.inline
  implicit class ChangestatusMutableBuilder[Self <: Changestatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange_status(value: Additions): Self = StObject.set(x, "change_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitted_at(value: String): Self = StObject.set(x, "committed_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: Avatarurl): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
