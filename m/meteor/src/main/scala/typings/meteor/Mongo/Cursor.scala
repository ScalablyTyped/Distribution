package typings.meteor.Mongo

import typings.meteor.Meteor.LiveQueryHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cursor[T] extends js.Object {
  def count(): Double = js.native
  def count(applySkipLimit: Boolean): Double = js.native
  def fetch(): js.Array[T] = js.native
  def forEach(callback: js.Function3[/* doc */ T, /* index */ Double, /* cursor */ Cursor[T], Unit]): Unit = js.native
  def forEach(
    callback: js.Function3[/* doc */ T, /* index */ Double, /* cursor */ Cursor[T], Unit],
    thisArg: js.Any
  ): Unit = js.native
  def map[U](callback: js.Function3[/* doc */ T, /* index */ Double, /* cursor */ Cursor[T], U]): js.Array[U] = js.native
  def map[U](
    callback: js.Function3[/* doc */ T, /* index */ Double, /* cursor */ Cursor[T], U],
    thisArg: js.Any
  ): js.Array[U] = js.native
  def observe(callbacks: ObserveCallbacks[T]): LiveQueryHandle = js.native
  def observeChanges(callbacks: ObserveChangesCallbacks[T]): LiveQueryHandle = js.native
}

