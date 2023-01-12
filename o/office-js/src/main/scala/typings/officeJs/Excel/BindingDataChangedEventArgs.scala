package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the binding that raised the data changed event.
  *
  * @remarks
  * [Api set: ExcelApi 1.2]
  */
trait BindingDataChangedEventArgs extends StObject {
  
  /**
    * Gets a temporary `Binding` object that contains the ID of the `Binding` object that raised the event. Use that ID with `BindingCollection.getItem(id)` to get the binding.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var binding: Binding
}
object BindingDataChangedEventArgs {
  
  inline def apply(binding: Binding): BindingDataChangedEventArgs = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingDataChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BindingDataChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setBinding(value: Binding): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
  }
}
