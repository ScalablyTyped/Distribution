package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicScopedRouteConfigs extends StObject {
  
  /** The timestamp when the scoped route config set was last updated. */
  var lastUpdated: js.UndefOr[String] = js.undefined
  
  /** The name assigned to the scoped route configurations. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The scoped route configurations. */
  var scopedRouteConfigs: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.DynamicScopedRouteConfigs & TopLevel[js.Any]
    ]
  ] = js.undefined
  
  /** This is the per-resource version information. This version is currently taken from the :ref:`version_info ` field at the time that the scoped routes configuration was loaded. */
  var versionInfo: js.UndefOr[String] = js.undefined
}
object DynamicScopedRouteConfigs {
  
  inline def apply(): DynamicScopedRouteConfigs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicScopedRouteConfigs]
  }
  
  extension [Self <: DynamicScopedRouteConfigs](x: Self) {
    
    inline def setLastUpdated(value: String): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "lastUpdated", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setScopedRouteConfigs(
      value: js.Array[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.DynamicScopedRouteConfigs & TopLevel[js.Any]
        ]
    ): Self = StObject.set(x, "scopedRouteConfigs", value.asInstanceOf[js.Any])
    
    inline def setScopedRouteConfigsUndefined: Self = StObject.set(x, "scopedRouteConfigs", js.undefined)
    
    inline def setScopedRouteConfigsVarargs(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.DynamicScopedRouteConfigs & TopLevel[js.Any])*
    ): Self = StObject.set(x, "scopedRouteConfigs", js.Array(value :_*))
    
    inline def setVersionInfo(value: String): Self = StObject.set(x, "versionInfo", value.asInstanceOf[js.Any])
    
    inline def setVersionInfoUndefined: Self = StObject.set(x, "versionInfo", js.undefined)
  }
}
