package typings.muiDashDatatables

import typings.muiDashDatatables.muiDashDatatablesMod.Display
import typings.muiDashDatatables.muiDashDatatablesMod.FilterType
import typings.muiDashDatatables.muiDashDatatablesMod.Responsive
import typings.muiDashDatatables.muiDashDatatablesMod.SelectableRows
import typings.muiDashDatatables.muiDashDatatablesMod.SortDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object muiDashDatatablesStrings {
  @js.native
  sealed trait asc extends SortDirection
  
  @js.native
  sealed trait checkbox extends FilterType
  
  @js.native
  sealed trait desc extends SortDirection
  
  @js.native
  sealed trait dropdown extends FilterType
  
  @js.native
  sealed trait excluded extends Display
  
  @js.native
  sealed trait `false` extends Display
  
  @js.native
  sealed trait multiple extends SelectableRows
  
  @js.native
  sealed trait multiselect extends FilterType
  
  @js.native
  sealed trait none extends SelectableRows
  
  @js.native
  sealed trait scroll extends Responsive
  
  @js.native
  sealed trait single extends SelectableRows
  
  @js.native
  sealed trait stacked extends Responsive
  
  @js.native
  sealed trait textField extends FilterType
  
  @js.native
  sealed trait `true` extends Display
  
  @scala.inline
  def asc: asc = "asc".asInstanceOf[asc]
  @scala.inline
  def checkbox: checkbox = "checkbox".asInstanceOf[checkbox]
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
  @scala.inline
  def dropdown: dropdown = "dropdown".asInstanceOf[dropdown]
  @scala.inline
  def excluded: excluded = "excluded".asInstanceOf[excluded]
  @scala.inline
  def `false`: `false` = "false".asInstanceOf[`false`]
  @scala.inline
  def multiple: multiple = "multiple".asInstanceOf[multiple]
  @scala.inline
  def multiselect: multiselect = "multiselect".asInstanceOf[multiselect]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def scroll: scroll = "scroll".asInstanceOf[scroll]
  @scala.inline
  def single: single = "single".asInstanceOf[single]
  @scala.inline
  def stacked: stacked = "stacked".asInstanceOf[stacked]
  @scala.inline
  def textField: textField = "textField".asInstanceOf[textField]
  @scala.inline
  def `true`: `true` = "true".asInstanceOf[`true`]
}

