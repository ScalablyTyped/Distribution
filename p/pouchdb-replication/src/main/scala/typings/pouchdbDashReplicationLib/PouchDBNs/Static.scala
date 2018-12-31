package typings
package pouchdbDashReplicationLib.PouchDBNs

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
  def replicate[Content](source: java.lang.String, target: java.lang.String): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Replication[Content] = js.native
  def replicate[Content](
    source: java.lang.String,
    target: java.lang.String,
    options: pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.ReplicateOptions
  ): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Replication[Content] = js.native
  def replicate[Content](
    source: java.lang.String,
    target: java.lang.String,
    options: pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.ReplicateOptions,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[
      pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.ReplicationResultComplete[Content]
    ]
  ): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Replication[Content] = js.native
  def replicate[Content](source: java.lang.String, target: Database[Content]): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Replication[Content] = js.native
  def replicate[Content](
    source: java.lang.String,
    target: Database[Content],
    options: pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.ReplicateOptions
  ): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Replication[Content] = js.native
  def replicate[Content](
    source: java.lang.String,
    target: Database[Content],
    options: pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.ReplicateOptions,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[
      pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.ReplicationResultComplete[Content]
    ]
  ): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Replication[Content] = js.native
  def replicate[Content](source: Database[Content], target: java.lang.String): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Replication[Content] = js.native
  def replicate[Content](
    source: Database[Content],
    target: java.lang.String,
    options: pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.ReplicateOptions
  ): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Replication[Content] = js.native
  def replicate[Content](
    source: Database[Content],
    target: java.lang.String,
    options: pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.ReplicateOptions,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[
      pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.ReplicationResultComplete[Content]
    ]
  ): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Replication[Content] = js.native
  def replicate[Content](source: Database[Content], target: Database[Content]): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Replication[Content] = js.native
  def replicate[Content](
    source: Database[Content],
    target: Database[Content],
    options: pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.ReplicateOptions
  ): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Replication[Content] = js.native
  def replicate[Content](
    source: Database[Content],
    target: Database[Content],
    options: pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.ReplicateOptions,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[
      pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.ReplicationResultComplete[Content]
    ]
  ): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Replication[Content] = js.native
  /**
    * Sync data from src to target and target to src. This is a convenience method for bidirectional data replication.
    *
    * In other words, this code:
    * `PouchDB.replicate('mydb', 'http://localhost:5984/mydb')`;
    * `PouchDB.replicate('http://localhost:5984/mydb', 'mydb')`;
    * is equivalent to this code:
    * `PouchDB.sync('mydb', 'http://localhost:5984/mydb')`;
    */
  def sync[Content](source: java.lang.String, target: java.lang.String): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Sync[Content] = js.native
  def sync[Content](
    source: java.lang.String,
    target: java.lang.String,
    options: pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.SyncOptions
  ): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Sync[Content] = js.native
  def sync[Content](
    source: java.lang.String,
    target: java.lang.String,
    options: pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.SyncOptions,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.SyncResultComplete[Content]]
  ): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Sync[Content] = js.native
  def sync[Content](source: java.lang.String, target: Database[Content]): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Sync[Content] = js.native
  def sync[Content](
    source: java.lang.String,
    target: Database[Content],
    options: pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.SyncOptions
  ): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Sync[Content] = js.native
  def sync[Content](
    source: java.lang.String,
    target: Database[Content],
    options: pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.SyncOptions,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.SyncResultComplete[Content]]
  ): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Sync[Content] = js.native
  def sync[Content](source: Database[Content], target: java.lang.String): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Sync[Content] = js.native
  def sync[Content](
    source: Database[Content],
    target: java.lang.String,
    options: pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.SyncOptions
  ): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Sync[Content] = js.native
  def sync[Content](
    source: Database[Content],
    target: java.lang.String,
    options: pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.SyncOptions,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.SyncResultComplete[Content]]
  ): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Sync[Content] = js.native
  def sync[Content](source: Database[Content], target: Database[Content]): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Sync[Content] = js.native
  def sync[Content](
    source: Database[Content],
    target: Database[Content],
    options: pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.SyncOptions
  ): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Sync[Content] = js.native
  def sync[Content](
    source: Database[Content],
    target: Database[Content],
    options: pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.SyncOptions,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.SyncResultComplete[Content]]
  ): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Sync[Content] = js.native
}

