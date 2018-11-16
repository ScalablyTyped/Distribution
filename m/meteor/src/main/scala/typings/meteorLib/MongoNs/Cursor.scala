package typings
package meteorLib.MongoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cursor[T] extends js.Object {
  def count(): scala.Double = js.native
  def count(applySkipLimit: scala.Boolean): scala.Double = js.native
  def fetch(): js.Array[T] = js.native
  def forEach(callback: js.Function3[/* doc */ T, /* index */ scala.Double, /* cursor */ Cursor[T], scala.Unit]): scala.Unit = js.native
  def forEach(
    callback: js.Function3[/* doc */ T, /* index */ scala.Double, /* cursor */ Cursor[T], scala.Unit],
    thisArg: js.Any
  ): scala.Unit = js.native
  def map[U](callback: js.Function3[/* doc */ T, /* index */ scala.Double, /* cursor */ Cursor[T], U]): js.Array[U] = js.native
  def map[U](
    callback: js.Function3[/* doc */ T, /* index */ scala.Double, /* cursor */ Cursor[T], U],
    thisArg: js.Any
  ): js.Array[U] = js.native
  def observe(callbacks: ObserveCallbacks): meteorLib.MeteorNs.LiveQueryHandle = js.native
  def observeChanges(callbacks: ObserveChangesCallbacks): meteorLib.MeteorNs.LiveQueryHandle = js.native
}

