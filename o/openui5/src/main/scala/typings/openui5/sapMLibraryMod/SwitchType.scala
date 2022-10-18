package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SwitchType extends StObject
@JSImport("sap/m/library", "SwitchType")
@js.native
object SwitchType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SwitchType & String] = js.native
  
  /**
    * Switch with accept and reject icons
    */
  @js.native
  sealed trait AcceptReject
    extends StObject
       with SwitchType
  /* "AcceptReject" */ val AcceptReject: typings.openui5.sapMLibraryMod.SwitchType.AcceptReject & String = js.native
  
  /**
    * Will show "ON" and "OFF" translated to the current language or the custom text if provided
    */
  @js.native
  sealed trait Default
    extends StObject
       with SwitchType
  /* "Default" */ val Default: typings.openui5.sapMLibraryMod.SwitchType.Default & String = js.native
}
