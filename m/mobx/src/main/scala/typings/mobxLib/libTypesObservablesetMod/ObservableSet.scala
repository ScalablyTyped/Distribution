package typings
package mobxLib.libTypesObservablesetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/types/observableset", "ObservableSet")
@js.native
class ObservableSet[T] ()
  extends stdLib.Set[T]
     with mobxLib.libTypesInterceptDashUtilsMod.IInterceptable[ISetWillChange[js.Any]]
     with mobxLib.libTypesListenDashUtilsMod.IListenable {
  def this(initialData: IObservableSetInitialValues[T]) = this()
  def this(initialData: IObservableSetInitialValues[T], enhancer: mobxLib.libTypesModifiersMod.IEnhancer[T]) = this()
  def this(initialData: IObservableSetInitialValues[T], enhancer: mobxLib.libTypesModifiersMod.IEnhancer[T], name: java.lang.String) = this()
  var _atom: js.Any = js.native
  var _data: js.Any = js.native
  var dehanceValue: js.Any = js.native
  var dehancer: js.Any = js.native
  /* CompleteClass */
  override var interceptors: js.UndefOr[
    js.Array[mobxLib.libTypesInterceptDashUtilsMod.IInterceptor[ISetWillChange[js.Any]]]
  ] = js.native
  var name: java.lang.String = js.native
  @JSName(org.scalablytyped.runtime.Symbol.toStringTag)
  var toStringTag_ObservableSet: mobxLib.mobxLibStrings.Set = js.native
  def delete(value: js.Any): scala.Boolean = js.native
  def enhancer(newV: js.Any): js.Any = js.native
  def enhancer(newV: js.Any, oldV: js.Any): js.Any = js.native
  def has(value: js.Any): scala.Boolean = js.native
  /* CompleteClass */
  override def intercept(handler: mobxLib.libTypesInterceptDashUtilsMod.IInterceptor[ISetWillChange[js.Any]]): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe(listener: js.Function1[/* changes */ ISetDidChange[T], scala.Unit]): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe(listener: js.Function1[/* changes */ ISetDidChange[T], scala.Unit], fireImmediately: scala.Boolean): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def replace(other: IObservableSetInitialValues[T]): ObservableSet[T] = js.native
  def replace(other: ObservableSet[T]): ObservableSet[T] = js.native
  def toJS(): stdLib.Set[T] = js.native
}

