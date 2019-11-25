package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadataCardOption extends js.Object {
  val Events: IEvents
  def GetExplanation(): String
  def GetName(): String
  def GetOptionValue(): js.Any
  def IsEnabled(): Boolean
  def IsVisible(): Boolean
  def SetOptionValue(value: js.Any): Unit
}

object IMetadataCardOption {
  @scala.inline
  def apply(
    Events: IEvents,
    GetExplanation: () => String,
    GetName: () => String,
    GetOptionValue: () => js.Any,
    IsEnabled: () => Boolean,
    IsVisible: () => Boolean,
    SetOptionValue: js.Any => Unit
  ): IMetadataCardOption = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], GetExplanation = js.Any.fromFunction0(GetExplanation), GetName = js.Any.fromFunction0(GetName), GetOptionValue = js.Any.fromFunction0(GetOptionValue), IsEnabled = js.Any.fromFunction0(IsEnabled), IsVisible = js.Any.fromFunction0(IsVisible), SetOptionValue = js.Any.fromFunction1(SetOptionValue))
  
    __obj.asInstanceOf[IMetadataCardOption]
  }
}

