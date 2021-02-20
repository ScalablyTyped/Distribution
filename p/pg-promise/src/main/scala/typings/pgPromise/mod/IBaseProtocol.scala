package typings.pgPromise.mod

import typings.node.NodeJS.ReadableStream
import typings.pgPromise.anon.Cnd
import typings.pgPromise.anon.Duration
import typings.pgPromise.anon.Mode
import typings.pgPromise.anon.Reusable
import typings.pgPromise.anon.Tag
import typings.pgPromise.pgSubsetMod.IResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Base database protocol
// API: http://vitaly-t.github.io/pg-promise/Database.html
@js.native
trait IBaseProtocol[Ext] extends StObject {
  
  // API: http://vitaly-t.github.io/pg-promise/Database.html#any
  def any[T](query: QueryParam): XPromise[js.Array[T]] = js.native
  def any[T](query: QueryParam, values: js.Any): XPromise[js.Array[T]] = js.native
  
  // API: http://vitaly-t.github.io/pg-promise/Database.html#each
  def each[T](
    query: QueryParam,
    values: js.Any,
    cb: js.Function3[/* row */ js.Any, /* index */ Double, /* data */ js.Array[_], Unit]
  ): XPromise[js.Array[T]] = js.native
  def each[T](
    query: QueryParam,
    values: js.Any,
    cb: js.Function3[/* row */ js.Any, /* index */ Double, /* data */ js.Array[_], Unit],
    thisArg: js.Any
  ): XPromise[js.Array[T]] = js.native
  
  // API: http://vitaly-t.github.io/pg-promise/Database.html#func
  def func[T](funcName: String): XPromise[T] = js.native
  def func[T](funcName: String, values: js.UndefOr[scala.Nothing], qrm: queryResult): XPromise[T] = js.native
  def func[T](funcName: String, values: js.Any): XPromise[T] = js.native
  def func[T](funcName: String, values: js.Any, qrm: queryResult): XPromise[T] = js.native
  
  // API: http://vitaly-t.github.io/pg-promise/Database.html#many
  def many[T](query: QueryParam): XPromise[js.Array[T]] = js.native
  def many[T](query: QueryParam, values: js.Any): XPromise[js.Array[T]] = js.native
  
  // API: http://vitaly-t.github.io/pg-promise/Database.html#manyOrNone
  def manyOrNone[T](query: QueryParam): XPromise[js.Array[T]] = js.native
  def manyOrNone[T](query: QueryParam, values: js.Any): XPromise[js.Array[T]] = js.native
  
  // API: http://vitaly-t.github.io/pg-promise/Database.html#map
  def map[T](
    query: QueryParam,
    values: js.Any,
    cb: js.Function3[/* row */ js.Any, /* index */ Double, /* data */ js.Array[_], T]
  ): XPromise[js.Array[T]] = js.native
  def map[T](
    query: QueryParam,
    values: js.Any,
    cb: js.Function3[/* row */ js.Any, /* index */ Double, /* data */ js.Array[_], T],
    thisArg: js.Any
  ): XPromise[js.Array[T]] = js.native
  
  // API: http://vitaly-t.github.io/pg-promise/Database.html#multi
  def multi[T](query: QueryParam): XPromise[js.Array[js.Array[T]]] = js.native
  def multi[T](query: QueryParam, values: js.Any): XPromise[js.Array[js.Array[T]]] = js.native
  
  // API: http://vitaly-t.github.io/pg-promise/Database.html#multiResult
  def multiResult(query: QueryParam): XPromise[js.Array[IResult]] = js.native
  def multiResult(query: QueryParam, values: js.Any): XPromise[js.Array[IResult]] = js.native
  
  // result-specific methods;
  // API: http://vitaly-t.github.io/pg-promise/Database.html#none
  def none(query: QueryParam): XPromise[Null] = js.native
  def none(query: QueryParam, values: js.Any): XPromise[Null] = js.native
  
  // API: http://vitaly-t.github.io/pg-promise/Database.html#one
  def one[T](query: QueryParam): XPromise[T] = js.native
  def one[T](
    query: QueryParam,
    values: js.UndefOr[scala.Nothing],
    cb: js.UndefOr[scala.Nothing],
    thisArg: js.Any
  ): XPromise[T] = js.native
  def one[T](query: QueryParam, values: js.UndefOr[scala.Nothing], cb: js.Function1[/* value */ js.Any, T]): XPromise[T] = js.native
  def one[T](
    query: QueryParam,
    values: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* value */ js.Any, T],
    thisArg: js.Any
  ): XPromise[T] = js.native
  def one[T](query: QueryParam, values: js.Any): XPromise[T] = js.native
  def one[T](query: QueryParam, values: js.Any, cb: js.UndefOr[scala.Nothing], thisArg: js.Any): XPromise[T] = js.native
  def one[T](query: QueryParam, values: js.Any, cb: js.Function1[/* value */ js.Any, T]): XPromise[T] = js.native
  def one[T](query: QueryParam, values: js.Any, cb: js.Function1[/* value */ js.Any, T], thisArg: js.Any): XPromise[T] = js.native
  
  // API: http://vitaly-t.github.io/pg-promise/Database.html#oneOrNone
  def oneOrNone[T](query: QueryParam): XPromise[T | Null] = js.native
  def oneOrNone[T](
    query: QueryParam,
    values: js.UndefOr[scala.Nothing],
    cb: js.UndefOr[scala.Nothing],
    thisArg: js.Any
  ): XPromise[T | Null] = js.native
  def oneOrNone[T](query: QueryParam, values: js.UndefOr[scala.Nothing], cb: js.Function1[/* value */ js.Any, T]): XPromise[T | Null] = js.native
  def oneOrNone[T](
    query: QueryParam,
    values: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* value */ js.Any, T],
    thisArg: js.Any
  ): XPromise[T | Null] = js.native
  def oneOrNone[T](query: QueryParam, values: js.Any): XPromise[T | Null] = js.native
  def oneOrNone[T](query: QueryParam, values: js.Any, cb: js.UndefOr[scala.Nothing], thisArg: js.Any): XPromise[T | Null] = js.native
  def oneOrNone[T](query: QueryParam, values: js.Any, cb: js.Function1[/* value */ js.Any, T]): XPromise[T | Null] = js.native
  def oneOrNone[T](query: QueryParam, values: js.Any, cb: js.Function1[/* value */ js.Any, T], thisArg: js.Any): XPromise[T | Null] = js.native
  
  // API: http://vitaly-t.github.io/pg-promise/Database.html#proc
  def proc[T](procName: String): XPromise[T | Null] = js.native
  def proc[T](
    procName: String,
    values: js.UndefOr[scala.Nothing],
    cb: js.UndefOr[scala.Nothing],
    thisArg: js.Any
  ): XPromise[T | Null] = js.native
  def proc[T](procName: String, values: js.UndefOr[scala.Nothing], cb: js.Function1[/* value */ js.Any, T]): XPromise[T | Null] = js.native
  def proc[T](
    procName: String,
    values: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* value */ js.Any, T],
    thisArg: js.Any
  ): XPromise[T | Null] = js.native
  def proc[T](procName: String, values: js.Any): XPromise[T | Null] = js.native
  def proc[T](procName: String, values: js.Any, cb: js.UndefOr[scala.Nothing], thisArg: js.Any): XPromise[T | Null] = js.native
  def proc[T](procName: String, values: js.Any, cb: js.Function1[/* value */ js.Any, T]): XPromise[T | Null] = js.native
  def proc[T](procName: String, values: js.Any, cb: js.Function1[/* value */ js.Any, T], thisArg: js.Any): XPromise[T | Null] = js.native
  
  // API: http://vitaly-t.github.io/pg-promise/Database.html#query
  def query[T](query: QueryParam): XPromise[T] = js.native
  def query[T](query: QueryParam, values: js.UndefOr[scala.Nothing], qrm: queryResult): XPromise[T] = js.native
  def query[T](query: QueryParam, values: js.Any): XPromise[T] = js.native
  def query[T](query: QueryParam, values: js.Any, qrm: queryResult): XPromise[T] = js.native
  
  // API: http://vitaly-t.github.io/pg-promise/Database.html#result
  def result[T](query: QueryParam): XPromise[T] = js.native
  def result[T](
    query: QueryParam,
    values: js.UndefOr[scala.Nothing],
    cb: js.UndefOr[scala.Nothing],
    thisArg: js.Any
  ): XPromise[T] = js.native
  def result[T](query: QueryParam, values: js.UndefOr[scala.Nothing], cb: js.Function1[/* value */ IResultExt, T]): XPromise[T] = js.native
  def result[T](
    query: QueryParam,
    values: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* value */ IResultExt, T],
    thisArg: js.Any
  ): XPromise[T] = js.native
  def result[T](query: QueryParam, values: js.Any): XPromise[T] = js.native
  def result[T](query: QueryParam, values: js.Any, cb: js.UndefOr[scala.Nothing], thisArg: js.Any): XPromise[T] = js.native
  def result[T](query: QueryParam, values: js.Any, cb: js.Function1[/* value */ IResultExt, T]): XPromise[T] = js.native
  def result[T](query: QueryParam, values: js.Any, cb: js.Function1[/* value */ IResultExt, T], thisArg: js.Any): XPromise[T] = js.native
  
  // API: http://vitaly-t.github.io/pg-promise/Database.html#stream
  def stream(qs: ReadableStream, init: js.Function1[/* stream */ ReadableStream, Unit]): XPromise[Duration] = js.native
  
  // Tasks;
  // API: http://vitaly-t.github.io/pg-promise/Database.html#task
  def task[T](cb: js.Function1[/* t */ ITask[Ext] with Ext, T | XPromise[T]]): XPromise[T] = js.native
  def task[T](options: Tag, cb: js.Function1[/* t */ ITask[Ext] with Ext, T | XPromise[T]]): XPromise[T] = js.native
  def task[T](tag: String, cb: js.Function1[/* t */ ITask[Ext] with Ext, T | XPromise[T]]): XPromise[T] = js.native
  def task[T](tag: Double, cb: js.Function1[/* t */ ITask[Ext] with Ext, T | XPromise[T]]): XPromise[T] = js.native
  
  // Conditional Tasks;
  // API: http://vitaly-t.github.io/pg-promise/Database.html#taskIf
  def taskIf[T](cb: js.Function1[/* t */ ITask[Ext] with Ext, T | XPromise[T]]): XPromise[T] = js.native
  def taskIf[T](options: Cnd[Ext], cb: js.Function1[/* t */ ITask[Ext] with Ext, T | XPromise[T]]): XPromise[T] = js.native
  def taskIf[T](tag: String, cb: js.Function1[/* t */ ITask[Ext] with Ext, T | XPromise[T]]): XPromise[T] = js.native
  def taskIf[T](tag: Double, cb: js.Function1[/* t */ ITask[Ext] with Ext, T | XPromise[T]]): XPromise[T] = js.native
  
  // Transactions;
  // API: http://vitaly-t.github.io/pg-promise/Database.html#tx
  def tx[T](cb: js.Function1[/* t */ ITask[Ext] with Ext, T | XPromise[T]]): XPromise[T] = js.native
  def tx[T](options: Mode, cb: js.Function1[/* t */ ITask[Ext] with Ext, T | XPromise[T]]): XPromise[T] = js.native
  def tx[T](tag: String, cb: js.Function1[/* t */ ITask[Ext] with Ext, T | XPromise[T]]): XPromise[T] = js.native
  def tx[T](tag: Double, cb: js.Function1[/* t */ ITask[Ext] with Ext, T | XPromise[T]]): XPromise[T] = js.native
  
  // Conditional Transactions;
  // API: http://vitaly-t.github.io/pg-promise/Database.html#txIf
  def txIf[T](cb: js.Function1[/* t */ ITask[Ext] with Ext, T | XPromise[T]]): XPromise[T] = js.native
  def txIf[T](options: Reusable[Ext], cb: js.Function1[/* t */ ITask[Ext] with Ext, T | XPromise[T]]): XPromise[T] = js.native
  def txIf[T](tag: String, cb: js.Function1[/* t */ ITask[Ext] with Ext, T | XPromise[T]]): XPromise[T] = js.native
  def txIf[T](tag: Double, cb: js.Function1[/* t */ ITask[Ext] with Ext, T | XPromise[T]]): XPromise[T] = js.native
}
