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
    Activate: js.Function0[scala.Unit],
    Events: IEvents,
    GetExplanation: js.Function0[java.lang.String],
    GetName: js.Function0[java.lang.String],
    IsEnabled: js.Function0[scala.Boolean],
    IsVisible: js.Function0[scala.Boolean]
  ): IMetadataCardAction = {
    val __obj = js.Dynamic.literal(Activate = Activate, Events = Events, GetExplanation = GetExplanation, GetName = GetName, IsEnabled = IsEnabled, IsVisible = IsVisible)
  
    __obj.asInstanceOf[IMetadataCardAction]
  }
}

