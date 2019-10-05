package typings.muicss

import typings.muicss.libReactAppbarMod.Appbar
import typings.muicss.reactMod.DivProps
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("muicss/lib/react/appbar", JSImport.Namespace)
@js.native
object libReactAppbarMod extends js.Object {
  @js.native
  class default () extends Appbar
  
  type Appbar = Component[DivProps, js.Object, js.Any]
}

