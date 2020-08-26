package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectTemplateSelectorItem extends js.Object {
  def GetClassID(): Double = js.native
  def GetClassName(): String = js.native
  def GetGroupID(): Double = js.native
  def GetGroupName(): String = js.native
  def GetID(): String = js.native
  def GetIconURL(): String = js.native
  def GetName(): String = js.native
  def GetTemplateID(): Double = js.native
  def IsBlankItem(): Boolean = js.native
  def IsDefaultTemplateForClass(): Boolean = js.native
}

object IObjectTemplateSelectorItem {
  @scala.inline
  def apply(
    GetClassID: () => Double,
    GetClassName: () => String,
    GetGroupID: () => Double,
    GetGroupName: () => String,
    GetID: () => String,
    GetIconURL: () => String,
    GetName: () => String,
    GetTemplateID: () => Double,
    IsBlankItem: () => Boolean,
    IsDefaultTemplateForClass: () => Boolean
  ): IObjectTemplateSelectorItem = {
    val __obj = js.Dynamic.literal(GetClassID = js.Any.fromFunction0(GetClassID), GetClassName = js.Any.fromFunction0(GetClassName), GetGroupID = js.Any.fromFunction0(GetGroupID), GetGroupName = js.Any.fromFunction0(GetGroupName), GetID = js.Any.fromFunction0(GetID), GetIconURL = js.Any.fromFunction0(GetIconURL), GetName = js.Any.fromFunction0(GetName), GetTemplateID = js.Any.fromFunction0(GetTemplateID), IsBlankItem = js.Any.fromFunction0(IsBlankItem), IsDefaultTemplateForClass = js.Any.fromFunction0(IsDefaultTemplateForClass))
    __obj.asInstanceOf[IObjectTemplateSelectorItem]
  }
  @scala.inline
  implicit class IObjectTemplateSelectorItemOps[Self <: IObjectTemplateSelectorItem] (val x: Self) extends AnyVal {
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
    def setGetClassID(value: () => Double): Self = this.set("GetClassID", js.Any.fromFunction0(value))
    @scala.inline
    def setGetClassName(value: () => String): Self = this.set("GetClassName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetGroupID(value: () => Double): Self = this.set("GetGroupID", js.Any.fromFunction0(value))
    @scala.inline
    def setGetGroupName(value: () => String): Self = this.set("GetGroupName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetID(value: () => String): Self = this.set("GetID", js.Any.fromFunction0(value))
    @scala.inline
    def setGetIconURL(value: () => String): Self = this.set("GetIconURL", js.Any.fromFunction0(value))
    @scala.inline
    def setGetName(value: () => String): Self = this.set("GetName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTemplateID(value: () => Double): Self = this.set("GetTemplateID", js.Any.fromFunction0(value))
    @scala.inline
    def setIsBlankItem(value: () => Boolean): Self = this.set("IsBlankItem", js.Any.fromFunction0(value))
    @scala.inline
    def setIsDefaultTemplateForClass(value: () => Boolean): Self = this.set("IsDefaultTemplateForClass", js.Any.fromFunction0(value))
  }
  
}

