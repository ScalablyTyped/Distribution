package typings
package nedbLib.nedbMod.NedbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cursor[T] extends js.Object {
  def exec(callback: js.Function2[/* err */ nodeLib.Error, /* documents */ js.Array[T], scala.Unit]): scala.Unit
  def limit(n: scala.Double): Cursor[T]
  def projection(query: js.Any): Cursor[T]
  def skip(n: scala.Double): Cursor[T]
  def sort(query: js.Any): Cursor[T]
}

object Cursor {
  @scala.inline
  def apply[T](
    exec: js.Function1[
      js.Function2[/* err */ nodeLib.Error, /* documents */ js.Array[T], scala.Unit], 
      scala.Unit
    ],
    limit: js.Function1[scala.Double, Cursor[T]],
    projection: js.Function1[js.Any, Cursor[T]],
    skip: js.Function1[scala.Double, Cursor[T]],
    sort: js.Function1[js.Any, Cursor[T]]
  ): Cursor[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exec")(exec)
    __obj.updateDynamic("limit")(limit)
    __obj.updateDynamic("projection")(projection)
    __obj.updateDynamic("skip")(skip)
    __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[Cursor[T]]
  }
}

