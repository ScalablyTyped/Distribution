package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmptyIndicatorMode extends StObject
@JSImport("sap/m/library", "EmptyIndicatorMode")
@js.native
object EmptyIndicatorMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EmptyIndicatorMode & String] = js.native
  
  /**
    * Empty indicator will be rendered depending on the context in which the control is placed. If one of the
    * parents has the context class sapMShowEmpty-CTX then the empty indicator will be shown.
    */
  @js.native
  sealed trait Auto
    extends StObject
       with EmptyIndicatorMode
  /* "Auto" */ val Auto: typings.openui5.sapMLibraryMod.EmptyIndicatorMode.Auto & String = js.native
  
  /**
    * Empty indicator is never rendered.
    */
  @js.native
  sealed trait Off
    extends StObject
       with EmptyIndicatorMode
  /* "Off" */ val Off: typings.openui5.sapMLibraryMod.EmptyIndicatorMode.Off & String = js.native
  
  /**
    * Empty indicator is rendered always when the control's content is empty.
    */
  @js.native
  sealed trait On
    extends StObject
       with EmptyIndicatorMode
  /* "On" */ val On: typings.openui5.sapMLibraryMod.EmptyIndicatorMode.On & String = js.native
}
