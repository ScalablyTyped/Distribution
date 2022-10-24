package typings.next

import typings.next.anon.CustomAppFile
import typings.next.distCompiledWebpackWebpackMod.webpack.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackConfigMod_ {
  
  @JSImport("next/dist/build/webpack/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def build(config: Configuration, param1: CustomAppFile): js.Promise[Configuration] = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(config.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Configuration]]
}
