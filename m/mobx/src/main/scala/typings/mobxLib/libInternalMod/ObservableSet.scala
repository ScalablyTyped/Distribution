package typings
package mobxLib.libInternalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "ObservableSet")
@js.native
class ObservableSet[T] ()
  extends mobxLib.libTypesObservablesetMod.ObservableSet[T] {
  def this(initialData: mobxLib.libTypesObservablesetMod.IObservableSetInitialValues[T]) = this()
  def this(initialData: mobxLib.libTypesObservablesetMod.IObservableSetInitialValues[T], enhancer: mobxLib.libTypesModifiersMod.IEnhancer[T]) = this()
  def this(initialData: mobxLib.libTypesObservablesetMod.IObservableSetInitialValues[T], enhancer: mobxLib.libTypesModifiersMod.IEnhancer[T], name: java.lang.String) = this()
}

