package typings.mobx.internalMod

import typings.mobx.modifiersMod.IEnhancer
import typings.mobx.observablemapMod.IObservableMapInitialValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/internal", "ObservableMap")
@js.native
class ObservableMap[K, V] ()
  extends typings.mobx.observablemapMod.ObservableMap[K, V] {
  def this(initialData: IObservableMapInitialValues[K, V]) = this()
  def this(initialData: js.UndefOr[IObservableMapInitialValues[K, V]], enhancer: IEnhancer[V]) = this()
  def this(
    initialData: js.UndefOr[IObservableMapInitialValues[K, V]],
    enhancer: js.UndefOr[scala.Nothing],
    name: String
  ) = this()
  def this(initialData: js.UndefOr[IObservableMapInitialValues[K, V]], enhancer: IEnhancer[V], name: String) = this()
}

