package typings.pouchdbReplication.PouchDB.Replication

import typings.pouchdbCore.EventEmitter
import typings.pouchdbReplication.pouchdbReplicationStrings.active
import typings.pouchdbReplication.pouchdbReplicationStrings.change
import typings.pouchdbReplication.pouchdbReplicationStrings.complete
import typings.pouchdbReplication.pouchdbReplicationStrings.denied
import typings.pouchdbReplication.pouchdbReplicationStrings.error
import typings.pouchdbReplication.pouchdbReplicationStrings.paused
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

