package typings.nodeAbortController

import typings.nodeAbortController.anon.Capture
import typings.nodeAbortController.anon.`0`
import typings.nodeAbortController.nodeAbortControllerStrings.abort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-abort-controller", "AbortController")
  @js.native
  open class AbortController () extends StObject {
    
    def abort(): Unit = js.native
    
    var signal: AbortSignal = js.native
  }
  
  @JSImport("node-abort-controller", "AbortSignal")
  @js.native
  open class AbortSignal () extends StObject {
    
    var aborted: Boolean = js.native
    
    @JSName("addEventListener")
    def addEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* event */ Any, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ Any, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ Any, Any],
      options: Capture
    ): Unit = js.native
    
    def dispatchEvent(event: Any): Boolean = js.native
    
    var onabort: Null | (js.ThisFunction1[/* this */ this.type, /* event */ Any, Unit]) = js.native
    
    @JSName("removeEventListener")
    def removeEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* event */ Any, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ Any, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ Any, Any],
      options: `0`
    ): Unit = js.native
  }
}
