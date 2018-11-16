package typings
package pouchdbDashCoreLib.PouchDBNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Changes[Content /* <: js.Object */]
  extends pouchdbDashCoreLib.EventEmitter
     with stdLib.Promise[ChangesResponse[Content]] {
  def cancel(): scala.Unit = js.native
  @JSName("on")
  def on_change(
    event: pouchdbDashCoreLib.pouchdbDashCoreLibStrings.change,
    listener: js.Function1[/* value */ ChangesResponseChange[Content], _]
  ): this.type = js.native
  @JSName("on")
  def on_complete(
    event: pouchdbDashCoreLib.pouchdbDashCoreLibStrings.complete,
    listener: js.Function1[/* value */ ChangesResponse[Content], _]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: pouchdbDashCoreLib.pouchdbDashCoreLibStrings.error,
    listener: js.Function1[/* value */ js.Any, _]
  ): this.type = js.native
}

