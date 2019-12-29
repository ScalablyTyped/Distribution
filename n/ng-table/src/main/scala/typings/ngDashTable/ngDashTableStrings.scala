package typings.ngDashTable

import typings.ngDashTable.srcCoreFilteringFilterSettingsMod.FilterLayout
import typings.ngDashTable.srcCoreGroupingGroupingFuncMod.GroupSort
import typings.ngDashTable.srcCoreSortingMod.SortDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ngDashTableStrings {
  @js.native
  sealed trait _empty extends GroupSort
  
  @js.native
  sealed trait asc
    extends GroupSort
       with SortDirection
  
  @js.native
  sealed trait desc
    extends GroupSort
       with SortDirection
  
  @js.native
  sealed trait horizontal extends FilterLayout
  
  @js.native
  sealed trait stack extends FilterLayout
  
  @scala.inline
  def _empty: _empty = "".asInstanceOf[_empty]
  @scala.inline
  def asc: asc = "asc".asInstanceOf[asc]
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  @scala.inline
  def stack: stack = "stack".asInstanceOf[stack]
}

