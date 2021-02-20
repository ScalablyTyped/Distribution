package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveBroadcast extends StObject {
  
  /**
    * The contentDetails object contains information about the event's video content, such as whether the content can be shown in an embedded video player or if it will be archived and
    * therefore available for viewing after the event has concluded.
    */
  var contentDetails: js.UndefOr[LiveBroadcastContentDetails] = js.native
  
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.native
  
  /** The ID that YouTube assigns to uniquely identify the broadcast. */
  var id: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#liveBroadcast". */
  var kind: js.UndefOr[String] = js.native
  
  /** The snippet object contains basic details about the event, including its title, description, start time, and end time. */
  var snippet: js.UndefOr[LiveBroadcastSnippet] = js.native
  
  /**
    * The statistics object contains info about the event's current stats. These include concurrent viewers and total chat count. Statistics can change (in either direction) during the
    * lifetime of an event. Statistics are only returned while the event is live.
    */
  var statistics: js.UndefOr[LiveBroadcastStatistics] = js.native
  
  /** The status object contains information about the event's status. */
  var status: js.UndefOr[LiveBroadcastStatus] = js.native
}
object LiveBroadcast {
  
  @scala.inline
  def apply(): LiveBroadcast = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveBroadcast]
  }
  
  @scala.inline
  implicit class LiveBroadcastMutableBuilder[Self <: LiveBroadcast] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentDetails(value: LiveBroadcastContentDetails): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentDetailsUndefined: Self = StObject.set(x, "contentDetails", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSnippet(value: LiveBroadcastSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    @scala.inline
    def setStatistics(value: LiveBroadcastStatistics): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
    
    @scala.inline
    def setStatus(value: LiveBroadcastStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
