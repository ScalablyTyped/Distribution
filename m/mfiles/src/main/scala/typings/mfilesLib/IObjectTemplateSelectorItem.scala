package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectTemplateSelectorItem extends js.Object {
  def GetClassID(): scala.Double
  def GetClassName(): java.lang.String
  def GetGroupID(): scala.Double
  def GetGroupName(): java.lang.String
  def GetID(): java.lang.String
  def GetIconURL(): java.lang.String
  def GetName(): java.lang.String
  def GetTemplateID(): scala.Double
  def IsBlankItem(): scala.Boolean
  def IsDefaultTemplateForClass(): scala.Boolean
}

object IObjectTemplateSelectorItem {
  @scala.inline
  def apply(
    GetClassID: () => scala.Double,
    GetClassName: () => java.lang.String,
    GetGroupID: () => scala.Double,
    GetGroupName: () => java.lang.String,
    GetID: () => java.lang.String,
    GetIconURL: () => java.lang.String,
    GetName: () => java.lang.String,
    GetTemplateID: () => scala.Double,
    IsBlankItem: () => scala.Boolean,
    IsDefaultTemplateForClass: () => scala.Boolean
  ): IObjectTemplateSelectorItem = {
    val __obj = js.Dynamic.literal(GetClassID = js.Any.fromFunction0(GetClassID), GetClassName = js.Any.fromFunction0(GetClassName), GetGroupID = js.Any.fromFunction0(GetGroupID), GetGroupName = js.Any.fromFunction0(GetGroupName), GetID = js.Any.fromFunction0(GetID), GetIconURL = js.Any.fromFunction0(GetIconURL), GetName = js.Any.fromFunction0(GetName), GetTemplateID = js.Any.fromFunction0(GetTemplateID), IsBlankItem = js.Any.fromFunction0(IsBlankItem), IsDefaultTemplateForClass = js.Any.fromFunction0(IsDefaultTemplateForClass))
  
    __obj.asInstanceOf[IObjectTemplateSelectorItem]
  }
}

