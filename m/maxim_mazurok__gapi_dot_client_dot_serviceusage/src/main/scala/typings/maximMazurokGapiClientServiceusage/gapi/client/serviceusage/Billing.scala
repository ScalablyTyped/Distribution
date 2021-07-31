package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Billing extends StObject {
  
  /**
    * Billing configurations for sending metrics to the consumer project. There can be multiple consumer destinations per service, each one must have a different monitored resource type.
    * A metric can be used in at most one consumer destination.
    */
  var consumerDestinations: js.UndefOr[js.Array[BillingDestination]] = js.undefined
}
object Billing {
  
  @scala.inline
  def apply(): Billing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Billing]
  }
  
  @scala.inline
  implicit class BillingMutableBuilder[Self <: Billing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumerDestinations(value: js.Array[BillingDestination]): Self = StObject.set(x, "consumerDestinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerDestinationsUndefined: Self = StObject.set(x, "consumerDestinations", js.undefined)
    
    @scala.inline
    def setConsumerDestinationsVarargs(value: BillingDestination*): Self = StObject.set(x, "consumerDestinations", js.Array(value :_*))
  }
}
