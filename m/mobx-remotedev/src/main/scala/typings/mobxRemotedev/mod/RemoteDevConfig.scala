package typings.mobxRemotedev.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoteDevConfig extends js.Object {
  
  /**map of arrays named whitelist or blacklist to filter action types. You can also set it globally in the extension settings.
    */
  var filters: js.UndefOr[js.Object] = js.native
  
  /**set it to true in order to assign dispatching of all unhandled actions to this store. Useful for nested classes /
    *  observables or when having async actions without specifying the scope explicitly. */
  var global: js.UndefOr[Boolean] = js.native
  
  /**use to specify host for remotedev-server. If port is specified, default value is localhost. */
  var hostname: js.UndefOr[String] = js.native
  
  /**the instance name to be showed on the monitor page. Default value is document.title. */
  var name: js.UndefOr[String] = js.native
  
  /**set it to true to have a clear log only with actions. If MobX is in strict mode, it is true by default. Don't forget about async actions. */
  var onlyActions: js.UndefOr[Boolean] = js.native
  
  /**use to specify host's port for remotedev-server. */
  var port: js.UndefOr[Double] = js.native
  
  /** set it to true to have remote monitoring via the local or remotedev.io server. remote: false is used for the extension or react-native-debugger */
  var remote: js.UndefOr[Boolean] = js.native
}
object RemoteDevConfig {
  
  @scala.inline
  def apply(): RemoteDevConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteDevConfig]
  }
  
  @scala.inline
  implicit class RemoteDevConfigOps[Self <: RemoteDevConfig] (val x: Self) extends AnyVal {
    
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
    def setFilters(value: js.Object): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setGlobal(value: Boolean): Self = this.set("global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnlyActions(value: Boolean): Self = this.set("onlyActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyActions: Self = this.set("onlyActions", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setRemote(value: Boolean): Self = this.set("remote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemote: Self = this.set("remote", js.undefined)
  }
}
