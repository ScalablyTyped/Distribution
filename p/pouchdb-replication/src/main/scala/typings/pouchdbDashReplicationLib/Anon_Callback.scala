package typings
package pouchdbDashReplicationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Callback extends js.Object {
  /**
    * Replicate data from `source`. Both the source and target can be a PouchDB instance
    * or a string representing a CouchDB database URL or the name of a local PouchDB database.
    * If options.live is true, then this will track future changes and also replicate them automatically.
    * This method returns an object with the method cancel(), which you call if you want to cancel live replication.
    */
  def from[Content](source: java.lang.String): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Replication[Content] = js.native
  def from[Content](
    source: java.lang.String,
    options: pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.ReplicateOptions
  ): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Replication[Content] = js.native
  def from[Content](
    source: java.lang.String,
    options: pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.ReplicateOptions,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[
      pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.ReplicationResultComplete[Content]
    ]
  ): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Replication[Content] = js.native
  def from[Content](source: pouchdbDashReplicationLib.PouchDBNs.Database[Content]): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Replication[Content] = js.native
  def from[Content](
    source: pouchdbDashReplicationLib.PouchDBNs.Database[Content],
    options: pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.ReplicateOptions
  ): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Replication[Content] = js.native
  def from[Content](
    source: pouchdbDashReplicationLib.PouchDBNs.Database[Content],
    options: pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.ReplicateOptions,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[
      pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.ReplicationResultComplete[Content]
    ]
  ): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Replication[Content] = js.native
  /**
    * Replicate data to `target`. Both the source and target can be a PouchDB instance
    * or a string representing a CouchDB database URL or the name of a local PouchDB database.
    * If options.live is true, then this will track future changes and also replicate them automatically.
    * This method returns an object with the method cancel(), which you call if you want to cancel live replication.
    */
  def to[Content](target: java.lang.String): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Replication[Content] = js.native
  def to[Content](
    target: java.lang.String,
    options: pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.ReplicateOptions
  ): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Replication[Content] = js.native
  def to[Content](
    target: java.lang.String,
    options: pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.ReplicateOptions,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[
      pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.ReplicationResultComplete[Content]
    ]
  ): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Replication[Content] = js.native
  def to[Content](target: pouchdbDashReplicationLib.PouchDBNs.Database[Content]): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Replication[Content] = js.native
  def to[Content](
    target: pouchdbDashReplicationLib.PouchDBNs.Database[Content],
    options: pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.ReplicateOptions
  ): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Replication[Content] = js.native
  def to[Content](
    target: pouchdbDashReplicationLib.PouchDBNs.Database[Content],
    options: pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.ReplicateOptions,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[
      pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.ReplicationResultComplete[Content]
    ]
  ): pouchdbDashReplicationLib.PouchDBNs.ReplicationNs.Replication[Content] = js.native
}

