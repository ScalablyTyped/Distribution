package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the binding that raised the DataChanged event.
  *
  * [Api set: ExcelApi 1.2]
  */
trait BindingDataChangedEventArgs extends js.Object {
  /**
    *
    * Gets the Binding object that represents the binding that raised the DataChanged event.
    *
    * [Api set: ExcelApi 1.2]
    */
  var binding: Binding
}

object BindingDataChangedEventArgs {
  @scala.inline
  def apply(binding: Binding): BindingDataChangedEventArgs = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BindingDataChangedEventArgs]
  }
}

