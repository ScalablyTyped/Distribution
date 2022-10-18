package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRouterControllerMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/router/Controller", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Controller
  @JSImport("@nginstack/engine/lib/router/Controller", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wrap(`object`: Any): Controller = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(`object`.asInstanceOf[js.Any]).asInstanceOf[Controller]
  
  @js.native
  trait Controller extends StObject {
    
    /* protected */ var actions_ : Any = js.native
    
    def badRequest(): typings.nginstackEngine.libRouterRouteResultMod.^ = js.native
    def badRequest(opt_content: Any): typings.nginstackEngine.libRouterRouteResultMod.^ = js.native
    
    def created(): typings.nginstackEngine.libRouterRouteResultMod.^ = js.native
    def created(opt_content: Any): typings.nginstackEngine.libRouterRouteResultMod.^ = js.native
    
    def forbidden(): typings.nginstackEngine.libRouterRouteResultMod.^ = js.native
    def forbidden(opt_content: Any): typings.nginstackEngine.libRouterRouteResultMod.^ = js.native
    
    def hasAction(name: String): Boolean = js.native
    
    var moduleFileName: String = js.native
    
    /* private */ var newResult_ : Any = js.native
    
    def noContent(): typings.nginstackEngine.libRouterRouteResultMod.^ = js.native
    
    def notFound(): typings.nginstackEngine.libRouterRouteResultMod.^ = js.native
    def notFound(opt_content: Any): typings.nginstackEngine.libRouterRouteResultMod.^ = js.native
    
    def notModified(): typings.nginstackEngine.libRouterRouteResultMod.^ = js.native
    
    def ok(): typings.nginstackEngine.libRouterRouteResultMod.^ = js.native
    def ok(opt_content: Any): typings.nginstackEngine.libRouterRouteResultMod.^ = js.native
    
    def permanentRedirect(url: String): typings.nginstackEngine.libRouterRouteResultMod.^ = js.native
    
    def runAction(action: String, parameters: js.Array[Any], request: Request, response: Response): typings.nginstackEngine.libRouterRouteResultMod.^ = js.native
    
    def temporaryRedirect(url: String): typings.nginstackEngine.libRouterRouteResultMod.^ = js.native
  }
  
  type Request = typings.nginstackEngine.libHttpRequestMod.^
  
  type Response = typings.nginstackEngine.libHttpResponseMod.^
}
