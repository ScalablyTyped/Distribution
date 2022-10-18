package typings.next

import typings.next.anon.AssetPrefix
import typings.next.anon.BeforeRender
import typings.next.anon.WebpackHMR
import typings.next.distSharedLibMittMod.MittEmitter
import typings.next.distSharedLibRouterRouterMod.default
import typings.next.distSharedLibUtilsMod.NEXT_DATA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientMod {
  
  @JSImport("next/dist/client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/client", "emitter")
  @js.native
  val emitter: MittEmitter[String] = js.native
  
  inline def hydrate(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")().asInstanceOf[js.Promise[Unit]]
  inline def hydrate(opts: BeforeRender): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def initialize(): js.Promise[AssetPrefix] = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")().asInstanceOf[js.Promise[AssetPrefix]]
  inline def initialize(opts: WebpackHMR): js.Promise[AssetPrefix] = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AssetPrefix]]
  
  @JSImport("next/dist/client", "router")
  @js.native
  def router: default = js.native
  inline def router_=(x: default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("router")(x.asInstanceOf[js.Any])
  
  @JSImport("next/dist/client", "version")
  @js.native
  val version: js.UndefOr[String] = js.native
  
  object global {
    
    trait Window extends StObject {
      
      var __NEXT_DATA__ : NEXT_DATA
      
      var __NEXT_HYDRATED: js.UndefOr[Boolean] = js.undefined
      
      var __NEXT_HYDRATED_CB: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      var __NEXT_P: js.Array[Any]
      
      var __NEXT_PRELOADREADY: js.UndefOr[js.Function1[/* ids */ js.UndefOr[js.Array[String | Double]], Unit]] = js.undefined
    }
    object Window {
      
      inline def apply(__NEXT_DATA__ : NEXT_DATA, __NEXT_P: js.Array[Any]): typings.next.distClientMod.global.Window = {
        val __obj = js.Dynamic.literal(__NEXT_DATA__ = __NEXT_DATA__.asInstanceOf[js.Any], __NEXT_P = __NEXT_P.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.next.distClientMod.global.Window]
      }
      
      extension [Self <: typings.next.distClientMod.global.Window](x: Self) {
        
        inline def set__NEXT_DATA__(value: NEXT_DATA): Self = StObject.set(x, "__NEXT_DATA__", value.asInstanceOf[js.Any])
        
        inline def set__NEXT_HYDRATED(value: Boolean): Self = StObject.set(x, "__NEXT_HYDRATED", value.asInstanceOf[js.Any])
        
        inline def set__NEXT_HYDRATEDUndefined: Self = StObject.set(x, "__NEXT_HYDRATED", js.undefined)
        
        inline def set__NEXT_HYDRATED_CB(value: () => Unit): Self = StObject.set(x, "__NEXT_HYDRATED_CB", js.Any.fromFunction0(value))
        
        inline def set__NEXT_HYDRATED_CBUndefined: Self = StObject.set(x, "__NEXT_HYDRATED_CB", js.undefined)
        
        inline def set__NEXT_P(value: js.Array[Any]): Self = StObject.set(x, "__NEXT_P", value.asInstanceOf[js.Any])
        
        inline def set__NEXT_PRELOADREADY(value: /* ids */ js.UndefOr[js.Array[String | Double]] => Unit): Self = StObject.set(x, "__NEXT_PRELOADREADY", js.Any.fromFunction1(value))
        
        inline def set__NEXT_PRELOADREADYUndefined: Self = StObject.set(x, "__NEXT_PRELOADREADY", js.undefined)
        
        inline def set__NEXT_PVarargs(value: Any*): Self = StObject.set(x, "__NEXT_P", js.Array(value*))
      }
    }
  }
}
