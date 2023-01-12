package typings.peerjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeerOptions
  extends StObject
     with PeerJSOption {
  
  @JSName("config")
  var config_PeerOptions: js.UndefOr[Any] = js.undefined
  
  @JSName("debug")
  var debug_PeerOptions: js.UndefOr[LogLevel] = js.undefined
  
  var logFunction: js.UndefOr[js.Function2[/* logLevel */ LogLevel, /* repeated */ Any, Unit]] = js.undefined
  
  var pingInterval: js.UndefOr[Double] = js.undefined
}
object PeerOptions {
  
  inline def apply(): PeerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PeerOptions] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setDebug(value: LogLevel): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setLogFunction(value: (/* logLevel */ LogLevel, /* repeated */ Any) => Unit): Self = StObject.set(x, "logFunction", js.Any.fromFunction2(value))
    
    inline def setLogFunctionUndefined: Self = StObject.set(x, "logFunction", js.undefined)
    
    inline def setPingInterval(value: Double): Self = StObject.set(x, "pingInterval", value.asInstanceOf[js.Any])
    
    inline def setPingIntervalUndefined: Self = StObject.set(x, "pingInterval", js.undefined)
  }
}
