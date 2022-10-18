package typings.openui5.sapUiCommonsLibraryMod.layout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HAlign extends StObject
/**
  * @deprecated (since 1.38)
  *
  * Horizontal alignment, e.g. of a layout cell's content within the cell's borders. Note that some values
  * depend on the current locale's writing direction while others do not.
  */
@JSImport("sap/ui/commons/library", "layout.HAlign")
@js.native
object HAlign extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HAlign & String] = js.native
  
  /**
    * Aligned towards the beginning of a line, in the current locale's writing direction.
    */
  @js.native
  sealed trait Begin
    extends StObject
       with HAlign
  /* "Begin" */ val Begin: typings.openui5.sapUiCommonsLibraryMod.layout.HAlign.Begin & String = js.native
  
  /**
    * Horizontally centered.
    */
  @js.native
  sealed trait Center
    extends StObject
       with HAlign
  /* "Center" */ val Center: typings.openui5.sapUiCommonsLibraryMod.layout.HAlign.Center & String = js.native
  
  /**
    * Aligned towards the end of a line, in the current locale's writing direction.
    */
  @js.native
  sealed trait End
    extends StObject
       with HAlign
  /* "End" */ val End: typings.openui5.sapUiCommonsLibraryMod.layout.HAlign.End & String = js.native
  
  /**
    * Left aligned, regardless of the current locale's writing direction.
    */
  @js.native
  sealed trait Left
    extends StObject
       with HAlign
  /* "Left" */ val Left: typings.openui5.sapUiCommonsLibraryMod.layout.HAlign.Left & String = js.native
  
  /**
    * Right aligned, regardless of the current locale's writing direction.
    */
  @js.native
  sealed trait Right
    extends StObject
       with HAlign
  /* "Right" */ val Right: typings.openui5.sapUiCommonsLibraryMod.layout.HAlign.Right & String = js.native
}
