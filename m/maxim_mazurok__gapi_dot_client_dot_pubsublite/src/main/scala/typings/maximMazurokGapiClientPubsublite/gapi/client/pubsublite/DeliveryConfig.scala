package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeliveryConfig extends js.Object {
  
  /** The DeliveryRequirement for this subscription. */
  var deliveryRequirement: js.UndefOr[String] = js.native
}
object DeliveryConfig {
  
  @scala.inline
  def apply(): DeliveryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliveryConfig]
  }
  
  @scala.inline
  implicit class DeliveryConfigOps[Self <: DeliveryConfig] (val x: Self) extends AnyVal {
    
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
    def setDeliveryRequirement(value: String): Self = this.set("deliveryRequirement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryRequirement: Self = this.set("deliveryRequirement", js.undefined)
  }
}
