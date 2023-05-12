package typings.mirada

import typings.mirada.distSrcTypesOpencvTypesMod.InputArray
import typings.mirada.distSrcTypesOpencvTypesMod.InputOutputArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvFeatures2dDrawMod {
  
  @JSImport("mirada/dist/src/types/opencv/features2d_draw", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/features2d_draw", "DEFAULT")
  @js.native
  val DEFAULT: DrawMatchesFlags = js.native
  
  @JSImport("mirada/dist/src/types/opencv/features2d_draw", "DRAW_OVER_OUTIMG")
  @js.native
  val DRAW_OVER_OUTIMG: DrawMatchesFlags = js.native
  
  @JSImport("mirada/dist/src/types/opencv/features2d_draw", "DRAW_RICH_KEYPOINTS")
  @js.native
  val DRAW_RICH_KEYPOINTS: DrawMatchesFlags = js.native
  
  @JSImport("mirada/dist/src/types/opencv/features2d_draw", "NOT_DRAW_SINGLE_POINTS")
  @js.native
  val NOT_DRAW_SINGLE_POINTS: DrawMatchesFlags = js.native
  
  inline def drawKeypoints(image: InputArray, keypoints: Any, outImage: InputOutputArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawKeypoints")(image.asInstanceOf[js.Any], keypoints.asInstanceOf[js.Any], outImage.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawKeypoints(image: InputArray, keypoints: Any, outImage: InputOutputArray, color: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawKeypoints")(image.asInstanceOf[js.Any], keypoints.asInstanceOf[js.Any], outImage.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawKeypoints(image: InputArray, keypoints: Any, outImage: InputOutputArray, color: Any, flags: DrawMatchesFlags): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawKeypoints")(image.asInstanceOf[js.Any], keypoints.asInstanceOf[js.Any], outImage.asInstanceOf[js.Any], color.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawKeypoints(
    image: InputArray,
    keypoints: Any,
    outImage: InputOutputArray,
    color: Unit,
    flags: DrawMatchesFlags
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawKeypoints")(image.asInstanceOf[js.Any], keypoints.asInstanceOf[js.Any], outImage.asInstanceOf[js.Any], color.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def drawMatches(
    img1: InputArray,
    keypoints1: Any,
    img2: InputArray,
    keypoints2: Any,
    matches1to2: Any,
    outImg: InputOutputArray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMatches")(img1.asInstanceOf[js.Any], keypoints1.asInstanceOf[js.Any], img2.asInstanceOf[js.Any], keypoints2.asInstanceOf[js.Any], matches1to2.asInstanceOf[js.Any], outImg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawMatches(
    img1: InputArray,
    keypoints1: Any,
    img2: InputArray,
    keypoints2: Any,
    matches1to2: Any,
    outImg: InputOutputArray,
    matchColor: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMatches")(img1.asInstanceOf[js.Any], keypoints1.asInstanceOf[js.Any], img2.asInstanceOf[js.Any], keypoints2.asInstanceOf[js.Any], matches1to2.asInstanceOf[js.Any], outImg.asInstanceOf[js.Any], matchColor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawMatches(
    img1: InputArray,
    keypoints1: Any,
    img2: InputArray,
    keypoints2: Any,
    matches1to2: Any,
    outImg: InputOutputArray,
    matchColor: Any,
    singlePointColor: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMatches")(img1.asInstanceOf[js.Any], keypoints1.asInstanceOf[js.Any], img2.asInstanceOf[js.Any], keypoints2.asInstanceOf[js.Any], matches1to2.asInstanceOf[js.Any], outImg.asInstanceOf[js.Any], matchColor.asInstanceOf[js.Any], singlePointColor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawMatches(
    img1: InputArray,
    keypoints1: Any,
    img2: InputArray,
    keypoints2: Any,
    matches1to2: Any,
    outImg: InputOutputArray,
    matchColor: Any,
    singlePointColor: Any,
    matchesMask: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMatches")(img1.asInstanceOf[js.Any], keypoints1.asInstanceOf[js.Any], img2.asInstanceOf[js.Any], keypoints2.asInstanceOf[js.Any], matches1to2.asInstanceOf[js.Any], outImg.asInstanceOf[js.Any], matchColor.asInstanceOf[js.Any], singlePointColor.asInstanceOf[js.Any], matchesMask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawMatches(
    img1: InputArray,
    keypoints1: Any,
    img2: InputArray,
    keypoints2: Any,
    matches1to2: Any,
    outImg: InputOutputArray,
    matchColor: Any,
    singlePointColor: Any,
    matchesMask: Any,
    flags: DrawMatchesFlags
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMatches")(img1.asInstanceOf[js.Any], keypoints1.asInstanceOf[js.Any], img2.asInstanceOf[js.Any], keypoints2.asInstanceOf[js.Any], matches1to2.asInstanceOf[js.Any], outImg.asInstanceOf[js.Any], matchColor.asInstanceOf[js.Any], singlePointColor.asInstanceOf[js.Any], matchesMask.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawMatches(
    img1: InputArray,
    keypoints1: Any,
    img2: InputArray,
    keypoints2: Any,
    matches1to2: Any,
    outImg: InputOutputArray,
    matchColor: Any,
    singlePointColor: Any,
    matchesMask: Unit,
    flags: DrawMatchesFlags
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMatches")(img1.asInstanceOf[js.Any], keypoints1.asInstanceOf[js.Any], img2.asInstanceOf[js.Any], keypoints2.asInstanceOf[js.Any], matches1to2.asInstanceOf[js.Any], outImg.asInstanceOf[js.Any], matchColor.asInstanceOf[js.Any], singlePointColor.asInstanceOf[js.Any], matchesMask.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawMatches(
    img1: InputArray,
    keypoints1: Any,
    img2: InputArray,
    keypoints2: Any,
    matches1to2: Any,
    outImg: InputOutputArray,
    matchColor: Any,
    singlePointColor: Unit,
    matchesMask: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMatches")(img1.asInstanceOf[js.Any], keypoints1.asInstanceOf[js.Any], img2.asInstanceOf[js.Any], keypoints2.asInstanceOf[js.Any], matches1to2.asInstanceOf[js.Any], outImg.asInstanceOf[js.Any], matchColor.asInstanceOf[js.Any], singlePointColor.asInstanceOf[js.Any], matchesMask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawMatches(
    img1: InputArray,
    keypoints1: Any,
    img2: InputArray,
    keypoints2: Any,
    matches1to2: Any,
    outImg: InputOutputArray,
    matchColor: Any,
    singlePointColor: Unit,
    matchesMask: Any,
    flags: DrawMatchesFlags
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMatches")(img1.asInstanceOf[js.Any], keypoints1.asInstanceOf[js.Any], img2.asInstanceOf[js.Any], keypoints2.asInstanceOf[js.Any], matches1to2.asInstanceOf[js.Any], outImg.asInstanceOf[js.Any], matchColor.asInstanceOf[js.Any], singlePointColor.asInstanceOf[js.Any], matchesMask.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawMatches(
    img1: InputArray,
    keypoints1: Any,
    img2: InputArray,
    keypoints2: Any,
    matches1to2: Any,
    outImg: InputOutputArray,
    matchColor: Any,
    singlePointColor: Unit,
    matchesMask: Unit,
    flags: DrawMatchesFlags
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMatches")(img1.asInstanceOf[js.Any], keypoints1.asInstanceOf[js.Any], img2.asInstanceOf[js.Any], keypoints2.asInstanceOf[js.Any], matches1to2.asInstanceOf[js.Any], outImg.asInstanceOf[js.Any], matchColor.asInstanceOf[js.Any], singlePointColor.asInstanceOf[js.Any], matchesMask.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawMatches(
    img1: InputArray,
    keypoints1: Any,
    img2: InputArray,
    keypoints2: Any,
    matches1to2: Any,
    outImg: InputOutputArray,
    matchColor: Unit,
    singlePointColor: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMatches")(img1.asInstanceOf[js.Any], keypoints1.asInstanceOf[js.Any], img2.asInstanceOf[js.Any], keypoints2.asInstanceOf[js.Any], matches1to2.asInstanceOf[js.Any], outImg.asInstanceOf[js.Any], matchColor.asInstanceOf[js.Any], singlePointColor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawMatches(
    img1: InputArray,
    keypoints1: Any,
    img2: InputArray,
    keypoints2: Any,
    matches1to2: Any,
    outImg: InputOutputArray,
    matchColor: Unit,
    singlePointColor: Any,
    matchesMask: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMatches")(img1.asInstanceOf[js.Any], keypoints1.asInstanceOf[js.Any], img2.asInstanceOf[js.Any], keypoints2.asInstanceOf[js.Any], matches1to2.asInstanceOf[js.Any], outImg.asInstanceOf[js.Any], matchColor.asInstanceOf[js.Any], singlePointColor.asInstanceOf[js.Any], matchesMask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawMatches(
    img1: InputArray,
    keypoints1: Any,
    img2: InputArray,
    keypoints2: Any,
    matches1to2: Any,
    outImg: InputOutputArray,
    matchColor: Unit,
    singlePointColor: Any,
    matchesMask: Any,
    flags: DrawMatchesFlags
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMatches")(img1.asInstanceOf[js.Any], keypoints1.asInstanceOf[js.Any], img2.asInstanceOf[js.Any], keypoints2.asInstanceOf[js.Any], matches1to2.asInstanceOf[js.Any], outImg.asInstanceOf[js.Any], matchColor.asInstanceOf[js.Any], singlePointColor.asInstanceOf[js.Any], matchesMask.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawMatches(
    img1: InputArray,
    keypoints1: Any,
    img2: InputArray,
    keypoints2: Any,
    matches1to2: Any,
    outImg: InputOutputArray,
    matchColor: Unit,
    singlePointColor: Any,
    matchesMask: Unit,
    flags: DrawMatchesFlags
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMatches")(img1.asInstanceOf[js.Any], keypoints1.asInstanceOf[js.Any], img2.asInstanceOf[js.Any], keypoints2.asInstanceOf[js.Any], matches1to2.asInstanceOf[js.Any], outImg.asInstanceOf[js.Any], matchColor.asInstanceOf[js.Any], singlePointColor.asInstanceOf[js.Any], matchesMask.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawMatches(
    img1: InputArray,
    keypoints1: Any,
    img2: InputArray,
    keypoints2: Any,
    matches1to2: Any,
    outImg: InputOutputArray,
    matchColor: Unit,
    singlePointColor: Unit,
    matchesMask: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMatches")(img1.asInstanceOf[js.Any], keypoints1.asInstanceOf[js.Any], img2.asInstanceOf[js.Any], keypoints2.asInstanceOf[js.Any], matches1to2.asInstanceOf[js.Any], outImg.asInstanceOf[js.Any], matchColor.asInstanceOf[js.Any], singlePointColor.asInstanceOf[js.Any], matchesMask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawMatches(
    img1: InputArray,
    keypoints1: Any,
    img2: InputArray,
    keypoints2: Any,
    matches1to2: Any,
    outImg: InputOutputArray,
    matchColor: Unit,
    singlePointColor: Unit,
    matchesMask: Any,
    flags: DrawMatchesFlags
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMatches")(img1.asInstanceOf[js.Any], keypoints1.asInstanceOf[js.Any], img2.asInstanceOf[js.Any], keypoints2.asInstanceOf[js.Any], matches1to2.asInstanceOf[js.Any], outImg.asInstanceOf[js.Any], matchColor.asInstanceOf[js.Any], singlePointColor.asInstanceOf[js.Any], matchesMask.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawMatches(
    img1: InputArray,
    keypoints1: Any,
    img2: InputArray,
    keypoints2: Any,
    matches1to2: Any,
    outImg: InputOutputArray,
    matchColor: Unit,
    singlePointColor: Unit,
    matchesMask: Unit,
    flags: DrawMatchesFlags
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMatches")(img1.asInstanceOf[js.Any], keypoints1.asInstanceOf[js.Any], img2.asInstanceOf[js.Any], keypoints2.asInstanceOf[js.Any], matches1to2.asInstanceOf[js.Any], outImg.asInstanceOf[js.Any], matchColor.asInstanceOf[js.Any], singlePointColor.asInstanceOf[js.Any], matchesMask.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type DrawMatchesFlags = Any
}
