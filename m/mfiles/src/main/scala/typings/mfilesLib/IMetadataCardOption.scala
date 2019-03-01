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
    GetExplanation: js.Function0[java.lang.String],
    GetName: js.Function0[java.lang.String],
    GetOptionValue: js.Function0[js.Any],
    IsEnabled: js.Function0[scala.Boolean],
    IsVisible: js.Function0[scala.Boolean],
    SetOptionValue: js.Function1[js.Any, scala.Unit]
  ): IMetadataCardOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Events")(Events)
    __obj.updateDynamic("GetExplanation")(GetExplanation)
    __obj.updateDynamic("GetName")(GetName)
    __obj.updateDynamic("GetOptionValue")(GetOptionValue)
    __obj.updateDynamic("IsEnabled")(IsEnabled)
    __obj.updateDynamic("IsVisible")(IsVisible)
    __obj.updateDynamic("SetOptionValue")(SetOptionValue)
    __obj.asInstanceOf[IMetadataCardOption]
  }
}

