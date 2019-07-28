package typings.pouchdbDashReplication.PouchDBNs.ReplicationNs

import typings.pouchdbDashCore.EventEmitter
import typings.pouchdbDashReplication.pouchdbDashReplicationStrings.active
import typings.pouchdbDashReplication.pouchdbDashReplicationStrings.change
import typings.pouchdbDashReplication.pouchdbDashReplicationStrings.complete
import typings.pouchdbDashReplication.pouchdbDashReplicationStrings.denied
import typings.pouchdbDashReplication.pouchdbDashReplicationStrings.error
import typings.pouchdbDashReplication.pouchdbDashReplicationStrings.paused
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationEventEmitter[Content /* <: js.Object */, C, F] extends EventEmitter {
  def cancel(): Unit = js.native
  @JSName("on")
  def on_active(event: active, listener: js.Function0[_]): this.type = js.native
  @JSName("on")
  def on_change(event: change, listener: js.Function1[/* info */ C, _]): this.type = js.native
  @JSName("on")
  def on_complete(event: complete, listener: js.Function1[/* info */ F, _]): this.type = js.native
  @JSName("on")
  def on_denied(event: denied, listener: js.Function1[/* err */ js.Object, _]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Object, _]): this.type = js.native
  @JSName("on")
  def on_paused(event: paused, listener: js.Function1[/* err */ js.Object, _]): this.type = js.native
}

