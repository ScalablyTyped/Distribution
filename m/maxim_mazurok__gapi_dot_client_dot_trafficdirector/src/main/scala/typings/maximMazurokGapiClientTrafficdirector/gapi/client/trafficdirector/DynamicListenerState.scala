package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicListenerState extends StObject {
  
  /** The timestamp when the Listener was last successfully updated. */
  var lastUpdated: js.UndefOr[String] = js.undefined
  
  /** The listener config. */
  var listener: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.DynamicListenerState & TopLevel[js.Any]
  ] = js.undefined
  
  /**
    * This is the per-resource version information. This version is currently taken from the :ref:`version_info ` field at the time that the listener was loaded. In the future, discrete
    * per-listener versions may be supported by the API.
    */
  var versionInfo: js.UndefOr[String] = js.undefined
}
object DynamicListenerState {
  
  @scala.inline
  def apply(): DynamicListenerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicListenerState]
  }
  
  @scala.inline
  implicit class DynamicListenerStateMutableBuilder[Self <: DynamicListenerState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastUpdated(value: String): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedUndefined: Self = StObject.set(x, "lastUpdated", js.undefined)
    
    @scala.inline
    def setListener(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.DynamicListenerState & TopLevel[js.Any]
    ): Self = StObject.set(x, "listener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenerUndefined: Self = StObject.set(x, "listener", js.undefined)
    
    @scala.inline
    def setVersionInfo(value: String): Self = StObject.set(x, "versionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionInfoUndefined: Self = StObject.set(x, "versionInfo", js.undefined)
  }
}
