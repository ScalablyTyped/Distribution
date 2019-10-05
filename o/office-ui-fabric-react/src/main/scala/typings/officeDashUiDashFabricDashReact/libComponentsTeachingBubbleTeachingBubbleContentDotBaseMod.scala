package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsTeachingBubbleTeachingBubbleDotBaseMod.ITeachingBubbleState
import typings.officeDashUiDashFabricDashReact.libComponentsTeachingBubbleTeachingBubbleDotTypesMod.ITeachingBubbleProps
import typings.officeDashUiDashFabricDashReact.libUtilitiesMod.BaseComponent
import typings.react.reactMod.RefObject
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/TeachingBubble/TeachingBubbleContent.base", JSImport.Namespace)
@js.native
object libComponentsTeachingBubbleTeachingBubbleContentDotBaseMod extends js.Object {
  @js.native
  class TeachingBubbleContentBase protected () extends BaseComponent[ITeachingBubbleProps, ITeachingBubbleState] {
    def this(props: ITeachingBubbleProps) = this()
    var _onKeyDown: js.Any = js.native
    var rootElement: RefObject[HTMLDivElement] = js.native
    @JSName("componentDidMount")
    def componentDidMount_MTeachingBubbleContentBase(): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MTeachingBubbleContentBase(): Unit = js.native
    def focus(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object TeachingBubbleContentBase extends js.Object {
    var defaultProps: Anon_HasCondensedHeadline = js.native
  }
  
}

