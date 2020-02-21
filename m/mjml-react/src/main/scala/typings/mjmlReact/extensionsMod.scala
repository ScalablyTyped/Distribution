package typings.mjmlReact

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mjml-react/extensions", JSImport.Namespace)
@js.native
object extensionsMod extends js.Object {
  @js.native
  class MjmlComment ()
    extends Component[AnonChildren, js.Object, js.Any]
  
  @js.native
  class MjmlConditionalComment ()
    extends Component[AnonChildrenCondition, js.Object, js.Any]
  
  @js.native
  class MjmlTrackingPixel ()
    extends Component[AnonSrc, js.Object, js.Any]
  
  @js.native
  class MjmlYahooStyle ()
    extends Component[AnonChildren, js.Object, js.Any]
  
}

