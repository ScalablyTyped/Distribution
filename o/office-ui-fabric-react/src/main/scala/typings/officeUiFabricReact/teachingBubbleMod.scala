package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.CalloutProps
import typings.officeUiFabricReact.anon.HasCondensedHeadline
import typings.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubbleProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/TeachingBubble", JSImport.Namespace)
@js.native
object teachingBubbleMod extends js.Object {
  @js.native
  class TeachingBubbleBase protected ()
    extends typings.officeUiFabricReact.teachingBubbleBaseMod.TeachingBubbleBase {
    def this(props: ITeachingBubbleProps) = this()
  }
  
  @js.native
  class TeachingBubbleContentBase protected ()
    extends typings.officeUiFabricReact.teachingBubbleContentBaseMod.TeachingBubbleContentBase {
    def this(props: ITeachingBubbleProps) = this()
  }
  
  val TeachingBubble: FunctionComponent[ITeachingBubbleProps] = js.native
  val TeachingBubbleContent: FunctionComponent[ITeachingBubbleProps] = js.native
  /* static members */
  @js.native
  object TeachingBubbleBase extends js.Object {
    var defaultProps: CalloutProps = js.native
  }
  
  /* static members */
  @js.native
  object TeachingBubbleContentBase extends js.Object {
    var defaultProps: HasCondensedHeadline = js.native
  }
  
}

