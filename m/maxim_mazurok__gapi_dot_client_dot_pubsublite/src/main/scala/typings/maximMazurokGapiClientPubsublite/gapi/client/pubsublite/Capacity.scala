package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Capacity extends js.Object {
  
  /** Publish throughput capacity per partition in MiB/s. Must be >= 4 and <= 16. */
  var publishMibPerSec: js.UndefOr[Double] = js.native
  
  /** Subscribe throughput capacity per partition in MiB/s. Must be >= 4 and <= 32. */
  var subscribeMibPerSec: js.UndefOr[Double] = js.native
}
object Capacity {
  
  @scala.inline
  def apply(): Capacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Capacity]
  }
  
  @scala.inline
  implicit class CapacityOps[Self <: Capacity] (val x: Self) extends AnyVal {
    
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
    def setPublishMibPerSec(value: Double): Self = this.set("publishMibPerSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishMibPerSec: Self = this.set("publishMibPerSec", js.undefined)
    
    @scala.inline
    def setSubscribeMibPerSec(value: Double): Self = this.set("subscribeMibPerSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscribeMibPerSec: Self = this.set("subscribeMibPerSec", js.undefined)
  }
}
