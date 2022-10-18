package typings.next

import typings.next.anon.BuildInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackLoadersUtilsMod {
  
  @JSImport("next/dist/build/webpack/loaders/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isClientComponentModule(mod: BuildInfo): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClientComponentModule")(mod.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
