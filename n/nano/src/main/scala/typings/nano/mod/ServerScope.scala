package typings.nano.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerScope extends js.Object {
  val config: ServerConfig = js.native
  var db: DatabaseScope = js.native
  var dinosaur: js.Promise[_] = js.native
  var relax: js.Promise[_] = js.native
  var request: js.Promise[_] = js.native
  // http://docs.couchdb.org/en/latest/api/server/authn.html#cookie-authentication
  def auth(username: String, userpass: String): js.Promise[DatabaseAuthResponse] = js.native
  def auth(username: String, userpass: String, callback: Callback[DatabaseAuthResponse]): js.Promise[DatabaseAuthResponse] = js.native
  def followUpdates(): EventEmitter = js.native
  def followUpdates(callback: Callback[_]): EventEmitter = js.native
  def followUpdates(params: js.Any): EventEmitter = js.native
  def followUpdates(params: js.Any, callback: Callback[_]): EventEmitter = js.native
  def scope[D](db: String): DocumentScope[D] = js.native
  // http://docs.couchdb.org/en/latest/api/server/authn.html#get--_session
  def session(): js.Promise[DatabaseSessionResponse] = js.native
  def session(callback: Callback[DatabaseSessionResponse]): js.Promise[DatabaseSessionResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/server/common.html#get--_db_updates
  def updates(): js.Promise[DatabaseUpdatesResponse] = js.native
  def updates(callback: Callback[DatabaseUpdatesResponse]): js.Promise[DatabaseUpdatesResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/server/common.html#get--_db_updates
  def updates(params: UpdatesParams): js.Promise[DatabaseUpdatesResponse] = js.native
  def updates(params: UpdatesParams, callback: Callback[DatabaseUpdatesResponse]): js.Promise[DatabaseUpdatesResponse] = js.native
  def use[D](db: String): DocumentScope[D] = js.native
  def uuids(num: Double): js.Promise[UUIDObject] = js.native
  def uuids(num: Double, callback: Callback[_]): js.Promise[UUIDObject] = js.native
}

