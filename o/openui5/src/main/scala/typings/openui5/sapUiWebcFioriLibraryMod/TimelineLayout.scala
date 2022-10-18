package typings.openui5.sapUiWebcFioriLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimelineLayout extends StObject
@JSImport("sap/ui/webc/fiori/library", "TimelineLayout")
@js.native
object TimelineLayout extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TimelineLayout & String] = js.native
  
  /**
    * Horizontal layout
    */
  @js.native
  sealed trait Horizontal
    extends StObject
       with TimelineLayout
  /* "Horizontal" */ val Horizontal: typings.openui5.sapUiWebcFioriLibraryMod.TimelineLayout.Horizontal & String = js.native
  
  /**
    * Vertical layout Default type
    */
  @js.native
  sealed trait Vertical
    extends StObject
       with TimelineLayout
  /* "Vertical" */ val Vertical: typings.openui5.sapUiWebcFioriLibraryMod.TimelineLayout.Vertical & String = js.native
}
