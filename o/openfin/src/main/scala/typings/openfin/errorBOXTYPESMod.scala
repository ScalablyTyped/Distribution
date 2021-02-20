package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorBOXTYPESMod {
  
  @js.native
  sealed trait ERROR_BOX_TYPES extends StObject
  @JSImport("openfin/_v2/shapes/ERROR_BOX_TYPES", "ERROR_BOX_TYPES")
  @js.native
  object ERROR_BOX_TYPES extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ERROR_BOX_TYPES with String] = js.native
    
    @js.native
    sealed trait APP_INITIALIZATION extends ERROR_BOX_TYPES
    /* "OF_error_box:app_initialization" */ val APP_INITIALIZATION: typings.openfin.errorBOXTYPESMod.ERROR_BOX_TYPES.APP_INITIALIZATION with String = js.native
    
    @js.native
    sealed trait MAIN_PROCESS extends ERROR_BOX_TYPES
    /* "OF_error_box:main_process" */ val MAIN_PROCESS: typings.openfin.errorBOXTYPESMod.ERROR_BOX_TYPES.MAIN_PROCESS with String = js.native
    
    @js.native
    sealed trait RENDERER_CRASH extends ERROR_BOX_TYPES
    /* "OF_error_box:renderer_crash" */ val RENDERER_CRASH: typings.openfin.errorBOXTYPESMod.ERROR_BOX_TYPES.RENDERER_CRASH with String = js.native
  }
}
