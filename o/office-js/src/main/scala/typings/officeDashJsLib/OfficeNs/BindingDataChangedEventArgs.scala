package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about the binding that raised the DataChanged event.
  * 
  * @remarks
  * <table><tr><td>Hosts</td><td>Access, Excel, Word</td></tr></table>
  */
trait BindingDataChangedEventArgs extends js.Object {
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
    val __obj = js.Dynamic.literal(binding = binding)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BindingDataChangedEventArgs]
  }
}

