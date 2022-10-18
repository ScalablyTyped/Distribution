package typings.openui5.sapUiWebcFioriLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IllustrationMessageSize extends StObject
@JSImport("sap/ui/webc/fiori/library", "IllustrationMessageSize")
@js.native
object IllustrationMessageSize extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[IllustrationMessageSize & String] = js.native
  
  /**
    * Automatically decides the `Illustration` size (`Base`, `Spot`, `Dialog`, or `Scene`) depending on the
    * `IllustratedMessage` container width.
    *
    * **Note:** `Auto` is the only option where the illustration size is changed according to the available
    * container width. If any other `IllustratedMessageSize` is chosen, it remains until changed by the app
    * developer.
    */
  @js.native
  sealed trait Auto
    extends StObject
       with IllustrationMessageSize
  /* "Auto" */ val Auto: typings.openui5.sapUiWebcFioriLibraryMod.IllustrationMessageSize.Auto & String = js.native
  
  /**
    * Base `Illustration` size (XS breakpoint). Suitable for cards (two columns).
    *
    * **Note:** When `Base` is in use, no illustration is displayed.
    */
  @js.native
  sealed trait Base
    extends StObject
       with IllustrationMessageSize
  /* "Base" */ val Base: typings.openui5.sapUiWebcFioriLibraryMod.IllustrationMessageSize.Base & String = js.native
  
  /**
    * Dialog `Illustration` size (M breakpoint). Suitable for dialogs.
    */
  @js.native
  sealed trait Dialog
    extends StObject
       with IllustrationMessageSize
  /* "Dialog" */ val Dialog: typings.openui5.sapUiWebcFioriLibraryMod.IllustrationMessageSize.Dialog & String = js.native
  
  /**
    * Scene `Illustration` size (L breakpoint). Suitable for a `Page` or a table.
    */
  @js.native
  sealed trait Scene
    extends StObject
       with IllustrationMessageSize
  /* "Scene" */ val Scene: typings.openui5.sapUiWebcFioriLibraryMod.IllustrationMessageSize.Scene & String = js.native
  
  /**
    * Spot `Illustration` size (S breakpoint). Suitable for cards (four columns).
    */
  @js.native
  sealed trait Spot
    extends StObject
       with IllustrationMessageSize
  /* "Spot" */ val Spot: typings.openui5.sapUiWebcFioriLibraryMod.IllustrationMessageSize.Spot & String = js.native
}
