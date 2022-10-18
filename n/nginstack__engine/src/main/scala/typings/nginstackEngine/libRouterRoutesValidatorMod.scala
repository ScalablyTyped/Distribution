package typings.nginstackEngine

import typings.nginstackEngine.anon.Errors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRouterRoutesValidatorMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/router/RoutesValidator", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with RoutesValidator
  @JSImport("@nginstack/engine/lib/router/RoutesValidator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait RoutesValidator extends StObject {
    
    /* private */ var loadController_ : Any = js.native
    
    /* private */ var validateAction_ : Any = js.native
    
    def validateDirectory(directoryKey: Double, opt_product: Double): Errors = js.native
    
    def validateFile(path: String): Errors = js.native
    def validateFile(path: Double): Errors = js.native
    
    /* private */ var validateParams_ : Any = js.native
    
    /* private */ var validateRoutes_ : Any = js.native
  }
}
