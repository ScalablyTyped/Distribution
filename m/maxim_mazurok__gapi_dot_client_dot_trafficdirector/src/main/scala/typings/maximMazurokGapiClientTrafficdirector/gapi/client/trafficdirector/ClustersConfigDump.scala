package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClustersConfigDump extends js.Object {
  
  /** The dynamically loaded active clusters. These are clusters that are available to service data plane traffic. */
  var dynamicActiveClusters: js.UndefOr[js.Array[DynamicCluster]] = js.native
  
  /**
    * The dynamically loaded warming clusters. These are clusters that are currently undergoing warming in preparation to service data plane traffic. Note that if attempting to recreate
    * an Envoy configuration from a configuration dump, the warming clusters should generally be discarded.
    */
  var dynamicWarmingClusters: js.UndefOr[js.Array[DynamicCluster]] = js.native
  
  /** The statically loaded cluster configs. */
  var staticClusters: js.UndefOr[js.Array[StaticCluster]] = js.native
  
  /** This is the :ref:`version_info ` in the last processed CDS discovery response. If there are only static bootstrap clusters, this field will be "". */
  var versionInfo: js.UndefOr[String] = js.native
}
object ClustersConfigDump {
  
  @scala.inline
  def apply(): ClustersConfigDump = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClustersConfigDump]
  }
  
  @scala.inline
  implicit class ClustersConfigDumpOps[Self <: ClustersConfigDump] (val x: Self) extends AnyVal {
    
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
    def setDynamicActiveClustersVarargs(value: DynamicCluster*): Self = this.set("dynamicActiveClusters", js.Array(value :_*))
    
    @scala.inline
    def setDynamicActiveClusters(value: js.Array[DynamicCluster]): Self = this.set("dynamicActiveClusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicActiveClusters: Self = this.set("dynamicActiveClusters", js.undefined)
    
    @scala.inline
    def setDynamicWarmingClustersVarargs(value: DynamicCluster*): Self = this.set("dynamicWarmingClusters", js.Array(value :_*))
    
    @scala.inline
    def setDynamicWarmingClusters(value: js.Array[DynamicCluster]): Self = this.set("dynamicWarmingClusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicWarmingClusters: Self = this.set("dynamicWarmingClusters", js.undefined)
    
    @scala.inline
    def setStaticClustersVarargs(value: StaticCluster*): Self = this.set("staticClusters", js.Array(value :_*))
    
    @scala.inline
    def setStaticClusters(value: js.Array[StaticCluster]): Self = this.set("staticClusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticClusters: Self = this.set("staticClusters", js.undefined)
    
    @scala.inline
    def setVersionInfo(value: String): Self = this.set("versionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionInfo: Self = this.set("versionInfo", js.undefined)
  }
}
