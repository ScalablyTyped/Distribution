package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the binding that raised the DataChanged event.
  */
trait BindingDataChangedEventArgs extends StObject {
  
  /**
    * Gets an {@link Office.Binding} object that represents the binding that raised the DataChanged event.
    */
  var binding: Binding
  
  /**
    * Gets an {@link Office.EventType} enumeration value that identifies the kind of event that was raised.
    */
  var `type`: EventType
}
object BindingDataChangedEventArgs {
  
  @scala.inline
  def apply(binding: Binding, `type`: EventType): BindingDataChangedEventArgs = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingDataChangedEventArgs]
  }
  
  @scala.inline
  implicit class BindingDataChangedEventArgsMutableBuilder[Self <: BindingDataChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinding(value: Binding): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: EventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
