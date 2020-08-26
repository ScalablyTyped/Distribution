package typings.naja.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnippetListeners extends js.Object {
  var afterUpdate: SnippetUpdateListener = js.native
  var beforeUpdate: SnippetUpdateListener = js.native
}

object SnippetListeners {
  @scala.inline
  def apply(afterUpdate: SnippetUpdateListener, beforeUpdate: SnippetUpdateListener): SnippetListeners = {
    val __obj = js.Dynamic.literal(afterUpdate = afterUpdate.asInstanceOf[js.Any], beforeUpdate = beforeUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnippetListeners]
  }
  @scala.inline
  implicit class SnippetListenersOps[Self <: SnippetListeners] (val x: Self) extends AnyVal {
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
    def setAfterUpdateFunction1(value: /* event */ SnippetUpdateEvent => js.Promise[Unit] | Unit): Self = this.set("afterUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def setAfterUpdate(value: SnippetUpdateListener): Self = this.set("afterUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeforeUpdateFunction1(value: /* event */ SnippetUpdateEvent => js.Promise[Unit] | Unit): Self = this.set("beforeUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def setBeforeUpdate(value: SnippetUpdateListener): Self = this.set("beforeUpdate", value.asInstanceOf[js.Any])
  }
  
}

