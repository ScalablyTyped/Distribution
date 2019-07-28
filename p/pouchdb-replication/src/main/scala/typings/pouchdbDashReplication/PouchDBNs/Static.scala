package typings.pouchdbDashReplication.PouchDBNs

import typings.pouchdbDashCore.PouchDBNs.CoreNs.Callback
import typings.pouchdbDashReplication.PouchDBNs.ReplicationNs.ReplicateOptions
import typings.pouchdbDashReplication.PouchDBNs.ReplicationNs.Replication
import typings.pouchdbDashReplication.PouchDBNs.ReplicationNs.ReplicationResultComplete
import typings.pouchdbDashReplication.PouchDBNs.ReplicationNs.Sync
import typings.pouchdbDashReplication.PouchDBNs.ReplicationNs.SyncOptions
import typings.pouchdbDashReplication.PouchDBNs.ReplicationNs.SyncResultComplete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends js.Object {
  /**
    * Replicate data from source to target. Both the source and target can be a PouchDB instance or a string
    * representing a CouchDB database URL or the name of a local PouchDB database. If options.live is true,
    * then this will track future changes and also replicate them automatically.
    * This method returns an object with the method cancel(), which you call if you want to cancel live replication.
    */
  def replicate[Content](source: String, target: String): Replication[Content] = js.native
  def replicate[Content](source: String, target: String, options: ReplicateOptions): Replication[Content] = js.native
  def replicate[Content](
    source: String,
    target: String,
    options: ReplicateOptions,
    callback: Callback[ReplicationResultComplete[Content]]
  ): Replication[Content] = js.native
  def replicate[Content](source: String, target: Database[Content]): Replication[Content] = js.native
  def replicate[Content](source: String, target: Database[Content], options: ReplicateOptions): Replication[Content] = js.native
  def replicate[Content](
    source: String,
    target: Database[Content],
    options: ReplicateOptions,
    callback: Callback[ReplicationResultComplete[Content]]
  ): Replication[Content] = js.native
  def replicate[Content](source: Database[Content], target: String): Replication[Content] = js.native
  def replicate[Content](source: Database[Content], target: String, options: ReplicateOptions): Replication[Content] = js.native
  def replicate[Content](
    source: Database[Content],
    target: String,
    options: ReplicateOptions,
    callback: Callback[ReplicationResultComplete[Content]]
  ): Replication[Content] = js.native
  def replicate[Content](source: Database[Content], target: Database[Content]): Replication[Content] = js.native
  def replicate[Content](source: Database[Content], target: Database[Content], options: ReplicateOptions): Replication[Content] = js.native
  def replicate[Content](
    source: Database[Content],
    target: Database[Content],
    options: ReplicateOptions,
    callback: Callback[ReplicationResultComplete[Content]]
  ): Replication[Content] = js.native
  /**
    * Sync data from src to target and target to src. This is a convenience method for bidirectional data replication.
    *
    * In other words, this code:
    * `PouchDB.replicate('mydb', 'http://localhost:5984/mydb')`;
    * `PouchDB.replicate('http://localhost:5984/mydb', 'mydb')`;
    * is equivalent to this code:
    * `PouchDB.sync('mydb', 'http://localhost:5984/mydb')`;
    */
  def sync[Content](source: String, target: String): Sync[Content] = js.native
  def sync[Content](source: String, target: String, options: SyncOptions): Sync[Content] = js.native
  def sync[Content](
    source: String,
    target: String,
    options: SyncOptions,
    callback: Callback[SyncResultComplete[Content]]
  ): Sync[Content] = js.native
  def sync[Content](source: String, target: Database[Content]): Sync[Content] = js.native
  def sync[Content](source: String, target: Database[Content], options: SyncOptions): Sync[Content] = js.native
  def sync[Content](
    source: String,
    target: Database[Content],
    options: SyncOptions,
    callback: Callback[SyncResultComplete[Content]]
  ): Sync[Content] = js.native
  def sync[Content](source: Database[Content], target: String): Sync[Content] = js.native
  def sync[Content](source: Database[Content], target: String, options: SyncOptions): Sync[Content] = js.native
  def sync[Content](
    source: Database[Content],
    target: String,
    options: SyncOptions,
    callback: Callback[SyncResultComplete[Content]]
  ): Sync[Content] = js.native
  def sync[Content](source: Database[Content], target: Database[Content]): Sync[Content] = js.native
  def sync[Content](source: Database[Content], target: Database[Content], options: SyncOptions): Sync[Content] = js.native
  def sync[Content](
    source: Database[Content],
    target: Database[Content],
    options: SyncOptions,
    callback: Callback[SyncResultComplete[Content]]
  ): Sync[Content] = js.native
}

