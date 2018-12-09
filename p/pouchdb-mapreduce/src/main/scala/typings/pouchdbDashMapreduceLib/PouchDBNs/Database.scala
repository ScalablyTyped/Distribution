package typings
package pouchdbDashMapreduceLib.PouchDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database[Content /* <: js.Object */] extends js.Object {
  /**
           * Invoke a map/reduce function, which allows you to perform more complex queries
           * on PouchDB than what you get with allDocs().
           */
  def query[Result, Model](fun: java.lang.String): js.Promise[pouchdbDashMapreduceLib.PouchDBNs.QueryNs.Response[Result]] = js.native
  /**
           * Invoke a map/reduce function, which allows you to perform more complex queries
           * on PouchDB than what you get with allDocs().
           */
  def query[Result, Model](
    fun: java.lang.String,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[pouchdbDashMapreduceLib.PouchDBNs.QueryNs.Response[Result]]
  ): scala.Unit = js.native
  /**
           * Invoke a map/reduce function, which allows you to perform more complex queries
           * on PouchDB than what you get with allDocs().
           */
  def query[Result, Model](fun: java.lang.String, opts: pouchdbDashMapreduceLib.PouchDBNs.QueryNs.Options[Model, Result]): js.Promise[pouchdbDashMapreduceLib.PouchDBNs.QueryNs.Response[Result]] = js.native
  /**
           * Invoke a map/reduce function, which allows you to perform more complex queries
           * on PouchDB than what you get with allDocs().
           */
  def query[Result, Model](
    fun: java.lang.String,
    opts: pouchdbDashMapreduceLib.PouchDBNs.QueryNs.Options[Model, Result],
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[pouchdbDashMapreduceLib.PouchDBNs.QueryNs.Response[Result]]
  ): scala.Unit = js.native
  /**
           * Invoke a map/reduce function, which allows you to perform more complex queries
           * on PouchDB than what you get with allDocs().
           */
  def query[Result, Model](fun: Filter[Model, Result]): js.Promise[pouchdbDashMapreduceLib.PouchDBNs.QueryNs.Response[Result]] = js.native
  /**
           * Invoke a map/reduce function, which allows you to perform more complex queries
           * on PouchDB than what you get with allDocs().
           */
  def query[Result, Model](
    fun: Filter[Model, Result],
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[pouchdbDashMapreduceLib.PouchDBNs.QueryNs.Response[Result]]
  ): scala.Unit = js.native
  /**
           * Invoke a map/reduce function, which allows you to perform more complex queries
           * on PouchDB than what you get with allDocs().
           */
  def query[Result, Model](fun: Filter[Model, Result], opts: pouchdbDashMapreduceLib.PouchDBNs.QueryNs.Options[Model, Result]): js.Promise[pouchdbDashMapreduceLib.PouchDBNs.QueryNs.Response[Result]] = js.native
  /**
           * Invoke a map/reduce function, which allows you to perform more complex queries
           * on PouchDB than what you get with allDocs().
           */
  def query[Result, Model](
    fun: Filter[Model, Result],
    opts: pouchdbDashMapreduceLib.PouchDBNs.QueryNs.Options[Model, Result],
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[pouchdbDashMapreduceLib.PouchDBNs.QueryNs.Response[Result]]
  ): scala.Unit = js.native
  /**
           * Invoke a map/reduce function, which allows you to perform more complex queries
           * on PouchDB than what you get with allDocs().
           */
  def query[Result, Model](fun: Map[Model, Result]): js.Promise[pouchdbDashMapreduceLib.PouchDBNs.QueryNs.Response[Result]] = js.native
  /**
           * Invoke a map/reduce function, which allows you to perform more complex queries
           * on PouchDB than what you get with allDocs().
           */
  def query[Result, Model](
    fun: Map[Model, Result],
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[pouchdbDashMapreduceLib.PouchDBNs.QueryNs.Response[Result]]
  ): scala.Unit = js.native
  /**
           * Invoke a map/reduce function, which allows you to perform more complex queries
           * on PouchDB than what you get with allDocs().
           */
  def query[Result, Model](fun: Map[Model, Result], opts: pouchdbDashMapreduceLib.PouchDBNs.QueryNs.Options[Model, Result]): js.Promise[pouchdbDashMapreduceLib.PouchDBNs.QueryNs.Response[Result]] = js.native
  /**
           * Invoke a map/reduce function, which allows you to perform more complex queries
           * on PouchDB than what you get with allDocs().
           */
  def query[Result, Model](
    fun: Map[Model, Result],
    opts: pouchdbDashMapreduceLib.PouchDBNs.QueryNs.Options[Model, Result],
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[pouchdbDashMapreduceLib.PouchDBNs.QueryNs.Response[Result]]
  ): scala.Unit = js.native
  /**
           * Cleans up any stale map/reduce indexes.
           *
           * As design docs are deleted or modified, their associated index
           * files(in CouchDB) or companion databases (in local PouchDBs) continue
           * to take up space on disk. viewCleanup() removes these unnecessary
           * index files.
           */
  def viewCleanup(): js.Promise[pouchdbDashCoreLib.PouchDBNs.CoreNs.BasicResponse] = js.native
  /**
           * Cleans up any stale map/reduce indexes.
           *
           * As design docs are deleted or modified, their associated index
           * files(in CouchDB) or companion databases (in local PouchDBs) continue
           * to take up space on disk. viewCleanup() removes these unnecessary
           * index files.
           */
  def viewCleanup(
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[pouchdbDashCoreLib.PouchDBNs.CoreNs.BasicResponse]
  ): scala.Unit = js.native
}

