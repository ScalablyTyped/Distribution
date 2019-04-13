package typings
package mobservableDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable-react", JSImport.Namespace)
@js.native
object mobservableDashReactMod extends js.Object {
  def observer[P](clazz: reactLib.reactMod.ClassicComponentClass[P]): reactLib.reactMod.ClassicComponentClass[P] = js.native
  def observer[P](clazz: reactLib.reactMod.ComponentClass[P, reactLib.reactMod.ComponentState]): reactLib.reactMod.ComponentClass[P, reactLib.reactMod.ComponentState] = js.native
  def observer[P](clazz: reactLib.reactMod.StatelessComponent[P]): reactLib.reactMod.ClassicComponentClass[P] = js.native
  def observer[P](renderFunction: js.Function1[/* props */ P, reactLib.reactMod.ReactElement[_]]): reactLib.reactMod.ClassicComponentClass[P] = js.native
  def observer[TFunction /* <: reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState] */](target: TFunction): TFunction = js.native
}

