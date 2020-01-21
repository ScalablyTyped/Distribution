package typings.mobx.mod

import typings.mobx.modifiersMod.IEnhancer
import typings.mobx.observablesetMod.IObservableSetInitialValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx", "ObservableSet")
@js.native
class ObservableSet[T] ()
  extends typings.mobx.internalMod.ObservableSet[T] {
  def this(initialData: IObservableSetInitialValues[T]) = this()
  def this(initialData: IObservableSetInitialValues[T], enhancer: IEnhancer[T]) = this()
  def this(initialData: IObservableSetInitialValues[T], enhancer: IEnhancer[T], name: String) = this()
}

