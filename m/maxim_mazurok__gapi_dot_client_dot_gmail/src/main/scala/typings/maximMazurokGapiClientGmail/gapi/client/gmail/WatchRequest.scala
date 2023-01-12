package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchRequest extends StObject {
  
  /** Filtering behavior of labelIds list specified. */
  var labelFilterAction: js.UndefOr[String] = js.undefined
  
  /**
    * List of label_ids to restrict notifications about. By default, if unspecified, all changes are pushed out. If specified then dictates which labels are required for a push
    * notification to be generated.
    */
  var labelIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A fully qualified Google Cloud Pub/Sub API topic name to publish the events to. This topic name **must** already exist in Cloud Pub/Sub and you **must** have already granted gmail
    * "publish" permission on it. For example, "projects/my-project-identifier/topics/my-topic-name" (using the Cloud Pub/Sub "v1" topic naming format). Note that the
    * "my-project-identifier" portion must exactly match your Google developer project id (the one executing this watch request).
    */
  var topicName: js.UndefOr[String] = js.undefined
}
object WatchRequest {
  
  inline def apply(): WatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatchRequest] (val x: Self) extends AnyVal {
    
    inline def setLabelFilterAction(value: String): Self = StObject.set(x, "labelFilterAction", value.asInstanceOf[js.Any])
    
    inline def setLabelFilterActionUndefined: Self = StObject.set(x, "labelFilterAction", js.undefined)
    
    inline def setLabelIds(value: js.Array[String]): Self = StObject.set(x, "labelIds", value.asInstanceOf[js.Any])
    
    inline def setLabelIdsUndefined: Self = StObject.set(x, "labelIds", js.undefined)
    
    inline def setLabelIdsVarargs(value: String*): Self = StObject.set(x, "labelIds", js.Array(value*))
    
    inline def setTopicName(value: String): Self = StObject.set(x, "topicName", value.asInstanceOf[js.Any])
    
    inline def setTopicNameUndefined: Self = StObject.set(x, "topicName", js.undefined)
  }
}
