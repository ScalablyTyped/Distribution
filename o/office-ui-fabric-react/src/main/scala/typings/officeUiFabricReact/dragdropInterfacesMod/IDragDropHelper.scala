package typings.officeUiFabricReact.dragdropInterfacesMod

import typings.officeUiFabricReact.AnonDispose
import typings.officeUiFabricReact.utilitiesMod.EventGroup
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDragDropHelper extends js.Object {
  /**
    * Dispose of listeners bound to instance of helper.
    */
  def dispose(): Unit
  /**
    * Subscribe to events on a DOM node with drag and drop configuration.
    */
  def subscribe(root: HTMLElement, events: EventGroup, options: IDragDropOptions): AnonDispose
  /**
    * Unsubscribe to events registered on a DOM node with key.
    */
  def unsubscribe(root: HTMLElement, key: String): Unit
}

object IDragDropHelper {
  @scala.inline
  def apply(
    dispose: () => Unit,
    subscribe: (HTMLElement, EventGroup, IDragDropOptions) => AnonDispose,
    unsubscribe: (HTMLElement, String) => Unit
  ): IDragDropHelper = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), subscribe = js.Any.fromFunction3(subscribe), unsubscribe = js.Any.fromFunction2(unsubscribe))
  
    __obj.asInstanceOf[IDragDropHelper]
  }
}

