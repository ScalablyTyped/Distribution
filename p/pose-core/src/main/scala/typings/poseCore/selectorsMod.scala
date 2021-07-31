package typings.poseCore

import org.scalablytyped.runtime.StringDictionary
import typings.poseCore.typesMod.Pose
import typings.poseCore.typesMod.PoseMap
import typings.poseCore.typesMod.PoserConfig
import typings.poseCore.typesMod.SelectValueToRead
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectorsMod {
  
  @JSImport("pose-core/lib/inc/selectors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getPoseValues[A, TD](
    hasTransitionFlipDelayDelayChildrenStaggerChildrenStaggerDirectionAfterChildrenBeforeChildrenPreTransitionApplyAtStartApplyAtEndProps: Pose[A, TD]
  ): Pose[A, TD] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPoseValues")(hasTransitionFlipDelayDelayChildrenStaggerChildrenStaggerDirectionAfterChildrenBeforeChildrenPreTransitionApplyAtStartApplyAtEndProps.asInstanceOf[js.Any]).asInstanceOf[Pose[A, TD]]
  
  @scala.inline
  def selectAllValues[V](values: Map[String, V], selectValue: SelectValueToRead[V]): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectAllValues")(values.asInstanceOf[js.Any], selectValue.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  @scala.inline
  def selectPoses[V, A, TD](hasLabelPropsValuesParentValuesAncestorValuesOnChangePassiveInitialPosePoses: PoserConfig[V]): PoseMap[A, TD] = ^.asInstanceOf[js.Dynamic].applyDynamic("selectPoses")(hasLabelPropsValuesParentValuesAncestorValuesOnChangePassiveInitialPosePoses.asInstanceOf[js.Any]).asInstanceOf[PoseMap[A, TD]]
}
