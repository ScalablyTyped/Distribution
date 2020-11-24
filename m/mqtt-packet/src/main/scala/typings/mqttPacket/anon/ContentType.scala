package typings.mqttPacket.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentType extends js.Object {
  
  var contentType: js.UndefOr[String] = js.native
  
  var correlationData: js.UndefOr[Buffer] = js.native
  
  var messageExpiryInterval: js.UndefOr[Double] = js.native
  
  var payloadFormatIndicator: js.UndefOr[Double] = js.native
  
  var responseTopic: js.UndefOr[String] = js.native
  
  var userProperties: js.UndefOr[js.Object] = js.native
  
  var willDelayInterval: js.UndefOr[Double] = js.native
}
object ContentType {
  
  @scala.inline
  def apply(): ContentType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentType]
  }
  
  @scala.inline
  implicit class ContentTypeOps[Self <: ContentType] (val x: Self) extends AnyVal {
    
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
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setCorrelationData(value: Buffer): Self = this.set("correlationData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorrelationData: Self = this.set("correlationData", js.undefined)
    
    @scala.inline
    def setMessageExpiryInterval(value: Double): Self = this.set("messageExpiryInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageExpiryInterval: Self = this.set("messageExpiryInterval", js.undefined)
    
    @scala.inline
    def setPayloadFormatIndicator(value: Double): Self = this.set("payloadFormatIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayloadFormatIndicator: Self = this.set("payloadFormatIndicator", js.undefined)
    
    @scala.inline
    def setResponseTopic(value: String): Self = this.set("responseTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseTopic: Self = this.set("responseTopic", js.undefined)
    
    @scala.inline
    def setUserProperties(value: js.Object): Self = this.set("userProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProperties: Self = this.set("userProperties", js.undefined)
    
    @scala.inline
    def setWillDelayInterval(value: Double): Self = this.set("willDelayInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWillDelayInterval: Self = this.set("willDelayInterval", js.undefined)
  }
}
