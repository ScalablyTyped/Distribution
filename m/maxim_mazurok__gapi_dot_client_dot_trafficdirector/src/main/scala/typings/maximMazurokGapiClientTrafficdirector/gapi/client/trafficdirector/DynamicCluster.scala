package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicCluster extends StObject {
  
  /** The cluster config. */
  var cluster: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.DynamicCluster & TopLevel[js.Any]
  ] = js.undefined
  
  /** The timestamp when the Cluster was last updated. */
  var lastUpdated: js.UndefOr[String] = js.undefined
  
  /**
    * This is the per-resource version information. This version is currently taken from the :ref:`version_info ` field at the time that the cluster was loaded. In the future, discrete
    * per-cluster versions may be supported by the API.
    */
  var versionInfo: js.UndefOr[String] = js.undefined
}
object DynamicCluster {
  
  inline def apply(): DynamicCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicCluster]
  }
  
  extension [Self <: DynamicCluster](x: Self) {
    
    inline def setCluster(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.DynamicCluster & TopLevel[js.Any]
    ): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setLastUpdated(value: String): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "lastUpdated", js.undefined)
    
    inline def setVersionInfo(value: String): Self = StObject.set(x, "versionInfo", value.asInstanceOf[js.Any])
    
    inline def setVersionInfoUndefined: Self = StObject.set(x, "versionInfo", js.undefined)
  }
}
