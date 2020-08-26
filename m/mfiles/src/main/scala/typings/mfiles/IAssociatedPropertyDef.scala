package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInPropertyDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAssociatedPropertyDef extends js.Object {
  var PropertyDef: MFBuiltInPropertyDef | Double = js.native
  var Required: Boolean = js.native
  def Clone(): IAssociatedPropertyDef = js.native
}

object IAssociatedPropertyDef {
  @scala.inline
  def apply(Clone: () => IAssociatedPropertyDef, PropertyDef: MFBuiltInPropertyDef | Double, Required: Boolean): IAssociatedPropertyDef = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), PropertyDef = PropertyDef.asInstanceOf[js.Any], Required = Required.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAssociatedPropertyDef]
  }
  @scala.inline
  implicit class IAssociatedPropertyDefOps[Self <: IAssociatedPropertyDef] (val x: Self) extends AnyVal {
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
    def setClone(value: () => IAssociatedPropertyDef): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setPropertyDef(value: MFBuiltInPropertyDef | Double): Self = this.set("PropertyDef", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("Required", value.asInstanceOf[js.Any])
  }
  
}

