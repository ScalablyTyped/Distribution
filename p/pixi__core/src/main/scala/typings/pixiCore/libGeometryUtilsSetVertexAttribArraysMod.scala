package typings.pixiCore

import typings.pixiCore.libIrendererMod.IRenderingContext
import typings.pixiUtils.libTypesMod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryUtilsSetVertexAttribArraysMod {
  
  @JSImport("@pixi/core/lib/geometry/utils/setVertexAttribArrays", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setVertexAttribArrays(gl: IRenderingContext, attribs: Dict[Any], state: Dict[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setVertexAttribArrays")(gl.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
