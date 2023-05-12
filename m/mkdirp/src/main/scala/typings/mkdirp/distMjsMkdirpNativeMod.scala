package typings.mkdirp

import typings.mkdirp.anon.`0`
import typings.mkdirp.distMjsOptsArgMod.MkdirpOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsMkdirpNativeMod {
  
  @JSImport("mkdirp/dist/mjs/mkdirp-native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mkdirp/dist/mjs/mkdirp-native", "mkdirpNative")
  @js.native
  val mkdirpNative: (js.Function2[
    /* path */ String, 
    /* options */ js.UndefOr[MkdirpOptions], 
    js.Promise[js.UndefOr[String | Unit]]
  ]) & `0` = js.native
  
  inline def mkdirpNativeSync(path: String): js.UndefOr[String | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirpNativeSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Unit]]
  inline def mkdirpNativeSync(path: String, options: MkdirpOptions): js.UndefOr[String | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirpNativeSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Unit]]
}
