package typings.officeUiFabricReact.teachingBubbleBaseMod

import typings.officeUiFabricReact.anon.CalloutProps
import typings.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubbleProps
import typings.react.mod.Component
import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/TeachingBubble/TeachingBubble.base", "TeachingBubbleBase")
@js.native
class TeachingBubbleBase protected ()
  extends Component[ITeachingBubbleProps, ITeachingBubbleState, js.Any] {
  def this(props: ITeachingBubbleProps) = this()
  
  var _defaultCalloutProps: js.Any = js.native
  
  def focus(): Unit = js.native
  
  var rootElement: RefObject[HTMLDivElement] = js.native
}
/* static members */
@JSImport("office-ui-fabric-react/lib/components/TeachingBubble/TeachingBubble.base", "TeachingBubbleBase")
@js.native
object TeachingBubbleBase extends js.Object {
  
  var defaultProps: CalloutProps = js.native
}
