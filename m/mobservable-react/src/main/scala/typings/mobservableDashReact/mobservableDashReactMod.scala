package typings.mobservableDashReact

import typings.react.reactMod.ClassicComponentClass
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ReactElement
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable-react", JSImport.Namespace)
@js.native
object mobservableDashReactMod extends js.Object {
  def observer[P](clazz: ClassicComponentClass[P]): ClassicComponentClass[P] = js.native
  def observer[P](clazz: ComponentClass[P, ComponentState]): ComponentClass[P, ComponentState] = js.native
  def observer[P](clazz: StatelessComponent[P]): ClassicComponentClass[P] = js.native
  def observer[P](renderFunction: js.Function1[/* props */ P, ReactElement]): ClassicComponentClass[P] = js.native
  def observer[TFunction /* <: ComponentClass[_, ComponentState] */](target: TFunction): TFunction = js.native
}

