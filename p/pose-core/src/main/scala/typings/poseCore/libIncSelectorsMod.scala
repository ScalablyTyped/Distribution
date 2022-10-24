package typings.poseCore

import org.scalablytyped.runtime.StringDictionary
import typings.poseCore.libTypesMod.Pose
import typings.poseCore.libTypesMod.PoseMap
import typings.poseCore.libTypesMod.PoserConfig
import typings.poseCore.libTypesMod.SelectValueToRead
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIncSelectorsMod {
  
  @JSImport("pose-core/lib/inc/selectors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPoseValues[A, TD](param0: Pose[A, TD]): Pose[A, TD] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPoseValues")(param0.asInstanceOf[js.Any]).asInstanceOf[Pose[A, TD]]
  
  inline def selectAllValues[V](values: Map[String, V], selectValue: SelectValueToRead[V]): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectAllValues")(values.asInstanceOf[js.Any], selectValue.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  inline def selectPoses[V, A, TD](param0: PoserConfig[V]): PoseMap[A, TD] = ^.asInstanceOf[js.Dynamic].applyDynamic("selectPoses")(param0.asInstanceOf[js.Any]).asInstanceOf[PoseMap[A, TD]]
}
