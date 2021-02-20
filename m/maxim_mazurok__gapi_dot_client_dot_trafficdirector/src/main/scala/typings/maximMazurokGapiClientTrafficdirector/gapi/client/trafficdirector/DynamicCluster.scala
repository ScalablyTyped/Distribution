package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicCluster extends StObject {
  
  /** The cluster config. */
  var cluster: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.DynamicCluster with TopLevel[js.Any]
  ] = js.native
  
  /** The timestamp when the Cluster was last updated. */
  var lastUpdated: js.UndefOr[String] = js.native
  
  /**
    * This is the per-resource version information. This version is currently taken from the :ref:`version_info ` field at the time that the cluster was loaded. In the future, discrete
    * per-cluster versions may be supported by the API.
    */
  var versionInfo: js.UndefOr[String] = js.native
}
object DynamicCluster {
  
  @scala.inline
  def apply(): DynamicCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicCluster]
  }
  
  @scala.inline
  implicit class DynamicClusterMutableBuilder[Self <: DynamicCluster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluster(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.DynamicCluster with TopLevel[js.Any]
    ): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    @scala.inline
    def setLastUpdated(value: String): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedUndefined: Self = StObject.set(x, "lastUpdated", js.undefined)
    
    @scala.inline
    def setVersionInfo(value: String): Self = StObject.set(x, "versionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionInfoUndefined: Self = StObject.set(x, "versionInfo", js.undefined)
  }
}
