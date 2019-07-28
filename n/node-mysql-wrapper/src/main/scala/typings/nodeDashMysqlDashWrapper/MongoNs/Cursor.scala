package typings.nodeDashMysqlDashWrapper.MongoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cursor[T] extends js.Object {
  def count(): Double = js.native
  def fetch(): js.Array[T] = js.native
  def forEach(callback: js.Function3[/* doc */ js.Any, /* index */ Double, /* cursor */ Cursor[_], Unit]): Unit = js.native
  def forEach(
    callback: js.Function3[/* doc */ js.Any, /* index */ Double, /* cursor */ Cursor[_], Unit],
    thisArg: js.Any
  ): Unit = js.native
  def map[U](callback: js.Function3[/* doc */ T, /* index */ Double, /* cursor */ Cursor[T], U]): js.Array[U] = js.native
  def map[U](
    callback: js.Function3[/* doc */ T, /* index */ Double, /* cursor */ Cursor[T], U],
    thisArg: js.Any
  ): js.Array[U] = js.native
  def observe(callbacks: js.Object): js.Any = js.native
  def observeChanges(callbacks: js.Object): js.Any = js.native
}

@JSGlobal("Mongo.Cursor")
@js.native
class CursorCls[T] () extends Cursor[T]

