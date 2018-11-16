package typings
package pouchdbDashReplicationLib.PouchDBNs.ReplicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationEventEmitter[Content /* <: js.Object */, C, F]
  extends pouchdbDashCoreLib.EventEmitter {
  def cancel(): scala.Unit = js.native
  @JSName("on")
  def on_active(
    event: pouchdbDashReplicationLib.pouchdbDashReplicationLibStrings.active,
    listener: js.Function0[_]
  ): this.type = js.native
  @JSName("on")
  def on_change(
    event: pouchdbDashReplicationLib.pouchdbDashReplicationLibStrings.change,
    listener: js.Function1[/* info */ C, _]
  ): this.type = js.native
  @JSName("on")
  def on_complete(
    event: pouchdbDashReplicationLib.pouchdbDashReplicationLibStrings.complete,
    listener: js.Function1[/* info */ F, _]
  ): this.type = js.native
  @JSName("on")
  def on_denied(
    event: pouchdbDashReplicationLib.pouchdbDashReplicationLibStrings.denied,
    listener: js.Function1[/* err */ js.Object, _]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: pouchdbDashReplicationLib.pouchdbDashReplicationLibStrings.error,
    listener: js.Function1[/* err */ js.Object, _]
  ): this.type = js.native
  @JSName("on")
  def on_paused(
    event: pouchdbDashReplicationLib.pouchdbDashReplicationLibStrings.paused,
    listener: js.Function1[/* err */ js.Object, _]
  ): this.type = js.native
}

