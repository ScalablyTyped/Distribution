package typings
package mobxLib.libTypesObservablevalueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/types/observablevalue", "ObservableValue")
@js.native
class ObservableValue[T] protected ()
  extends mobxLib.libInternalMod.Atom
     with IObservableValue[T]
     with mobxLib.libTypesInterceptDashUtilsMod.IInterceptable[IValueWillChange[T]]
     with mobxLib.libTypesListenDashUtilsMod.IListenable {
  def this(value: T, enhancer: mobxLib.libTypesModifiersMod.IEnhancer[T]) = this()
  def this(value: T, enhancer: mobxLib.libTypesModifiersMod.IEnhancer[T], name: java.lang.String) = this()
  def this(value: T, enhancer: mobxLib.libTypesModifiersMod.IEnhancer[T], name: java.lang.String, notifySpy: scala.Boolean) = this()
  def this(value: T, enhancer: mobxLib.libTypesModifiersMod.IEnhancer[T], name: java.lang.String, notifySpy: scala.Boolean, equals: mobxLib.libUtilsComparerMod.IEqualsComparer[_]) = this()
  var dehanceValue: js.Any = js.native
  var dehancer: js.Any = js.native
  @JSName("enhancer")
  var enhancer_Original: mobxLib.libTypesModifiersMod.IEnhancer[T] = js.native
  @JSName("equals")
  var equals_FObservableValue: js.Any = js.native
  var hasUnreportedChange: scala.Boolean = js.native
  /* CompleteClass */
  override var interceptors: js.UndefOr[
    js.Array[mobxLib.libTypesInterceptDashUtilsMod.IInterceptor[IValueWillChange[T]]]
  ] = js.native
  var prepareNewValue: js.Any = js.native
  @JSName(org.scalablytyped.runtime.Symbol.toPrimitive)
  var toPrimitive: js.Function0[T] = js.native
  var value: js.Any = js.native
  def enhancer(newValue: T, oldValue: T, name: java.lang.String): T = js.native
  def enhancer(newValue: T, oldValue: js.UndefOr[scala.Nothing], name: java.lang.String): T = js.native
  /* InferMemberOverrides */
  override def intercept(handler: mobxLib.libTypesInterceptDashUtilsMod.IInterceptor[IValueWillChange[T]]): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def setNewValue(newValue: T): scala.Unit = js.native
  def toJSON(): T = js.native
}

