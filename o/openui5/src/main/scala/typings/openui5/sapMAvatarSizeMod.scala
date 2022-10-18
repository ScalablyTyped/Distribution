package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMAvatarSizeMod {
  
  /**
    * @SINCE 1.73
    *
    * Predefined sizes for the {@link sap.m.Avatar} control.
    */
  @JSImport("sap/m/AvatarSize", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AvatarSize & String] = js.native
    
    /* "Custom" */ val Custom: typings.openui5.sapMAvatarSizeMod.AvatarSize.Custom & String = js.native
    
    /* "L" */ val L: typings.openui5.sapMAvatarSizeMod.AvatarSize.L & String = js.native
    
    /* "M" */ val M: typings.openui5.sapMAvatarSizeMod.AvatarSize.M & String = js.native
    
    /* "S" */ val S: typings.openui5.sapMAvatarSizeMod.AvatarSize.S & String = js.native
    
    /* "XL" */ val XL: typings.openui5.sapMAvatarSizeMod.AvatarSize.XL & String = js.native
    
    /* "XS" */ val XS: typings.openui5.sapMAvatarSizeMod.AvatarSize.XS & String = js.native
  }
  
  @js.native
  sealed trait AvatarSize extends StObject
  /**
    * @SINCE 1.73
    *
    * Predefined sizes for the {@link sap.m.Avatar} control.
    */
  @JSImport("sap/m/AvatarSize", "AvatarSize")
  @js.native
  object AvatarSize extends StObject {
    
    /**
      * Custom size
      */
    @js.native
    sealed trait Custom
      extends StObject
         with AvatarSize
    
    /**
      * Control size - 5rem Font size - 2rem
      */
    @js.native
    sealed trait L
      extends StObject
         with AvatarSize
    
    /**
      * Control size - 4rem Font size - 1.625rem
      */
    @js.native
    sealed trait M
      extends StObject
         with AvatarSize
    
    /**
      * Control size - 3rem Font size - 1.125rem
      */
    @js.native
    sealed trait S
      extends StObject
         with AvatarSize
    
    /**
      * Control size - 7rem Font size - 2.75rem
      */
    @js.native
    sealed trait XL
      extends StObject
         with AvatarSize
    
    /**
      * Control size - 2rem Font size - 0.75rem
      */
    @js.native
    sealed trait XS
      extends StObject
         with AvatarSize
  }
}
