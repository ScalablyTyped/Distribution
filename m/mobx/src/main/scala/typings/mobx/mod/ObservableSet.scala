package typings.mobx.mod

import typings.mobx.modifiersMod.IEnhancer
import typings.mobx.observablesetMod.IObservableSetInitialValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx", "ObservableSet")
@js.native
class ObservableSet[T] ()
  extends typings.mobx.internalMod.ObservableSet[T] {
  def this(initialData: IObservableSetInitialValues[T]) = this()
  def this(initialData: js.UndefOr[IObservableSetInitialValues[T]], enhancer: IEnhancer[T]) = this()
  def this(
    initialData: js.UndefOr[IObservableSetInitialValues[T]],
    enhancer: js.UndefOr[scala.Nothing],
    name: String
  ) = this()
  def this(initialData: js.UndefOr[IObservableSetInitialValues[T]], enhancer: IEnhancer[T], name: String) = this()
}

