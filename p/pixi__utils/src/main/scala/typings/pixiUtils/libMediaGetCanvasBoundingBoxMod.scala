package typings.pixiUtils

import typings.pixiSettings.libIcanvasMod.ICanvas
import typings.pixiUtils.libMediaBoundingBoxMod.BoundingBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMediaGetCanvasBoundingBoxMod {
  
  @JSImport("@pixi/utils/lib/media/getCanvasBoundingBox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCanvasBoundingBox(canvas: ICanvas): BoundingBox = ^.asInstanceOf[js.Dynamic].applyDynamic("getCanvasBoundingBox")(canvas.asInstanceOf[js.Any]).asInstanceOf[BoundingBox]
}
