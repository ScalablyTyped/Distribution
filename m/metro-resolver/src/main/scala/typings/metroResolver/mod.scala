package typings.metroResolver

import typings.metroResolver.typesMod.Resolution
import typings.metroResolver.typesMod.ResolutionContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("metro-resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolve(context: ResolutionContext, moduleName: String): Resolution = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(context.asInstanceOf[js.Any], moduleName.asInstanceOf[js.Any])).asInstanceOf[Resolution]
  inline def resolve(context: ResolutionContext, moduleName: String, platform: String): Resolution = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(context.asInstanceOf[js.Any], moduleName.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Resolution]
}
