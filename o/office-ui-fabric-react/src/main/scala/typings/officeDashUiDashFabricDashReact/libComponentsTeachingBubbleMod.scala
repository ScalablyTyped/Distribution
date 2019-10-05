package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsTeachingBubbleTeachingBubbleDotTypesMod.ITeachingBubbleProps
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/TeachingBubble", JSImport.Namespace)
@js.native
object libComponentsTeachingBubbleMod extends js.Object {
  @js.native
  class TeachingBubbleBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsTeachingBubbleTeachingBubbleDotBaseMod.TeachingBubbleBase {
    def this(props: ITeachingBubbleProps) = this()
  }
  
  @js.native
  class TeachingBubbleContentBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsTeachingBubbleTeachingBubbleContentDotBaseMod.TeachingBubbleContentBase {
    def this(props: ITeachingBubbleProps) = this()
  }
  
  val TeachingBubble: StatelessComponent[ITeachingBubbleProps] = js.native
  val TeachingBubbleContent: StatelessComponent[ITeachingBubbleProps] = js.native
  /* static members */
  @js.native
  object TeachingBubbleBase extends js.Object {
    var defaultProps: Anon_CalloutProps = js.native
  }
  
  /* static members */
  @js.native
  object TeachingBubbleContentBase extends js.Object {
    var defaultProps: Anon_HasCondensedHeadline = js.native
  }
  
}

