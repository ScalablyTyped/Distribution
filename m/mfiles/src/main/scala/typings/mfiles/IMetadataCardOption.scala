package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMetadataCardOption extends js.Object {
  
  val Events: IEvents = js.native
  
  def GetExplanation(): String = js.native
  
  def GetName(): String = js.native
  
  def GetOptionValue(): js.Any = js.native
  
  def IsEnabled(): Boolean = js.native
  
  def IsVisible(): Boolean = js.native
  
  def SetOptionValue(value: js.Any): Unit = js.native
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
  
  @scala.inline
  implicit class IMetadataCardOptionOps[Self <: IMetadataCardOption] (val x: Self) extends AnyVal {
    
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
    def setEvents(value: IEvents): Self = this.set("Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetExplanation(value: () => String): Self = this.set("GetExplanation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = this.set("GetName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOptionValue(value: () => js.Any): Self = this.set("GetOptionValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEnabled(value: () => Boolean): Self = this.set("IsEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsVisible(value: () => Boolean): Self = this.set("IsVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetOptionValue(value: js.Any => Unit): Self = this.set("SetOptionValue", js.Any.fromFunction1(value))
  }
}
