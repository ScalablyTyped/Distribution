package typings.mjmlReact

import typings.mjmlReact.anon.Children
import typings.mjmlReact.anon.Condition
import typings.mjmlReact.anon.Src
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mjml-react/extensions", JSImport.Namespace)
@js.native
object extensionsMod extends js.Object {
  @js.native
  class MjmlComment ()
    extends Component[Children, js.Object, js.Any]
  
  @js.native
  class MjmlConditionalComment ()
    extends Component[Condition, js.Object, js.Any]
  
  @js.native
  class MjmlTrackingPixel ()
    extends Component[Src, js.Object, js.Any]
  
  @js.native
  class MjmlYahooStyle ()
    extends Component[Children, js.Object, js.Any]
  
}

