package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Locality extends js.Object {
  
  /** Region this :ref:`zone ` belongs to. */
  var region: js.UndefOr[String] = js.native
  
  /** When used for locality of upstream hosts, this field further splits zone into smaller chunks of sub-zones so they can be load balanced independently. */
  var subZone: js.UndefOr[String] = js.native
  
  /**
    * Defines the local service zone where Envoy is running. Though optional, it should be set if discovery service routing is used and the discovery service exposes :ref:`zone data `,
    * either in this message or via :option:`--service-zone`. The meaning of zone is context dependent, e.g. `Availability Zone (AZ) `_ on AWS, `Zone `_ on GCP, etc.
    */
  var zone: js.UndefOr[String] = js.native
}
object Locality {
  
  @scala.inline
  def apply(): Locality = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Locality]
  }
  
  @scala.inline
  implicit class LocalityOps[Self <: Locality] (val x: Self) extends AnyVal {
    
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
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setSubZone(value: String): Self = this.set("subZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubZone: Self = this.set("subZone", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = this.set("zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
}
