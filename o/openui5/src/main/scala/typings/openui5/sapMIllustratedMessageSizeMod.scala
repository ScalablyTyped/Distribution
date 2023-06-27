package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMIllustratedMessageSizeMod {
  
  /**
    * @since 1.98
    *
    * Available `Illustration` sizes for the {@link sap.m.IllustratedMessage} control.
    */
  @JSImport("sap/m/IllustratedMessageSize", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[IllustratedMessageSize & String] = js.native
    
    /* "Auto" */ val Auto: typings.openui5.sapMIllustratedMessageSizeMod.IllustratedMessageSize.Auto & String = js.native
    
    /* "Base" */ val Base: typings.openui5.sapMIllustratedMessageSizeMod.IllustratedMessageSize.Base & String = js.native
    
    /* "Dialog" */ val Dialog: typings.openui5.sapMIllustratedMessageSizeMod.IllustratedMessageSize.Dialog & String = js.native
    
    /* "Dot" */ val Dot: typings.openui5.sapMIllustratedMessageSizeMod.IllustratedMessageSize.Dot & String = js.native
    
    /* "Scene" */ val Scene: typings.openui5.sapMIllustratedMessageSizeMod.IllustratedMessageSize.Scene & String = js.native
    
    /* "Spot" */ val Spot: typings.openui5.sapMIllustratedMessageSizeMod.IllustratedMessageSize.Spot & String = js.native
  }
  
  @js.native
  sealed trait IllustratedMessageSize extends StObject
  /**
    * @since 1.98
    *
    * Available `Illustration` sizes for the {@link sap.m.IllustratedMessage} control.
    */
  @JSImport("sap/m/IllustratedMessageSize", "IllustratedMessageSize")
  @js.native
  object IllustratedMessageSize extends StObject {
    
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
         with IllustratedMessageSize
    
    /**
      * Base `Illustration` size. Suitable for cards (two columns).
      *
      * **Note:** When `Base` is in use, no illustration is displayed.
      */
    @js.native
    sealed trait Base
      extends StObject
         with IllustratedMessageSize
    
    /**
      * Dialog `Illustration` size (M breakpoint). Suitable for dialogs.
      */
    @js.native
    sealed trait Dialog
      extends StObject
         with IllustratedMessageSize
    
    /**
      * @since 1.108
      *
      * Dot `Illustration` size (XS breakpoint). Suitable for spaces with little vertical space.
      */
    @js.native
    sealed trait Dot
      extends StObject
         with IllustratedMessageSize
    
    /**
      * Scene `Illustration` size (L breakpoint). Suitable for a `Page` or a table.
      */
    @js.native
    sealed trait Scene
      extends StObject
         with IllustratedMessageSize
    
    /**
      * Spot `Illustration` size (S breakpoint). Suitable for cards (four columns).
      */
    @js.native
    sealed trait Spot
      extends StObject
         with IllustratedMessageSize
  }
}
