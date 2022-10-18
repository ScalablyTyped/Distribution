package typings.next

import typings.next.anon.AssetPrefix
import typings.next.anon.BeforeRender
import typings.next.anon.WebpackHMR
import typings.next.distSharedLibMittMod.MittEmitter
import typings.next.distSharedLibRouterRouterMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientMod {
  
  @JSImport("next/client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/client", "emitter")
  @js.native
  val emitter: MittEmitter[String] = js.native
  
  inline def hydrate(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")().asInstanceOf[js.Promise[Unit]]
  inline def hydrate(opts: BeforeRender): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def initialize(): js.Promise[AssetPrefix] = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")().asInstanceOf[js.Promise[AssetPrefix]]
  inline def initialize(opts: WebpackHMR): js.Promise[AssetPrefix] = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AssetPrefix]]
  
  @JSImport("next/client", "router")
  @js.native
  def router: default = js.native
  inline def router_=(x: default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("router")(x.asInstanceOf[js.Any])
  
  @JSImport("next/client", "version")
  @js.native
  val version: js.UndefOr[String] = js.native
}
