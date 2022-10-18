package typings.openui5.sapUiCommonsLibraryMod.layout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Padding extends StObject
/**
  * @deprecated (since 1.38)
  *
  * Padding, e.g. of a layout cell's content within the cell's borders. Note that all options except "None"
  * include a padding of 2px at the top and bottom, and differ only in the presence of a 4px padding towards
  * the beginning or end of a line, in the current locale's writing direction.
  */
@JSImport("sap/ui/commons/library", "layout.Padding")
@js.native
object Padding extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Padding & String] = js.native
  
  /**
    * Top and bottom padding of 2px. Padding of 4px towards the beginning of a line, in the current locale's
    * writing direction, but none towards its end.
    */
  @js.native
  sealed trait Begin
    extends StObject
       with Padding
  /* "Begin" */ val Begin: typings.openui5.sapUiCommonsLibraryMod.layout.Padding.Begin & String = js.native
  
  /**
    * Top and bottom padding of 2px. Padding of 4px towards both the beginning and end of a line.
    */
  @js.native
  sealed trait Both
    extends StObject
       with Padding
  /* "Both" */ val Both: typings.openui5.sapUiCommonsLibraryMod.layout.Padding.Both & String = js.native
  
  /**
    * Top and bottom padding of 2px. Padding of 4px towards the end of a line, in the current locale's writing
    * direction, but none towards its beginning.
    */
  @js.native
  sealed trait End
    extends StObject
       with Padding
  /* "End" */ val End: typings.openui5.sapUiCommonsLibraryMod.layout.Padding.End & String = js.native
  
  /**
    * Top and bottom padding of 2px. No padding towards neither the beginning nor end of a line.
    */
  @js.native
  sealed trait Neither
    extends StObject
       with Padding
  /* "Neither" */ val Neither: typings.openui5.sapUiCommonsLibraryMod.layout.Padding.Neither & String = js.native
  
  /**
    * No padding at all.
    */
  @js.native
  sealed trait None
    extends StObject
       with Padding
  /* "None" */ val None: typings.openui5.sapUiCommonsLibraryMod.layout.Padding.None & String = js.native
}
