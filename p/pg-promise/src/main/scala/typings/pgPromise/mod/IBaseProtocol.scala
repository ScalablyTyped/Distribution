package typings.pgPromise.mod

import typings.node.NodeJS.ReadableStream
import typings.pgPromise.anon.Cnd
import typings.pgPromise.anon.Duration
import typings.pgPromise.anon.Mode
import typings.pgPromise.anon.Reusable
import typings.pgPromise.anon.Tag
import typings.pgPromise.typescriptPgSubsetMod.IResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Base database protocol
// API: http://vitaly-t.github.io/pg-promise/Database.html
@js.native
trait IBaseProtocol[Ext] extends StObject {
  
  // API: http://vitaly-t.github.io/pg-promise/Database.html#any
  def any[T](query: QueryParam): js.Promise[js.Array[T]] = js.native
  def any[T](query: QueryParam, values: Any): js.Promise[js.Array[T]] = js.native
  
  // API: http://vitaly-t.github.io/pg-promise/Database.html#each
  def each[T](
    query: QueryParam,
    values: Any,
    cb: js.Function3[/* row */ Any, /* index */ Double, /* data */ js.Array[Any], Unit]
  ): js.Promise[js.Array[T]] = js.native
  def each[T](
    query: QueryParam,
    values: Any,
    cb: js.Function3[/* row */ Any, /* index */ Double, /* data */ js.Array[Any], Unit],
    thisArg: Any
  ): js.Promise[js.Array[T]] = js.native
  
  // API: http://vitaly-t.github.io/pg-promise/Database.html#func
  def func[T](funcName: String): js.Promise[T] = js.native
  def func[T](funcName: String, values: Any): js.Promise[T] = js.native
  def func[T](funcName: String, values: Any, qrm: queryResult): js.Promise[T] = js.native
  def func[T](funcName: String, values: Unit, qrm: queryResult): js.Promise[T] = js.native
  
  // API: http://vitaly-t.github.io/pg-promise/Database.html#many
  def many[T](query: QueryParam): js.Promise[js.Array[T]] = js.native
  def many[T](query: QueryParam, values: Any): js.Promise[js.Array[T]] = js.native
  
  // API: http://vitaly-t.github.io/pg-promise/Database.html#manyOrNone
  def manyOrNone[T](query: QueryParam): js.Promise[js.Array[T]] = js.native
  def manyOrNone[T](query: QueryParam, values: Any): js.Promise[js.Array[T]] = js.native
  
  // API: http://vitaly-t.github.io/pg-promise/Database.html#map
  def map[T](
    query: QueryParam,
    values: Any,
    cb: js.Function3[/* row */ Any, /* index */ Double, /* data */ js.Array[Any], T]
  ): js.Promise[js.Array[T]] = js.native
  def map[T](
    query: QueryParam,
    values: Any,
    cb: js.Function3[/* row */ Any, /* index */ Double, /* data */ js.Array[Any], T],
    thisArg: Any
  ): js.Promise[js.Array[T]] = js.native
  
  // API: http://vitaly-t.github.io/pg-promise/Database.html#multi
  def multi[T](query: QueryParam): js.Promise[js.Array[js.Array[T]]] = js.native
  def multi[T](query: QueryParam, values: Any): js.Promise[js.Array[js.Array[T]]] = js.native
  
  // API: http://vitaly-t.github.io/pg-promise/Database.html#multiResult
  def multiResult(query: QueryParam): js.Promise[js.Array[IResult[Any]]] = js.native
  def multiResult(query: QueryParam, values: Any): js.Promise[js.Array[IResult[Any]]] = js.native
  
  // result-specific methods;
  // API: http://vitaly-t.github.io/pg-promise/Database.html#none
  def none(query: QueryParam): js.Promise[Null] = js.native
  def none(query: QueryParam, values: Any): js.Promise[Null] = js.native
  
  // API: http://vitaly-t.github.io/pg-promise/Database.html#one
  def one[T](query: QueryParam): js.Promise[T] = js.native
  def one[T](query: QueryParam, values: Any): js.Promise[T] = js.native
  def one[T](query: QueryParam, values: Any, cb: js.Function1[/* value */ Any, T]): js.Promise[T] = js.native
  def one[T](query: QueryParam, values: Any, cb: js.Function1[/* value */ Any, T], thisArg: Any): js.Promise[T] = js.native
  def one[T](query: QueryParam, values: Any, cb: Unit, thisArg: Any): js.Promise[T] = js.native
  def one[T](query: QueryParam, values: Unit, cb: js.Function1[/* value */ Any, T]): js.Promise[T] = js.native
  def one[T](query: QueryParam, values: Unit, cb: js.Function1[/* value */ Any, T], thisArg: Any): js.Promise[T] = js.native
  def one[T](query: QueryParam, values: Unit, cb: Unit, thisArg: Any): js.Promise[T] = js.native
  
  // API: http://vitaly-t.github.io/pg-promise/Database.html#oneOrNone
  def oneOrNone[T](query: QueryParam): js.Promise[T | Null] = js.native
  def oneOrNone[T](query: QueryParam, values: Any): js.Promise[T | Null] = js.native
  def oneOrNone[T](query: QueryParam, values: Any, cb: js.Function1[/* value */ Any, T]): js.Promise[T | Null] = js.native
  def oneOrNone[T](query: QueryParam, values: Any, cb: js.Function1[/* value */ Any, T], thisArg: Any): js.Promise[T | Null] = js.native
  def oneOrNone[T](query: QueryParam, values: Any, cb: Unit, thisArg: Any): js.Promise[T | Null] = js.native
  def oneOrNone[T](query: QueryParam, values: Unit, cb: js.Function1[/* value */ Any, T]): js.Promise[T | Null] = js.native
  def oneOrNone[T](query: QueryParam, values: Unit, cb: js.Function1[/* value */ Any, T], thisArg: Any): js.Promise[T | Null] = js.native
  def oneOrNone[T](query: QueryParam, values: Unit, cb: Unit, thisArg: Any): js.Promise[T | Null] = js.native
  
  // API: http://vitaly-t.github.io/pg-promise/Database.html#proc
  def proc[T](procName: String): js.Promise[T | Null] = js.native
  def proc[T](procName: String, values: Any): js.Promise[T | Null] = js.native
  def proc[T](procName: String, values: Any, cb: js.Function1[/* value */ Any, T]): js.Promise[T | Null] = js.native
  def proc[T](procName: String, values: Any, cb: js.Function1[/* value */ Any, T], thisArg: Any): js.Promise[T | Null] = js.native
  def proc[T](procName: String, values: Any, cb: Unit, thisArg: Any): js.Promise[T | Null] = js.native
  def proc[T](procName: String, values: Unit, cb: js.Function1[/* value */ Any, T]): js.Promise[T | Null] = js.native
  def proc[T](procName: String, values: Unit, cb: js.Function1[/* value */ Any, T], thisArg: Any): js.Promise[T | Null] = js.native
  def proc[T](procName: String, values: Unit, cb: Unit, thisArg: Any): js.Promise[T | Null] = js.native
  
  // API: http://vitaly-t.github.io/pg-promise/Database.html#query
  def query[T](query: QueryParam): js.Promise[T] = js.native
  def query[T](query: QueryParam, values: Any): js.Promise[T] = js.native
  def query[T](query: QueryParam, values: Any, qrm: queryResult): js.Promise[T] = js.native
  def query[T](query: QueryParam, values: Unit, qrm: queryResult): js.Promise[T] = js.native
  
  // API: http://vitaly-t.github.io/pg-promise/Database.html#result
  def result[T](query: QueryParam): js.Promise[T] = js.native
  def result[T](query: QueryParam, values: Any): js.Promise[T] = js.native
  def result[T](query: QueryParam, values: Any, cb: js.Function1[/* value */ IResultExt[Any], T]): js.Promise[T] = js.native
  def result[T](query: QueryParam, values: Any, cb: js.Function1[/* value */ IResultExt[Any], T], thisArg: Any): js.Promise[T] = js.native
  def result[T](query: QueryParam, values: Any, cb: Unit, thisArg: Any): js.Promise[T] = js.native
  def result[T](query: QueryParam, values: Unit, cb: js.Function1[/* value */ IResultExt[Any], T]): js.Promise[T] = js.native
  def result[T](query: QueryParam, values: Unit, cb: js.Function1[/* value */ IResultExt[Any], T], thisArg: Any): js.Promise[T] = js.native
  def result[T](query: QueryParam, values: Unit, cb: Unit, thisArg: Any): js.Promise[T] = js.native
  
  // API: http://vitaly-t.github.io/pg-promise/Database.html#stream
  def stream(qs: ReadableStream, init: js.Function1[/* stream */ ReadableStream, Unit]): js.Promise[Duration] = js.native
  
  // Tasks;
  // API: http://vitaly-t.github.io/pg-promise/Database.html#task
  def task[T](cb: js.Function1[/* t */ ITask[Ext] & Ext, T | js.Promise[T]]): js.Promise[T] = js.native
  def task[T](options: Tag, cb: js.Function1[/* t */ ITask[Ext] & Ext, T | js.Promise[T]]): js.Promise[T] = js.native
  def task[T](tag: String, cb: js.Function1[/* t */ ITask[Ext] & Ext, T | js.Promise[T]]): js.Promise[T] = js.native
  def task[T](tag: Double, cb: js.Function1[/* t */ ITask[Ext] & Ext, T | js.Promise[T]]): js.Promise[T] = js.native
  
  // Conditional Tasks;
  // API: http://vitaly-t.github.io/pg-promise/Database.html#taskIf
  def taskIf[T](cb: js.Function1[/* t */ ITask[Ext] & Ext, T | js.Promise[T]]): js.Promise[T] = js.native
  def taskIf[T](options: Cnd[Ext], cb: js.Function1[/* t */ ITask[Ext] & Ext, T | js.Promise[T]]): js.Promise[T] = js.native
  def taskIf[T](tag: String, cb: js.Function1[/* t */ ITask[Ext] & Ext, T | js.Promise[T]]): js.Promise[T] = js.native
  def taskIf[T](tag: Double, cb: js.Function1[/* t */ ITask[Ext] & Ext, T | js.Promise[T]]): js.Promise[T] = js.native
  
  // Transactions;
  // API: http://vitaly-t.github.io/pg-promise/Database.html#tx
  def tx[T](cb: js.Function1[/* t */ ITask[Ext] & Ext, T | js.Promise[T]]): js.Promise[T] = js.native
  def tx[T](options: Mode, cb: js.Function1[/* t */ ITask[Ext] & Ext, T | js.Promise[T]]): js.Promise[T] = js.native
  def tx[T](tag: String, cb: js.Function1[/* t */ ITask[Ext] & Ext, T | js.Promise[T]]): js.Promise[T] = js.native
  def tx[T](tag: Double, cb: js.Function1[/* t */ ITask[Ext] & Ext, T | js.Promise[T]]): js.Promise[T] = js.native
  
  // Conditional Transactions;
  // API: http://vitaly-t.github.io/pg-promise/Database.html#txIf
  def txIf[T](cb: js.Function1[/* t */ ITask[Ext] & Ext, T | js.Promise[T]]): js.Promise[T] = js.native
  def txIf[T](options: Reusable[Ext], cb: js.Function1[/* t */ ITask[Ext] & Ext, T | js.Promise[T]]): js.Promise[T] = js.native
  def txIf[T](tag: String, cb: js.Function1[/* t */ ITask[Ext] & Ext, T | js.Promise[T]]): js.Promise[T] = js.native
  def txIf[T](tag: Double, cb: js.Function1[/* t */ ITask[Ext] & Ext, T | js.Promise[T]]): js.Promise[T] = js.native
}
