package typings.openui5.sapUiCommonsLibraryMod.layout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Separation extends StObject
/**
  * @deprecated (since 1.38)
  *
  * Separation, e.g. of a layout cell from its neighbor, via a vertical gutter of defined width, with or
  * without a vertical line in its middle.
  */
@JSImport("sap/ui/commons/library", "layout.Separation")
@js.native
object Separation extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Separation & String] = js.native
  
  /**
    * A large (63px) vertical gutter without a vertical line.
    */
  @js.native
  sealed trait Large
    extends StObject
       with Separation
  /* "Large" */ val Large: typings.openui5.sapUiCommonsLibraryMod.layout.Separation.Large & String = js.native
  
  /**
    * A large (63px) vertical gutter with a vertical line in its middle.
    */
  @js.native
  sealed trait LargeWithLine
    extends StObject
       with Separation
  /* "LargeWithLine" */ val LargeWithLine: typings.openui5.sapUiCommonsLibraryMod.layout.Separation.LargeWithLine & String = js.native
  
  /**
    * A medium (31px) vertical gutter without a vertical line.
    */
  @js.native
  sealed trait Medium
    extends StObject
       with Separation
  /* "Medium" */ val Medium: typings.openui5.sapUiCommonsLibraryMod.layout.Separation.Medium & String = js.native
  
  /**
    * A medium (31px) vertical gutter with a vertical line in its middle.
    */
  @js.native
  sealed trait MediumWithLine
    extends StObject
       with Separation
  /* "MediumWithLine" */ val MediumWithLine: typings.openui5.sapUiCommonsLibraryMod.layout.Separation.MediumWithLine & String = js.native
  
  /**
    * No gutter at all (0px), and without a vertical line, of course.
    */
  @js.native
  sealed trait None
    extends StObject
       with Separation
  /* "None" */ val None: typings.openui5.sapUiCommonsLibraryMod.layout.Separation.None & String = js.native
  
  /**
    * A small (17px) vertical gutter without a vertical line.
    */
  @js.native
  sealed trait Small
    extends StObject
       with Separation
  /* "Small" */ val Small: typings.openui5.sapUiCommonsLibraryMod.layout.Separation.Small & String = js.native
  
  /**
    * A small (17px) vertical gutter with a vertical line in its middle.
    */
  @js.native
  sealed trait SmallWithLine
    extends StObject
       with Separation
  /* "SmallWithLine" */ val SmallWithLine: typings.openui5.sapUiCommonsLibraryMod.layout.Separation.SmallWithLine & String = js.native
}
