package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticListener extends StObject {
  
  /** The timestamp when the Listener was last successfully updated. */
  var lastUpdated: js.UndefOr[String] = js.undefined
  
  /** The listener config. */
  var listener: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.StaticListener & TopLevel[Any]
  ] = js.undefined
}
object StaticListener {
  
  inline def apply(): StaticListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticListener]
  }
  
  extension [Self <: StaticListener](x: Self) {
    
    inline def setLastUpdated(value: String): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "lastUpdated", js.undefined)
    
    inline def setListener(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.StaticListener & TopLevel[Any]
    ): Self = StObject.set(x, "listener", value.asInstanceOf[js.Any])
    
    inline def setListenerUndefined: Self = StObject.set(x, "listener", js.undefined)
  }
}
