package typings.pixiUtils

import typings.pixiSettings.libIcanvasMod.ICanvas
import typings.pixiUtils.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMediaTrimCanvasMod {
  
  @JSImport("@pixi/utils/lib/media/trimCanvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def trimCanvas(canvas: ICanvas): Data = ^.asInstanceOf[js.Dynamic].applyDynamic("trimCanvas")(canvas.asInstanceOf[js.Any]).asInstanceOf[Data]
}
