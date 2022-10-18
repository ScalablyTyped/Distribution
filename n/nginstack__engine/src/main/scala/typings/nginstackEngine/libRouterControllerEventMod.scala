package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRouterControllerEventMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/router/ControllerEvent", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ControllerEvent {
    def this(args: Any*) = this()
    
    /* CompleteClass */
    var action: String = js.native
    
    /* CompleteClass */
    var controller: Controller = js.native
    
    /* CompleteClass */
    var request: Request = js.native
    
    /* CompleteClass */
    var response: Response = js.native
    
    /* CompleteClass */
    var result: RouteResult = js.native
  }
  @JSImport("@nginstack/engine/lib/router/ControllerEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Controller = typings.nginstackEngine.libRouterControllerMod.^
  
  trait ControllerEvent extends StObject {
    
    var action: String
    
    var controller: Controller
    
    var request: Request
    
    var response: Response
    
    var result: RouteResult
  }
  object ControllerEvent {
    
    inline def apply(action: String, controller: Controller, request: Request, response: Response, result: RouteResult): ControllerEvent = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], controller = controller.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControllerEvent]
    }
    
    extension [Self <: ControllerEvent](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setController(value: Controller): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResult(value: RouteResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  type Request = typings.nginstackEngine.libHttpRequestMod.^
  
  type Response = typings.nginstackEngine.libHttpResponseMod.^
  
  type RouteResult = typings.nginstackEngine.libRouterRouteResultMod.^
}
