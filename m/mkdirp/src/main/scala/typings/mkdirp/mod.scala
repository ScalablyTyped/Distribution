package typings.mkdirp

import typings.mkdirp.anon.Manual
import typings.mkdirp.anon.Sync
import typings.mkdirp.anon.`0`
import typings.mkdirp.anon.`1`
import typings.mkdirp.anon.`2`
import typings.mkdirp.distMjsOptsArgMod.MkdirpOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mkdirp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mkdirp", "manual")
  @js.native
  val manual: (js.Function3[
    /* path */ String, 
    /* options */ js.UndefOr[MkdirpOptions], 
    /* made */ js.UndefOr[String | Unit], 
    js.Promise[js.UndefOr[String | Unit]]
  ]) & `2` = js.native
  
  inline def manualSync(path: String): js.UndefOr[String | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("manualSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Unit]]
  inline def manualSync(path: String, options: Unit, made: String): js.UndefOr[String | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("manualSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], made.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Unit]]
  inline def manualSync(path: String, options: Unit, made: Unit): js.UndefOr[String | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("manualSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], made.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Unit]]
  inline def manualSync(path: String, options: MkdirpOptions): js.UndefOr[String | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("manualSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Unit]]
  inline def manualSync(path: String, options: MkdirpOptions, made: String): js.UndefOr[String | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("manualSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], made.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Unit]]
  inline def manualSync(path: String, options: MkdirpOptions, made: Unit): js.UndefOr[String | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("manualSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], made.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Unit]]
  
  @JSImport("mkdirp", "mkdirp")
  @js.native
  val mkdirp: (js.Function2[
    /* path */ String, 
    /* opts */ js.UndefOr[MkdirpOptions], 
    js.Promise[js.UndefOr[String | Unit]]
  ]) & Manual = js.native
  
  @JSImport("mkdirp", "mkdirpManual")
  @js.native
  val mkdirpManual: (js.Function3[
    /* path */ String, 
    /* options */ js.UndefOr[MkdirpOptions], 
    /* made */ js.UndefOr[String | Unit], 
    js.Promise[js.UndefOr[String | Unit]]
  ]) & Sync = js.native
  
  inline def mkdirpManualSync(path: String): js.UndefOr[String | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirpManualSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Unit]]
  inline def mkdirpManualSync(path: String, options: Unit, made: String): js.UndefOr[String | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirpManualSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], made.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Unit]]
  inline def mkdirpManualSync(path: String, options: Unit, made: Unit): js.UndefOr[String | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirpManualSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], made.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Unit]]
  inline def mkdirpManualSync(path: String, options: MkdirpOptions): js.UndefOr[String | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirpManualSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Unit]]
  inline def mkdirpManualSync(path: String, options: MkdirpOptions, made: String): js.UndefOr[String | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirpManualSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], made.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Unit]]
  inline def mkdirpManualSync(path: String, options: MkdirpOptions, made: Unit): js.UndefOr[String | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirpManualSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], made.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Unit]]
  
  @JSImport("mkdirp", "mkdirpNative")
  @js.native
  val mkdirpNative: (js.Function2[
    /* path */ String, 
    /* options */ js.UndefOr[MkdirpOptions], 
    js.Promise[js.UndefOr[String | Unit]]
  ]) & `0` = js.native
  
  inline def mkdirpNativeSync(path: String): js.UndefOr[String | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirpNativeSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Unit]]
  inline def mkdirpNativeSync(path: String, options: MkdirpOptions): js.UndefOr[String | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirpNativeSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Unit]]
  
  inline def mkdirpSync(path: String): String | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirpSync")(path.asInstanceOf[js.Any]).asInstanceOf[String | Unit]
  inline def mkdirpSync(path: String, opts: MkdirpOptions): String | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirpSync")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String | Unit]
  
  @JSImport("mkdirp", "native")
  @js.native
  val native: (js.Function2[
    /* path */ String, 
    /* options */ js.UndefOr[MkdirpOptions], 
    js.Promise[js.UndefOr[String | Unit]]
  ]) & `0` = js.native
  
  inline def nativeSync(path: String): js.UndefOr[String | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("nativeSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Unit]]
  inline def nativeSync(path: String, options: MkdirpOptions): js.UndefOr[String | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("nativeSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Unit]]
  
  inline def sync(path: String): String | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(path.asInstanceOf[js.Any]).asInstanceOf[String | Unit]
  inline def sync(path: String, opts: MkdirpOptions): String | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String | Unit]
  
  @JSImport("mkdirp", "useNative")
  @js.native
  val useNative: (js.Function1[/* opts */ js.UndefOr[MkdirpOptions], Boolean]) & `1` = js.native
  
  inline def useNativeSync(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useNativeSync")().asInstanceOf[Boolean]
  inline def useNativeSync(opts: MkdirpOptions): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useNativeSync")(opts.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
