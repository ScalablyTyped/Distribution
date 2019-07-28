package typings.mobx.libTypesObservableobjectMod

import typings.mobx.libTypesModifiersMod.IEnhancer
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/types/observableobject", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def asObservableObject(target: js.Any): ObservableObjectAdministration = js.native
  def asObservableObject(target: js.Any, name: PropertyKey): ObservableObjectAdministration = js.native
  def asObservableObject(target: js.Any, name: PropertyKey, defaultEnhancer: IEnhancer[_]): ObservableObjectAdministration = js.native
  def generateComputedPropConfig(propName: js.Any): js.Any = js.native
  def generateObservablePropConfig(propName: js.Any): js.Any = js.native
  def isObservableObject(thing: js.Any): /* is mobx.mobx/lib/types/observableobject.IObservableObject */ Boolean = js.native
}

