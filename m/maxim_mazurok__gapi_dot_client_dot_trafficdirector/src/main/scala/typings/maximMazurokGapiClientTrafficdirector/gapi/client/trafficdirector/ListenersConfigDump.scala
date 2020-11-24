package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenersConfigDump extends js.Object {
  
  /** State for any warming, active, or draining listeners. */
  var dynamicListeners: js.UndefOr[js.Array[DynamicListener]] = js.native
  
  /** The statically loaded listener configs. */
  var staticListeners: js.UndefOr[js.Array[StaticListener]] = js.native
  
  /** This is the :ref:`version_info ` in the last processed LDS discovery response. If there are only static bootstrap listeners, this field will be "". */
  var versionInfo: js.UndefOr[String] = js.native
}
object ListenersConfigDump {
  
  @scala.inline
  def apply(): ListenersConfigDump = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenersConfigDump]
  }
  
  @scala.inline
  implicit class ListenersConfigDumpOps[Self <: ListenersConfigDump] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDynamicListenersVarargs(value: DynamicListener*): Self = this.set("dynamicListeners", js.Array(value :_*))
    
    @scala.inline
    def setDynamicListeners(value: js.Array[DynamicListener]): Self = this.set("dynamicListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicListeners: Self = this.set("dynamicListeners", js.undefined)
    
    @scala.inline
    def setStaticListenersVarargs(value: StaticListener*): Self = this.set("staticListeners", js.Array(value :_*))
    
    @scala.inline
    def setStaticListeners(value: js.Array[StaticListener]): Self = this.set("staticListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticListeners: Self = this.set("staticListeners", js.undefined)
    
    @scala.inline
    def setVersionInfo(value: String): Self = this.set("versionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionInfo: Self = this.set("versionInfo", js.undefined)
  }
}
