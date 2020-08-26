package typings.officeUiFabricReact.dropdownBaseMod

import typings.officeUiFabricReact.positioningTypesMod.RectangleEdge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDropdownState extends js.Object {
  var calloutRenderEdge: js.UndefOr[RectangleEdge] = js.native
  /** Whether the root dropdown element has focus. */
  var hasFocus: Boolean = js.native
  var isOpen: Boolean = js.native
  var selectedIndices: js.Array[Double] = js.native
}

object IDropdownState {
  @scala.inline
  def apply(hasFocus: Boolean, isOpen: Boolean, selectedIndices: js.Array[Double]): IDropdownState = {
    val __obj = js.Dynamic.literal(hasFocus = hasFocus.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], selectedIndices = selectedIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDropdownState]
  }
  @scala.inline
  implicit class IDropdownStateOps[Self <: IDropdownState] (val x: Self) extends AnyVal {
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
    def setHasFocus(value: Boolean): Self = this.set("hasFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedIndicesVarargs(value: Double*): Self = this.set("selectedIndices", js.Array(value :_*))
    @scala.inline
    def setSelectedIndices(value: js.Array[Double]): Self = this.set("selectedIndices", value.asInstanceOf[js.Any])
    @scala.inline
    def setCalloutRenderEdge(value: RectangleEdge): Self = this.set("calloutRenderEdge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalloutRenderEdge: Self = this.set("calloutRenderEdge", js.undefined)
  }
  
}

