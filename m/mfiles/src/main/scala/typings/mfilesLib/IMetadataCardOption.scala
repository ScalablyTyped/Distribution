package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadataCardOption extends js.Object {
  val Events: IEvents
  def GetExplanation(): java.lang.String
  def GetName(): java.lang.String
  def GetOptionValue(): js.Any
  def IsEnabled(): scala.Boolean
  def IsVisible(): scala.Boolean
  def SetOptionValue(value: js.Any): scala.Unit
}

object IMetadataCardOption {
  @scala.inline
  def apply(
    Events: IEvents,
    GetExplanation: () => java.lang.String,
    GetName: () => java.lang.String,
    GetOptionValue: () => js.Any,
    IsEnabled: () => scala.Boolean,
    IsVisible: () => scala.Boolean,
    SetOptionValue: js.Any => scala.Unit
  ): IMetadataCardOption = {
    val __obj = js.Dynamic.literal(Events = Events, GetExplanation = js.Any.fromFunction0(GetExplanation), GetName = js.Any.fromFunction0(GetName), GetOptionValue = js.Any.fromFunction0(GetOptionValue), IsEnabled = js.Any.fromFunction0(IsEnabled), IsVisible = js.Any.fromFunction0(IsVisible), SetOptionValue = js.Any.fromFunction1(SetOptionValue))
  
    __obj.asInstanceOf[IMetadataCardOption]
  }
}

