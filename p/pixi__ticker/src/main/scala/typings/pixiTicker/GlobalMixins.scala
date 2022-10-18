package typings.pixiTicker

import typings.pixiTicker.mod.Ticker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GlobalMixins {
  
  trait Application extends StObject {
    
    def start(): Unit
    
    def stop(): Unit
    
    var ticker: Ticker
  }
  object Application {
    
    inline def apply(start: () => Unit, stop: () => Unit, ticker: Ticker): Application = {
      val __obj = js.Dynamic.literal(start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), ticker = ticker.asInstanceOf[js.Any])
      __obj.asInstanceOf[Application]
    }
    
    extension [Self <: Application](x: Self) {
      
      inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      inline def setTicker(value: Ticker): Self = StObject.set(x, "ticker", value.asInstanceOf[js.Any])
    }
  }
  
  trait IApplicationOptions extends StObject {
    
    var autoStart: js.UndefOr[Boolean] = js.undefined
    
    var sharedTicker: js.UndefOr[Boolean] = js.undefined
  }
  object IApplicationOptions {
    
    inline def apply(): IApplicationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IApplicationOptions]
    }
    
    extension [Self <: IApplicationOptions](x: Self) {
      
      inline def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
      
      inline def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
      
      inline def setSharedTicker(value: Boolean): Self = StObject.set(x, "sharedTicker", value.asInstanceOf[js.Any])
      
      inline def setSharedTickerUndefined: Self = StObject.set(x, "sharedTicker", js.undefined)
    }
  }
}
