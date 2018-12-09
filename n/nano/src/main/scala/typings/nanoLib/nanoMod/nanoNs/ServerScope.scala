package typings
package nanoLib.nanoMod.nanoNs

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
  def auth(username: java.lang.String, userpass: java.lang.String): js.Promise[DatabaseAuthResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/server/authn.html#cookie-authentication
  def auth(username: java.lang.String, userpass: java.lang.String, callback: Callback[DatabaseAuthResponse]): js.Promise[DatabaseAuthResponse] = js.native
  def followUpdates(): nodeLib.eventsMod.EventEmitter = js.native
  def followUpdates(callback: Callback[_]): nodeLib.eventsMod.EventEmitter = js.native
  def followUpdates(params: js.Any): nodeLib.eventsMod.EventEmitter = js.native
  def followUpdates(params: js.Any, callback: Callback[_]): nodeLib.eventsMod.EventEmitter = js.native
  def scope[D](db: java.lang.String): DocumentScope[D] = js.native
  // http://docs.couchdb.org/en/latest/api/server/authn.html#get--_session
  def session(): js.Promise[DatabaseSessionResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/server/authn.html#get--_session
  def session(callback: Callback[DatabaseSessionResponse]): js.Promise[DatabaseSessionResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/server/common.html#get--_db_updates
  def updates(): js.Promise[DatabaseUpdatesResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/server/common.html#get--_db_updates
  def updates(callback: Callback[DatabaseUpdatesResponse]): js.Promise[DatabaseUpdatesResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/server/common.html#get--_db_updates
  def updates(params: UpdatesParams): js.Promise[DatabaseUpdatesResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/server/common.html#get--_db_updates
  def updates(params: UpdatesParams, callback: Callback[DatabaseUpdatesResponse]): js.Promise[DatabaseUpdatesResponse] = js.native
  def use[D](db: java.lang.String): DocumentScope[D] = js.native
  def uuids(num: scala.Double): js.Promise[UUIDObject] = js.native
  def uuids(num: scala.Double, callback: Callback[_]): js.Promise[UUIDObject] = js.native
}

