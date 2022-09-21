package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controllerMod {
  
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
    
    def badRequest(): typings.nginstackEngine.routeResultMod.^ = js.native
    def badRequest(opt_content: Any): typings.nginstackEngine.routeResultMod.^ = js.native
    
    def created(): typings.nginstackEngine.routeResultMod.^ = js.native
    def created(opt_content: Any): typings.nginstackEngine.routeResultMod.^ = js.native
    
    def forbidden(): typings.nginstackEngine.routeResultMod.^ = js.native
    def forbidden(opt_content: Any): typings.nginstackEngine.routeResultMod.^ = js.native
    
    def hasAction(name: String): Boolean = js.native
    
    var moduleFileName: String = js.native
    
    /* private */ var newResult_ : Any = js.native
    
    def noContent(): typings.nginstackEngine.routeResultMod.^ = js.native
    
    def notFound(): typings.nginstackEngine.routeResultMod.^ = js.native
    def notFound(opt_content: Any): typings.nginstackEngine.routeResultMod.^ = js.native
    
    def notModified(): typings.nginstackEngine.routeResultMod.^ = js.native
    
    def ok(): typings.nginstackEngine.routeResultMod.^ = js.native
    def ok(opt_content: Any): typings.nginstackEngine.routeResultMod.^ = js.native
    
    def permanentRedirect(url: String): typings.nginstackEngine.routeResultMod.^ = js.native
    
    def runAction(action: String, parameters: js.Array[Any], request: Request, response: Response): typings.nginstackEngine.routeResultMod.^ = js.native
    
    def temporaryRedirect(url: String): typings.nginstackEngine.routeResultMod.^ = js.native
  }
  
  type Request = typings.nginstackEngine.httpRequestMod.^
  
  type Response = typings.nginstackEngine.httpResponseMod.^
}
