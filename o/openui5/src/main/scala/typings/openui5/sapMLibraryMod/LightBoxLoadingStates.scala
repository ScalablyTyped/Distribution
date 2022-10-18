package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LightBoxLoadingStates extends StObject
@JSImport("sap/m/library", "LightBoxLoadingStates")
@js.native
object LightBoxLoadingStates extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LightBoxLoadingStates & String] = js.native
  
  /**
    * The LightBox image could not load.
    */
  @js.native
  sealed trait Error
    extends StObject
       with LightBoxLoadingStates
  /* "ERROR" */ val Error: typings.openui5.sapMLibraryMod.LightBoxLoadingStates.Error & String = js.native
  
  /**
    * The LightBox image has loaded.
    */
  @js.native
  sealed trait Loaded
    extends StObject
       with LightBoxLoadingStates
  /* "LOADED" */ val Loaded: typings.openui5.sapMLibraryMod.LightBoxLoadingStates.Loaded & String = js.native
  
  /**
    * The LightBox image is still loading.
    */
  @js.native
  sealed trait Loading
    extends StObject
       with LightBoxLoadingStates
  /* "LOADING" */ val Loading: typings.openui5.sapMLibraryMod.LightBoxLoadingStates.Loading & String = js.native
  
  /**
    * The LightBox image has timed out, could not load.
    */
  @js.native
  sealed trait TimeOutError
    extends StObject
       with LightBoxLoadingStates
  /* "TIME_OUT_ERROR" */ val TimeOutError: typings.openui5.sapMLibraryMod.LightBoxLoadingStates.TimeOutError & String = js.native
}
