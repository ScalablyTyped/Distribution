package typings.muicss

import typings.muicss.libReactOptionMod.Option
import typings.muicss.reactMod.OptionProps
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("muicss/lib/react/option", JSImport.Namespace)
@js.native
object libReactOptionMod extends js.Object {
  @js.native
  class default () extends Option
  
  type Option = Component[OptionProps, js.Object, js.Any]
}

