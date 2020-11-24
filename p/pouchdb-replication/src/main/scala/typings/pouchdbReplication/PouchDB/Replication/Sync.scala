package typings.pouchdbReplication.PouchDB.Replication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sync[Content /* <: js.Object */]
  extends js.Promise[SyncResultComplete[Content]]
     with ReplicationEventEmitter[Content, SyncResult[Content], SyncResultComplete[Content]]
