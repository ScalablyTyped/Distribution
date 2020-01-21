package typings.mobservable.mod

import typings.mobservable.interfacesMod.IArrayChange
import typings.mobservable.interfacesMod.IArraySplice
import typings.mobservable.interfacesMod.IObjectChange
import typings.mobservable.interfacesMod.IObservableArray
import typings.mobservable.interfacesMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable", "observe")
@js.native
object observe extends js.Object {
  def apply(func: js.Function0[Unit]): Lambda = js.native
  def apply[T /* <: js.Object */](`object`: T, listener: js.Function1[/* change */ IObjectChange[_, T], Unit]): Lambda = js.native
  def apply[T](
    observableArray: IObservableArray[T],
    listener: js.Function1[/* change */ IArrayChange[T] | IArraySplice[T], Unit]
  ): Lambda = js.native
  def apply[T](
    observableMap: typings.mobservable.observablemapMod.ObservableMap[T],
    listener: js.Function1[
      /* change */ IObjectChange[T, typings.mobservable.observablemapMod.ObservableMap[T]], 
      Unit
    ]
  ): Lambda = js.native
  def apply[T /* <: js.Object */, Y](
    `object`: T,
    prop: String,
    listener: js.Function2[/* newValue */ Y, /* oldValue */ js.UndefOr[Y], Unit]
  ): Lambda = js.native
}

