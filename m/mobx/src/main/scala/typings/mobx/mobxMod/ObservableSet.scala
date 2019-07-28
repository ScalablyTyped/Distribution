package typings.mobx.mobxMod

import typings.mobx.libTypesModifiersMod.IEnhancer
import typings.mobx.libTypesObservablesetMod.IObservableSetInitialValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx", "ObservableSet")
@js.native
class ObservableSet[T] ()
  extends typings.mobx.libInternalMod.ObservableSet[T] {
  def this(initialData: IObservableSetInitialValues[T]) = this()
  def this(initialData: IObservableSetInitialValues[T], enhancer: IEnhancer[T]) = this()
  def this(initialData: IObservableSetInitialValues[T], enhancer: IEnhancer[T], name: String) = this()
}

