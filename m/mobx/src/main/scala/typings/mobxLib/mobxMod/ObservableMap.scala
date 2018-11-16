package typings
package mobxLib.mobxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx", "ObservableMap")
@js.native
class ObservableMap[K, V] ()
  extends mobxLib.libInternalMod.ObservableMap[K, V] {
  def this(initialData: mobxLib.libTypesObservablemapMod.IObservableMapInitialValues[K, V]) = this()
  def this(initialData: mobxLib.libTypesObservablemapMod.IObservableMapInitialValues[K, V], enhancer: mobxLib.libTypesModifiersMod.IEnhancer[V]) = this()
  def this(initialData: mobxLib.libTypesObservablemapMod.IObservableMapInitialValues[K, V], enhancer: mobxLib.libTypesModifiersMod.IEnhancer[V], name: java.lang.String) = this()
}

