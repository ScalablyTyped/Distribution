package typings.mobxReact

import typings.react.mod.ClassicComponentClass
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-react/dist/types/IReactComponent", JSImport.Namespace)
@js.native
object ireactcomponentMod extends js.Object {
  type IReactComponent[P] = ClassicComponentClass[P] | (ComponentClass[P, ComponentState]) | FunctionComponent[P] | ForwardRefExoticComponent[P]
}

