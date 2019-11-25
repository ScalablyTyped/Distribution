package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectTemplateSelector extends js.Object {
  val ClassSelector: IMetadataCardControl
  val Events: IEvents
  def GetObjectTypeIconURL(): String
  def GetObjectTypeId(): Double
  def GetObjectTypeName(): String
  def GetTemplateItems(): js.Any
  def SelectItem(itemID: String): Unit
}

object IObjectTemplateSelector {
  @scala.inline
  def apply(
    ClassSelector: IMetadataCardControl,
    Events: IEvents,
    GetObjectTypeIconURL: () => String,
    GetObjectTypeId: () => Double,
    GetObjectTypeName: () => String,
    GetTemplateItems: () => js.Any,
    SelectItem: String => Unit
  ): IObjectTemplateSelector = {
    val __obj = js.Dynamic.literal(ClassSelector = ClassSelector.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], GetObjectTypeIconURL = js.Any.fromFunction0(GetObjectTypeIconURL), GetObjectTypeId = js.Any.fromFunction0(GetObjectTypeId), GetObjectTypeName = js.Any.fromFunction0(GetObjectTypeName), GetTemplateItems = js.Any.fromFunction0(GetTemplateItems), SelectItem = js.Any.fromFunction1(SelectItem))
  
    __obj.asInstanceOf[IObjectTemplateSelector]
  }
}

