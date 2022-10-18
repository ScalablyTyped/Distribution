package typings.ngTable

import typings.ngTable.srcCoreFilteringFilterSettingsMod.FilterLayout
import typings.ngTable.srcCoreGroupingGroupingFuncMod.GroupSort
import typings.ngTable.srcCoreSortingMod.SortDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngTableStrings {
  
  @js.native
  sealed trait _empty
    extends StObject
       with GroupSort
  inline def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait asc
    extends StObject
       with GroupSort
       with SortDirection
  inline def asc: asc = "asc".asInstanceOf[asc]
  
  @js.native
  sealed trait desc
    extends StObject
       with GroupSort
       with SortDirection
  inline def desc: desc = "desc".asInstanceOf[desc]
  
  @js.native
  sealed trait horizontal
    extends StObject
       with FilterLayout
  inline def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @js.native
  sealed trait stack
    extends StObject
       with FilterLayout
  inline def stack: stack = "stack".asInstanceOf[stack]
}
