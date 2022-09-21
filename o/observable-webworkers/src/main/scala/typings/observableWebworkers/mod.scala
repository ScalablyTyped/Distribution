package typings.observableWebworkers

import typings.observableWebworkers.anon.Workerportanyundefined
import typings.std.MessageEvent
import typings.std.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    inline def apply(worker: Workerportanyundefined): Unit = ^.asInstanceOf[js.Dynamic].apply(worker.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("observable-webworkers", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def addEventListener(`type`: String, fn: WebworkerEventListener[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def dispatchEvent(`type`: String, worker: Worker, event: MessageEvent[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dispatchEvent")(`type`.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener(`type`: String, fn: WebworkerEventListener[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  type WebworkerEventListener[T] = js.Function2[/* worker */ Worker, /* event */ MessageEvent[T], Unit]
}
