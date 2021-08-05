package typings.openfin

import typings.openfin.environmentMod.Environment
import typings.openfin.shapesPlatformMod.OverrideCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object platformProviderMod {
  
  @JSImport("openfin/_v2/api/platform/platform-provider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(environment: Environment): js.Function1[/* userOverrideFn */ OverrideCallback[js.Any], js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(environment.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* userOverrideFn */ OverrideCallback[js.Any], js.Promise[Unit]]]
}
