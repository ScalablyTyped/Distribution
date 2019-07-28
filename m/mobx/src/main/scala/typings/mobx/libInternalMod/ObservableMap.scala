package typings.mobx.libInternalMod

import typings.mobx.libTypesModifiersMod.IEnhancer
import typings.mobx.libTypesObservablemapMod.IObservableMapInitialValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "ObservableMap")
@js.native
class ObservableMap[K, V] ()
  extends typings.mobx.libTypesObservablemapMod.ObservableMap[K, V] {
  def this(initialData: IObservableMapInitialValues[K, V]) = this()
  def this(initialData: IObservableMapInitialValues[K, V], enhancer: IEnhancer[V]) = this()
  def this(initialData: IObservableMapInitialValues[K, V], enhancer: IEnhancer[V], name: String) = this()
}

