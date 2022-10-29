package typings.pixiFilterBlur

import typings.pixiCore.libIrendererMod.IRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGetMaxBlurKernelSizeMod {
  
  @JSImport("@pixi/filter-blur/lib/getMaxBlurKernelSize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMaxKernelSize(gl: IRenderingContext): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaxKernelSize")(gl.asInstanceOf[js.Any]).asInstanceOf[Double]
}
