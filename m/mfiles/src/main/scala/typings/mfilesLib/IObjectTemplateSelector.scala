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
    GetObjectTypeIconURL: () => java.lang.String,
    GetObjectTypeId: () => scala.Double,
    GetObjectTypeName: () => java.lang.String,
    GetTemplateItems: () => js.Any,
    SelectItem: java.lang.String => scala.Unit
  ): IObjectTemplateSelector = {
    val __obj = js.Dynamic.literal(ClassSelector = ClassSelector, Events = Events, GetObjectTypeIconURL = js.Any.fromFunction0(GetObjectTypeIconURL), GetObjectTypeId = js.Any.fromFunction0(GetObjectTypeId), GetObjectTypeName = js.Any.fromFunction0(GetObjectTypeName), GetTemplateItems = js.Any.fromFunction0(GetTemplateItems), SelectItem = js.Any.fromFunction1(SelectItem))
  
    __obj.asInstanceOf[IObjectTemplateSelector]
  }
}

