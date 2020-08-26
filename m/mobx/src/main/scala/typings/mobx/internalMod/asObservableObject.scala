package typings.mobx.internalMod

import typings.mobx.modifiersMod.IEnhancer
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "asObservableObject")
@js.native
object asObservableObject extends js.Object {
  def apply(target: js.Any): typings.mobx.observableobjectMod.ObservableObjectAdministration = js.native
  def apply(target: js.Any, name: js.UndefOr[PropertyKey], defaultEnhancer: IEnhancer[_]): typings.mobx.observableobjectMod.ObservableObjectAdministration = js.native
  def apply(target: js.Any, name: PropertyKey): typings.mobx.observableobjectMod.ObservableObjectAdministration = js.native
}

