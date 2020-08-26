package typings.messenger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Messenger extends js.Object {
  /**
    * Hides all messages.
    */
  def hideAll(): Unit = js.native
  /**
    * Posts a message.
    */
  def post(options: MessageOptions): Message = js.native
}

object Messenger {
  @scala.inline
  def apply(hideAll: () => Unit, post: MessageOptions => Message): Messenger = {
    val __obj = js.Dynamic.literal(hideAll = js.Any.fromFunction0(hideAll), post = js.Any.fromFunction1(post))
    __obj.asInstanceOf[Messenger]
  }
  @scala.inline
  implicit class MessengerOps[Self <: Messenger] (val x: Self) extends AnyVal {
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
    def setHideAll(value: () => Unit): Self = this.set("hideAll", js.Any.fromFunction0(value))
    @scala.inline
    def setPost(value: MessageOptions => Message): Self = this.set("post", js.Any.fromFunction1(value))
  }
  
}

