package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerScope extends js.Object {
  val config: ServerConfig = js.native
  var db: DatabaseScope = js.native
  var dinosaur: stdLib.Promise[_] = js.native
  var relax: stdLib.Promise[_] = js.native
  var request: stdLib.Promise[_] = js.native
  // http://docs.couchdb.org/en/latest/api/server/authn.html#cookie-authentication
  def auth(username: java.lang.String, userpass: java.lang.String): stdLib.Promise[DatabaseAuthResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/server/authn.html#cookie-authentication
  def auth(username: java.lang.String, userpass: java.lang.String, callback: Callback[DatabaseAuthResponse]): stdLib.Promise[DatabaseAuthResponse] = js.native
  def followUpdates(): eventsLib.eventsMod.EventEmitter = js.native
  def followUpdates(callback: Callback[_]): eventsLib.eventsMod.EventEmitter = js.native
  def followUpdates(params: js.Any): eventsLib.eventsMod.EventEmitter = js.native
  def followUpdates(params: js.Any, callback: Callback[_]): eventsLib.eventsMod.EventEmitter = js.native
  def scope[D](db: java.lang.String): DocumentScope[D] = js.native
  // http://docs.couchdb.org/en/latest/api/server/authn.html#get--_session
  def session(): stdLib.Promise[DatabaseSessionResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/server/authn.html#get--_session
  def session(callback: Callback[DatabaseSessionResponse]): stdLib.Promise[DatabaseSessionResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/server/common.html#get--_db_updates
  def updates(): stdLib.Promise[DatabaseUpdatesResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/server/common.html#get--_db_updates
  def updates(callback: Callback[DatabaseUpdatesResponse]): stdLib.Promise[DatabaseUpdatesResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/server/common.html#get--_db_updates
  def updates(params: UpdatesParams): stdLib.Promise[DatabaseUpdatesResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/server/common.html#get--_db_updates
  def updates(params: UpdatesParams, callback: Callback[DatabaseUpdatesResponse]): stdLib.Promise[DatabaseUpdatesResponse] = js.native
  def use[D](db: java.lang.String): DocumentScope[D] = js.native
  def uuids(num: scala.Double): stdLib.Promise[UUIDObject] = js.native
  def uuids(num: scala.Double, callback: Callback[_]): stdLib.Promise[UUIDObject] = js.native
}

