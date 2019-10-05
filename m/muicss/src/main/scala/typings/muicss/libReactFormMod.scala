package typings.muicss

import typings.muicss.libReactFormMod.Form
import typings.muicss.reactMod.FormProps
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("muicss/lib/react/form", JSImport.Namespace)
@js.native
object libReactFormMod extends js.Object {
  @js.native
  class default () extends Form
  
  type Form = Component[FormProps, js.Object, js.Any]
}

