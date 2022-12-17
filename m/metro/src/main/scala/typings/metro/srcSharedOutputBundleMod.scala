package typings.metro

import typings.metro.anon.Map
import typings.metro.serverMod.Server
import typings.metro.sharedTypesMod.OutputOptions
import typings.metro.sharedTypesMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSharedOutputBundleMod {
  
  @JSImport("metro/src/shared/output/bundle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def build(packagerClient: Server, requestOptions: RequestOptions): js.Promise[Map] = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(packagerClient.asInstanceOf[js.Any], requestOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Map]]
  
  inline def save(bundle: Map, options: OutputOptions, log: js.Function1[/* repeated */ String, Unit]): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("save")(bundle.asInstanceOf[js.Any], options.asInstanceOf[js.Any], log.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
