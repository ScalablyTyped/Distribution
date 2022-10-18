package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FlexDirection extends StObject
@JSImport("sap/m/library", "FlexDirection")
@js.native
object FlexDirection extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FlexDirection & String] = js.native
  
  /**
    * Flex items are laid out along the direction of the block axis (usually top to bottom).
    */
  @js.native
  sealed trait Column
    extends StObject
       with FlexDirection
  /* "Column" */ val Column: typings.openui5.sapMLibraryMod.FlexDirection.Column & String = js.native
  
  /**
    * Flex items are laid out along the reverse direction of the block axis (usually bottom to top).
    */
  @js.native
  sealed trait ColumnReverse
    extends StObject
       with FlexDirection
  /* "ColumnReverse" */ val ColumnReverse: typings.openui5.sapMLibraryMod.FlexDirection.ColumnReverse & String = js.native
  
  /**
    * Inherits the value from its parent.
    */
  @js.native
  sealed trait Inherit
    extends StObject
       with FlexDirection
  /* "Inherit" */ val Inherit: typings.openui5.sapMLibraryMod.FlexDirection.Inherit & String = js.native
  
  /**
    * Flex items are laid out along the direction of the inline axis (text direction).
    */
  @js.native
  sealed trait Row
    extends StObject
       with FlexDirection
  /* "Row" */ val Row: typings.openui5.sapMLibraryMod.FlexDirection.Row & String = js.native
  
  /**
    * Flex items are laid out along the reverse direction of the inline axis (against the text direction).
    */
  @js.native
  sealed trait RowReverse
    extends StObject
       with FlexDirection
  /* "RowReverse" */ val RowReverse: typings.openui5.sapMLibraryMod.FlexDirection.RowReverse & String = js.native
}
