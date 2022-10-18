package typings.openui5.sapUiCommonsLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TriStateCheckBoxState extends StObject
@JSImport("sap/ui/commons/library", "TriStateCheckBoxState")
@js.native
object TriStateCheckBoxState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TriStateCheckBoxState & String] = js.native
  
  /**
    * checked value for tri-state checkbox
    */
  @js.native
  sealed trait Checked
    extends StObject
       with TriStateCheckBoxState
  /* "Checked" */ val Checked: typings.openui5.sapUiCommonsLibraryMod.TriStateCheckBoxState.Checked & String = js.native
  
  /**
    * mixed state for tri-state checkbox
    */
  @js.native
  sealed trait Mixed
    extends StObject
       with TriStateCheckBoxState
  /* "Mixed" */ val Mixed: typings.openui5.sapUiCommonsLibraryMod.TriStateCheckBoxState.Mixed & String = js.native
  
  /**
    * unchecked, default value for tri-state checkbox
    */
  @js.native
  sealed trait Unchecked
    extends StObject
       with TriStateCheckBoxState
  /* "Unchecked" */ val Unchecked: typings.openui5.sapUiCommonsLibraryMod.TriStateCheckBoxState.Unchecked & String = js.native
}
