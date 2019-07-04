package typings
package mobxLib.libTypesObservableobjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/types/observableobject", "ObservableObjectAdministration")
@js.native
class ObservableObjectAdministration protected ()
  extends mobxLib.libTypesInterceptDashUtilsMod.IInterceptable[IObjectWillChange]
     with mobxLib.libTypesListenDashUtilsMod.IListenable {
  def this(target: js.Any, values: stdLib.Map[
      java.lang.String | scala.Double | js.Symbol, 
      mobxLib.libInternalMod.ObservableValue[_] | mobxLib.libInternalMod.ComputedValue[_]
    ], name: java.lang.String, defaultEnhancer: mobxLib.libTypesModifiersMod.IEnhancer[_]) = this()
  @JSName("defaultEnhancer")
  var defaultEnhancer_Original: mobxLib.libTypesModifiersMod.IEnhancer[_] = js.native
  var keysAtom: mobxLib.libCoreAtomMod.IAtom = js.native
  var name: java.lang.String = js.native
  var pendingKeys: js.Any = js.native
  var proxy: js.Any = js.native
  var target: js.Any = js.native
  var values: stdLib.Map[
    java.lang.String | scala.Double | js.Symbol, 
    mobxLib.libInternalMod.ObservableValue[_] | mobxLib.libInternalMod.ComputedValue[_]
  ] = js.native
  def addComputedProp(
     // where is the property declared?
  propertyOwner: js.Any,
    propName: stdLib.PropertyKey,
    options: mobxLib.libCoreComputedvalueMod.IComputedValueOptions[_]
  ): scala.Unit = js.native
  def addObservableProp(propName: stdLib.PropertyKey, newValue: js.Any): scala.Unit = js.native
  def addObservableProp(
    propName: stdLib.PropertyKey,
    newValue: js.Any,
    enhancer: mobxLib.libTypesModifiersMod.IEnhancer[_]
  ): scala.Unit = js.native
  def defaultEnhancer(newValue: js.Any, oldValue: js.UndefOr[scala.Nothing], name: java.lang.String): js.Any = js.native
  def defaultEnhancer(newValue: js.Any, oldValue: js.Any, name: java.lang.String): js.Any = js.native
  def getKeys(): js.Array[stdLib.PropertyKey] = js.native
  def has(key: stdLib.PropertyKey): js.Any = js.native
  def illegalAccess(owner: js.Any, propName: js.Any): scala.Unit = js.native
  def intercept(handler: js.Any): mobxLib.libUtilsUtilsMod.Lambda = js.native
  /* CompleteClass */
  override def intercept(handler: mobxLib.libTypesInterceptDashUtilsMod.IInterceptor[IObjectWillChange]): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def notifyPropertyAddition(key: stdLib.PropertyKey, newValue: js.Any): scala.Unit = js.native
  /**
    * Observes this object. Triggers for the events 'add', 'update' and 'delete'.
    * See: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/observe
    * for callback details
    */
  def observe(callback: js.Function1[/* changes */ IObjectDidChange, scala.Unit]): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe(callback: js.Function1[/* changes */ IObjectDidChange, scala.Unit], fireImmediately: scala.Boolean): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def read(key: stdLib.PropertyKey): js.Any = js.native
  def remove(key: stdLib.PropertyKey): scala.Unit = js.native
  def write(key: stdLib.PropertyKey, newValue: js.Any): scala.Unit = js.native
}

