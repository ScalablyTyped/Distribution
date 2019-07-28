package typings.pouchdbDashReplication.PouchDBNs

import typings.pouchdbDashCore.PouchDBNs.CoreNs.Callback
import typings.pouchdbDashReplication.Anon_Callback
import typings.pouchdbDashReplication.PouchDBNs.ReplicationNs.Sync
import typings.pouchdbDashReplication.PouchDBNs.ReplicationNs.SyncOptions
import typings.pouchdbDashReplication.PouchDBNs.ReplicationNs.SyncResultComplete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database[Content /* <: js.Object */] extends js.Object {
  var replicate: Anon_Callback = js.native
  /**
    * Sync data from src to target and target to src. This is a convenience method for bidirectional data replication.
    *
    * In other words, this code:
    * `PouchDB.replicate('mydb', 'http://localhost:5984/mydb')`;
    * `PouchDB.replicate('http://localhost:5984/mydb', 'mydb')`;
    * is equivalent to this code:
    * `PouchDB.sync('mydb', 'http://localhost:5984/mydb')`;
    */
  def sync[Content](remote: String): Sync[Content] = js.native
  def sync[Content](remote: String, options: SyncOptions): Sync[Content] = js.native
  def sync[Content](remote: String, options: SyncOptions, callback: Callback[SyncResultComplete[Content]]): Sync[Content] = js.native
  def sync[Content](remote: Database[Content]): Sync[Content] = js.native
  def sync[Content](remote: Database[Content], options: SyncOptions): Sync[Content] = js.native
  def sync[Content](remote: Database[Content], options: SyncOptions, callback: Callback[SyncResultComplete[Content]]): Sync[Content] = js.native
}

