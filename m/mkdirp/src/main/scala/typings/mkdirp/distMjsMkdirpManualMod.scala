package typings.mkdirp

import typings.mkdirp.anon.Sync
import typings.mkdirp.distMjsOptsArgMod.MkdirpOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsMkdirpManualMod {
  
  @JSImport("mkdirp/dist/mjs/mkdirp-manual", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mkdirp/dist/mjs/mkdirp-manual", "mkdirpManual")
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
}
