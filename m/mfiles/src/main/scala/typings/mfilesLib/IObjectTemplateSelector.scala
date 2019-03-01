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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ClassSelector")(ClassSelector)
    __obj.updateDynamic("Events")(Events)
    __obj.updateDynamic("GetObjectTypeIconURL")(GetObjectTypeIconURL)
    __obj.updateDynamic("GetObjectTypeId")(GetObjectTypeId)
    __obj.updateDynamic("GetObjectTypeName")(GetObjectTypeName)
    __obj.updateDynamic("GetTemplateItems")(GetTemplateItems)
    __obj.updateDynamic("SelectItem")(SelectItem)
    __obj.asInstanceOf[IObjectTemplateSelector]
  }
}

