package typings.poseCore

import typings.poseCore.typesMod.PoseFactoryConfig
import typings.poseCore.typesMod.Poser
import typings.poseCore.typesMod.PoserConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pose-core", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def default[V, A, C, P, TD](
    hasGetDefaultPropsDefaultTransitionsBindOnChangeStartActionStopActionReadValueReadValueFromSourceResolveTargetSetValueSetValueNativeCreateValueConvertValueGetInstantTransitionGetTransitionPropsAddActionDelaySelectValueToReadConvertTransitionDefinitionTransformPosePosePriorityForceRenderExtendAPI: PoseFactoryConfig[V, A, C, P, TD]
  ): js.Function1[/* config */ PoserConfig[V], Poser[V, A, C, P]] = js.native
}

