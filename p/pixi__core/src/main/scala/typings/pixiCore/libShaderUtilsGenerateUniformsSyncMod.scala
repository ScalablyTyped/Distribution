package typings.pixiCore

import typings.pixiCore.libShaderUniformGroupMod.UniformGroup
import typings.pixiUtils.libTypesMod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShaderUtilsGenerateUniformsSyncMod {
  
  @JSImport("@pixi/core/lib/shader/utils/generateUniformsSync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateUniformsSync(group: UniformGroup[Dict[Any]], uniformData: Dict[Any]): UniformsSyncCallback = (^.asInstanceOf[js.Dynamic].applyDynamic("generateUniformsSync")(group.asInstanceOf[js.Any], uniformData.asInstanceOf[js.Any])).asInstanceOf[UniformsSyncCallback]
  
  @js.native
  trait UniformsSyncCallback extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
}
