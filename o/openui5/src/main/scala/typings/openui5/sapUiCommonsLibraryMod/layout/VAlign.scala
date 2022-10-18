package typings.openui5.sapUiCommonsLibraryMod.layout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VAlign extends StObject
/**
  * @deprecated (since 1.38)
  *
  * Vertical alignment, e.g. of a layout cell's content within the cell's borders.
  */
@JSImport("sap/ui/commons/library", "layout.VAlign")
@js.native
object VAlign extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[VAlign & String] = js.native
  
  /**
    * Aligned at the bottom.
    */
  @js.native
  sealed trait Bottom
    extends StObject
       with VAlign
  /* "Bottom" */ val Bottom: typings.openui5.sapUiCommonsLibraryMod.layout.VAlign.Bottom & String = js.native
  
  /**
    * Vertically centered.
    */
  @js.native
  sealed trait Middle
    extends StObject
       with VAlign
  /* "Middle" */ val Middle: typings.openui5.sapUiCommonsLibraryMod.layout.VAlign.Middle & String = js.native
  
  /**
    * Aligned at the top.
    */
  @js.native
  sealed trait Top
    extends StObject
       with VAlign
  /* "Top" */ val Top: typings.openui5.sapUiCommonsLibraryMod.layout.VAlign.Top & String = js.native
}
