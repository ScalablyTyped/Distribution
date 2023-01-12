package typings.maximMazurokGapiClientStorage.gapi.client.storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Notification extends StObject {
  
  /** An optional list of additional attributes to attach to each Cloud PubSub message published for this notification subscription. */
  var custom_attributes: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** HTTP 1.1 Entity tag for this subscription notification. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** If present, only send notifications about listed event types. If empty, sent notifications for all event types. */
  var event_types: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The ID of the notification. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The kind of item this is. For notifications, this is always storage#notification. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** If present, only apply this notification configuration to object names that begin with this prefix. */
  var object_name_prefix: js.UndefOr[String] = js.undefined
  
  /** The desired content of the Payload. */
  var payload_format: js.UndefOr[String] = js.undefined
  
  /** The canonical URL of this notification. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /** The Cloud PubSub topic to which this subscription publishes. Formatted as: '//pubsub.googleapis.com/projects/{project-identifier}/topics/{my-topic}' */
  var topic: js.UndefOr[String] = js.undefined
}
object Notification {
  
  inline def apply(): Notification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Notification] (val x: Self) extends AnyVal {
    
    inline def setCustom_attributes(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "custom_attributes", value.asInstanceOf[js.Any])
    
    inline def setCustom_attributesUndefined: Self = StObject.set(x, "custom_attributes", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setEvent_types(value: js.Array[String]): Self = StObject.set(x, "event_types", value.asInstanceOf[js.Any])
    
    inline def setEvent_typesUndefined: Self = StObject.set(x, "event_types", js.undefined)
    
    inline def setEvent_typesVarargs(value: String*): Self = StObject.set(x, "event_types", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setObject_name_prefix(value: String): Self = StObject.set(x, "object_name_prefix", value.asInstanceOf[js.Any])
    
    inline def setObject_name_prefixUndefined: Self = StObject.set(x, "object_name_prefix", js.undefined)
    
    inline def setPayload_format(value: String): Self = StObject.set(x, "payload_format", value.asInstanceOf[js.Any])
    
    inline def setPayload_formatUndefined: Self = StObject.set(x, "payload_format", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
