package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectTemplateSelectorItem extends js.Object {
  def GetClassID(): Double
  def GetClassName(): String
  def GetGroupID(): Double
  def GetGroupName(): String
  def GetID(): String
  def GetIconURL(): String
  def GetName(): String
  def GetTemplateID(): Double
  def IsBlankItem(): Boolean
  def IsDefaultTemplateForClass(): Boolean
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
}

