package typings.mobx.mod

import typings.mobx.observablearrayMod.IObservableArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx", "values")
@js.native
object values extends js.Object {
  def apply[T](ar: IObservableArray[T]): js.Array[T] = js.native
  def apply[T](obj: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T](set: typings.mobx.observablesetMod.ObservableSet[T]): js.Array[T] = js.native
  def apply[K, T](map: typings.mobx.observablemapMod.ObservableMap[K, T]): js.Array[T] = js.native
}

