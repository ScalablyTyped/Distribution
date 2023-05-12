package typings.mirada

import typings.mirada.distSrcTypesOpencvHacksMod.double
import typings.mirada.distSrcTypesOpencvHacksMod.int
import typings.mirada.distSrcTypesOpencvTypesMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvObjdetectMod {
  
  @JSImport("mirada/dist/src/types/opencv/objdetect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/objdetect", "CASCADE_DO_CANNY_PRUNING")
  @js.native
  val CASCADE_DO_CANNY_PRUNING: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/objdetect", "CASCADE_DO_ROUGH_SEARCH")
  @js.native
  val CASCADE_DO_ROUGH_SEARCH: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/objdetect", "CASCADE_FIND_BIGGEST_OBJECT")
  @js.native
  val CASCADE_FIND_BIGGEST_OBJECT: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/objdetect", "CASCADE_SCALE_IMAGE")
  @js.native
  val CASCADE_SCALE_IMAGE: Any = js.native
  
  inline def createFaceDetectionMaskGenerator(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createFaceDetectionMaskGenerator")().asInstanceOf[Any]
  
  inline def groupRectangles(rectList: Any, groupThreshold: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupRectangles")(rectList.asInstanceOf[js.Any], groupThreshold.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def groupRectangles(rectList: Any, groupThreshold: int, eps: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupRectangles")(rectList.asInstanceOf[js.Any], groupThreshold.asInstanceOf[js.Any], eps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def groupRectangles(rectList: Any, groupThreshold: int, eps: double, weights: Any, levelWeights: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupRectangles")(rectList.asInstanceOf[js.Any], groupThreshold.asInstanceOf[js.Any], eps.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], levelWeights.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def groupRectangles(rectList: Any, rejectLevels: Any, levelWeights: Any, groupThreshold: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupRectangles")(rectList.asInstanceOf[js.Any], rejectLevels.asInstanceOf[js.Any], levelWeights.asInstanceOf[js.Any], groupThreshold.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def groupRectangles(rectList: Any, rejectLevels: Any, levelWeights: Any, groupThreshold: int, eps: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupRectangles")(rectList.asInstanceOf[js.Any], rejectLevels.asInstanceOf[js.Any], levelWeights.asInstanceOf[js.Any], groupThreshold.asInstanceOf[js.Any], eps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def groupRectangles(rectList: Any, weights: Any, groupThreshold: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupRectangles")(rectList.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], groupThreshold.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def groupRectangles(rectList: Any, weights: Any, groupThreshold: int, eps: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupRectangles")(rectList.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], groupThreshold.asInstanceOf[js.Any], eps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def groupRectanglesMeanshift(rectList: Any, foundWeights: Any, foundScales: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupRectangles_meanshift")(rectList.asInstanceOf[js.Any], foundWeights.asInstanceOf[js.Any], foundScales.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def groupRectanglesMeanshift(rectList: Any, foundWeights: Any, foundScales: Any, detectThreshold: Unit, winDetSize: Size): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupRectangles_meanshift")(rectList.asInstanceOf[js.Any], foundWeights.asInstanceOf[js.Any], foundScales.asInstanceOf[js.Any], detectThreshold.asInstanceOf[js.Any], winDetSize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def groupRectanglesMeanshift(rectList: Any, foundWeights: Any, foundScales: Any, detectThreshold: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupRectangles_meanshift")(rectList.asInstanceOf[js.Any], foundWeights.asInstanceOf[js.Any], foundScales.asInstanceOf[js.Any], detectThreshold.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def groupRectanglesMeanshift(rectList: Any, foundWeights: Any, foundScales: Any, detectThreshold: double, winDetSize: Size): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("groupRectangles_meanshift")(rectList.asInstanceOf[js.Any], foundWeights.asInstanceOf[js.Any], foundScales.asInstanceOf[js.Any], detectThreshold.asInstanceOf[js.Any], winDetSize.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
