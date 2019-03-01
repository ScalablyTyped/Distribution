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
    GetClassID: js.Function0[scala.Double],
    GetClassName: js.Function0[java.lang.String],
    GetGroupID: js.Function0[scala.Double],
    GetGroupName: js.Function0[java.lang.String],
    GetID: js.Function0[java.lang.String],
    GetIconURL: js.Function0[java.lang.String],
    GetName: js.Function0[java.lang.String],
    GetTemplateID: js.Function0[scala.Double],
    IsBlankItem: js.Function0[scala.Boolean],
    IsDefaultTemplateForClass: js.Function0[scala.Boolean]
  ): IObjectTemplateSelectorItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetClassID")(GetClassID)
    __obj.updateDynamic("GetClassName")(GetClassName)
    __obj.updateDynamic("GetGroupID")(GetGroupID)
    __obj.updateDynamic("GetGroupName")(GetGroupName)
    __obj.updateDynamic("GetID")(GetID)
    __obj.updateDynamic("GetIconURL")(GetIconURL)
    __obj.updateDynamic("GetName")(GetName)
    __obj.updateDynamic("GetTemplateID")(GetTemplateID)
    __obj.updateDynamic("IsBlankItem")(IsBlankItem)
    __obj.updateDynamic("IsDefaultTemplateForClass")(IsDefaultTemplateForClass)
    __obj.asInstanceOf[IObjectTemplateSelectorItem]
  }
}

