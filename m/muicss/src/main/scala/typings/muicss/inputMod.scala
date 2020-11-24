package typings.muicss

import typings.muicss.reactMod.InputProps
import typings.react.mod.Component
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("muicss/lib/react/input", JSImport.Namespace)
@js.native
object inputMod extends js.Object {
  
  @js.native
  trait Input
    extends Component[InputProps, js.Object, js.Any] {
    
    var controlEl: js.UndefOr[HTMLInputElement] = js.native
  }
  
  @js.native
  class default () extends Input
}
