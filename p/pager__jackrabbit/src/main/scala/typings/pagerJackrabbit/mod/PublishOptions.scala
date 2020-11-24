package typings.pagerJackrabbit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined amqplib.amqplib.Options.Publish & {  key :string,   reply :@pager/jackrabbit.@pager/jackrabbit.AckCallback | undefined} */
@js.native
trait PublishOptions extends js.Object {
  
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
  implicit class PublishOptionsOps[Self <: PublishOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBCCVarargs(value: String*): Self = this.set("BCC", js.Array(value :_*))
    
    @scala.inline
    def setBCC(value: String | js.Array[String]): Self = this.set("BCC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBCC: Self = this.set("BCC", js.undefined)
    
    @scala.inline
    def setCCVarargs(value: String*): Self = this.set("CC", js.Array(value :_*))
    
    @scala.inline
    def setCC(value: String | js.Array[String]): Self = this.set("CC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCC: Self = this.set("CC", js.undefined)
    
    @scala.inline
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
    
    @scala.inline
    def setContentEncoding(value: String): Self = this.set("contentEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentEncoding: Self = this.set("contentEncoding", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setCorrelationId(value: String): Self = this.set("correlationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorrelationId: Self = this.set("correlationId", js.undefined)
    
    @scala.inline
    def setDeliveryMode(value: Boolean | Double): Self = this.set("deliveryMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryMode: Self = this.set("deliveryMode", js.undefined)
    
    @scala.inline
    def setExpiration(value: String | Double): Self = this.set("expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiration: Self = this.set("expiration", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setMandatory(value: Boolean): Self = this.set("mandatory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMandatory: Self = this.set("mandatory", js.undefined)
    
    @scala.inline
    def setMessageId(value: String): Self = this.set("messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageId: Self = this.set("messageId", js.undefined)
    
    @scala.inline
    def setPersistent(value: Boolean): Self = this.set("persistent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersistent: Self = this.set("persistent", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setReply(value: /* data */ js.UndefOr[js.Any] => Unit): Self = this.set("reply", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReply: Self = this.set("reply", js.undefined)
    
    @scala.inline
    def setReplyTo(value: String): Self = this.set("replyTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplyTo: Self = this.set("replyTo", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
