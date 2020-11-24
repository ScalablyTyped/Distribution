package typings.maximMazurokGapiClientRun.gapi.client.run

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceSpec extends js.Object {
  
  /** Template holds the latest specification for the Revision to be stamped out. */
  var template: js.UndefOr[RevisionTemplate] = js.native
  
  /** Traffic specifies how to distribute traffic over a collection of Knative Revisions and Configurations. */
  var traffic: js.UndefOr[js.Array[TrafficTarget]] = js.native
}
object ServiceSpec {
  
  @scala.inline
  def apply(): ServiceSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceSpec]
  }
  
  @scala.inline
  implicit class ServiceSpecOps[Self <: ServiceSpec] (val x: Self) extends AnyVal {
    
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
    def setTemplate(value: RevisionTemplate): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTrafficVarargs(value: TrafficTarget*): Self = this.set("traffic", js.Array(value :_*))
    
    @scala.inline
    def setTraffic(value: js.Array[TrafficTarget]): Self = this.set("traffic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraffic: Self = this.set("traffic", js.undefined)
  }
}
