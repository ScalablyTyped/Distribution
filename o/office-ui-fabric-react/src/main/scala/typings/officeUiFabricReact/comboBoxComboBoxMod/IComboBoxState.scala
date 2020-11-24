package typings.officeUiFabricReact.comboBoxComboBoxMod

import typings.officeUiFabricReact.comboBoxTypesMod.IComboBoxOption
import typings.officeUiFabricReact.officeUiFabricReactStrings.focused
import typings.officeUiFabricReact.officeUiFabricReactStrings.focusing
import typings.officeUiFabricReact.officeUiFabricReactStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IComboBoxState extends js.Object {
  
  /** The options currently available for the callout */
  var currentOptions: js.Array[IComboBoxOption] = js.native
  
  /** When taking input, this will store the actual text that is being entered */
  var currentPendingValue: js.UndefOr[String] = js.native
  
  /**
    * When taking input, this will store the index that the options input matches
    * (-1 if no input or match)
    */
  var currentPendingValueValidIndex: Double = js.native
  
  /**
    * Stores the hovered over value in the dropdown
    * (used for styling the options without updating the input)
    */
  var currentPendingValueValidIndexOnHover: Double = js.native
  
  /** The focused state of the comboBox */
  var focusState: js.UndefOr[none | focused | focusing] = js.native
  
  /** The open state */
  var isOpen: js.UndefOr[Boolean] = js.native
  
  /** The currently selected indices */
  var selectedIndices: js.UndefOr[js.Array[Double]] = js.native
  
  /** This value is used for the autocomplete hint value */
  var suggestedDisplayValue: js.UndefOr[String] = js.native
}
object IComboBoxState {
  
  @scala.inline
  def apply(
    currentOptions: js.Array[IComboBoxOption],
    currentPendingValueValidIndex: Double,
    currentPendingValueValidIndexOnHover: Double
  ): IComboBoxState = {
    val __obj = js.Dynamic.literal(currentOptions = currentOptions.asInstanceOf[js.Any], currentPendingValueValidIndex = currentPendingValueValidIndex.asInstanceOf[js.Any], currentPendingValueValidIndexOnHover = currentPendingValueValidIndexOnHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComboBoxState]
  }
  
  @scala.inline
  implicit class IComboBoxStateOps[Self <: IComboBoxState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCurrentOptionsVarargs(value: IComboBoxOption*): Self = this.set("currentOptions", js.Array(value :_*))
    
    @scala.inline
    def setCurrentOptions(value: js.Array[IComboBoxOption]): Self = this.set("currentOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPendingValueValidIndex(value: Double): Self = this.set("currentPendingValueValidIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPendingValueValidIndexOnHover(value: Double): Self = this.set("currentPendingValueValidIndexOnHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPendingValue(value: String): Self = this.set("currentPendingValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentPendingValue: Self = this.set("currentPendingValue", js.undefined)
    
    @scala.inline
    def setFocusState(value: none | focused | focusing): Self = this.set("focusState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusState: Self = this.set("focusState", js.undefined)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    
    @scala.inline
    def setSelectedIndicesVarargs(value: Double*): Self = this.set("selectedIndices", js.Array(value :_*))
    
    @scala.inline
    def setSelectedIndices(value: js.Array[Double]): Self = this.set("selectedIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedIndices: Self = this.set("selectedIndices", js.undefined)
    
    @scala.inline
    def setSuggestedDisplayValue(value: String): Self = this.set("suggestedDisplayValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestedDisplayValue: Self = this.set("suggestedDisplayValue", js.undefined)
  }
}
