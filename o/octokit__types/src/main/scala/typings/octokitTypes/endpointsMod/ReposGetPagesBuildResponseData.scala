package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Avatarurl
import typings.octokitTypes.anon.MessageString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposGetPagesBuildResponseData extends StObject {
  
  var commit: String = js.native
  
  var created_at: String = js.native
  
  var duration: Double = js.native
  
  var error: MessageString = js.native
  
  var pusher: Avatarurl = js.native
  
  var status: String = js.native
  
  var updated_at: String = js.native
  
  var url: String = js.native
}
object ReposGetPagesBuildResponseData {
  
  @scala.inline
  def apply(
    commit: String,
    created_at: String,
    duration: Double,
    error: MessageString,
    pusher: Avatarurl,
    status: String,
    updated_at: String,
    url: String
  ): ReposGetPagesBuildResponseData = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], pusher = pusher.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetPagesBuildResponseData]
  }
  
  @scala.inline
  implicit class ReposGetPagesBuildResponseDataMutableBuilder[Self <: ReposGetPagesBuildResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommit(value: String): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: MessageString): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPusher(value: Avatarurl): Self = StObject.set(x, "pusher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
