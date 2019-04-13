package typings
package nedbLib.nedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cursor[T] extends js.Object {
  def exec(callback: js.Function2[/* err */ stdLib.Error, /* documents */ js.Array[T], scala.Unit]): scala.Unit
  def limit(n: scala.Double): Cursor[T]
  def projection(query: js.Any): Cursor[T]
  def skip(n: scala.Double): Cursor[T]
  def sort(query: js.Any): Cursor[T]
}

object Cursor {
  @scala.inline
  def apply[T](
    exec: js.Function2[/* err */ stdLib.Error, /* documents */ js.Array[T], scala.Unit] => scala.Unit,
    limit: scala.Double => Cursor[T],
    projection: js.Any => Cursor[T],
    skip: scala.Double => Cursor[T],
    sort: js.Any => Cursor[T]
  ): Cursor[T] = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec), limit = js.Any.fromFunction1(limit), projection = js.Any.fromFunction1(projection), skip = js.Any.fromFunction1(skip), sort = js.Any.fromFunction1(sort))
  
    __obj.asInstanceOf[Cursor[T]]
  }
}

