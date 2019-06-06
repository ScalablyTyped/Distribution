package typings
package nodeDashFetchLib.externalsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbortSignal extends js.Object {
  var aborted: scala.Boolean = js.native
  var onabort: js.UndefOr[
    scala.Null | (js.ThisFunction1[/* this */ this.type, /* event */ js.Any, scala.Unit])
  ] = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: nodeDashFetchLib.nodeDashFetchLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ js.Any, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: nodeDashFetchLib.nodeDashFetchLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ js.Any, _],
    options: nodeDashFetchLib.Anon_Capture
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: nodeDashFetchLib.nodeDashFetchLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ js.Any, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  def dispatchEvent(event: js.Any): scala.Boolean = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: nodeDashFetchLib.nodeDashFetchLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ js.Any, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: nodeDashFetchLib.nodeDashFetchLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ js.Any, _],
    options: nodeDashFetchLib.Anon_CaptureBoolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: nodeDashFetchLib.nodeDashFetchLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ js.Any, _],
    options: scala.Boolean
  ): scala.Unit = js.native
}

