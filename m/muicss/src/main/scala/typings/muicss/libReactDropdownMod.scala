package typings.muicss

import typings.muicss.libReactDropdownMod.Dropdown
import typings.muicss.reactMod.DropdownProps
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("muicss/lib/react/dropdown", JSImport.Namespace)
@js.native
object libReactDropdownMod extends js.Object {
  @js.native
  class default () extends Dropdown
  
  type Dropdown = Component[DropdownProps, js.Object, js.Any]
}

