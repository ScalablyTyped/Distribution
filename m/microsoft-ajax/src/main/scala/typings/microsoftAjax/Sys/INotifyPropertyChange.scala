package typings.microsoftAjax.Sys

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the propertyChanged event.
  */
@js.native
trait INotifyPropertyChange extends StObject {
  
  //#region Events
  /**
    * Occurs when a component property is set to a new value.
    * @param handler
    *       The name of the event handler for the propertyChanged event.
    */
  def add_propertyChanged(handler: js.Function): Unit = js.native
  
  /**
    * Occurs when a component property is set to a new value.
    * @param handler
    *       The name of the event handler for the propertyChanged event.
    */
  def remove_propertyChanged(handler: js.Function): Unit = js.native
}
object INotifyPropertyChange {
  
  @scala.inline
  def apply(add_propertyChanged: js.Function => Unit, remove_propertyChanged: js.Function => Unit): INotifyPropertyChange = {
    val __obj = js.Dynamic.literal(add_propertyChanged = js.Any.fromFunction1(add_propertyChanged), remove_propertyChanged = js.Any.fromFunction1(remove_propertyChanged))
    __obj.asInstanceOf[INotifyPropertyChange]
  }
  
  @scala.inline
  implicit class INotifyPropertyChangeMutableBuilder[Self <: INotifyPropertyChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd_propertyChanged(value: js.Function => Unit): Self = StObject.set(x, "add_propertyChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove_propertyChanged(value: js.Function => Unit): Self = StObject.set(x, "remove_propertyChanged", js.Any.fromFunction1(value))
  }
}
