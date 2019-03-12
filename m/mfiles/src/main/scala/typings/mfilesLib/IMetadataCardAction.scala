package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadataCardAction extends js.Object {
  val Events: IEvents
  def Activate(): scala.Unit
  def GetExplanation(): java.lang.String
  def GetName(): java.lang.String
  def IsEnabled(): scala.Boolean
  def IsVisible(): scala.Boolean
}

object IMetadataCardAction {
  @scala.inline
  def apply(
    Activate: () => scala.Unit,
    Events: IEvents,
    GetExplanation: () => java.lang.String,
    GetName: () => java.lang.String,
    IsEnabled: () => scala.Boolean,
    IsVisible: () => scala.Boolean
  ): IMetadataCardAction = {
    val __obj = js.Dynamic.literal(Activate = js.Any.fromFunction0(Activate), Events = Events, GetExplanation = js.Any.fromFunction0(GetExplanation), GetName = js.Any.fromFunction0(GetName), IsEnabled = js.Any.fromFunction0(IsEnabled), IsVisible = js.Any.fromFunction0(IsVisible))
  
    __obj.asInstanceOf[IMetadataCardAction]
  }
}

