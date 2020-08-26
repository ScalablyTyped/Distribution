package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMetadataCardAction extends js.Object {
  val Events: IEvents = js.native
  def Activate(): Unit = js.native
  def GetExplanation(): String = js.native
  def GetName(): String = js.native
  def IsEnabled(): Boolean = js.native
  def IsVisible(): Boolean = js.native
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
  @scala.inline
  implicit class IMetadataCardActionOps[Self <: IMetadataCardAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActivate(value: () => Unit): Self = this.set("Activate", js.Any.fromFunction0(value))
    @scala.inline
    def setEvents(value: IEvents): Self = this.set("Events", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetExplanation(value: () => String): Self = this.set("GetExplanation", js.Any.fromFunction0(value))
    @scala.inline
    def setGetName(value: () => String): Self = this.set("GetName", js.Any.fromFunction0(value))
    @scala.inline
    def setIsEnabled(value: () => Boolean): Self = this.set("IsEnabled", js.Any.fromFunction0(value))
    @scala.inline
    def setIsVisible(value: () => Boolean): Self = this.set("IsVisible", js.Any.fromFunction0(value))
  }
  
}

