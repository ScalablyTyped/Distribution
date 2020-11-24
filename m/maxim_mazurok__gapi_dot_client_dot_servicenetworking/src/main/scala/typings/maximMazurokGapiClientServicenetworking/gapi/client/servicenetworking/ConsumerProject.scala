package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsumerProject extends js.Object {
  
  /**
    * Required. Project number of the consumer that is launching the service instance. It can own the network that is peered with Google or, be a service project in an XPN where the host
    * project has the network.
    */
  var projectNum: js.UndefOr[String] = js.native
}
object ConsumerProject {
  
  @scala.inline
  def apply(): ConsumerProject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumerProject]
  }
  
  @scala.inline
  implicit class ConsumerProjectOps[Self <: ConsumerProject] (val x: Self) extends AnyVal {
    
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
    def setProjectNum(value: String): Self = this.set("projectNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectNum: Self = this.set("projectNum", js.undefined)
  }
}
