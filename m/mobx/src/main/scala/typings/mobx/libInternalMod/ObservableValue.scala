package typings.mobx.libInternalMod

import typings.mobx.libTypesModifiersMod.IEnhancer
import typings.mobx.libUtilsComparerMod.IEqualsComparer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "ObservableValue")
@js.native
class ObservableValue[T] protected ()
  extends typings.mobx.libTypesObservablevalueMod.ObservableValue[T] {
  def this(value: T, enhancer: IEnhancer[T]) = this()
  def this(value: T, enhancer: IEnhancer[T], name: String) = this()
  def this(value: T, enhancer: IEnhancer[T], name: String, notifySpy: Boolean) = this()
  def this(value: T, enhancer: IEnhancer[T], name: String, notifySpy: Boolean, equals: IEqualsComparer[_]) = this()
}

