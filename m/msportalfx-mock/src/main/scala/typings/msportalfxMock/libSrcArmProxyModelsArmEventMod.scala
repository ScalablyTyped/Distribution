package typings.msportalfxMock

import typings.msportalfxMock.libSrcHelpersHtml5Mod.StringMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcArmProxyModelsArmEventMod {
  
  trait EventData extends StObject {
    
    var correlationId: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var eventChannels: String
    
    var eventDataId: js.UndefOr[String] = js.undefined
    
    var eventName: js.UndefOr[LocalizableString] = js.undefined
    
    var eventSource: js.UndefOr[LocalizableString] = js.undefined
    
    var eventTimestamp: String
    
    var id: String
    
    var level: js.UndefOr[String] = js.undefined
    
    var operationId: js.UndefOr[String] = js.undefined
    
    var operationName: js.UndefOr[LocalizableString] = js.undefined
    
    var properties: js.UndefOr[StringMap[String]] = js.undefined
    
    var resourceGroupName: String
    
    var resourceProviderName: LocalizableString
    
    var resourceUri: String
    
    var status: LocalizableString
    
    var subStatus: js.UndefOr[LocalizableString] = js.undefined
    
    var submissionTimestamp: js.UndefOr[String] = js.undefined
    
    var subscriptionId: String
  }
  object EventData {
    
    inline def apply(
      eventChannels: String,
      eventTimestamp: String,
      id: String,
      resourceGroupName: String,
      resourceProviderName: LocalizableString,
      resourceUri: String,
      status: LocalizableString,
      subscriptionId: String
    ): EventData = {
      val __obj = js.Dynamic.literal(eventChannels = eventChannels.asInstanceOf[js.Any], eventTimestamp = eventTimestamp.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceGroupName = resourceGroupName.asInstanceOf[js.Any], resourceProviderName = resourceProviderName.asInstanceOf[js.Any], resourceUri = resourceUri.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subscriptionId = subscriptionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventData] (val x: Self) extends AnyVal {
      
      inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
      
      inline def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEventChannels(value: String): Self = StObject.set(x, "eventChannels", value.asInstanceOf[js.Any])
      
      inline def setEventDataId(value: String): Self = StObject.set(x, "eventDataId", value.asInstanceOf[js.Any])
      
      inline def setEventDataIdUndefined: Self = StObject.set(x, "eventDataId", js.undefined)
      
      inline def setEventName(value: LocalizableString): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      inline def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
      
      inline def setEventSource(value: LocalizableString): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
      
      inline def setEventSourceUndefined: Self = StObject.set(x, "eventSource", js.undefined)
      
      inline def setEventTimestamp(value: String): Self = StObject.set(x, "eventTimestamp", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
      
      inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
      
      inline def setOperationName(value: LocalizableString): Self = StObject.set(x, "operationName", value.asInstanceOf[js.Any])
      
      inline def setOperationNameUndefined: Self = StObject.set(x, "operationName", js.undefined)
      
      inline def setProperties(value: StringMap[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setResourceGroupName(value: String): Self = StObject.set(x, "resourceGroupName", value.asInstanceOf[js.Any])
      
      inline def setResourceProviderName(value: LocalizableString): Self = StObject.set(x, "resourceProviderName", value.asInstanceOf[js.Any])
      
      inline def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: LocalizableString): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setSubStatus(value: LocalizableString): Self = StObject.set(x, "subStatus", value.asInstanceOf[js.Any])
      
      inline def setSubStatusUndefined: Self = StObject.set(x, "subStatus", js.undefined)
      
      inline def setSubmissionTimestamp(value: String): Self = StObject.set(x, "submissionTimestamp", value.asInstanceOf[js.Any])
      
      inline def setSubmissionTimestampUndefined: Self = StObject.set(x, "submissionTimestamp", js.undefined)
      
      inline def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocalizableString extends StObject {
    
    var localizedValue: js.UndefOr[String] = js.undefined
    
    var value: String
  }
  object LocalizableString {
    
    inline def apply(value: String): LocalizableString = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalizableString]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocalizableString] (val x: Self) extends AnyVal {
      
      inline def setLocalizedValue(value: String): Self = StObject.set(x, "localizedValue", value.asInstanceOf[js.Any])
      
      inline def setLocalizedValueUndefined: Self = StObject.set(x, "localizedValue", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
