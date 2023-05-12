package typings.mkdirp

import typings.mkdirp.anon.`1`
import typings.mkdirp.distMjsOptsArgMod.MkdirpOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsUseNativeMod {
  
  @JSImport("mkdirp/dist/mjs/use-native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mkdirp/dist/mjs/use-native", "useNative")
  @js.native
  val useNative: (js.Function1[/* opts */ js.UndefOr[MkdirpOptions], Boolean]) & `1` = js.native
  
  inline def useNativeSync(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useNativeSync")().asInstanceOf[Boolean]
  inline def useNativeSync(opts: MkdirpOptions): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useNativeSync")(opts.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
