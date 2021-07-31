package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticCluster extends StObject {
  
  /** The cluster config. */
  var cluster: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.StaticCluster & TopLevel[js.Any]
  ] = js.undefined
  
  /** The timestamp when the Cluster was last updated. */
  var lastUpdated: js.UndefOr[String] = js.undefined
}
object StaticCluster {
  
  @scala.inline
  def apply(): StaticCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticCluster]
  }
  
  @scala.inline
  implicit class StaticClusterMutableBuilder[Self <: StaticCluster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluster(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.StaticCluster & TopLevel[js.Any]
    ): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    @scala.inline
    def setLastUpdated(value: String): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedUndefined: Self = StObject.set(x, "lastUpdated", js.undefined)
  }
}
