package typings.pixiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShaderUtilsMapTypeMod {
  
  @JSImport("@pixi/core/lib/shader/utils/mapType", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mapType(gl: Any, `type`: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mapType")(gl.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
}
