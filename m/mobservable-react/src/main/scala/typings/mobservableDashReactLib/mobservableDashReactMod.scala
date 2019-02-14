package typings
package mobservableDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable-react", JSImport.Namespace)
@js.native
object mobservableDashReactMod extends js.Object {
  def observer[P](clazz: reactLib.reactMod.ReactNs.ClassicComponentClass[P]): reactLib.reactMod.ReactNs.ClassicComponentClass[P] = js.native
  def observer[P](clazz: reactLib.reactMod.ReactNs.ComponentClass[P, reactLib.reactMod.ReactNs.ComponentState]): reactLib.reactMod.ReactNs.ComponentClass[P, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def observer[P](clazz: reactLib.reactMod.ReactNs.StatelessComponent[P]): reactLib.reactMod.ReactNs.ClassicComponentClass[P] = js.native
  def observer[P](renderFunction: js.Function1[/* props */ P, reactLib.reactMod.ReactNs.ReactElement]): reactLib.reactMod.ReactNs.ClassicComponentClass[P] = js.native
  def observer[TFunction /* <: reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] */](target: TFunction): TFunction = js.native
}

