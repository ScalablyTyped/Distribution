package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicRouteConfig extends StObject {
  
  /** The timestamp when the Route was last updated. */
  var lastUpdated: js.UndefOr[String] = js.undefined
  
  /** The route config. */
  var routeConfig: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.DynamicRouteConfig & TopLevel[js.Any]
  ] = js.undefined
  
  /** This is the per-resource version information. This version is currently taken from the :ref:`version_info ` field at the time that the route configuration was loaded. */
  var versionInfo: js.UndefOr[String] = js.undefined
}
object DynamicRouteConfig {
  
  @scala.inline
  def apply(): DynamicRouteConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicRouteConfig]
  }
  
  @scala.inline
  implicit class DynamicRouteConfigMutableBuilder[Self <: DynamicRouteConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastUpdated(value: String): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedUndefined: Self = StObject.set(x, "lastUpdated", js.undefined)
    
    @scala.inline
    def setRouteConfig(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.DynamicRouteConfig & TopLevel[js.Any]
    ): Self = StObject.set(x, "routeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteConfigUndefined: Self = StObject.set(x, "routeConfig", js.undefined)
    
    @scala.inline
    def setVersionInfo(value: String): Self = StObject.set(x, "versionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionInfoUndefined: Self = StObject.set(x, "versionInfo", js.undefined)
  }
}
