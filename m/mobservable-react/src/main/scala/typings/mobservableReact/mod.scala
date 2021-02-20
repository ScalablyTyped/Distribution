package typings.mobservableReact

import typings.react.mod.ClassicComponentClass
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.react.mod.StatelessComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mobservable-react", "observer")
  @js.native
  def observer[P](clazz: ClassicComponentClass[P]): ClassicComponentClass[P] = js.native
  @JSImport("mobservable-react", "observer")
  @js.native
  def observer[P](clazz: ComponentClass[P, ComponentState]): ComponentClass[P, ComponentState] = js.native
  @JSImport("mobservable-react", "observer")
  @js.native
  def observer[P](clazz: StatelessComponent[P]): ClassicComponentClass[P] = js.native
  @JSImport("mobservable-react", "observer")
  @js.native
  def observer[P](renderFunction: js.Function1[/* props */ P, ReactElement]): ClassicComponentClass[P] = js.native
  @JSImport("mobservable-react", "observer")
  @js.native
  def observer[TFunction /* <: ComponentClass[_, ComponentState] */](target: TFunction): TFunction = js.native
}
