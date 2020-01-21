package typings.microsoftAjax

import typings.microsoftAjax.Sys.Component
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("$create")
@js.native
object create extends js.Object {
  //#endregion
  //#region Shortcuts to commonly used APIs
  /**
  * Creates and initializes a component of the specified type. This method is static and can be called without creating an instance of the class.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb397487(v=vs.100).aspx}
  *
  * @param type
  *           The type of the component to create.
  * @param properties
  *           (Optional) A JSON object that describes the properties and their values.
  * @param events
  *           (Optional) A JSON object that describes the events and their handlers.
  * @param references
  *           (Optional) A JSON object that describes the properties that are references to other components.
  * @param element
  *           (Optional) The DOM element that the component should be attached to.
  * @returns A new instance of a component that uses the specified parameters.
  */
  def apply(`type`: Type): Component = js.native
  def apply(`type`: Type, properties: js.Any): Component = js.native
  def apply(`type`: Type, properties: js.Any, events: js.Any): Component = js.native
  def apply(`type`: Type, properties: js.Any, events: js.Any, references: js.Any): Component = js.native
  def apply(`type`: Type, properties: js.Any, events: js.Any, references: js.Any, element: HTMLElement): Component = js.native
}

