package typings.onfleetNodeOnfleet.hubsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hub extends js.Object {
  def get(): js.Promise[js.Array[OnfleetHub]] = js.native
}

object Hub {
  @scala.inline
  def apply(get: () => js.Promise[js.Array[OnfleetHub]]): Hub = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get))
    __obj.asInstanceOf[Hub]
  }
  @scala.inline
  implicit class HubOps[Self <: Hub] (val x: Self) extends AnyVal {
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
    def setGet(value: () => js.Promise[js.Array[OnfleetHub]]): Self = this.set("get", js.Any.fromFunction0(value))
  }
  
}

