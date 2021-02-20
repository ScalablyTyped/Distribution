package typings.openfin

import typings.openfin.environmentMod.Environment
import typings.openfin.shapesPlatformMod.OverrideCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object platformProviderMod {
  
  @JSImport("openfin/_v2/api/platform/platform-provider", JSImport.Default)
  @js.native
  def default(environment: Environment): js.Function1[/* userOverrideFn */ OverrideCallback[_], js.Promise[Unit]] = js.native
}
