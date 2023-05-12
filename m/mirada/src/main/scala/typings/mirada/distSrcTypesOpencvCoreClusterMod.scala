package typings.mirada

import typings.mirada.distSrcTypesOpencvHacksMod.EqPredicate
import typings.mirada.distSrcTypesOpencvHacksMod.double
import typings.mirada.distSrcTypesOpencvHacksMod.int
import typings.mirada.distSrcTypesOpencvTypesMod.InputArray
import typings.mirada.distSrcTypesOpencvTypesMod.InputOutputArray
import typings.mirada.distSrcTypesOpencvTypesMod.OutputArray
import typings.mirada.distSrcTypesOpencvTypesMod.TermCriteria
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvCoreClusterMod {
  
  @JSImport("mirada/dist/src/types/opencv/core_cluster", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def kmeans(
    data: InputArray,
    K: int,
    bestLabels: InputOutputArray,
    criteria: TermCriteria,
    attempts: int,
    flags: int
  ): double = (^.asInstanceOf[js.Dynamic].applyDynamic("kmeans")(data.asInstanceOf[js.Any], K.asInstanceOf[js.Any], bestLabels.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], attempts.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[double]
  inline def kmeans(
    data: InputArray,
    K: int,
    bestLabels: InputOutputArray,
    criteria: TermCriteria,
    attempts: int,
    flags: int,
    centers: OutputArray
  ): double = (^.asInstanceOf[js.Dynamic].applyDynamic("kmeans")(data.asInstanceOf[js.Any], K.asInstanceOf[js.Any], bestLabels.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], attempts.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], centers.asInstanceOf[js.Any])).asInstanceOf[double]
  
  inline def partition(arg119: Any, arg120: Any, _vec: Any, labels: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(arg119.asInstanceOf[js.Any], arg120.asInstanceOf[js.Any], _vec.asInstanceOf[js.Any], labels.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def partition(arg119: Any, arg120: Any, _vec: Any, labels: Any, predicate: EqPredicate): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(arg119.asInstanceOf[js.Any], arg120.asInstanceOf[js.Any], _vec.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Any]
}
