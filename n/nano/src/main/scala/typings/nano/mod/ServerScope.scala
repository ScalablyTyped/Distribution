package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Server scope */
@js.native
trait ServerScope extends StObject {
  
  /** 
    * Initiates new session for specified user credentials by providing Cookie value.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/server/authn.html#cookie-authentication} */
  def auth(username: String, userpass: String): js.Promise[DatabaseAuthResponse] = js.native
  def auth(username: String, userpass: String, callback: Callback[DatabaseAuthResponse]): js.Promise[DatabaseAuthResponse] = js.native
  
  /**
    * An object containing the nano configurations.
    * @see README: {@link https://www.npmjs.com/package/nano#nanoconfig}
    */
  val config: ServerConfig = js.native
  
  var db: DatabaseScope = js.native
  
  def dinosaur(opts: String): js.Promise[Any] = js.native
  def dinosaur(opts: String, callback: Callback[Any]): js.Promise[Any] = js.native
  /** 
    * Initiates a custom request
    * @see README: {@link https://www.npmjs.com/package/nano#nanorequestopts-callback}
    **/
  def dinosaur(opts: RequestOptions): js.Promise[Any] = js.native
  def dinosaur(opts: RequestOptions, callback: Callback[Any]): js.Promise[Any] = js.native
  
  /** 
    * Accessing the root of a CouchDB instance returns meta information about the instance.
    * @see Docs: {@link https://docs.couchdb.org/en/stable/api/server/common.html#api-server-root} */
  def info(): js.Promise[InfoResponse] = js.native
  def info(callback: Callback[InfoResponse]): js.Promise[InfoResponse] = js.native
  
  def relax(opts: String): js.Promise[Any] = js.native
  def relax(opts: String, callback: Callback[Any]): js.Promise[Any] = js.native
  /** 
    * Initiates a custom request
    * @see README: {@link https://www.npmjs.com/package/nano#nanorequestopts-callback}
    **/
  def relax(opts: RequestOptions): js.Promise[Any] = js.native
  def relax(opts: RequestOptions, callback: Callback[Any]): js.Promise[Any] = js.native
  
  def request(opts: String): js.Promise[Any] = js.native
  def request(opts: String, callback: Callback[Any]): js.Promise[Any] = js.native
  /** 
    * Initiates a custom request
    * @see README: {@link https://www.npmjs.com/package/nano#nanorequestopts-callback}
    **/
  def request(opts: RequestOptions): js.Promise[Any] = js.native
  def request(opts: RequestOptions, callback: Callback[Any]): js.Promise[Any] = js.native
  
  /**
    * Returns a database object that allows you to perform operations against that database.
    * @see README: {@link https://www.npmjs.com/package/nano#nanoscopename}
    */
  def scope[D](db: String): DocumentScope[D] = js.native
  
  /** 
    * Returns information about the authenticated user, including a User Context Object, the authentication method and database that were used, and a list of configured authentication handlers on the server.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/server/authn.html#get--_session} */
  def session(): js.Promise[DatabaseSessionResponse] = js.native
  def session(callback: Callback[DatabaseSessionResponse]): js.Promise[DatabaseSessionResponse] = js.native
  
  /** 
    * Returns a list of all database events in the CouchDB instance.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/server/common.html#get--_db_updates} */
  def updates(): js.Promise[DatabaseUpdatesResponse] = js.native
  def updates(callback: Callback[DatabaseUpdatesResponse]): js.Promise[DatabaseUpdatesResponse] = js.native
  /**
    * Returns a list of all database events in the CouchDB instance.
    *  @see Docs: {@link http://docs.couchdb.org/en/latest/api/server/common.html#get--_db_updates} */
  def updates(params: UpdatesParams): js.Promise[DatabaseUpdatesResponse] = js.native
  def updates(params: UpdatesParams, callback: Callback[DatabaseUpdatesResponse]): js.Promise[DatabaseUpdatesResponse] = js.native
  
  /**
    * Returns a database object that allows you to perform operations against that database.
    * @see README: {@link https://www.npmjs.com/package/nano#nanousename}
    */
  def use[D](db: String): DocumentScope[D] = js.native
  
  /**
    * Requests one or more Universally Unique Identifiers (UUIDs) from the CouchDB instance.
    * @see Docs: {@link https://docs.couchdb.org/en/stable/api/server/common.html#uuids}
    */
  def uuids(): js.Promise[UUIDObject] = js.native
  def uuids(num: Double): js.Promise[UUIDObject] = js.native
  def uuids(num: Double, callback: Callback[Any]): js.Promise[UUIDObject] = js.native
  def uuids(num: Unit, callback: Callback[Any]): js.Promise[UUIDObject] = js.native
}
