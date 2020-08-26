package typings.openfin

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/shapes/ERROR_BOX_TYPES", JSImport.Namespace)
@js.native
object errorBOXTYPESMod extends js.Object {
  @js.native
  sealed trait ERROR_BOX_TYPES extends js.Object
  
  @js.native
  object ERROR_BOX_TYPES extends js.Object {
    @js.native
    sealed trait APP_INITIALIZATION extends ERROR_BOX_TYPES
    
    @js.native
    sealed trait MAIN_PROCESS extends ERROR_BOX_TYPES
    
    @js.native
    sealed trait RENDERER_CRASH extends ERROR_BOX_TYPES
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ERROR_BOX_TYPES with String] = js.native
    /* "OF_error_box:app_initialization" */ @js.native
    object APP_INITIALIZATION extends TopLevel[APP_INITIALIZATION with String]
    
    /* "OF_error_box:main_process" */ @js.native
    object MAIN_PROCESS extends TopLevel[MAIN_PROCESS with String]
    
    /* "OF_error_box:renderer_crash" */ @js.native
    object RENDERER_CRASH extends TopLevel[RENDERER_CRASH with String]
    
  }
  
}

