package typings.metro

import typings.metro.anon.Map
import typings.metro.srcServerMod.default
import typings.metro.srcSharedTypesMod.OutputOptions
import typings.metro.srcSharedTypesMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSharedOutputBundleMod {
  
  @JSImport("metro/src/shared/output/bundle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def build(packagerClient: default, requestOptions: RequestOptions): js.Promise[Map] = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(packagerClient.asInstanceOf[js.Any], requestOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Map]]
  
  @JSImport("metro/src/shared/output/bundle", "formatName")
  @js.native
  val formatName: String = js.native
  
  inline def save(bundle: Map, options: OutputOptions, log: js.Function1[/* repeated */ String, Unit]): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("save")(bundle.asInstanceOf[js.Any], options.asInstanceOf[js.Any], log.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
