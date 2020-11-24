package typings.mobx.observableobjectMod

import typings.mobx.atomMod.IAtom
import typings.mobx.computedvalueMod.IComputedValueOptions
import typings.mobx.interceptUtilsMod.IInterceptable
import typings.mobx.internalMod.ComputedValue
import typings.mobx.internalMod.ObservableValue
import typings.mobx.listenUtilsMod.IListenable
import typings.mobx.modifiersMod.IEnhancer
import typings.mobx.utilsMod.Lambda
import typings.std.Map
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/types/observableobject", "ObservableObjectAdministration")
@js.native
class ObservableObjectAdministration protected ()
  extends IInterceptable[IObjectWillChange[js.Any]]
     with IListenable {
  def this(
    target: js.Any,
    values: Map[String | Double | js.Symbol, ObservableValue[_] | ComputedValue[_]],
    name: String,
    defaultEnhancer: IEnhancer[_]
  ) = this()
  
  def addComputedProp(
     // where is the property declared?
  propertyOwner: js.Any,
    propName: PropertyKey,
    options: IComputedValueOptions[_]
  ): Unit = js.native
  
  def addObservableProp(propName: PropertyKey, newValue: js.Any): Unit = js.native
  def addObservableProp(propName: PropertyKey, newValue: js.Any, enhancer: IEnhancer[_]): Unit = js.native
  
  def defaultEnhancer(newValue: js.Any, oldValue: js.UndefOr[scala.Nothing], name: String): js.Any = js.native
  def defaultEnhancer(newValue: js.Any, oldValue: js.Any, name: String): js.Any = js.native
  @JSName("defaultEnhancer")
  var defaultEnhancer_Original: IEnhancer[_] = js.native
  
  def getKeys(): js.Array[PropertyKey] = js.native
  
  def has(key: PropertyKey): js.Any = js.native
  
  def illegalAccess(owner: js.Any, propName: js.Any): Unit = js.native
  
  def intercept(handler: js.Any): Lambda = js.native
  
  var keysAtom: IAtom = js.native
  
  var name: String = js.native
  
  def notifyPropertyAddition(key: PropertyKey, newValue: js.Any): Unit = js.native
  
  /**
    * Observes this object. Triggers for the events 'add', 'update' and 'delete'.
    * See: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/observe
    * for callback details
    */
  def observe(callback: js.Function1[/* changes */ IObjectDidChange[_], Unit]): Lambda = js.native
  def observe(callback: js.Function1[/* changes */ IObjectDidChange[_], Unit], fireImmediately: Boolean): Lambda = js.native
  
  var pendingKeys: js.Any = js.native
  
  var proxy: js.Any = js.native
  
  def read(key: PropertyKey): js.Any = js.native
  
  def remove(key: PropertyKey): Unit = js.native
  
  var target: js.Any = js.native
  
  var values: Map[String | Double | js.Symbol, ObservableValue[_] | ComputedValue[_]] = js.native
  
  def write(key: PropertyKey, newValue: js.Any): Unit = js.native
}
