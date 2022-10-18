package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FlexAlignContent extends StObject
@JSImport("sap/m/library", "FlexAlignContent")
@js.native
object FlexAlignContent extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FlexAlignContent & String] = js.native
  
  /**
    * Line are packed toward the center of the line.
    */
  @js.native
  sealed trait Center
    extends StObject
       with FlexAlignContent
  /* "Center" */ val Center: typings.openui5.sapMLibraryMod.FlexAlignContent.Center & String = js.native
  
  /**
    * Lines are packed toward the end of the line.
    */
  @js.native
  sealed trait End
    extends StObject
       with FlexAlignContent
  /* "End" */ val End: typings.openui5.sapMLibraryMod.FlexAlignContent.End & String = js.native
  
  /**
    * Inherits the value from its parent.
    */
  @js.native
  sealed trait Inherit
    extends StObject
       with FlexAlignContent
  /* "Inherit" */ val Inherit: typings.openui5.sapMLibraryMod.FlexAlignContent.Inherit & String = js.native
  
  /**
    * Lines are evenly distributed in the line, with half-size spaces on either end.
    */
  @js.native
  sealed trait SpaceAround
    extends StObject
       with FlexAlignContent
  /* "SpaceAround" */ val SpaceAround: typings.openui5.sapMLibraryMod.FlexAlignContent.SpaceAround & String = js.native
  
  /**
    * Lines are evenly distributed in the line.
    */
  @js.native
  sealed trait SpaceBetween
    extends StObject
       with FlexAlignContent
  /* "SpaceBetween" */ val SpaceBetween: typings.openui5.sapMLibraryMod.FlexAlignContent.SpaceBetween & String = js.native
  
  /**
    * Lines are packed toward the start of the line.
    */
  @js.native
  sealed trait Start
    extends StObject
       with FlexAlignContent
  /* "Start" */ val Start: typings.openui5.sapMLibraryMod.FlexAlignContent.Start & String = js.native
  
  /**
    * Lines stretch to take up the remaining space.
    */
  @js.native
  sealed trait Stretch
    extends StObject
       with FlexAlignContent
  /* "Stretch" */ val Stretch: typings.openui5.sapMLibraryMod.FlexAlignContent.Stretch & String = js.native
}
