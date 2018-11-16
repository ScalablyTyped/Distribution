package typings
package pouchdbDashReplicationLib.PouchDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database[Content /* <: js.Object */] extends js.Object {
  var replicate: pouchdbDashReplicationLib.Anon_From = js.native
  /**
           * Sync data from src to target and target to src. This is a convenience method for bidirectional data replication.
           *
           * In other words, this code:
           * `PouchDB.replicate('mydb', 'http://localhost:5984/mydb')`;
           * `PouchDB.replicate('http://localhost:5984/mydb', 'mydb')`;
           * is equivalent to this code:
           * `PouchDB.sync('mydb', 'http://localhost:5984/mydb')`;
           */
  def sync[Content](remote: java.lang.String): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Sync[Content] = js.native
  /**
           * Sync data from src to target and target to src. This is a convenience method for bidirectional data replication.
           *
           * In other words, this code:
           * `PouchDB.replicate('mydb', 'http://localhost:5984/mydb')`;
           * `PouchDB.replicate('http://localhost:5984/mydb', 'mydb')`;
           * is equivalent to this code:
           * `PouchDB.sync('mydb', 'http://localhost:5984/mydb')`;
           */
  def sync[Content](remote: java.lang.String, options: pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.SyncOptions): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Sync[Content] = js.native
  /**
           * Sync data from src to target and target to src. This is a convenience method for bidirectional data replication.
           *
           * In other words, this code:
           * `PouchDB.replicate('mydb', 'http://localhost:5984/mydb')`;
           * `PouchDB.replicate('http://localhost:5984/mydb', 'mydb')`;
           * is equivalent to this code:
           * `PouchDB.sync('mydb', 'http://localhost:5984/mydb')`;
           */
  def sync[Content](
    remote: java.lang.String,
    options: pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.SyncOptions,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.SyncResultComplete[Content]]
  ): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Sync[Content] = js.native
  /**
           * Sync data from src to target and target to src. This is a convenience method for bidirectional data replication.
           *
           * In other words, this code:
           * `PouchDB.replicate('mydb', 'http://localhost:5984/mydb')`;
           * `PouchDB.replicate('http://localhost:5984/mydb', 'mydb')`;
           * is equivalent to this code:
           * `PouchDB.sync('mydb', 'http://localhost:5984/mydb')`;
           */
  def sync[Content](remote: Database[Content]): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Sync[Content] = js.native
  /**
           * Sync data from src to target and target to src. This is a convenience method for bidirectional data replication.
           *
           * In other words, this code:
           * `PouchDB.replicate('mydb', 'http://localhost:5984/mydb')`;
           * `PouchDB.replicate('http://localhost:5984/mydb', 'mydb')`;
           * is equivalent to this code:
           * `PouchDB.sync('mydb', 'http://localhost:5984/mydb')`;
           */
  def sync[Content](remote: Database[Content], options: pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.SyncOptions): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Sync[Content] = js.native
  /**
           * Sync data from src to target and target to src. This is a convenience method for bidirectional data replication.
           *
           * In other words, this code:
           * `PouchDB.replicate('mydb', 'http://localhost:5984/mydb')`;
           * `PouchDB.replicate('http://localhost:5984/mydb', 'mydb')`;
           * is equivalent to this code:
           * `PouchDB.sync('mydb', 'http://localhost:5984/mydb')`;
           */
  def sync[Content](
    remote: Database[Content],
    options: pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.SyncOptions,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.SyncResultComplete[Content]]
  ): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Sync[Content] = js.native
}

