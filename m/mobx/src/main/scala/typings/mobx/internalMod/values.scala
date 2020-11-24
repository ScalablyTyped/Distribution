package typings.mobx.internalMod

import typings.mobx.observablearrayMod.IObservableArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/internal", "values")
@js.native
object values extends js.Object {
  
  def apply[T](ar: IObservableArray[T]): js.Array[T] = js.native
  def apply[T](obj: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T](set: ObservableSet[T]): js.Array[T] = js.native
  def apply[K, T](map: ObservableMap[K, T]): js.Array[T] = js.native
}
