package typings
package microsoftDashAjaxLib.SysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the propertyChanged event.
  */
trait INotifyPropertyChange extends js.Object {
  //#region Events
  /**
    * Occurs when a component property is set to a new value.
    * @param handler
    *       The name of the event handler for the propertyChanged event.
    */
  def add_propertyChanged(handler: js.Function): scala.Unit
  /**
    * Occurs when a component property is set to a new value.
    * @param handler
    *       The name of the event handler for the propertyChanged event.
    */
  def remove_propertyChanged(handler: js.Function): scala.Unit
}

