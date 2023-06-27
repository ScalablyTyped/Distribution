package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMAvatarImageFitTypeMod {
  
  /**
    * @since 1.73
    *
    * Types of image size and position that determine how an image fits in the {@link sap.m.Avatar} control
    * area.
    */
  @JSImport("sap/m/AvatarImageFitType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AvatarImageFitType & String] = js.native
    
    /* "Contain" */ val Contain: typings.openui5.sapMAvatarImageFitTypeMod.AvatarImageFitType.Contain & String = js.native
    
    /* "Cover" */ val Cover: typings.openui5.sapMAvatarImageFitTypeMod.AvatarImageFitType.Cover & String = js.native
  }
  
  @js.native
  sealed trait AvatarImageFitType extends StObject
  /**
    * @since 1.73
    *
    * Types of image size and position that determine how an image fits in the {@link sap.m.Avatar} control
    * area.
    */
  @JSImport("sap/m/AvatarImageFitType", "AvatarImageFitType")
  @js.native
  object AvatarImageFitType extends StObject {
    
    /**
      * The image is scaled to the largest size so that both its width and height can fit in the control area.
      */
    @js.native
    sealed trait Contain
      extends StObject
         with AvatarImageFitType
    
    /**
      * The image is scaled to be large enough so that the control area is completely covered.
      */
    @js.native
    sealed trait Cover
      extends StObject
         with AvatarImageFitType
  }
}
