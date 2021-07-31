package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenersConfigDump extends StObject {
  
  /** State for any warming, active, or draining listeners. */
  var dynamicListeners: js.UndefOr[js.Array[DynamicListener]] = js.undefined
  
  /** The statically loaded listener configs. */
  var staticListeners: js.UndefOr[js.Array[StaticListener]] = js.undefined
  
  /** This is the :ref:`version_info ` in the last processed LDS discovery response. If there are only static bootstrap listeners, this field will be "". */
  var versionInfo: js.UndefOr[String] = js.undefined
}
object ListenersConfigDump {
  
  @scala.inline
  def apply(): ListenersConfigDump = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenersConfigDump]
  }
  
  @scala.inline
  implicit class ListenersConfigDumpMutableBuilder[Self <: ListenersConfigDump] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamicListeners(value: js.Array[DynamicListener]): Self = StObject.set(x, "dynamicListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicListenersUndefined: Self = StObject.set(x, "dynamicListeners", js.undefined)
    
    @scala.inline
    def setDynamicListenersVarargs(value: DynamicListener*): Self = StObject.set(x, "dynamicListeners", js.Array(value :_*))
    
    @scala.inline
    def setStaticListeners(value: js.Array[StaticListener]): Self = StObject.set(x, "staticListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticListenersUndefined: Self = StObject.set(x, "staticListeners", js.undefined)
    
    @scala.inline
    def setStaticListenersVarargs(value: StaticListener*): Self = StObject.set(x, "staticListeners", js.Array(value :_*))
    
    @scala.inline
    def setVersionInfo(value: String): Self = StObject.set(x, "versionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionInfoUndefined: Self = StObject.set(x, "versionInfo", js.undefined)
  }
}
