package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait P13nPanelType extends StObject
@JSImport("sap/m/library", "P13nPanelType")
@js.native
object P13nPanelType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[P13nPanelType & String] = js.native
  
  /**
    * Panel type for column settings.
    */
  @js.native
  sealed trait columns
    extends StObject
       with P13nPanelType
  /* "columns" */ val columns: typings.openui5.sapMLibraryMod.P13nPanelType.columns & String = js.native
  
  /**
    * Panel type for dimension and measure settings.
    */
  @js.native
  sealed trait dimeasure
    extends StObject
       with P13nPanelType
  /* "dimeasure" */ val dimeasure: typings.openui5.sapMLibraryMod.P13nPanelType.dimeasure & String = js.native
  
  /**
    * Panel type for filtering.
    */
  @js.native
  sealed trait filter
    extends StObject
       with P13nPanelType
  /* "filter" */ val filter: typings.openui5.sapMLibraryMod.P13nPanelType.filter & String = js.native
  
  /**
    * Panel type for grouping.
    */
  @js.native
  sealed trait group
    extends StObject
       with P13nPanelType
  /* "group" */ val group: typings.openui5.sapMLibraryMod.P13nPanelType.group & String = js.native
  
  /**
    * Panel type for sorting.
    */
  @js.native
  sealed trait sort
    extends StObject
       with P13nPanelType
  /* "sort" */ val sort: typings.openui5.sapMLibraryMod.P13nPanelType.sort & String = js.native
}
