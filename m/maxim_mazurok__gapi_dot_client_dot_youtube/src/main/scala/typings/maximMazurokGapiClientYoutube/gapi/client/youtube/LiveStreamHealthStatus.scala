package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveStreamHealthStatus extends StObject {
  
  /** The configurations issues on this stream */
  var configurationIssues: js.UndefOr[js.Array[LiveStreamConfigurationIssue]] = js.native
  
  /** The last time this status was updated (in seconds) */
  var lastUpdateTimeSeconds: js.UndefOr[String] = js.native
  
  /** The status code of this stream */
  var status: js.UndefOr[String] = js.native
}
object LiveStreamHealthStatus {
  
  @scala.inline
  def apply(): LiveStreamHealthStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveStreamHealthStatus]
  }
  
  @scala.inline
  implicit class LiveStreamHealthStatusMutableBuilder[Self <: LiveStreamHealthStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationIssues(value: js.Array[LiveStreamConfigurationIssue]): Self = StObject.set(x, "configurationIssues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationIssuesUndefined: Self = StObject.set(x, "configurationIssues", js.undefined)
    
    @scala.inline
    def setConfigurationIssuesVarargs(value: LiveStreamConfigurationIssue*): Self = StObject.set(x, "configurationIssues", js.Array(value :_*))
    
    @scala.inline
    def setLastUpdateTimeSeconds(value: String): Self = StObject.set(x, "lastUpdateTimeSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTimeSecondsUndefined: Self = StObject.set(x, "lastUpdateTimeSeconds", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
