package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logging extends js.Object {
  
  /**
    * Logging configurations for sending logs to the consumer project. There can be multiple consumer destinations, each one must have a different monitored resource type. A log can be
    * used in at most one consumer destination.
    */
  var consumerDestinations: js.UndefOr[js.Array[LoggingDestination]] = js.native
  
  /**
    * Logging configurations for sending logs to the producer project. There can be multiple producer destinations, each one must have a different monitored resource type. A log can be
    * used in at most one producer destination.
    */
  var producerDestinations: js.UndefOr[js.Array[LoggingDestination]] = js.native
}
object Logging {
  
  @scala.inline
  def apply(): Logging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Logging]
  }
  
  @scala.inline
  implicit class LoggingOps[Self <: Logging] (val x: Self) extends AnyVal {
    
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
    def setConsumerDestinationsVarargs(value: LoggingDestination*): Self = this.set("consumerDestinations", js.Array(value :_*))
    
    @scala.inline
    def setConsumerDestinations(value: js.Array[LoggingDestination]): Self = this.set("consumerDestinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumerDestinations: Self = this.set("consumerDestinations", js.undefined)
    
    @scala.inline
    def setProducerDestinationsVarargs(value: LoggingDestination*): Self = this.set("producerDestinations", js.Array(value :_*))
    
    @scala.inline
    def setProducerDestinations(value: js.Array[LoggingDestination]): Self = this.set("producerDestinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProducerDestinations: Self = this.set("producerDestinations", js.undefined)
  }
}
