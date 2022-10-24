package typings.next.anon

import typings.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnsurePage extends StObject {
  
  def ensurePage(param0: ClientOnly): js.Promise[Unit]
  
  def onHMR(client: WebSocket): Unit
}
object EnsurePage {
  
  inline def apply(ensurePage: ClientOnly => js.Promise[Unit], onHMR: WebSocket => Unit): EnsurePage = {
    val __obj = js.Dynamic.literal(ensurePage = js.Any.fromFunction1(ensurePage), onHMR = js.Any.fromFunction1(onHMR))
    __obj.asInstanceOf[EnsurePage]
  }
  
  extension [Self <: EnsurePage](x: Self) {
    
    inline def setEnsurePage(value: ClientOnly => js.Promise[Unit]): Self = StObject.set(x, "ensurePage", js.Any.fromFunction1(value))
    
    inline def setOnHMR(value: WebSocket => Unit): Self = StObject.set(x, "onHMR", js.Any.fromFunction1(value))
  }
}
