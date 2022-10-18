package typings.muicss

import typings.muicss.reactMod.InputProps
import typings.react.mod.Component
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libReactInputMod {
  
  @JSImport("muicss/lib/react/input", JSImport.Default)
  @js.native
  open class default () extends Input
  
  @js.native
  trait Input
    extends Component[InputProps, js.Object, Any] {
    
    var controlEl: js.UndefOr[HTMLInputElement] = js.native
  }
}
