package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerScope extends js.Object {
  
  // http://docs.couchdb.org/en/latest/api/server/authn.html#cookie-authentication
  def auth(username: String, userpass: String): js.Promise[DatabaseAuthResponse] = js.native
  def auth(username: String, userpass: String, callback: Callback[DatabaseAuthResponse]): js.Promise[DatabaseAuthResponse] = js.native
  
  val config: ServerConfig = js.native
  
  var db: DatabaseScope = js.native
  
  def dinosaur(opts: String): js.Promise[_] = js.native
  def dinosaur(opts: String, callback: Callback[_]): js.Promise[_] = js.native
  def dinosaur(opts: RequestOptions): js.Promise[_] = js.native
  def dinosaur(opts: RequestOptions, callback: Callback[_]): js.Promise[_] = js.native
  
  // https://docs.couchdb.org/en/stable/api/server/common.html#api-server-root
  def info(): js.Promise[InfoResponse] = js.native
  def info(callback: Callback[InfoResponse]): js.Promise[InfoResponse] = js.native
  
  def relax(opts: String): js.Promise[_] = js.native
  def relax(opts: String, callback: Callback[_]): js.Promise[_] = js.native
  def relax(opts: RequestOptions): js.Promise[_] = js.native
  def relax(opts: RequestOptions, callback: Callback[_]): js.Promise[_] = js.native
  
  def request(opts: String): js.Promise[_] = js.native
  def request(opts: String, callback: Callback[_]): js.Promise[_] = js.native
  def request(opts: RequestOptions): js.Promise[_] = js.native
  def request(opts: RequestOptions, callback: Callback[_]): js.Promise[_] = js.native
  
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
