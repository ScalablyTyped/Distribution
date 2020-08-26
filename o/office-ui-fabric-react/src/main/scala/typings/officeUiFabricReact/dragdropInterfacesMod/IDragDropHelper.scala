package typings.officeUiFabricReact.dragdropInterfacesMod

import typings.officeUiFabricReact.anon.Dispose
import typings.officeUiFabricReact.utilitiesMod.EventGroup
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDragDropHelper extends js.Object {
  /**
    * Dispose of listeners bound to instance of helper.
    */
  def dispose(): Unit = js.native
  /**
    * Subscribe to events on a DOM node with drag and drop configuration.
    */
  def subscribe(root: HTMLElement, events: EventGroup, options: IDragDropOptions): Dispose = js.native
  /**
    * Unsubscribe to events registered on a DOM node with key.
    */
  def unsubscribe(root: HTMLElement, key: String): Unit = js.native
}

object IDragDropHelper {
  @scala.inline
  def apply(
    dispose: () => Unit,
    subscribe: (HTMLElement, EventGroup, IDragDropOptions) => Dispose,
    unsubscribe: (HTMLElement, String) => Unit
  ): IDragDropHelper = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), subscribe = js.Any.fromFunction3(subscribe), unsubscribe = js.Any.fromFunction2(unsubscribe))
    __obj.asInstanceOf[IDragDropHelper]
  }
  @scala.inline
  implicit class IDragDropHelperOps[Self <: IDragDropHelper] (val x: Self) extends AnyVal {
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
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    @scala.inline
    def setSubscribe(value: (HTMLElement, EventGroup, IDragDropOptions) => Dispose): Self = this.set("subscribe", js.Any.fromFunction3(value))
    @scala.inline
    def setUnsubscribe(value: (HTMLElement, String) => Unit): Self = this.set("unsubscribe", js.Any.fromFunction2(value))
  }
  
}

