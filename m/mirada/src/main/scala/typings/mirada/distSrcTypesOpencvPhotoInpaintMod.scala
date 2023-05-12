package typings.mirada

import typings.mirada.distSrcTypesOpencvHacksMod.double
import typings.mirada.distSrcTypesOpencvHacksMod.int
import typings.mirada.distSrcTypesOpencvTypesMod.InputArray
import typings.mirada.distSrcTypesOpencvTypesMod.OutputArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvPhotoInpaintMod {
  
  @JSImport("mirada/dist/src/types/opencv/photo_inpaint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/photo_inpaint", "INPAINT_NS")
  @js.native
  val INPAINT_NS: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/photo_inpaint", "INPAINT_TELEA")
  @js.native
  val INPAINT_TELEA: Any = js.native
  
  inline def inpaint(src: InputArray, inpaintMask: InputArray, dst: OutputArray, inpaintRadius: double, flags: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inpaint")(src.asInstanceOf[js.Any], inpaintMask.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], inpaintRadius.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
