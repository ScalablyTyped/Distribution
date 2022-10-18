package typings.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Scrolling extends StObject
@JSImport("sap/ui/core/library", "Scrolling")
@js.native
object Scrolling extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Scrolling & String] = js.native
  
  /**
    * A scroll bar is shown if the content requires more space than the given space (rectangle) provides.
    */
  @js.native
  sealed trait Auto
    extends StObject
       with Scrolling
  /* "Auto" */ val Auto: typings.openui5.sapUiCoreLibraryMod.Scrolling.Auto & String = js.native
  
  /**
    * No scroll bar is shown, and the content stays in the given rectangle.
    */
  @js.native
  sealed trait Hidden
    extends StObject
       with Scrolling
  /* "Hidden" */ val Hidden: typings.openui5.sapUiCoreLibraryMod.Scrolling.Hidden & String = js.native
  
  /**
    * No scroll bar provided even if the content is larger than the available space.
    */
  @js.native
  sealed trait None
    extends StObject
       with Scrolling
  /* "None" */ val None: typings.openui5.sapUiCoreLibraryMod.Scrolling.None & String = js.native
  
  /**
    * A scroll bar is always shown even if the space is large enough for the current content.
    */
  @js.native
  sealed trait Scroll
    extends StObject
       with Scrolling
  /* "Scroll" */ val Scroll: typings.openui5.sapUiCoreLibraryMod.Scrolling.Scroll & String = js.native
}
