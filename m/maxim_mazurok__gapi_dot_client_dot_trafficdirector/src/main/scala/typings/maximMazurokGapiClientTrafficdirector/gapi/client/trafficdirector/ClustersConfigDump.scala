package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClustersConfigDump extends StObject {
  
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
  implicit class ClustersConfigDumpMutableBuilder[Self <: ClustersConfigDump] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamicActiveClusters(value: js.Array[DynamicCluster]): Self = StObject.set(x, "dynamicActiveClusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicActiveClustersUndefined: Self = StObject.set(x, "dynamicActiveClusters", js.undefined)
    
    @scala.inline
    def setDynamicActiveClustersVarargs(value: DynamicCluster*): Self = StObject.set(x, "dynamicActiveClusters", js.Array(value :_*))
    
    @scala.inline
    def setDynamicWarmingClusters(value: js.Array[DynamicCluster]): Self = StObject.set(x, "dynamicWarmingClusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicWarmingClustersUndefined: Self = StObject.set(x, "dynamicWarmingClusters", js.undefined)
    
    @scala.inline
    def setDynamicWarmingClustersVarargs(value: DynamicCluster*): Self = StObject.set(x, "dynamicWarmingClusters", js.Array(value :_*))
    
    @scala.inline
    def setStaticClusters(value: js.Array[StaticCluster]): Self = StObject.set(x, "staticClusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticClustersUndefined: Self = StObject.set(x, "staticClusters", js.undefined)
    
    @scala.inline
    def setStaticClustersVarargs(value: StaticCluster*): Self = StObject.set(x, "staticClusters", js.Array(value :_*))
    
    @scala.inline
    def setVersionInfo(value: String): Self = StObject.set(x, "versionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionInfoUndefined: Self = StObject.set(x, "versionInfo", js.undefined)
  }
}
