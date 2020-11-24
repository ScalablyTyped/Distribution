package typings.oracleOraclejet.ojcompositeMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewModel extends js.Object {
  
  def activated(param0: ViewModelContext): js.Promise[_] | Unit = js.native
  
  def bindingsApplied(param0: ViewModelContext): Unit = js.native
  
  def connected(param0: ViewModelContext): Unit = js.native
  
  def disconnected(param0: Element): Unit = js.native
  
  def propertyChanged(param0: PropertyChangedContext): Unit = js.native
}
object ViewModel {
  
  @scala.inline
  def apply(
    activated: ViewModelContext => js.Promise[_] | Unit,
    bindingsApplied: ViewModelContext => Unit,
    connected: ViewModelContext => Unit,
    disconnected: Element => Unit,
    propertyChanged: PropertyChangedContext => Unit
  ): ViewModel = {
    val __obj = js.Dynamic.literal(activated = js.Any.fromFunction1(activated), bindingsApplied = js.Any.fromFunction1(bindingsApplied), connected = js.Any.fromFunction1(connected), disconnected = js.Any.fromFunction1(disconnected), propertyChanged = js.Any.fromFunction1(propertyChanged))
    __obj.asInstanceOf[ViewModel]
  }
  
  @scala.inline
  implicit class ViewModelOps[Self <: ViewModel] (val x: Self) extends AnyVal {
    
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
    def setActivated(value: ViewModelContext => js.Promise[_] | Unit): Self = this.set("activated", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindingsApplied(value: ViewModelContext => Unit): Self = this.set("bindingsApplied", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConnected(value: ViewModelContext => Unit): Self = this.set("connected", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisconnected(value: Element => Unit): Self = this.set("disconnected", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPropertyChanged(value: PropertyChangedContext => Unit): Self = this.set("propertyChanged", js.Any.fromFunction1(value))
  }
}
