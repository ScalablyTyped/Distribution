package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadataCardAction extends js.Object {
  val Events: IEvents
  def Activate(): Unit
  def GetExplanation(): String
  def GetName(): String
  def IsEnabled(): Boolean
  def IsVisible(): Boolean
}

object IMetadataCardAction {
  @scala.inline
  def apply(
    Activate: () => Unit,
    Events: IEvents,
    GetExplanation: () => String,
    GetName: () => String,
    IsEnabled: () => Boolean,
    IsVisible: () => Boolean
  ): IMetadataCardAction = {
    val __obj = js.Dynamic.literal(Activate = js.Any.fromFunction0(Activate), Events = Events.asInstanceOf[js.Any], GetExplanation = js.Any.fromFunction0(GetExplanation), GetName = js.Any.fromFunction0(GetName), IsEnabled = js.Any.fromFunction0(IsEnabled), IsVisible = js.Any.fromFunction0(IsVisible))
  
    __obj.asInstanceOf[IMetadataCardAction]
  }
}

