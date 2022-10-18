package typings.next

import typings.next.anon.Stats
import typings.next.distCompiledWebpackWebpackMod.webpack.Compiler
import typings.std.Set
import typings.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerDevHotMiddlewareMod {
  
  @JSImport("next/dist/server/dev/hot-middleware", "WebpackHotMiddleware")
  @js.native
  open class WebpackHotMiddleware protected () extends StObject {
    def this(compilers: js.Array[Compiler]) = this()
    
    var clientLatestStats: Stats | Null = js.native
    
    def close(): Unit = js.native
    
    var closed: Boolean = js.native
    
    var eventStream: EventStream = js.native
    
    var middlewareLatestStats: Stats | Null = js.native
    
    def onClientDone(statsResult: typings.next.distCompiledWebpackWebpackMod.webpack.Stats): Unit = js.native
    
    def onClientInvalid(): Unit = js.native
    
    def onEdgeServerDone(statsResult: typings.next.distCompiledWebpackWebpackMod.webpack.Stats): Unit = js.native
    
    def onEdgeServerInvalid(): Unit = js.native
    
    /**
      * To sync we use the most recent stats but also we append middleware
      * errors. This is because it is possible that middleware fails to compile
      * and we still want to show the client overlay with the error while
      * the error page should be rendered just fine.
      */
    def onHMR(client: WebSocket): Unit = js.native
    
    def onServerDone(statsResult: typings.next.distCompiledWebpackWebpackMod.webpack.Stats): Unit = js.native
    
    def onServerInvalid(): Unit = js.native
    
    def publish(payload: Any): Unit = js.native
    
    def publishStats(action: String, statsResult: typings.next.distCompiledWebpackWebpackMod.webpack.Stats): Unit = js.native
    
    var serverLatestStats: Stats | Null = js.native
  }
  
  trait EventStream extends StObject {
    
    var clients: Set[WebSocket]
    
    def close(): Unit
    
    def everyClient(fn: js.Function1[/* client */ WebSocket, Unit]): Unit
    
    def handler(client: WebSocket): Unit
    
    def publish(payload: Any): Unit
  }
  object EventStream {
    
    inline def apply(
      clients: Set[WebSocket],
      close: () => Unit,
      everyClient: js.Function1[/* client */ WebSocket, Unit] => Unit,
      handler: WebSocket => Unit,
      publish: Any => Unit
    ): EventStream = {
      val __obj = js.Dynamic.literal(clients = clients.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), everyClient = js.Any.fromFunction1(everyClient), handler = js.Any.fromFunction1(handler), publish = js.Any.fromFunction1(publish))
      __obj.asInstanceOf[EventStream]
    }
    
    extension [Self <: EventStream](x: Self) {
      
      inline def setClients(value: Set[WebSocket]): Self = StObject.set(x, "clients", value.asInstanceOf[js.Any])
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setEveryClient(value: js.Function1[/* client */ WebSocket, Unit] => Unit): Self = StObject.set(x, "everyClient", js.Any.fromFunction1(value))
      
      inline def setHandler(value: WebSocket => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
      
      inline def setPublish(value: Any => Unit): Self = StObject.set(x, "publish", js.Any.fromFunction1(value))
    }
  }
}
