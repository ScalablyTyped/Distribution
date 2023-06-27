package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMAvatarTypeMod {
  
  /**
    * @since 1.73
    *
    * Types of {@link sap.m.Avatar} based on the displayed content.
    */
  @JSImport("sap/m/AvatarType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AvatarType & String] = js.native
    
    /* "Icon" */ val Icon: typings.openui5.sapMAvatarTypeMod.AvatarType.Icon & String = js.native
    
    /* "Image" */ val Image: typings.openui5.sapMAvatarTypeMod.AvatarType.Image & String = js.native
    
    /* "Initials" */ val Initials: typings.openui5.sapMAvatarTypeMod.AvatarType.Initials & String = js.native
  }
  
  @js.native
  sealed trait AvatarType extends StObject
  /**
    * @since 1.73
    *
    * Types of {@link sap.m.Avatar} based on the displayed content.
    */
  @JSImport("sap/m/AvatarType", "AvatarType")
  @js.native
  object AvatarType extends StObject {
    
    /**
      * The displayed content is an icon.
      */
    @js.native
    sealed trait Icon
      extends StObject
         with AvatarType
    
    /**
      * The displayed content is an image.
      */
    @js.native
    sealed trait Image
      extends StObject
         with AvatarType
    
    /**
      * The displayed content is initials.
      */
    @js.native
    sealed trait Initials
      extends StObject
         with AvatarType
  }
}
