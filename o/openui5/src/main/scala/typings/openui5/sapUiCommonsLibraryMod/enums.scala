package typings.openui5.sapUiCommonsLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enums {
  
  @js.native
  sealed trait AreaDesign extends StObject
  /**
    * @deprecated (since 1.38)
    *
    * Value set for the background design of areas
    */
  @JSImport("sap/ui/commons/library", "enums.AreaDesign")
  @js.native
  object AreaDesign extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AreaDesign & String] = js.native
    
    /**
      * Shows the label in a filled look
      */
    @js.native
    sealed trait Fill
      extends StObject
         with AreaDesign
    /* "Fill" */ val Fill: typings.openui5.sapUiCommonsLibraryMod.enums.AreaDesign.Fill & String = js.native
    
    /**
      * Shows the area in a plain look
      */
    @js.native
    sealed trait Plain
      extends StObject
         with AreaDesign
    /* "Plain" */ val Plain: typings.openui5.sapUiCommonsLibraryMod.enums.AreaDesign.Plain & String = js.native
    
    /**
      * Shows the background as transparent
      */
    @js.native
    sealed trait Transparent
      extends StObject
         with AreaDesign
    /* "Transparent" */ val Transparent: typings.openui5.sapUiCommonsLibraryMod.enums.AreaDesign.Transparent & String = js.native
  }
  
  @js.native
  sealed trait BorderDesign extends StObject
  /**
    * @deprecated (since 1.38)
    *
    * Value set for the border design of areas
    */
  @JSImport("sap/ui/commons/library", "enums.BorderDesign")
  @js.native
  object BorderDesign extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[BorderDesign & String] = js.native
    
    /**
      * Draws the border as a box around the area
      */
    @js.native
    sealed trait Box
      extends StObject
         with BorderDesign
    /* "Box" */ val Box: typings.openui5.sapUiCommonsLibraryMod.enums.BorderDesign.Box & String = js.native
    
    /**
      * Suppresses the border
      */
    @js.native
    sealed trait None
      extends StObject
         with BorderDesign
    /* "None" */ val None: typings.openui5.sapUiCommonsLibraryMod.enums.BorderDesign.None & String = js.native
  }
  
  @js.native
  sealed trait Orientation extends StObject
  /**
    * @deprecated (since 1.38)
    *
    * Orientation of a UI element
    */
  @JSImport("sap/ui/commons/library", "enums.Orientation")
  @js.native
  object Orientation extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Orientation & String] = js.native
    
    /**
      * Horizontal orientation
      */
    @js.native
    sealed trait horizontal
      extends StObject
         with Orientation
    /* "horizontal" */ val horizontal: typings.openui5.sapUiCommonsLibraryMod.enums.Orientation.horizontal & String = js.native
    
    /**
      * Vertical orientation
      */
    @js.native
    sealed trait vertical
      extends StObject
         with Orientation
    /* "vertical" */ val vertical: typings.openui5.sapUiCommonsLibraryMod.enums.Orientation.vertical & String = js.native
  }
}
