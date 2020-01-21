package typings.popmotionPose

import typings.popmotionPose.libTypesMod.PoseFactoryConfig
import typings.popmotionPose.libTypesMod.Poser
import typings.popmotionPose.libTypesMod.PoserConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion-pose/pose-core/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  def default[V, A, C, P, TD](
    hasGetDefaultPropsDefaultTransitionsBindOnChangeStartActionStopActionReadValueReadValueFromSourceResolveTargetSetValueSetValueNativeCreateValueConvertValueGetInstantTransitionGetTransitionPropsAddActionDelaySelectValueToReadConvertTransitionDefinitionTransformPosePosePriorityForceRenderExtendAPI: PoseFactoryConfig[V, A, C, P, TD]
  ): js.Function1[/* config */ PoserConfig[V], Poser[V, A, C, P]] = js.native
}

