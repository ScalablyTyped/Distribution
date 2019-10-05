package typings.muicss

import typings.muicss.libReactCheckboxMod.Checkbox
import typings.muicss.reactMod.CheckboxProps
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("muicss/lib/react/checkbox", JSImport.Namespace)
@js.native
object libReactCheckboxMod extends js.Object {
  @js.native
  class default () extends Checkbox
  
  type Checkbox = Component[CheckboxProps, js.Object, js.Any]
}

