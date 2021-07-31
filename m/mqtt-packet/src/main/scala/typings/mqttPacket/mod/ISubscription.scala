package typings.mqttPacket.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISubscription extends StObject {
  
  var nl: js.UndefOr[Boolean] = js.undefined
  
  var qos: QoS
  
  var rap: js.UndefOr[Boolean] = js.undefined
  
  var rh: js.UndefOr[Double] = js.undefined
  
  var topic: String
}
object ISubscription {
  
  @scala.inline
  def apply(qos: QoS, topic: String): ISubscription = {
    val __obj = js.Dynamic.literal(qos = qos.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscription]
  }
  
  @scala.inline
  implicit class ISubscriptionMutableBuilder[Self <: ISubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNl(value: Boolean): Self = StObject.set(x, "nl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNlUndefined: Self = StObject.set(x, "nl", js.undefined)
    
    @scala.inline
    def setQos(value: QoS): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRap(value: Boolean): Self = StObject.set(x, "rap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRapUndefined: Self = StObject.set(x, "rap", js.undefined)
    
    @scala.inline
    def setRh(value: Double): Self = StObject.set(x, "rh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRhUndefined: Self = StObject.set(x, "rh", js.undefined)
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
