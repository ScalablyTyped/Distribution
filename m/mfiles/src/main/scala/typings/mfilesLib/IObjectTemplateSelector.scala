package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectTemplateSelector extends js.Object {
  val ClassSelector: IMetadataCardControl
  val Events: IEvents
  def GetObjectTypeIconURL(): java.lang.String
  def GetObjectTypeId(): scala.Double
  def GetObjectTypeName(): java.lang.String
  def GetTemplateItems(): js.Any
  def SelectItem(itemID: java.lang.String): scala.Unit
}

object IObjectTemplateSelector {
  @scala.inline
  def apply(
    ClassSelector: IMetadataCardControl,
    Events: IEvents,
    GetObjectTypeIconURL: js.Function0[java.lang.String],
    GetObjectTypeId: js.Function0[scala.Double],
    GetObjectTypeName: js.Function0[java.lang.String],
    GetTemplateItems: js.Function0[js.Any],
    SelectItem: js.Function1[java.lang.String, scala.Unit]
  ): IObjectTemplateSelector = {
    val __obj = js.Dynamic.literal(ClassSelector = ClassSelector, Events = Events, GetObjectTypeIconURL = GetObjectTypeIconURL, GetObjectTypeId = GetObjectTypeId, GetObjectTypeName = GetObjectTypeName, GetTemplateItems = GetTemplateItems, SelectItem = SelectItem)
  
    __obj.asInstanceOf[IObjectTemplateSelector]
  }
}

