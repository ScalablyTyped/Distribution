package typings.muicss

import typings.muicss.libReactColMod.Col
import typings.muicss.reactMod.ColProps
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("muicss/lib/react/col", JSImport.Namespace)
@js.native
object libReactColMod extends js.Object {
  @js.native
  class default () extends Col
  
  type Col = Component[ColProps, js.Object, js.Any]
}

