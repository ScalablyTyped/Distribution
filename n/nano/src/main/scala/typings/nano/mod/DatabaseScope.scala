package typings.nano.mod

import typings.nano.anon.Disable
import typings.node.processMod.global.NodeJS.ReadStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabaseScope extends StObject {
  
  // http://docs.couchdb.org/en/latest/api/database/changes.html#get--db-_changes
  def changes(name: String): js.Promise[DatabaseChangesResponse] = js.native
  def changes(name: String, callback: Callback[DatabaseChangesResponse]): js.Promise[DatabaseChangesResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/database/compact.html#post--db-_compact
  def changes(name: String, params: DatabaseChangesParams): js.Promise[DatabaseChangesResponse] = js.native
  def changes(name: String, params: DatabaseChangesParams, callback: Callback[DatabaseChangesResponse]): js.Promise[DatabaseChangesResponse] = js.native
  
  // http://docs.couchdb.org/en/latest/api/database/changes.html#get--db-_changes
  def changesAsStream(name: String): ReadStream = js.native
  // http://docs.couchdb.org/en/latest/api/database/compact.html#post--db-_compact
  def changesAsStream(name: String, params: DatabaseChangesParams): ReadStream = js.native
  
  def compact(name: String): js.Promise[OkResponse] = js.native
  def compact(name: String, callback: Callback[OkResponse]): js.Promise[OkResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/database/compact.html#post--db-_compact
  def compact(name: String, designname: String): js.Promise[OkResponse] = js.native
  def compact(name: String, designname: String, callback: Callback[OkResponse]): js.Promise[OkResponse] = js.native
  
  // http://docs.couchdb.org/en/latest/api/database/common.html#put--db
  def create(name: String): js.Promise[DatabaseCreateResponse] = js.native
  def create(name: String, params: Unit, callback: Callback[DatabaseCreateResponse]): js.Promise[DatabaseCreateResponse] = js.native
  def create(name: String, params: DatabaseCreateParams): js.Promise[DatabaseCreateResponse] = js.native
  def create(name: String, params: DatabaseCreateParams, callback: Callback[DatabaseCreateResponse]): js.Promise[DatabaseCreateResponse] = js.native
  
  // http://docs.couchdb.org/en/latest/api/database/common.html#delete--db
  def destroy(name: String): js.Promise[OkResponse] = js.native
  def destroy(name: String, callback: Callback[OkResponse]): js.Promise[OkResponse] = js.native
  
  // http://docs.couchdb.org/en/latest/api/database/common.html#get--db
  def get(name: String): js.Promise[DatabaseGetResponse] = js.native
  def get(name: String, callback: Callback[DatabaseGetResponse]): js.Promise[DatabaseGetResponse] = js.native
  
  // http://docs.couchdb.org/en/latest/api/server/common.html#get--_all_dbs
  def list(): js.Promise[js.Array[String]] = js.native
  def list(callback: Callback[js.Array[String]]): js.Promise[js.Array[String]] = js.native
  
  def listAsStream(): ReadStream = js.native
  
  // http://docs.couchdb.org/en/latest/api/server/common.html#post--_replicate
  def replicate[D](source: String, target: String): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate[D](source: String, target: String, callback: Callback[DatabaseReplicateResponse]): js.Promise[DatabaseReplicateResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/server/common.html#post--_replicate
  def replicate[D](source: String, target: String, options: DatabaseReplicateOptions): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate[D](
    source: String,
    target: String,
    options: DatabaseReplicateOptions,
    callback: Callback[DatabaseReplicateResponse]
  ): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate[D](source: String, target: DocumentScope[D]): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate[D](source: String, target: DocumentScope[D], callback: Callback[DatabaseReplicateResponse]): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate[D](source: String, target: DocumentScope[D], options: DatabaseReplicateOptions): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate[D](
    source: String,
    target: DocumentScope[D],
    options: DatabaseReplicateOptions,
    callback: Callback[DatabaseReplicateResponse]
  ): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate[D](source: DocumentScope[D], target: String): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate[D](source: DocumentScope[D], target: String, callback: Callback[DatabaseReplicateResponse]): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate[D](source: DocumentScope[D], target: String, options: DatabaseReplicateOptions): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate[D](
    source: DocumentScope[D],
    target: String,
    options: DatabaseReplicateOptions,
    callback: Callback[DatabaseReplicateResponse]
  ): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate[D](source: DocumentScope[D], target: DocumentScope[D]): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate[D](source: DocumentScope[D], target: DocumentScope[D], callback: Callback[DatabaseReplicateResponse]): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate[D](source: DocumentScope[D], target: DocumentScope[D], options: DatabaseReplicateOptions): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate[D](
    source: DocumentScope[D],
    target: DocumentScope[D],
    options: DatabaseReplicateOptions,
    callback: Callback[DatabaseReplicateResponse]
  ): js.Promise[DatabaseReplicateResponse] = js.native
  
  var replication: Disable = js.native
  
  // http://docs.couchdb.org/en/latest/api/server/common.html#get--_db_updates
  def updates(): js.Promise[DatabaseUpdatesResponse] = js.native
  def updates(callback: Callback[DatabaseUpdatesResponse]): js.Promise[DatabaseUpdatesResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/server/common.html#get--_db_updates
  def updates(params: UpdatesParams): js.Promise[DatabaseUpdatesResponse] = js.native
  def updates(params: UpdatesParams, callback: Callback[DatabaseUpdatesResponse]): js.Promise[DatabaseUpdatesResponse] = js.native
  
  def use[D](db: String): DocumentScope[D] = js.native
}
