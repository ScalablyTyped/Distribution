package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeliveryConfig extends StObject {
  
  /** The DeliveryRequirement for this subscription. */
  var deliveryRequirement: js.UndefOr[String] = js.undefined
}
object DeliveryConfig {
  
  @scala.inline
  def apply(): DeliveryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliveryConfig]
  }
  
  @scala.inline
  implicit class DeliveryConfigMutableBuilder[Self <: DeliveryConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryRequirement(value: String): Self = StObject.set(x, "deliveryRequirement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryRequirementUndefined: Self = StObject.set(x, "deliveryRequirement", js.undefined)
  }
}
