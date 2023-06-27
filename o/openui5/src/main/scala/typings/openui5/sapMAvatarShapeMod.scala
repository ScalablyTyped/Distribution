package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMAvatarShapeMod {
  
  /**
    * @since 1.73
    *
    * Types of shape for the {@link sap.m.Avatar} control.
    */
  @JSImport("sap/m/AvatarShape", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AvatarShape & String] = js.native
    
    /* "Circle" */ val Circle: typings.openui5.sapMAvatarShapeMod.AvatarShape.Circle & String = js.native
    
    /* "Square" */ val Square: typings.openui5.sapMAvatarShapeMod.AvatarShape.Square & String = js.native
  }
  
  @js.native
  sealed trait AvatarShape extends StObject
  /**
    * @since 1.73
    *
    * Types of shape for the {@link sap.m.Avatar} control.
    */
  @JSImport("sap/m/AvatarShape", "AvatarShape")
  @js.native
  object AvatarShape extends StObject {
    
    /**
      * Circular shape.
      */
    @js.native
    sealed trait Circle
      extends StObject
         with AvatarShape
    
    /**
      * Square shape.
      */
    @js.native
    sealed trait Square
      extends StObject
         with AvatarShape
  }
}
