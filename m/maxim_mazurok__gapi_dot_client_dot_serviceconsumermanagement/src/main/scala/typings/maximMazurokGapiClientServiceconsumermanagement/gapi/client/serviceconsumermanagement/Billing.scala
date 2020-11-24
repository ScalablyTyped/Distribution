package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Billing extends js.Object {
  
  /**
    * Billing configurations for sending metrics to the consumer project. There can be multiple consumer destinations per service, each one must have a different monitored resource type.
    * A metric can be used in at most one consumer destination.
    */
  var consumerDestinations: js.UndefOr[js.Array[BillingDestination]] = js.native
}
object Billing {
  
  @scala.inline
  def apply(): Billing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Billing]
  }
  
  @scala.inline
  implicit class BillingOps[Self <: Billing] (val x: Self) extends AnyVal {
    
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
    def setConsumerDestinationsVarargs(value: BillingDestination*): Self = this.set("consumerDestinations", js.Array(value :_*))
    
    @scala.inline
    def setConsumerDestinations(value: js.Array[BillingDestination]): Self = this.set("consumerDestinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumerDestinations: Self = this.set("consumerDestinations", js.undefined)
  }
}
