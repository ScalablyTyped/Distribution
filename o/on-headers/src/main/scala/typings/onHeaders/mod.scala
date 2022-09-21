package typings.onHeaders

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * This will add the listener to fire when headers are emitted for res.
    * The listener is passed the response object as its context (this).
    * Headers are considered emitted only once, right before they
    * are sent to the client.
    *
    * When this is called multiple times on the same res, the listeners
    * are fired in the reverse order they were added.
    *
    * @param res HTTP server response object
    * @param listener Function to call prior to headers being emitted,
    *        the response object is passed as this context.
    */
  inline def apply(
    res: ServerResponse[IncomingMessage],
    listener: js.ThisFunction0[/* this */ ServerResponse[IncomingMessage], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(res.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("on-headers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
