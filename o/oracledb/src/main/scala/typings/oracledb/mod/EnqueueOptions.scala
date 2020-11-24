package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to use when enqueuing messages. Attributes can be set before each queue.enqOne() or queue.enqMany().
  */
@js.native
trait EnqueueOptions extends js.Object {
  
  /** Celivery mode when enqueuing messages. It can be any one of the AQ_MSG_DELIV constants. */
  var deliveryMode: Double = js.native
  
  /** Transformation that will take place on messages when they are enqueued. */
  var transformation: String = js.native
  
  /** Defines whether the enqueue occurs in the current transaction or as a separate transaction. It can be any one of the AQ_VISIBILITY constants. */
  var visibility: Double = js.native
}
object EnqueueOptions {
  
  @scala.inline
  def apply(deliveryMode: Double, transformation: String, visibility: Double): EnqueueOptions = {
    val __obj = js.Dynamic.literal(deliveryMode = deliveryMode.asInstanceOf[js.Any], transformation = transformation.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnqueueOptions]
  }
  
  @scala.inline
  implicit class EnqueueOptionsOps[Self <: EnqueueOptions] (val x: Self) extends AnyVal {
    
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
    def setDeliveryMode(value: Double): Self = this.set("deliveryMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformation(value: String): Self = this.set("transformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibility(value: Double): Self = this.set("visibility", value.asInstanceOf[js.Any])
  }
}
