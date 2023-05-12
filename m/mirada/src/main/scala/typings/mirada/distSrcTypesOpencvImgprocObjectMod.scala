package typings.mirada

import typings.mirada.distSrcTypesOpencvHacksMod.int
import typings.mirada.distSrcTypesOpencvTypesMod.InputArray
import typings.mirada.distSrcTypesOpencvTypesMod.OutputArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvImgprocObjectMod {
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_object", "TM_CCOEFF")
  @js.native
  val TM_CCOEFF: TemplateMatchModes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_object", "TM_CCOEFF_NORMED")
  @js.native
  val TM_CCOEFF_NORMED: TemplateMatchModes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_object", "TM_CCORR")
  @js.native
  val TM_CCORR: TemplateMatchModes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_object", "TM_CCORR_NORMED")
  @js.native
  val TM_CCORR_NORMED: TemplateMatchModes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_object", "TM_SQDIFF")
  @js.native
  val TM_SQDIFF: TemplateMatchModes = js.native
  
  @JSImport("mirada/dist/src/types/opencv/imgproc_object", "TM_SQDIFF_NORMED")
  @js.native
  val TM_SQDIFF_NORMED: TemplateMatchModes = js.native
  
  inline def matchTemplate(image: InputArray, templ: InputArray, result: OutputArray, method: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("matchTemplate")(image.asInstanceOf[js.Any], templ.asInstanceOf[js.Any], result.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def matchTemplate(image: InputArray, templ: InputArray, result: OutputArray, method: int, mask: InputArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("matchTemplate")(image.asInstanceOf[js.Any], templ.asInstanceOf[js.Any], result.asInstanceOf[js.Any], method.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type TemplateMatchModes = Any
}
