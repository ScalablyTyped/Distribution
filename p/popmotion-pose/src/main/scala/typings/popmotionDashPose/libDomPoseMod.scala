package typings.popmotionDashPose

import typings.popmotion.libReactionsValueMod.ValueProps
import typings.popmotionDashPose.libTypesMod.DomPopmotionConfig
import typings.popmotionDashPose.libTypesMod.DomPopmotionPoser
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion-pose/lib/dom/pose", JSImport.Namespace)
@js.native
object libDomPoseMod extends js.Object {
  @js.native
  class Action ()
    extends typings.popmotion.popmotionMod.Action
  
  @js.native
  class ValueReaction protected ()
    extends typings.popmotion.popmotionMod.ValueReaction {
    def this(props: ValueProps) = this()
  }
  
  def default(element: Element, config: DomPopmotionConfig): DomPopmotionPoser = js.native
}

