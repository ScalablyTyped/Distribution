package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerOptions extends SSLOptions {
  
  /**
    * @default false
    */
  var domainsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify a file sync write concern
    * @default false
    */
  var fsync: js.UndefOr[Boolean] = js.native
  
  /**
    * The High availability period for replicaset inquiry
    * @default 10000
    */
  var haInterval: js.UndefOr[scala.Double] = js.native
  
  /**
    * Enable command monitoring for this client
    * @default false
    */
  var monitorCommands: js.UndefOr[Boolean] = js.native
  
  /**
    * @default true
    */
  var monitoring: js.UndefOr[Boolean] = js.native
  
  /**
    * Will wait # milliseconds between retries
    * @default 1000
    */
  var reconnectInterval: js.UndefOr[scala.Double] = js.native
  
  /**
    * If you're connected to a single server or mongos proxy (as opposed to a replica set),
    * the MongoDB driver will try to reconnect every reconnectInterval milliseconds for reconnectTries
    * times, and give up afterward. When the driver gives up, the mongoose connection emits a
    * reconnectFailed event.
    * @default 30
    */
  var reconnectTries: js.UndefOr[scala.Double] = js.native
  
  /**
    * Socket Options
    */
  var socketOptions: js.UndefOr[SocketOptions] = js.native
}
object ServerOptions {
  
  @scala.inline
  def apply(): ServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions]
  }
  
  @scala.inline
  implicit class ServerOptionsOps[Self <: ServerOptions] (val x: Self) extends AnyVal {
    
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
    def setDomainsEnabled(value: Boolean): Self = this.set("domainsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainsEnabled: Self = this.set("domainsEnabled", js.undefined)
    
    @scala.inline
    def setFsync(value: Boolean): Self = this.set("fsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFsync: Self = this.set("fsync", js.undefined)
    
    @scala.inline
    def setHaInterval(value: scala.Double): Self = this.set("haInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHaInterval: Self = this.set("haInterval", js.undefined)
    
    @scala.inline
    def setMonitorCommands(value: Boolean): Self = this.set("monitorCommands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitorCommands: Self = this.set("monitorCommands", js.undefined)
    
    @scala.inline
    def setMonitoring(value: Boolean): Self = this.set("monitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitoring: Self = this.set("monitoring", js.undefined)
    
    @scala.inline
    def setReconnectInterval(value: scala.Double): Self = this.set("reconnectInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnectInterval: Self = this.set("reconnectInterval", js.undefined)
    
    @scala.inline
    def setReconnectTries(value: scala.Double): Self = this.set("reconnectTries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnectTries: Self = this.set("reconnectTries", js.undefined)
    
    @scala.inline
    def setSocketOptions(value: SocketOptions): Self = this.set("socketOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketOptions: Self = this.set("socketOptions", js.undefined)
  }
}
