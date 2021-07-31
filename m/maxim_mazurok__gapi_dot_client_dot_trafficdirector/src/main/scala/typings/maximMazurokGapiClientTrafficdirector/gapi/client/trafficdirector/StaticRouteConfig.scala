package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticRouteConfig extends StObject {
  
  /** The timestamp when the Route was last updated. */
  var lastUpdated: js.UndefOr[String] = js.undefined
  
  /** The route config. */
  var routeConfig: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.StaticRouteConfig & TopLevel[js.Any]
  ] = js.undefined
}
object StaticRouteConfig {
  
  @scala.inline
  def apply(): StaticRouteConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticRouteConfig]
  }
  
  @scala.inline
  implicit class StaticRouteConfigMutableBuilder[Self <: StaticRouteConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastUpdated(value: String): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedUndefined: Self = StObject.set(x, "lastUpdated", js.undefined)
    
    @scala.inline
    def setRouteConfig(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.StaticRouteConfig & TopLevel[js.Any]
    ): Self = StObject.set(x, "routeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteConfigUndefined: Self = StObject.set(x, "routeConfig", js.undefined)
  }
}
