package typings.poseCore

import org.scalablytyped.runtime.StringDictionary
import typings.poseCore.typesMod.Pose
import typings.poseCore.typesMod.PoseMap
import typings.poseCore.typesMod.PoserConfig
import typings.poseCore.typesMod.SelectValueToRead
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectorsMod {
  
  @JSImport("pose-core/lib/inc/selectors", "getPoseValues")
  @js.native
  def getPoseValues[A, TD](
    hasTransitionFlipDelayDelayChildrenStaggerChildrenStaggerDirectionAfterChildrenBeforeChildrenPreTransitionApplyAtStartApplyAtEndProps: Pose[A, TD]
  ): Pose[A, TD] = js.native
  
  @JSImport("pose-core/lib/inc/selectors", "selectAllValues")
  @js.native
  def selectAllValues[V](values: Map[String, V], selectValue: SelectValueToRead[V]): StringDictionary[js.Any] = js.native
  
  @JSImport("pose-core/lib/inc/selectors", "selectPoses")
  @js.native
  def selectPoses[V, A, TD](hasLabelPropsValuesParentValuesAncestorValuesOnChangePassiveInitialPosePoses: PoserConfig[V]): PoseMap[A, TD] = js.native
}
