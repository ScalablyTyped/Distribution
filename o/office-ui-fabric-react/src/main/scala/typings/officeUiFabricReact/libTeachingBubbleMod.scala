package typings.officeUiFabricReact

import typings.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubbleProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/TeachingBubble", JSImport.Namespace)
@js.native
object libTeachingBubbleMod extends js.Object {
  @js.native
  class TeachingBubbleBase protected ()
    extends typings.officeUiFabricReact.teachingBubbleMod.TeachingBubbleBase {
    def this(props: ITeachingBubbleProps) = this()
  }
  
  @js.native
  class TeachingBubbleContentBase protected ()
    extends typings.officeUiFabricReact.teachingBubbleMod.TeachingBubbleContentBase {
    def this(props: ITeachingBubbleProps) = this()
  }
  
  val TeachingBubble: FunctionComponent[ITeachingBubbleProps] = js.native
  val TeachingBubbleContent: FunctionComponent[ITeachingBubbleProps] = js.native
  /* static members */
  @js.native
  object TeachingBubbleBase extends js.Object {
    var defaultProps: AnonCalloutProps = js.native
  }
  
  /* static members */
  @js.native
  object TeachingBubbleContentBase extends js.Object {
    var defaultProps: AnonHasCondensedHeadline = js.native
  }
  
}

