package typings.popmotionPose

import typings.popmotion.actionTypesMod.ColdSubscription
import typings.popmotion.valueMod.ValueProps
import typings.popmotionPose.typesMod.DomPopmotionConfig
import typings.popmotionPose.typesMod.DomPopmotionPoser
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion-pose/lib/dom/pose", JSImport.Namespace)
@js.native
object poseMod extends js.Object {
  @js.native
  class Action[Sub /* <: ColdSubscription */] ()
    extends typings.popmotion.actionMod.Action[Sub]
  
  @js.native
  class ValueReaction protected ()
    extends typings.popmotion.mod.ValueReaction {
    def this(props: ValueProps) = this()
  }
  
  def default(element: Element, config: DomPopmotionConfig): DomPopmotionPoser = js.native
}

