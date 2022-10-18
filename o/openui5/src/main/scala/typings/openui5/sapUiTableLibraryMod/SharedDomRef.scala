package typings.openui5.sapUiTableLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SharedDomRef extends StObject
@JSImport("sap/ui/table/library", "SharedDomRef")
@js.native
object SharedDomRef extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SharedDomRef & String] = js.native
  
  /**
    * The element id of the Horizontal Scroll Bar of the sap.ui.table.Table.
    */
  @js.native
  sealed trait HorizontalScrollBar
    extends StObject
       with SharedDomRef
  /* "hsb" */ val HorizontalScrollBar: typings.openui5.sapUiTableLibraryMod.SharedDomRef.HorizontalScrollBar & String = js.native
  
  /**
    * The element id of the Vertical Scroll Bar of the sap.ui.table.Table.
    */
  @js.native
  sealed trait VerticalScrollBar
    extends StObject
       with SharedDomRef
  /* "vsb" */ val VerticalScrollBar: typings.openui5.sapUiTableLibraryMod.SharedDomRef.VerticalScrollBar & String = js.native
}
