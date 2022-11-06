package typings.parse.mod

import typings.parse.parseStrings.close
import typings.parse.parseStrings.error
import typings.parse.parseStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The LiveQuery namespace is basically an EventEmitter
  * (source : https://github.com/parse-community/Parse-SDK-JS/blob/8115e959533d1676fe5e5551bc81888b21fc12ef/src/ParseLiveQuery.js)
  * https://docs.parseplatform.org/js/guide/#websocket-status
  */
object LiveQuery {
  
  @JSImport("parse", "LiveQuery")
  @js.native
  val ^ : js.Any = js.native
  
  inline def on(
    event: open | close,
    /** When we establish ('open') or lose the WebSocket connection to the LiveQuery server, you’ll get this event */
  listener: js.Function0[Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_error(
    event: error,
    /** When some network error or LiveQuery server error happens, you’ll get this event. */
  listener: js.Function1[/* error */ Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
