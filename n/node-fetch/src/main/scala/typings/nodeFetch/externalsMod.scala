package typings.nodeFetch

import typings.nodeFetch.anon.Capture
import typings.nodeFetch.anon.CaptureBoolean
import typings.nodeFetch.nodeFetchStrings.abort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-fetch/externals", JSImport.Namespace)
@js.native
object externalsMod extends js.Object {
  @js.native
  trait AbortSignal extends js.Object {
    var aborted: Boolean = js.native
    var onabort: js.UndefOr[Null | (js.ThisFunction1[/* this */ this.type, /* event */ js.Any, Unit])] = js.native
    @JSName("addEventListener")
    def addEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* event */ js.Any, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ js.Any, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ js.Any, _],
      options: Capture
    ): Unit = js.native
    def dispatchEvent(event: js.Any): Boolean = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* event */ js.Any, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ js.Any, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ js.Any, _],
      options: CaptureBoolean
    ): Unit = js.native
  }
  
}

