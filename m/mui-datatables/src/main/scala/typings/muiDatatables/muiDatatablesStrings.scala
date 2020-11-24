package typings.muiDatatables

import typings.muiDatatables.mod.ChipColor
import typings.muiDatatables.mod.ChipVariant
import typings.muiDatatables.mod.FilterType
import typings.muiDatatables.mod.Responsive
import typings.muiDatatables.mod.SelectableRows
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object muiDatatablesStrings {
  
  @scala.inline
  def above: above = "above".asInstanceOf[above]
  
  @scala.inline
  def asc: asc = "asc".asInstanceOf[asc]
  
  @scala.inline
  def checkbox: checkbox = "checkbox".asInstanceOf[checkbox]
  
  @scala.inline
  def chip: chip = "chip".asInstanceOf[chip]
  
  @scala.inline
  def custom: custom = "custom".asInstanceOf[custom]
  
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
  
  @scala.inline
  def disabled: disabled = "disabled".asInstanceOf[disabled]
  
  @scala.inline
  def dropdown: dropdown = "dropdown".asInstanceOf[dropdown]
  
  @scala.inline
  def excluded: excluded = "excluded".asInstanceOf[excluded]
  
  @scala.inline
  def multiple: multiple = "multiple".asInstanceOf[multiple]
  
  @scala.inline
  def multiselect: multiselect = "multiselect".asInstanceOf[multiselect]
  
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @scala.inline
  def outlined: outlined = "outlined".asInstanceOf[outlined]
  
  @scala.inline
  def primary: primary = "primary".asInstanceOf[primary]
  
  @scala.inline
  def replace: replace = "replace".asInstanceOf[replace]
  
  @scala.inline
  def reset: reset = "reset".asInstanceOf[reset]
  
  @scala.inline
  def secondary: secondary = "secondary".asInstanceOf[secondary]
  
  @scala.inline
  def simple: simple = "simple".asInstanceOf[simple]
  
  @scala.inline
  def single: single = "single".asInstanceOf[single]
  
  @scala.inline
  def standard: standard = "standard".asInstanceOf[standard]
  
  @scala.inline
  def textField: textField = "textField".asInstanceOf[textField]
  
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
  
  @js.native
  sealed trait above extends js.Object
  
  @js.native
  sealed trait asc extends js.Object
  
  @js.native
  sealed trait checkbox extends FilterType
  
  @js.native
  sealed trait chip extends js.Object
  
  @js.native
  sealed trait custom extends FilterType
  
  @js.native
  sealed trait default
    extends ChipColor
       with ChipVariant
  
  @js.native
  sealed trait desc extends js.Object
  
  @js.native
  sealed trait disabled extends js.Object
  
  @js.native
  sealed trait dropdown extends FilterType
  
  @js.native
  sealed trait excluded extends js.Object
  
  @js.native
  sealed trait multiple extends SelectableRows
  
  @js.native
  sealed trait multiselect extends FilterType
  
  @js.native
  sealed trait none extends SelectableRows
  
  @js.native
  sealed trait outlined extends ChipVariant
  
  @js.native
  sealed trait primary extends ChipColor
  
  @js.native
  sealed trait replace extends js.Object
  
  @js.native
  sealed trait reset extends js.Object
  
  @js.native
  sealed trait secondary extends ChipColor
  
  @js.native
  sealed trait simple extends Responsive
  
  @js.native
  sealed trait single extends SelectableRows
  
  @js.native
  sealed trait standard extends Responsive
  
  @js.native
  sealed trait textField extends FilterType
  
  @js.native
  sealed trait vertical extends Responsive
}
