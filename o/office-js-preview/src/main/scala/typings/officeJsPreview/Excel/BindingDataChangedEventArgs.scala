package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the binding that raised the DataChanged event.
  *
  * [Api set: ExcelApi 1.2]
  */
@js.native
trait BindingDataChangedEventArgs extends StObject {
  
  /**
    *
    * Gets a temporary `Binding` object that contains the ID of the `Binding` object that raised the event. Use that ID with `BindingCollection.getItem(id)` to get the binding.
    *
    * [Api set: ExcelApi 1.2]
    */
  var binding: Binding = js.native
}
object BindingDataChangedEventArgs {
  
  @scala.inline
  def apply(binding: Binding): BindingDataChangedEventArgs = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingDataChangedEventArgs]
  }
  
  @scala.inline
  implicit class BindingDataChangedEventArgsMutableBuilder[Self <: BindingDataChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinding(value: Binding): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
  }
}
