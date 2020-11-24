package typings.playable.chomecastApiMockMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Publisher extends js.Object {
  
  var _listeners: StringDictionary[js.Array[js.Function]] = js.native
  
  def addEventListener(`type`: eventType, func: js.Function): Unit = js.native
  
  def trigger(`type`: eventType, event: js.Any): Unit = js.native
}
object Publisher {
  
  @scala.inline
  def apply(
    _listeners: StringDictionary[js.Array[js.Function]],
    addEventListener: (eventType, js.Function) => Unit,
    trigger: (eventType, js.Any) => Unit
  ): Publisher = {
    val __obj = js.Dynamic.literal(_listeners = _listeners.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction2(addEventListener), trigger = js.Any.fromFunction2(trigger))
    __obj.asInstanceOf[Publisher]
  }
  
  @scala.inline
  implicit class PublisherOps[Self <: Publisher] (val x: Self) extends AnyVal {
    
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
    def set_listeners(value: StringDictionary[js.Array[js.Function]]): Self = this.set("_listeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddEventListener(value: (eventType, js.Function) => Unit): Self = this.set("addEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTrigger(value: (eventType, js.Any) => Unit): Self = this.set("trigger", js.Any.fromFunction2(value))
  }
}
