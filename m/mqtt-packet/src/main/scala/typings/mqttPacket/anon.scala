package typings.mqttPacket

import typings.mqttPacket.mod.QoS
import typings.node.Buffer
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
    
    var userProperties: js.UndefOr[js.Object] = js.undefined
    
    var wildcardSubscriptionAvailable: js.UndefOr[Boolean] = js.undefined
  }
  object AssignedClientIdentifier {
    
    @scala.inline
    def apply(): AssignedClientIdentifier = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssignedClientIdentifier]
    }
    
    @scala.inline
    implicit class AssignedClientIdentifierMutableBuilder[Self <: AssignedClientIdentifier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssignedClientIdentifier(value: String): Self = StObject.set(x, "assignedClientIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssignedClientIdentifierUndefined: Self = StObject.set(x, "assignedClientIdentifier", js.undefined)
      
      @scala.inline
      def setAuthenticationData(value: Buffer): Self = StObject.set(x, "authenticationData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthenticationDataUndefined: Self = StObject.set(x, "authenticationData", js.undefined)
      
      @scala.inline
      def setAuthenticationMethod(value: String): Self = StObject.set(x, "authenticationMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthenticationMethodUndefined: Self = StObject.set(x, "authenticationMethod", js.undefined)
      
      @scala.inline
      def setMaximumPacketSize(value: Double): Self = StObject.set(x, "maximumPacketSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumPacketSizeUndefined: Self = StObject.set(x, "maximumPacketSize", js.undefined)
      
      @scala.inline
      def setMaximumQoS(value: Double): Self = StObject.set(x, "maximumQoS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumQoSUndefined: Self = StObject.set(x, "maximumQoS", js.undefined)
      
      @scala.inline
      def setReasonString(value: String): Self = StObject.set(x, "reasonString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReasonStringUndefined: Self = StObject.set(x, "reasonString", js.undefined)
      
      @scala.inline
      def setReceiveMaximum(value: Double): Self = StObject.set(x, "receiveMaximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceiveMaximumUndefined: Self = StObject.set(x, "receiveMaximum", js.undefined)
      
      @scala.inline
      def setResponseInformation(value: String): Self = StObject.set(x, "responseInformation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseInformationUndefined: Self = StObject.set(x, "responseInformation", js.undefined)
      
      @scala.inline
      def setRetainAvailable(value: Boolean): Self = StObject.set(x, "retainAvailable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetainAvailableUndefined: Self = StObject.set(x, "retainAvailable", js.undefined)
      
      @scala.inline
      def setServerKeepAlive(value: Double): Self = StObject.set(x, "serverKeepAlive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerKeepAliveUndefined: Self = StObject.set(x, "serverKeepAlive", js.undefined)
      
      @scala.inline
      def setServerReference(value: String): Self = StObject.set(x, "serverReference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerReferenceUndefined: Self = StObject.set(x, "serverReference", js.undefined)
      
      @scala.inline
      def setSessionExpiryInterval(value: Double): Self = StObject.set(x, "sessionExpiryInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionExpiryIntervalUndefined: Self = StObject.set(x, "sessionExpiryInterval", js.undefined)
      
      @scala.inline
      def setSharedSubscriptionAvailable(value: Boolean): Self = StObject.set(x, "sharedSubscriptionAvailable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharedSubscriptionAvailableUndefined: Self = StObject.set(x, "sharedSubscriptionAvailable", js.undefined)
      
      @scala.inline
      def setSubscriptionIdentifiersAvailable(value: Boolean): Self = StObject.set(x, "subscriptionIdentifiersAvailable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionIdentifiersAvailableUndefined: Self = StObject.set(x, "subscriptionIdentifiersAvailable", js.undefined)
      
      @scala.inline
      def setTopicAliasMaximum(value: Double): Self = StObject.set(x, "topicAliasMaximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicAliasMaximumUndefined: Self = StObject.set(x, "topicAliasMaximum", js.undefined)
      
      @scala.inline
      def setUserProperties(value: js.Object): Self = StObject.set(x, "userProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPropertiesUndefined: Self = StObject.set(x, "userProperties", js.undefined)
      
      @scala.inline
      def setWildcardSubscriptionAvailable(value: Boolean): Self = StObject.set(x, "wildcardSubscriptionAvailable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWildcardSubscriptionAvailableUndefined: Self = StObject.set(x, "wildcardSubscriptionAvailable", js.undefined)
    }
  }
  
  trait AuthenticationData extends StObject {
    
    var authenticationData: js.UndefOr[Buffer] = js.undefined
    
    var authenticationMethod: js.UndefOr[String] = js.undefined
    
    var maximumPacketSize: js.UndefOr[Double] = js.undefined
    
    var receiveMaximum: js.UndefOr[Double] = js.undefined
    
    var requestProblemInformation: js.UndefOr[Boolean] = js.undefined
    
    var requestResponseInformation: js.UndefOr[Boolean] = js.undefined
    
    var sessionExpiryInterval: js.UndefOr[Double] = js.undefined
    
    var topicAliasMaximum: js.UndefOr[Double] = js.undefined
    
    var userProperties: js.UndefOr[js.Object] = js.undefined
  }
  object AuthenticationData {
    
    @scala.inline
    def apply(): AuthenticationData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthenticationData]
    }
    
    @scala.inline
    implicit class AuthenticationDataMutableBuilder[Self <: AuthenticationData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthenticationData(value: Buffer): Self = StObject.set(x, "authenticationData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthenticationDataUndefined: Self = StObject.set(x, "authenticationData", js.undefined)
      
      @scala.inline
      def setAuthenticationMethod(value: String): Self = StObject.set(x, "authenticationMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthenticationMethodUndefined: Self = StObject.set(x, "authenticationMethod", js.undefined)
      
      @scala.inline
      def setMaximumPacketSize(value: Double): Self = StObject.set(x, "maximumPacketSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumPacketSizeUndefined: Self = StObject.set(x, "maximumPacketSize", js.undefined)
      
      @scala.inline
      def setReceiveMaximum(value: Double): Self = StObject.set(x, "receiveMaximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceiveMaximumUndefined: Self = StObject.set(x, "receiveMaximum", js.undefined)
      
      @scala.inline
      def setRequestProblemInformation(value: Boolean): Self = StObject.set(x, "requestProblemInformation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestProblemInformationUndefined: Self = StObject.set(x, "requestProblemInformation", js.undefined)
      
      @scala.inline
      def setRequestResponseInformation(value: Boolean): Self = StObject.set(x, "requestResponseInformation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestResponseInformationUndefined: Self = StObject.set(x, "requestResponseInformation", js.undefined)
      
      @scala.inline
      def setSessionExpiryInterval(value: Double): Self = StObject.set(x, "sessionExpiryInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionExpiryIntervalUndefined: Self = StObject.set(x, "sessionExpiryInterval", js.undefined)
      
      @scala.inline
      def setTopicAliasMaximum(value: Double): Self = StObject.set(x, "topicAliasMaximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicAliasMaximumUndefined: Self = StObject.set(x, "topicAliasMaximum", js.undefined)
      
      @scala.inline
      def setUserProperties(value: js.Object): Self = StObject.set(x, "userProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPropertiesUndefined: Self = StObject.set(x, "userProperties", js.undefined)
    }
  }
  
  trait ContentType extends StObject {
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var correlationData: js.UndefOr[Buffer] = js.undefined
    
    var messageExpiryInterval: js.UndefOr[Double] = js.undefined
    
    var payloadFormatIndicator: js.UndefOr[Double] = js.undefined
    
    var responseTopic: js.UndefOr[String] = js.undefined
    
    var userProperties: js.UndefOr[js.Object] = js.undefined
    
    var willDelayInterval: js.UndefOr[Double] = js.undefined
  }
  object ContentType {
    
    @scala.inline
    def apply(): ContentType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentType]
    }
    
    @scala.inline
    implicit class ContentTypeMutableBuilder[Self <: ContentType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setCorrelationData(value: Buffer): Self = StObject.set(x, "correlationData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorrelationDataUndefined: Self = StObject.set(x, "correlationData", js.undefined)
      
      @scala.inline
      def setMessageExpiryInterval(value: Double): Self = StObject.set(x, "messageExpiryInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageExpiryIntervalUndefined: Self = StObject.set(x, "messageExpiryInterval", js.undefined)
      
      @scala.inline
      def setPayloadFormatIndicator(value: Double): Self = StObject.set(x, "payloadFormatIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadFormatIndicatorUndefined: Self = StObject.set(x, "payloadFormatIndicator", js.undefined)
      
      @scala.inline
      def setResponseTopic(value: String): Self = StObject.set(x, "responseTopic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTopicUndefined: Self = StObject.set(x, "responseTopic", js.undefined)
      
      @scala.inline
      def setUserProperties(value: js.Object): Self = StObject.set(x, "userProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPropertiesUndefined: Self = StObject.set(x, "userProperties", js.undefined)
      
      @scala.inline
      def setWillDelayInterval(value: Double): Self = StObject.set(x, "willDelayInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWillDelayIntervalUndefined: Self = StObject.set(x, "willDelayInterval", js.undefined)
    }
  }
  
  trait CorrelationData extends StObject {
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var correlationData: js.UndefOr[Buffer] = js.undefined
    
    var messageExpiryInterval: js.UndefOr[Double] = js.undefined
    
    var payloadFormatIndicator: js.UndefOr[Boolean] = js.undefined
    
    var responseTopic: js.UndefOr[String] = js.undefined
    
    var subscriptionIdentifier: js.UndefOr[Double] = js.undefined
    
    var topicAlias: js.UndefOr[Double] = js.undefined
    
    var userProperties: js.UndefOr[js.Object] = js.undefined
  }
  object CorrelationData {
    
    @scala.inline
    def apply(): CorrelationData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CorrelationData]
    }
    
    @scala.inline
    implicit class CorrelationDataMutableBuilder[Self <: CorrelationData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setCorrelationData(value: Buffer): Self = StObject.set(x, "correlationData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorrelationDataUndefined: Self = StObject.set(x, "correlationData", js.undefined)
      
      @scala.inline
      def setMessageExpiryInterval(value: Double): Self = StObject.set(x, "messageExpiryInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageExpiryIntervalUndefined: Self = StObject.set(x, "messageExpiryInterval", js.undefined)
      
      @scala.inline
      def setPayloadFormatIndicator(value: Boolean): Self = StObject.set(x, "payloadFormatIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadFormatIndicatorUndefined: Self = StObject.set(x, "payloadFormatIndicator", js.undefined)
      
      @scala.inline
      def setResponseTopic(value: String): Self = StObject.set(x, "responseTopic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTopicUndefined: Self = StObject.set(x, "responseTopic", js.undefined)
      
      @scala.inline
      def setSubscriptionIdentifier(value: Double): Self = StObject.set(x, "subscriptionIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionIdentifierUndefined: Self = StObject.set(x, "subscriptionIdentifier", js.undefined)
      
      @scala.inline
      def setTopicAlias(value: Double): Self = StObject.set(x, "topicAlias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicAliasUndefined: Self = StObject.set(x, "topicAlias", js.undefined)
      
      @scala.inline
      def setUserProperties(value: js.Object): Self = StObject.set(x, "userProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPropertiesUndefined: Self = StObject.set(x, "userProperties", js.undefined)
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
    
    @scala.inline
    def apply(payload: Buffer, topic: String): Payload = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[Payload]
    }
    
    @scala.inline
    implicit class PayloadMutableBuilder[Self <: Payload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: Buffer): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperties(value: ContentType): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setQos(value: QoS): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQosUndefined: Self = StObject.set(x, "qos", js.undefined)
      
      @scala.inline
      def setRetain(value: Boolean): Self = StObject.set(x, "retain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetainUndefined: Self = StObject.set(x, "retain", js.undefined)
      
      @scala.inline
      def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReasonString extends StObject {
    
    var reasonString: js.UndefOr[String] = js.undefined
    
    var userProperties: js.UndefOr[js.Object] = js.undefined
  }
  object ReasonString {
    
    @scala.inline
    def apply(): ReasonString = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReasonString]
    }
    
    @scala.inline
    implicit class ReasonStringMutableBuilder[Self <: ReasonString] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReasonString(value: String): Self = StObject.set(x, "reasonString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReasonStringUndefined: Self = StObject.set(x, "reasonString", js.undefined)
      
      @scala.inline
      def setUserProperties(value: js.Object): Self = StObject.set(x, "userProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPropertiesUndefined: Self = StObject.set(x, "userProperties", js.undefined)
    }
  }
  
  trait ServerReference extends StObject {
    
    var reasonString: js.UndefOr[String] = js.undefined
    
    var serverReference: js.UndefOr[String] = js.undefined
    
    var sessionExpiryInterval: js.UndefOr[Double] = js.undefined
    
    var userProperties: js.UndefOr[js.Object] = js.undefined
  }
  object ServerReference {
    
    @scala.inline
    def apply(): ServerReference = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerReference]
    }
    
    @scala.inline
    implicit class ServerReferenceMutableBuilder[Self <: ServerReference] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReasonString(value: String): Self = StObject.set(x, "reasonString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReasonStringUndefined: Self = StObject.set(x, "reasonString", js.undefined)
      
      @scala.inline
      def setServerReference(value: String): Self = StObject.set(x, "serverReference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerReferenceUndefined: Self = StObject.set(x, "serverReference", js.undefined)
      
      @scala.inline
      def setSessionExpiryInterval(value: Double): Self = StObject.set(x, "sessionExpiryInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionExpiryIntervalUndefined: Self = StObject.set(x, "sessionExpiryInterval", js.undefined)
      
      @scala.inline
      def setUserProperties(value: js.Object): Self = StObject.set(x, "userProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPropertiesUndefined: Self = StObject.set(x, "userProperties", js.undefined)
    }
  }
}
