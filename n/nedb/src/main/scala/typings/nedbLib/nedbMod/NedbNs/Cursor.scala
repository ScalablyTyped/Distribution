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

