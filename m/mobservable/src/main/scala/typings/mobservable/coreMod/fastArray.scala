package typings.mobservable.coreMod

import typings.mobservable.interfacesMod.IObservableArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable/lib/core", "fastArray")
@js.native
object fastArray extends js.Object {
  def apply[V](): IObservableArray[V] = js.native
  def apply[V](initialValues: js.Array[V]): IObservableArray[V] = js.native
}

