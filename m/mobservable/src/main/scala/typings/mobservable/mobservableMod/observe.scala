package typings.mobservable.mobservableMod

import typings.mobservable.libInterfacesMod.IArrayChange
import typings.mobservable.libInterfacesMod.IArraySplice
import typings.mobservable.libInterfacesMod.IObjectChange
import typings.mobservable.libInterfacesMod.IObservableArray
import typings.mobservable.libInterfacesMod.Lambda
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
    observableMap: typings.mobservable.libObservablemapMod.ObservableMap[T],
    listener: js.Function1[
      /* change */ IObjectChange[T, typings.mobservable.libObservablemapMod.ObservableMap[T]], 
      Unit
    ]
  ): Lambda = js.native
  def apply[T /* <: js.Object */, Y](
    `object`: T,
    prop: String,
    listener: js.Function2[/* newValue */ Y, /* oldValue */ js.UndefOr[Y], Unit]
  ): Lambda = js.native
}

