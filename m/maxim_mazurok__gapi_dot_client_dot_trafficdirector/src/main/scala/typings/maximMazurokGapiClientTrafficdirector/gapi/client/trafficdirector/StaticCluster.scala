package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticCluster extends js.Object {
  
  /** The cluster config. */
  var cluster: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.StaticCluster with TopLevel[js.Any]
  ] = js.native
  
  /** The timestamp when the Cluster was last updated. */
  var lastUpdated: js.UndefOr[String] = js.native
}
object StaticCluster {
  
  @scala.inline
  def apply(): StaticCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticCluster]
  }
  
  @scala.inline
  implicit class StaticClusterOps[Self <: StaticCluster] (val x: Self) extends AnyVal {
    
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
    def setCluster(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.StaticCluster with TopLevel[js.Any]
    ): Self = this.set("cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCluster: Self = this.set("cluster", js.undefined)
    
    @scala.inline
    def setLastUpdated(value: String): Self = this.set("lastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdated: Self = this.set("lastUpdated", js.undefined)
  }
}
