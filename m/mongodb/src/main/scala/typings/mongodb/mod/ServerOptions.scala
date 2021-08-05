package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerOptions
  extends StObject
     with SSLOptions {
  
  /**
    * @default false
    */
  var domainsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify a file sync write concern
    * @default false
    */
  var fsync: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The High availability period for replicaset inquiry
    * @default 10000
    */
  var haInterval: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Enable command monitoring for this client
    * @default false
    */
  var monitorCommands: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default true
    */
  var monitoring: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Will wait # milliseconds between retries
    * @default 1000
    */
  var reconnectInterval: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * If you're connected to a single server or mongos proxy (as opposed to a replica set),
    * the MongoDB driver will try to reconnect every reconnectInterval milliseconds for reconnectTries
    * times, and give up afterward. When the driver gives up, the mongoose connection emits a
    * reconnectFailed event.
    * @default 30
    */
  var reconnectTries: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Socket Options
    */
  var socketOptions: js.UndefOr[SocketOptions] = js.undefined
}
object ServerOptions {
  
  inline def apply(): ServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions]
  }
  
  extension [Self <: ServerOptions](x: Self) {
    
    inline def setDomainsEnabled(value: Boolean): Self = StObject.set(x, "domainsEnabled", value.asInstanceOf[js.Any])
    
    inline def setDomainsEnabledUndefined: Self = StObject.set(x, "domainsEnabled", js.undefined)
    
    inline def setFsync(value: Boolean): Self = StObject.set(x, "fsync", value.asInstanceOf[js.Any])
    
    inline def setFsyncUndefined: Self = StObject.set(x, "fsync", js.undefined)
    
    inline def setHaInterval(value: scala.Double): Self = StObject.set(x, "haInterval", value.asInstanceOf[js.Any])
    
    inline def setHaIntervalUndefined: Self = StObject.set(x, "haInterval", js.undefined)
    
    inline def setMonitorCommands(value: Boolean): Self = StObject.set(x, "monitorCommands", value.asInstanceOf[js.Any])
    
    inline def setMonitorCommandsUndefined: Self = StObject.set(x, "monitorCommands", js.undefined)
    
    inline def setMonitoring(value: Boolean): Self = StObject.set(x, "monitoring", value.asInstanceOf[js.Any])
    
    inline def setMonitoringUndefined: Self = StObject.set(x, "monitoring", js.undefined)
    
    inline def setReconnectInterval(value: scala.Double): Self = StObject.set(x, "reconnectInterval", value.asInstanceOf[js.Any])
    
    inline def setReconnectIntervalUndefined: Self = StObject.set(x, "reconnectInterval", js.undefined)
    
    inline def setReconnectTries(value: scala.Double): Self = StObject.set(x, "reconnectTries", value.asInstanceOf[js.Any])
    
    inline def setReconnectTriesUndefined: Self = StObject.set(x, "reconnectTries", js.undefined)
    
    inline def setSocketOptions(value: SocketOptions): Self = StObject.set(x, "socketOptions", value.asInstanceOf[js.Any])
    
    inline def setSocketOptionsUndefined: Self = StObject.set(x, "socketOptions", js.undefined)
  }
}
