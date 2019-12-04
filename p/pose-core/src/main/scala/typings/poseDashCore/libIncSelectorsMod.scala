package typings.poseDashCore

import org.scalablytyped.runtime.StringDictionary
import typings.poseDashCore.libTypesMod.Pose
import typings.poseDashCore.libTypesMod.PoseMap
import typings.poseDashCore.libTypesMod.PoserConfig
import typings.poseDashCore.libTypesMod.SelectValueToRead
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pose-core/lib/inc/selectors", JSImport.Namespace)
@js.native
object libIncSelectorsMod extends js.Object {
  def getPoseValues[A, TD](
    hasTransitionFlipDelayDelayChildrenStaggerChildrenStaggerDirectionAfterChildrenBeforeChildrenPreTransitionApplyAtStartApplyAtEndProps: Pose[A, TD]
  ): Pose[A, TD] = js.native
  def selectAllValues[V](values: Map[String, V], selectValue: SelectValueToRead[V]): StringDictionary[js.Any] = js.native
  def selectPoses[V, A, TD](hasLabelPropsValuesParentValuesAncestorValuesOnChangePassiveInitialPosePoses: PoserConfig[V]): PoseMap[A, TD] = js.native
}

