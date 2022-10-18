package typings.mqttPacket

import typings.mqttPacket.mod.QoS
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AssignedClientIdentifier extends StObject {
    
    var assignedClientIdentifier: js.UndefOr[String] = js.undefined
    
    var authenticationData: js.UndefOr[Buffer] = js.undefined
    
    var authenticationMethod: js.UndefOr[String] = js.undefined
    
    var maximumPacketSize: js.UndefOr[Double] = js.undefined
    
    var maximumQoS: js.UndefOr[Double] = js.undefined
    
    var reasonString: js.UndefOr[String] = js.undefined
    
    var receiveMaximum: js.UndefOr[Double] = js.undefined
    
    var responseInformation: js.UndefOr[String] = js.undefined
    
    var retainAvailable: js.UndefOr[Boolean] = js.undefined
    
    var serverKeepAlive: js.UndefOr[Double] = js.undefined
    
    var serverReference: js.UndefOr[String] = js.undefined
    
    var sessionExpiryInterval: js.UndefOr[Double] = js.undefined
    
    var sharedSubscriptionAvailable: js.UndefOr[Boolean] = js.undefined
    
    var subscriptionIdentifiersAvailable: js.UndefOr[Boolean] = js.undefined
    
    var topicAliasMaximum: js.UndefOr[Double] = js.undefined
    
    var userProperties: js.UndefOr[typings.mqttPacket.mod.UserProperties] = js.undefined
    
    var wildcardSubscriptionAvailable: js.UndefOr[Boolean] = js.undefined
  }
  object AssignedClientIdentifier {
    
    inline def apply(): AssignedClientIdentifier = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssignedClientIdentifier]
    }
    
    extension [Self <: AssignedClientIdentifier](x: Self) {
      
      inline def setAssignedClientIdentifier(value: String): Self = StObject.set(x, "assignedClientIdentifier", value.asInstanceOf[js.Any])
      
      inline def setAssignedClientIdentifierUndefined: Self = StObject.set(x, "assignedClientIdentifier", js.undefined)
      
      inline def setAuthenticationData(value: Buffer): Self = StObject.set(x, "authenticationData", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationDataUndefined: Self = StObject.set(x, "authenticationData", js.undefined)
      
      inline def setAuthenticationMethod(value: String): Self = StObject.set(x, "authenticationMethod", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationMethodUndefined: Self = StObject.set(x, "authenticationMethod", js.undefined)
      
      inline def setMaximumPacketSize(value: Double): Self = StObject.set(x, "maximumPacketSize", value.asInstanceOf[js.Any])
      
      inline def setMaximumPacketSizeUndefined: Self = StObject.set(x, "maximumPacketSize", js.undefined)
      
      inline def setMaximumQoS(value: Double): Self = StObject.set(x, "maximumQoS", value.asInstanceOf[js.Any])
      
      inline def setMaximumQoSUndefined: Self = StObject.set(x, "maximumQoS", js.undefined)
      
      inline def setReasonString(value: String): Self = StObject.set(x, "reasonString", value.asInstanceOf[js.Any])
      
      inline def setReasonStringUndefined: Self = StObject.set(x, "reasonString", js.undefined)
      
      inline def setReceiveMaximum(value: Double): Self = StObject.set(x, "receiveMaximum", value.asInstanceOf[js.Any])
      
      inline def setReceiveMaximumUndefined: Self = StObject.set(x, "receiveMaximum", js.undefined)
      
      inline def setResponseInformation(value: String): Self = StObject.set(x, "responseInformation", value.asInstanceOf[js.Any])
      
      inline def setResponseInformationUndefined: Self = StObject.set(x, "responseInformation", js.undefined)
      
      inline def setRetainAvailable(value: Boolean): Self = StObject.set(x, "retainAvailable", value.asInstanceOf[js.Any])
      
      inline def setRetainAvailableUndefined: Self = StObject.set(x, "retainAvailable", js.undefined)
      
      inline def setServerKeepAlive(value: Double): Self = StObject.set(x, "serverKeepAlive", value.asInstanceOf[js.Any])
      
      inline def setServerKeepAliveUndefined: Self = StObject.set(x, "serverKeepAlive", js.undefined)
      
      inline def setServerReference(value: String): Self = StObject.set(x, "serverReference", value.asInstanceOf[js.Any])
      
      inline def setServerReferenceUndefined: Self = StObject.set(x, "serverReference", js.undefined)
      
      inline def setSessionExpiryInterval(value: Double): Self = StObject.set(x, "sessionExpiryInterval", value.asInstanceOf[js.Any])
      
      inline def setSessionExpiryIntervalUndefined: Self = StObject.set(x, "sessionExpiryInterval", js.undefined)
      
      inline def setSharedSubscriptionAvailable(value: Boolean): Self = StObject.set(x, "sharedSubscriptionAvailable", value.asInstanceOf[js.Any])
      
      inline def setSharedSubscriptionAvailableUndefined: Self = StObject.set(x, "sharedSubscriptionAvailable", js.undefined)
      
      inline def setSubscriptionIdentifiersAvailable(value: Boolean): Self = StObject.set(x, "subscriptionIdentifiersAvailable", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionIdentifiersAvailableUndefined: Self = StObject.set(x, "subscriptionIdentifiersAvailable", js.undefined)
      
      inline def setTopicAliasMaximum(value: Double): Self = StObject.set(x, "topicAliasMaximum", value.asInstanceOf[js.Any])
      
      inline def setTopicAliasMaximumUndefined: Self = StObject.set(x, "topicAliasMaximum", js.undefined)
      
      inline def setUserProperties(value: typings.mqttPacket.mod.UserProperties): Self = StObject.set(x, "userProperties", value.asInstanceOf[js.Any])
      
      inline def setUserPropertiesUndefined: Self = StObject.set(x, "userProperties", js.undefined)
      
      inline def setWildcardSubscriptionAvailable(value: Boolean): Self = StObject.set(x, "wildcardSubscriptionAvailable", value.asInstanceOf[js.Any])
      
      inline def setWildcardSubscriptionAvailableUndefined: Self = StObject.set(x, "wildcardSubscriptionAvailable", js.undefined)
    }
  }
  
  trait AuthenticationData extends StObject {
    
    var authenticationData: js.UndefOr[Buffer] = js.undefined
    
    var authenticationMethod: js.UndefOr[String] = js.undefined
    
    var reasonString: js.UndefOr[String] = js.undefined
    
    var userProperties: js.UndefOr[typings.mqttPacket.mod.UserProperties] = js.undefined
  }
  object AuthenticationData {
    
    inline def apply(): AuthenticationData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthenticationData]
    }
    
    extension [Self <: AuthenticationData](x: Self) {
      
      inline def setAuthenticationData(value: Buffer): Self = StObject.set(x, "authenticationData", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationDataUndefined: Self = StObject.set(x, "authenticationData", js.undefined)
      
      inline def setAuthenticationMethod(value: String): Self = StObject.set(x, "authenticationMethod", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationMethodUndefined: Self = StObject.set(x, "authenticationMethod", js.undefined)
      
      inline def setReasonString(value: String): Self = StObject.set(x, "reasonString", value.asInstanceOf[js.Any])
      
      inline def setReasonStringUndefined: Self = StObject.set(x, "reasonString", js.undefined)
      
      inline def setUserProperties(value: typings.mqttPacket.mod.UserProperties): Self = StObject.set(x, "userProperties", value.asInstanceOf[js.Any])
      
      inline def setUserPropertiesUndefined: Self = StObject.set(x, "userProperties", js.undefined)
    }
  }
  
  trait AuthenticationMethod extends StObject {
    
    var authenticationData: js.UndefOr[Buffer] = js.undefined
    
    var authenticationMethod: js.UndefOr[String] = js.undefined
    
    var maximumPacketSize: js.UndefOr[Double] = js.undefined
    
    var receiveMaximum: js.UndefOr[Double] = js.undefined
    
    var requestProblemInformation: js.UndefOr[Boolean] = js.undefined
    
    var requestResponseInformation: js.UndefOr[Boolean] = js.undefined
    
    var sessionExpiryInterval: js.UndefOr[Double] = js.undefined
    
    var topicAliasMaximum: js.UndefOr[Double] = js.undefined
    
    var userProperties: js.UndefOr[typings.mqttPacket.mod.UserProperties] = js.undefined
  }
  object AuthenticationMethod {
    
    inline def apply(): AuthenticationMethod = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthenticationMethod]
    }
    
    extension [Self <: AuthenticationMethod](x: Self) {
      
      inline def setAuthenticationData(value: Buffer): Self = StObject.set(x, "authenticationData", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationDataUndefined: Self = StObject.set(x, "authenticationData", js.undefined)
      
      inline def setAuthenticationMethod(value: String): Self = StObject.set(x, "authenticationMethod", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationMethodUndefined: Self = StObject.set(x, "authenticationMethod", js.undefined)
      
      inline def setMaximumPacketSize(value: Double): Self = StObject.set(x, "maximumPacketSize", value.asInstanceOf[js.Any])
      
      inline def setMaximumPacketSizeUndefined: Self = StObject.set(x, "maximumPacketSize", js.undefined)
      
      inline def setReceiveMaximum(value: Double): Self = StObject.set(x, "receiveMaximum", value.asInstanceOf[js.Any])
      
      inline def setReceiveMaximumUndefined: Self = StObject.set(x, "receiveMaximum", js.undefined)
      
      inline def setRequestProblemInformation(value: Boolean): Self = StObject.set(x, "requestProblemInformation", value.asInstanceOf[js.Any])
      
      inline def setRequestProblemInformationUndefined: Self = StObject.set(x, "requestProblemInformation", js.undefined)
      
      inline def setRequestResponseInformation(value: Boolean): Self = StObject.set(x, "requestResponseInformation", value.asInstanceOf[js.Any])
      
      inline def setRequestResponseInformationUndefined: Self = StObject.set(x, "requestResponseInformation", js.undefined)
      
      inline def setSessionExpiryInterval(value: Double): Self = StObject.set(x, "sessionExpiryInterval", value.asInstanceOf[js.Any])
      
      inline def setSessionExpiryIntervalUndefined: Self = StObject.set(x, "sessionExpiryInterval", js.undefined)
      
      inline def setTopicAliasMaximum(value: Double): Self = StObject.set(x, "topicAliasMaximum", value.asInstanceOf[js.Any])
      
      inline def setTopicAliasMaximumUndefined: Self = StObject.set(x, "topicAliasMaximum", js.undefined)
      
      inline def setUserProperties(value: typings.mqttPacket.mod.UserProperties): Self = StObject.set(x, "userProperties", value.asInstanceOf[js.Any])
      
      inline def setUserPropertiesUndefined: Self = StObject.set(x, "userProperties", js.undefined)
    }
  }
  
  trait ContentType extends StObject {
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var correlationData: js.UndefOr[Buffer] = js.undefined
    
    var messageExpiryInterval: js.UndefOr[Double] = js.undefined
    
    var payloadFormatIndicator: js.UndefOr[Boolean] = js.undefined
    
    var responseTopic: js.UndefOr[String] = js.undefined
    
    var userProperties: js.UndefOr[typings.mqttPacket.mod.UserProperties] = js.undefined
    
    var willDelayInterval: js.UndefOr[Double] = js.undefined
  }
  object ContentType {
    
    inline def apply(): ContentType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentType]
    }
    
    extension [Self <: ContentType](x: Self) {
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setCorrelationData(value: Buffer): Self = StObject.set(x, "correlationData", value.asInstanceOf[js.Any])
      
      inline def setCorrelationDataUndefined: Self = StObject.set(x, "correlationData", js.undefined)
      
      inline def setMessageExpiryInterval(value: Double): Self = StObject.set(x, "messageExpiryInterval", value.asInstanceOf[js.Any])
      
      inline def setMessageExpiryIntervalUndefined: Self = StObject.set(x, "messageExpiryInterval", js.undefined)
      
      inline def setPayloadFormatIndicator(value: Boolean): Self = StObject.set(x, "payloadFormatIndicator", value.asInstanceOf[js.Any])
      
      inline def setPayloadFormatIndicatorUndefined: Self = StObject.set(x, "payloadFormatIndicator", js.undefined)
      
      inline def setResponseTopic(value: String): Self = StObject.set(x, "responseTopic", value.asInstanceOf[js.Any])
      
      inline def setResponseTopicUndefined: Self = StObject.set(x, "responseTopic", js.undefined)
      
      inline def setUserProperties(value: typings.mqttPacket.mod.UserProperties): Self = StObject.set(x, "userProperties", value.asInstanceOf[js.Any])
      
      inline def setUserPropertiesUndefined: Self = StObject.set(x, "userProperties", js.undefined)
      
      inline def setWillDelayInterval(value: Double): Self = StObject.set(x, "willDelayInterval", value.asInstanceOf[js.Any])
      
      inline def setWillDelayIntervalUndefined: Self = StObject.set(x, "willDelayInterval", js.undefined)
    }
  }
  
  trait CorrelationData extends StObject {
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var correlationData: js.UndefOr[Buffer] = js.undefined
    
    var messageExpiryInterval: js.UndefOr[Double] = js.undefined
    
    var payloadFormatIndicator: js.UndefOr[Boolean] = js.undefined
    
    var responseTopic: js.UndefOr[String] = js.undefined
    
    var subscriptionIdentifier: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var topicAlias: js.UndefOr[Double] = js.undefined
    
    var userProperties: js.UndefOr[typings.mqttPacket.mod.UserProperties] = js.undefined
  }
  object CorrelationData {
    
    inline def apply(): CorrelationData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CorrelationData]
    }
    
    extension [Self <: CorrelationData](x: Self) {
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setCorrelationData(value: Buffer): Self = StObject.set(x, "correlationData", value.asInstanceOf[js.Any])
      
      inline def setCorrelationDataUndefined: Self = StObject.set(x, "correlationData", js.undefined)
      
      inline def setMessageExpiryInterval(value: Double): Self = StObject.set(x, "messageExpiryInterval", value.asInstanceOf[js.Any])
      
      inline def setMessageExpiryIntervalUndefined: Self = StObject.set(x, "messageExpiryInterval", js.undefined)
      
      inline def setPayloadFormatIndicator(value: Boolean): Self = StObject.set(x, "payloadFormatIndicator", value.asInstanceOf[js.Any])
      
      inline def setPayloadFormatIndicatorUndefined: Self = StObject.set(x, "payloadFormatIndicator", js.undefined)
      
      inline def setResponseTopic(value: String): Self = StObject.set(x, "responseTopic", value.asInstanceOf[js.Any])
      
      inline def setResponseTopicUndefined: Self = StObject.set(x, "responseTopic", js.undefined)
      
      inline def setSubscriptionIdentifier(value: Double | js.Array[Double]): Self = StObject.set(x, "subscriptionIdentifier", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionIdentifierUndefined: Self = StObject.set(x, "subscriptionIdentifier", js.undefined)
      
      inline def setSubscriptionIdentifierVarargs(value: Double*): Self = StObject.set(x, "subscriptionIdentifier", js.Array(value*))
      
      inline def setTopicAlias(value: Double): Self = StObject.set(x, "topicAlias", value.asInstanceOf[js.Any])
      
      inline def setTopicAliasUndefined: Self = StObject.set(x, "topicAlias", js.undefined)
      
      inline def setUserProperties(value: typings.mqttPacket.mod.UserProperties): Self = StObject.set(x, "userProperties", value.asInstanceOf[js.Any])
      
      inline def setUserPropertiesUndefined: Self = StObject.set(x, "userProperties", js.undefined)
    }
  }
  
  trait Payload extends StObject {
    
    var payload: Buffer
    
    var properties: js.UndefOr[ContentType] = js.undefined
    
    var qos: js.UndefOr[QoS] = js.undefined
    
    var retain: js.UndefOr[Boolean] = js.undefined
    
    var topic: String
  }
  object Payload {
    
    inline def apply(payload: Buffer, topic: String): Payload = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[Payload]
    }
    
    extension [Self <: Payload](x: Self) {
      
      inline def setPayload(value: Buffer): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: ContentType): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setQos(value: QoS): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
      
      inline def setQosUndefined: Self = StObject.set(x, "qos", js.undefined)
      
      inline def setRetain(value: Boolean): Self = StObject.set(x, "retain", value.asInstanceOf[js.Any])
      
      inline def setRetainUndefined: Self = StObject.set(x, "retain", js.undefined)
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReasonString extends StObject {
    
    var reasonString: js.UndefOr[String] = js.undefined
    
    var serverReference: js.UndefOr[String] = js.undefined
    
    var sessionExpiryInterval: js.UndefOr[Double] = js.undefined
    
    var userProperties: js.UndefOr[typings.mqttPacket.mod.UserProperties] = js.undefined
  }
  object ReasonString {
    
    inline def apply(): ReasonString = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReasonString]
    }
    
    extension [Self <: ReasonString](x: Self) {
      
      inline def setReasonString(value: String): Self = StObject.set(x, "reasonString", value.asInstanceOf[js.Any])
      
      inline def setReasonStringUndefined: Self = StObject.set(x, "reasonString", js.undefined)
      
      inline def setServerReference(value: String): Self = StObject.set(x, "serverReference", value.asInstanceOf[js.Any])
      
      inline def setServerReferenceUndefined: Self = StObject.set(x, "serverReference", js.undefined)
      
      inline def setSessionExpiryInterval(value: Double): Self = StObject.set(x, "sessionExpiryInterval", value.asInstanceOf[js.Any])
      
      inline def setSessionExpiryIntervalUndefined: Self = StObject.set(x, "sessionExpiryInterval", js.undefined)
      
      inline def setUserProperties(value: typings.mqttPacket.mod.UserProperties): Self = StObject.set(x, "userProperties", value.asInstanceOf[js.Any])
      
      inline def setUserPropertiesUndefined: Self = StObject.set(x, "userProperties", js.undefined)
    }
  }
  
  trait SubscriptionIdentifier extends StObject {
    
    var reasonString: js.UndefOr[String] = js.undefined
    
    var subscriptionIdentifier: js.UndefOr[Double] = js.undefined
    
    var userProperties: js.UndefOr[typings.mqttPacket.mod.UserProperties] = js.undefined
  }
  object SubscriptionIdentifier {
    
    inline def apply(): SubscriptionIdentifier = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscriptionIdentifier]
    }
    
    extension [Self <: SubscriptionIdentifier](x: Self) {
      
      inline def setReasonString(value: String): Self = StObject.set(x, "reasonString", value.asInstanceOf[js.Any])
      
      inline def setReasonStringUndefined: Self = StObject.set(x, "reasonString", js.undefined)
      
      inline def setSubscriptionIdentifier(value: Double): Self = StObject.set(x, "subscriptionIdentifier", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionIdentifierUndefined: Self = StObject.set(x, "subscriptionIdentifier", js.undefined)
      
      inline def setUserProperties(value: typings.mqttPacket.mod.UserProperties): Self = StObject.set(x, "userProperties", value.asInstanceOf[js.Any])
      
      inline def setUserPropertiesUndefined: Self = StObject.set(x, "userProperties", js.undefined)
    }
  }
  
  trait UserProperties extends StObject {
    
    var reasonString: js.UndefOr[String] = js.undefined
    
    var userProperties: js.UndefOr[typings.mqttPacket.mod.UserProperties] = js.undefined
  }
  object UserProperties {
    
    inline def apply(): UserProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserProperties]
    }
    
    extension [Self <: UserProperties](x: Self) {
      
      inline def setReasonString(value: String): Self = StObject.set(x, "reasonString", value.asInstanceOf[js.Any])
      
      inline def setReasonStringUndefined: Self = StObject.set(x, "reasonString", js.undefined)
      
      inline def setUserProperties(value: typings.mqttPacket.mod.UserProperties): Self = StObject.set(x, "userProperties", value.asInstanceOf[js.Any])
      
      inline def setUserPropertiesUndefined: Self = StObject.set(x, "userProperties", js.undefined)
    }
  }
}
