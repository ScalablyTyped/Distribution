package typings
package nanoLib.nanoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseScope extends js.Object {
  // http://docs.couchdb.org/en/latest/api/database/changes.html#get--db-_changes
  def changes(name: java.lang.String): js.Promise[DatabaseChangesResponse] = js.native
  def changes(name: java.lang.String, callback: Callback[DatabaseChangesResponse]): js.Promise[DatabaseChangesResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/database/compact.html#post--db-_compact
  def changes(name: java.lang.String, params: DatabaseChangesParams): js.Promise[DatabaseChangesResponse] = js.native
  def changes(name: java.lang.String, params: DatabaseChangesParams, callback: Callback[DatabaseChangesResponse]): js.Promise[DatabaseChangesResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/database/changes.html#get--db-_changes
  def changesAsStream(name: java.lang.String): requestLib.requestMod.Request = js.native
  // http://docs.couchdb.org/en/latest/api/database/compact.html#post--db-_compact
  def changesAsStream(name: java.lang.String, params: DatabaseChangesParams): requestLib.requestMod.Request = js.native
  def compact(name: java.lang.String): js.Promise[OkResponse] = js.native
  def compact(name: java.lang.String, callback: Callback[OkResponse]): js.Promise[OkResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/database/compact.html#post--db-_compact
  def compact(name: java.lang.String, designname: java.lang.String): js.Promise[OkResponse] = js.native
  def compact(name: java.lang.String, designname: java.lang.String, callback: Callback[OkResponse]): js.Promise[OkResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/database/common.html#put--db
  def create(name: java.lang.String): js.Promise[DatabaseCreateResponse] = js.native
  def create(name: java.lang.String, params: DatabaseCreateParams): js.Promise[DatabaseCreateResponse] = js.native
  def create(name: java.lang.String, params: DatabaseCreateParams, callback: Callback[DatabaseCreateResponse]): js.Promise[DatabaseCreateResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/database/common.html#delete--db
  def destroy(name: java.lang.String): js.Promise[OkResponse] = js.native
  def destroy(name: java.lang.String, callback: Callback[OkResponse]): js.Promise[OkResponse] = js.native
  def follow(source: java.lang.String): nodeLib.eventsMod.EventEmitter = js.native
  def follow(source: java.lang.String, callback: Callback[_]): nodeLib.eventsMod.EventEmitter = js.native
  def follow(source: java.lang.String, params: DatabaseScopeFollowUpdatesParams): nodeLib.eventsMod.EventEmitter = js.native
  def follow(source: java.lang.String, params: DatabaseScopeFollowUpdatesParams, callback: Callback[_]): nodeLib.eventsMod.EventEmitter = js.native
  def followUpdates(): nodeLib.eventsMod.EventEmitter = js.native
  def followUpdates(params: js.Any): nodeLib.eventsMod.EventEmitter = js.native
  def followUpdates(params: js.Any, callback: Callback[_]): nodeLib.eventsMod.EventEmitter = js.native
  // http://docs.couchdb.org/en/latest/api/database/common.html#get--db
  def get(name: java.lang.String): js.Promise[DatabaseGetResponse] = js.native
  def get(name: java.lang.String, callback: Callback[DatabaseGetResponse]): js.Promise[DatabaseGetResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/server/common.html#get--_all_dbs
  def list(): js.Promise[js.Array[java.lang.String]] = js.native
  def list(callback: Callback[js.Array[java.lang.String]]): js.Promise[js.Array[java.lang.String]] = js.native
  def listAsStream(): requestLib.requestMod.Request = js.native
  // http://docs.couchdb.org/en/latest/api/server/common.html#post--_replicate
  def replicate[D](source: java.lang.String, target: java.lang.String): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate[D](source: java.lang.String, target: java.lang.String, callback: Callback[DatabaseReplicateResponse]): js.Promise[DatabaseReplicateResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/server/common.html#post--_replicate
  def replicate[D](source: java.lang.String, target: java.lang.String, options: DatabaseReplicateOptions): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate[D](
    source: java.lang.String,
    target: java.lang.String,
    options: DatabaseReplicateOptions,
    callback: Callback[DatabaseReplicateResponse]
  ): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate[D](source: java.lang.String, target: DocumentScope[D]): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate[D](source: java.lang.String, target: DocumentScope[D], callback: Callback[DatabaseReplicateResponse]): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate[D](source: java.lang.String, target: DocumentScope[D], options: DatabaseReplicateOptions): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate[D](
    source: java.lang.String,
    target: DocumentScope[D],
    options: DatabaseReplicateOptions,
    callback: Callback[DatabaseReplicateResponse]
  ): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate[D](source: DocumentScope[D], target: java.lang.String): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate[D](source: DocumentScope[D], target: java.lang.String, callback: Callback[DatabaseReplicateResponse]): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate[D](source: DocumentScope[D], target: java.lang.String, options: DatabaseReplicateOptions): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate[D](
    source: DocumentScope[D],
    target: java.lang.String,
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
  // http://docs.couchdb.org/en/latest/api/server/common.html#get--_db_updates
  def updates(): js.Promise[DatabaseUpdatesResponse] = js.native
  def updates(callback: Callback[DatabaseUpdatesResponse]): js.Promise[DatabaseUpdatesResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/server/common.html#get--_db_updates
  def updates(params: UpdatesParams): js.Promise[DatabaseUpdatesResponse] = js.native
  def updates(params: UpdatesParams, callback: Callback[DatabaseUpdatesResponse]): js.Promise[DatabaseUpdatesResponse] = js.native
  def use[D](db: java.lang.String): DocumentScope[D] = js.native
}

