package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMAvatarColorMod {
  
  /**
    * @since 1.73
    *
    * Possible background color options for the {@link sap.m.Avatar} control.
    *
    * **Notes:**
    * 	 - Keep in mind that the colors are theme-dependent and can differ based on the currently used theme.
    *
    * 	 -  If the `Random` value is assigned, a random color is chosen from the accent options (Accent1 to
    *     Accent10).
    */
  @JSImport("sap/m/AvatarColor", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AvatarColor & String] = js.native
    
    /* "Accent1" */ val Accent1: typings.openui5.sapMAvatarColorMod.AvatarColor.Accent1 & String = js.native
    
    /* "Accent10" */ val Accent10: typings.openui5.sapMAvatarColorMod.AvatarColor.Accent10 & String = js.native
    
    /* "Accent2" */ val Accent2: typings.openui5.sapMAvatarColorMod.AvatarColor.Accent2 & String = js.native
    
    /* "Accent3" */ val Accent3: typings.openui5.sapMAvatarColorMod.AvatarColor.Accent3 & String = js.native
    
    /* "Accent4" */ val Accent4: typings.openui5.sapMAvatarColorMod.AvatarColor.Accent4 & String = js.native
    
    /* "Accent5" */ val Accent5: typings.openui5.sapMAvatarColorMod.AvatarColor.Accent5 & String = js.native
    
    /* "Accent6" */ val Accent6: typings.openui5.sapMAvatarColorMod.AvatarColor.Accent6 & String = js.native
    
    /* "Accent7" */ val Accent7: typings.openui5.sapMAvatarColorMod.AvatarColor.Accent7 & String = js.native
    
    /* "Accent8" */ val Accent8: typings.openui5.sapMAvatarColorMod.AvatarColor.Accent8 & String = js.native
    
    /* "Accent9" */ val Accent9: typings.openui5.sapMAvatarColorMod.AvatarColor.Accent9 & String = js.native
    
    /* "Placeholder" */ val Placeholder: typings.openui5.sapMAvatarColorMod.AvatarColor.Placeholder & String = js.native
    
    /* "Random" */ val Random: typings.openui5.sapMAvatarColorMod.AvatarColor.Random & String = js.native
    
    /* "TileIcon" */ val TileIcon: typings.openui5.sapMAvatarColorMod.AvatarColor.TileIcon & String = js.native
    
    /* "Transparent" */ val Transparent: typings.openui5.sapMAvatarColorMod.AvatarColor.Transparent & String = js.native
  }
  
  @js.native
  sealed trait AvatarColor extends StObject
  /**
    * @since 1.73
    *
    * Possible background color options for the {@link sap.m.Avatar} control.
    *
    * **Notes:**
    * 	 - Keep in mind that the colors are theme-dependent and can differ based on the currently used theme.
    *
    * 	 -  If the `Random` value is assigned, a random color is chosen from the accent options (Accent1 to
    *     Accent10).
    */
  @JSImport("sap/m/AvatarColor", "AvatarColor")
  @js.native
  object AvatarColor extends StObject {
    
    /**
      * Accent 1
      */
    @js.native
    sealed trait Accent1
      extends StObject
         with AvatarColor
    
    /**
      * Accent 10
      */
    @js.native
    sealed trait Accent10
      extends StObject
         with AvatarColor
    
    /**
      * Accent 2
      */
    @js.native
    sealed trait Accent2
      extends StObject
         with AvatarColor
    
    /**
      * Accent 3
      */
    @js.native
    sealed trait Accent3
      extends StObject
         with AvatarColor
    
    /**
      * Accent 4
      */
    @js.native
    sealed trait Accent4
      extends StObject
         with AvatarColor
    
    /**
      * Accent 5
      */
    @js.native
    sealed trait Accent5
      extends StObject
         with AvatarColor
    
    /**
      * Accent 6
      */
    @js.native
    sealed trait Accent6
      extends StObject
         with AvatarColor
    
    /**
      * Accent 7
      */
    @js.native
    sealed trait Accent7
      extends StObject
         with AvatarColor
    
    /**
      * Accent 8
      */
    @js.native
    sealed trait Accent8
      extends StObject
         with AvatarColor
    
    /**
      * Accent 9
      */
    @js.native
    sealed trait Accent9
      extends StObject
         with AvatarColor
    
    /**
      * Recommended when used as a placeholder (no image or initials are provided).
      */
    @js.native
    sealed trait Placeholder
      extends StObject
         with AvatarColor
    
    /**
      * Random color, chosen from the accent options (Accent1 to Accent10)
      */
    @js.native
    sealed trait Random
      extends StObject
         with AvatarColor
    
    /**
      * Recommended when used as an icon in a tile.
      */
    @js.native
    sealed trait TileIcon
      extends StObject
         with AvatarColor
    
    /**
      * Transparent
      */
    @js.native
    sealed trait Transparent
      extends StObject
         with AvatarColor
  }
}
