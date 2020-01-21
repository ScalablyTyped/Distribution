package typings.pouchdbMapreduce.PouchDB

import typings.pouchdbCore.PouchDB.Core.BasicResponse
import typings.pouchdbCore.PouchDB.Core.Callback
import typings.pouchdbMapreduce.PouchDB.Query.Options
import typings.pouchdbMapreduce.PouchDB.Query.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database[Content /* <: js.Object */] extends js.Object {
  /**
    * Invoke a map/reduce function, which allows you to perform more complex queries
    * on PouchDB than what you get with allDocs().
    */
  def query[Result, Model](fun: String): js.Promise[Response[Result]] = js.native
  /**
    * Invoke a map/reduce function, which allows you to perform more complex queries
    * on PouchDB than what you get with allDocs().
    */
  def query[Result, Model](fun: String, callback: Callback[Response[Result]]): Unit = js.native
  def query[Result, Model](fun: String, opts: Options[Model, Result]): js.Promise[Response[Result]] = js.native
  /**
    * Invoke a map/reduce function, which allows you to perform more complex queries
    * on PouchDB than what you get with allDocs().
    */
  def query[Result, Model](fun: String, opts: Options[Model, Result], callback: Callback[Response[Result]]): Unit = js.native
  def query[Result, Model](fun: Filter[Model, Result]): js.Promise[Response[Result]] = js.native
  def query[Result, Model](fun: Filter[Model, Result], callback: Callback[Response[Result]]): Unit = js.native
  def query[Result, Model](fun: Filter[Model, Result], opts: Options[Model, Result]): js.Promise[Response[Result]] = js.native
  def query[Result, Model](fun: Filter[Model, Result], opts: Options[Model, Result], callback: Callback[Response[Result]]): Unit = js.native
  def query[Result, Model](fun: Map[Model, Result]): js.Promise[Response[Result]] = js.native
  def query[Result, Model](fun: Map[Model, Result], callback: Callback[Response[Result]]): Unit = js.native
  def query[Result, Model](fun: Map[Model, Result], opts: Options[Model, Result]): js.Promise[Response[Result]] = js.native
  def query[Result, Model](fun: Map[Model, Result], opts: Options[Model, Result], callback: Callback[Response[Result]]): Unit = js.native
  /**
    * Cleans up any stale map/reduce indexes.
    *
    * As design docs are deleted or modified, their associated index
    * files(in CouchDB) or companion databases (in local PouchDBs) continue
    * to take up space on disk. viewCleanup() removes these unnecessary
    * index files.
    */
  def viewCleanup(): js.Promise[BasicResponse] = js.native
  /**
    * Cleans up any stale map/reduce indexes.
    *
    * As design docs are deleted or modified, their associated index
    * files(in CouchDB) or companion databases (in local PouchDBs) continue
    * to take up space on disk. viewCleanup() removes these unnecessary
    * index files.
    */
  def viewCleanup(callback: Callback[BasicResponse]): Unit = js.native
}

