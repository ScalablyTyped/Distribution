package typings.muicss

import typings.muicss.libReactSelectMod.Select
import typings.muicss.reactMod.SelectProps
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("muicss/lib/react/select", JSImport.Namespace)
@js.native
object libReactSelectMod extends js.Object {
  @js.native
  class default () extends Select
  
  type Select = Component[SelectProps, js.Object, js.Any]
}

