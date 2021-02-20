package typings.pagerJackrabbit

import typings.amqplib.mod.Connection
import typings.amqplib.propertiesMod.Options.AssertExchange
import typings.amqplib.propertiesMod.Options.Consume
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.pagerJackrabbit.anon.Amqp
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pager/jackrabbit", JSImport.Namespace)
  @js.native
  def apply(url: String): JackRabbit = js.native
  
  @js.native
  sealed trait exchangeType extends StObject
  @JSImport("@pager/jackrabbit", "exchangeType")
  @js.native
  object exchangeType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[exchangeType with String] = js.native
    
    @js.native
    sealed trait direct extends exchangeType
    /* "direct" */ val direct: typings.pagerJackrabbit.mod.exchangeType.direct with String = js.native
    
    @js.native
    sealed trait fanout extends exchangeType
    /* "fanout" */ val fanout: typings.pagerJackrabbit.mod.exchangeType.fanout with String = js.native
    
    @js.native
    sealed trait topic extends exchangeType
    /* "topic" */ val topic: typings.pagerJackrabbit.mod.exchangeType.topic with String = js.native
  }
  
  type AckCallback = js.Function1[/* data */ js.UndefOr[js.Any], Unit]
  
  @js.native
  trait Exchange extends EventEmitter {
    
    def connect(con: Connection): Exchange = js.native
    
    var name: String = js.native
    
    var options: AssertExchange = js.native
    
    def publish(message: js.Any): Exchange = js.native
    def publish(message: js.Any, options: PublishOptions): Exchange = js.native
    
    def queue(options: QueueOptions): Queue = js.native
    
    var `type`: exchangeType = js.native
  }
  
  /* Inlined amqplib.amqplib.Options.AssertExchange & {  noReply :boolean | undefined} */
  @js.native
  trait ExchangeOptions extends StObject {
    
    var alternateExchange: js.UndefOr[String] = js.native
    
    var arguments: js.UndefOr[js.Any] = js.native
    
    var autoDelete: js.UndefOr[Boolean] = js.native
    
    var durable: js.UndefOr[Boolean] = js.native
    
    var internal: js.UndefOr[Boolean] = js.native
    
    var noReply: js.UndefOr[Boolean] = js.native
  }
  object ExchangeOptions {
    
    @scala.inline
    def apply(): ExchangeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExchangeOptions]
    }
    
    @scala.inline
    implicit class ExchangeOptionsMutableBuilder[Self <: ExchangeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlternateExchange(value: String): Self = StObject.set(x, "alternateExchange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlternateExchangeUndefined: Self = StObject.set(x, "alternateExchange", js.undefined)
      
      @scala.inline
      def setArguments(value: js.Any): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
      
      @scala.inline
      def setAutoDelete(value: Boolean): Self = StObject.set(x, "autoDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoDeleteUndefined: Self = StObject.set(x, "autoDelete", js.undefined)
      
      @scala.inline
      def setDurable(value: Boolean): Self = StObject.set(x, "durable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurableUndefined: Self = StObject.set(x, "durable", js.undefined)
      
      @scala.inline
      def setInternal(value: Boolean): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalUndefined: Self = StObject.set(x, "internal", js.undefined)
      
      @scala.inline
      def setNoReply(value: Boolean): Self = StObject.set(x, "noReply", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoReplyUndefined: Self = StObject.set(x, "noReply", js.undefined)
    }
  }
  
  @js.native
  trait JackRabbit extends EventEmitter {
    
    def default(): Exchange = js.native
    
    def close(): Unit = js.native
    def close(callback: js.Function1[/* e */ Error, _]): Unit = js.native
    
    def direct(): Exchange = js.native
    def direct(name: js.UndefOr[scala.Nothing], options: ExchangeOptions): Exchange = js.native
    def direct(name: String): Exchange = js.native
    def direct(name: String, options: ExchangeOptions): Exchange = js.native
    
    def fanout(): Exchange = js.native
    def fanout(name: js.UndefOr[scala.Nothing], options: ExchangeOptions): Exchange = js.native
    def fanout(name: String): Exchange = js.native
    def fanout(name: String, options: ExchangeOptions): Exchange = js.native
    
    def getInternals(): Amqp = js.native
    
    def topic(): Exchange = js.native
    def topic(name: js.UndefOr[scala.Nothing], options: ExchangeOptions): Exchange = js.native
    def topic(name: String): Exchange = js.native
    def topic(name: String, options: ExchangeOptions): Exchange = js.native
  }
  
  type Message = typings.amqplib.propertiesMod.Message
  
  /* Inlined amqplib.amqplib.Options.Publish & {  key :string,   reply :@pager/jackrabbit.@pager/jackrabbit.AckCallback | undefined} */
  @js.native
  trait PublishOptions extends StObject {
    
    var BCC: js.UndefOr[String | js.Array[String]] = js.native
    
    var CC: js.UndefOr[String | js.Array[String]] = js.native
    
    var appId: js.UndefOr[String] = js.native
    
    var contentEncoding: js.UndefOr[String] = js.native
    
    var contentType: js.UndefOr[String] = js.native
    
    var correlationId: js.UndefOr[String] = js.native
    
    var deliveryMode: js.UndefOr[Boolean | Double] = js.native
    
    var expiration: js.UndefOr[String | Double] = js.native
    
    var headers: js.UndefOr[js.Any] = js.native
    
    var key: String = js.native
    
    var mandatory: js.UndefOr[Boolean] = js.native
    
    var messageId: js.UndefOr[String] = js.native
    
    var persistent: js.UndefOr[Boolean] = js.native
    
    var priority: js.UndefOr[Double] = js.native
    
    var reply: js.UndefOr[AckCallback] = js.native
    
    var replyTo: js.UndefOr[String] = js.native
    
    var timestamp: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var userId: js.UndefOr[String] = js.native
  }
  object PublishOptions {
    
    @scala.inline
    def apply(key: String): PublishOptions = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublishOptions]
    }
    
    @scala.inline
    implicit class PublishOptionsMutableBuilder[Self <: PublishOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
      
      @scala.inline
      def setBCC(value: String | js.Array[String]): Self = StObject.set(x, "BCC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBCCUndefined: Self = StObject.set(x, "BCC", js.undefined)
      
      @scala.inline
      def setBCCVarargs(value: String*): Self = StObject.set(x, "BCC", js.Array(value :_*))
      
      @scala.inline
      def setCC(value: String | js.Array[String]): Self = StObject.set(x, "CC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCCUndefined: Self = StObject.set(x, "CC", js.undefined)
      
      @scala.inline
      def setCCVarargs(value: String*): Self = StObject.set(x, "CC", js.Array(value :_*))
      
      @scala.inline
      def setContentEncoding(value: String): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
      
      @scala.inline
      def setDeliveryMode(value: Boolean | Double): Self = StObject.set(x, "deliveryMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeliveryModeUndefined: Self = StObject.set(x, "deliveryMode", js.undefined)
      
      @scala.inline
      def setExpiration(value: String | Double): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMandatory(value: Boolean): Self = StObject.set(x, "mandatory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMandatoryUndefined: Self = StObject.set(x, "mandatory", js.undefined)
      
      @scala.inline
      def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
      
      @scala.inline
      def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setReply(value: /* data */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "reply", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReplyTo(value: String): Self = StObject.set(x, "replyTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplyToUndefined: Self = StObject.set(x, "replyTo", js.undefined)
      
      @scala.inline
      def setReplyUndefined: Self = StObject.set(x, "reply", js.undefined)
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    }
  }
  
  @js.native
  trait Queue extends EventEmitter {
    
    def cancel(done: js.Any): Unit = js.native
    
    def connect(con: Connection): Unit = js.native
    
    def consume(
      callback: js.Function4[
          /* data */ js.Any, 
          /* ack */ AckCallback, 
          /* nack */ js.Function0[Unit], 
          /* msg */ Message, 
          Unit
        ]
    ): Unit = js.native
    def consume(
      callback: js.Function4[
          /* data */ js.Any, 
          /* ack */ AckCallback, 
          /* nack */ js.Function0[Unit], 
          /* msg */ Message, 
          Unit
        ],
      options: Consume
    ): Unit = js.native
    
    var name: String = js.native
    
    var options: QueueOptions = js.native
    
    def purge(done: js.Any): Unit = js.native
  }
  
  /* Inlined amqplib.amqplib.Options.AssertQueue & {  name :string | undefined,   key :string | undefined,   keys :std.ReadonlyArray<string> | undefined,   prefetch :number | undefined} */
  @js.native
  trait QueueOptions extends StObject {
    
    var arguments: js.UndefOr[js.Any] = js.native
    
    var autoDelete: js.UndefOr[Boolean] = js.native
    
    var deadLetterExchange: js.UndefOr[String] = js.native
    
    var deadLetterRoutingKey: js.UndefOr[String] = js.native
    
    var durable: js.UndefOr[Boolean] = js.native
    
    var exclusive: js.UndefOr[Boolean] = js.native
    
    var expires: js.UndefOr[Double] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var keys: js.UndefOr[js.Array[String]] = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
    var maxPriority: js.UndefOr[Double] = js.native
    
    var messageTtl: js.UndefOr[Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var prefetch: js.UndefOr[Double] = js.native
  }
  object QueueOptions {
    
    @scala.inline
    def apply(): QueueOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueueOptions]
    }
    
    @scala.inline
    implicit class QueueOptionsMutableBuilder[Self <: QueueOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArguments(value: js.Any): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
      
      @scala.inline
      def setAutoDelete(value: Boolean): Self = StObject.set(x, "autoDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoDeleteUndefined: Self = StObject.set(x, "autoDelete", js.undefined)
      
      @scala.inline
      def setDeadLetterExchange(value: String): Self = StObject.set(x, "deadLetterExchange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeadLetterExchangeUndefined: Self = StObject.set(x, "deadLetterExchange", js.undefined)
      
      @scala.inline
      def setDeadLetterRoutingKey(value: String): Self = StObject.set(x, "deadLetterRoutingKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeadLetterRoutingKeyUndefined: Self = StObject.set(x, "deadLetterRoutingKey", js.undefined)
      
      @scala.inline
      def setDurable(value: Boolean): Self = StObject.set(x, "durable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurableUndefined: Self = StObject.set(x, "durable", js.undefined)
      
      @scala.inline
      def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      @scala.inline
      def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      @scala.inline
      def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value :_*))
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMaxPriority(value: Double): Self = StObject.set(x, "maxPriority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPriorityUndefined: Self = StObject.set(x, "maxPriority", js.undefined)
      
      @scala.inline
      def setMessageTtl(value: Double): Self = StObject.set(x, "messageTtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageTtlUndefined: Self = StObject.set(x, "messageTtl", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPrefetch(value: Double): Self = StObject.set(x, "prefetch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefetchUndefined: Self = StObject.set(x, "prefetch", js.undefined)
    }
  }
}
