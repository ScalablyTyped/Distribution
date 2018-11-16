package typings
package mobxLib.libInternalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "ObservableValue")
@js.native
class ObservableValue[T] protected ()
  extends mobxLib.libTypesObservablevalueMod.ObservableValue[T] {
  def this(value: T, enhancer: mobxLib.libTypesModifiersMod.IEnhancer[T]) = this()
  def this(value: T, enhancer: mobxLib.libTypesModifiersMod.IEnhancer[T], name: java.lang.String) = this()
  def this(value: T, enhancer: mobxLib.libTypesModifiersMod.IEnhancer[T], name: java.lang.String, notifySpy: scala.Boolean) = this()
}

