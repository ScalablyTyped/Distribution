package typings.mqtt.clientOptionsMod

import typings.mqtt.anon.CorrelationData
import typings.mqttPacket.mod.QoS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientPublishOptions extends js.Object {
  
  /**
    * callback called when message is put into `outgoingStore`
    */
  var cbStorePut: js.UndefOr[StorePutCallback] = js.native
  
  /**
    * whether or not mark a message as duplicate
    */
  var dup: js.UndefOr[Boolean] = js.native
  
  /*
    *  MQTT 5.0 properties object
    */
  var properties: js.UndefOr[CorrelationData] = js.native
  
  /**
    * the QoS
    */
  var qos: js.UndefOr[QoS] = js.native
  
  /**
    * the retain flag
    */
  var retain: js.UndefOr[Boolean] = js.native
}
object IClientPublishOptions {
  
  @scala.inline
  def apply(): IClientPublishOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientPublishOptions]
  }
  
  @scala.inline
  implicit class IClientPublishOptionsOps[Self <: IClientPublishOptions] (val x: Self) extends AnyVal {
    
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
    def setCbStorePut(value: () => Unit): Self = this.set("cbStorePut", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCbStorePut: Self = this.set("cbStorePut", js.undefined)
    
    @scala.inline
    def setDup(value: Boolean): Self = this.set("dup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDup: Self = this.set("dup", js.undefined)
    
    @scala.inline
    def setProperties(value: CorrelationData): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setQos(value: QoS): Self = this.set("qos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQos: Self = this.set("qos", js.undefined)
    
    @scala.inline
    def setRetain(value: Boolean): Self = this.set("retain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetain: Self = this.set("retain", js.undefined)
  }
}
