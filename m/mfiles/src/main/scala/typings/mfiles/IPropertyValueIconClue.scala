package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInPropertyDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPropertyValueIconClue extends js.Object {
  val PropertyDef: MFBuiltInPropertyDef | Double = js.native
  val ValueListItem: Double = js.native
  def Clone(): IPropertyValueIconClue = js.native
}

object IPropertyValueIconClue {
  @scala.inline
  def apply(
    Clone: () => IPropertyValueIconClue,
    PropertyDef: MFBuiltInPropertyDef | Double,
    ValueListItem: Double
  ): IPropertyValueIconClue = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), PropertyDef = PropertyDef.asInstanceOf[js.Any], ValueListItem = ValueListItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyValueIconClue]
  }
  @scala.inline
  implicit class IPropertyValueIconClueOps[Self <: IPropertyValueIconClue] (val x: Self) extends AnyVal {
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
    def setClone(value: () => IPropertyValueIconClue): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setPropertyDef(value: MFBuiltInPropertyDef | Double): Self = this.set("PropertyDef", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueListItem(value: Double): Self = this.set("ValueListItem", value.asInstanceOf[js.Any])
  }
  
}

