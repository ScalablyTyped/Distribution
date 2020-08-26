package typings.pollyjsAdapter.mod

import org.scalablytyped.runtime.StringDictionary
import typings.pollyjsAdapter.anon.Body
import typings.pollyjsCore.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Adapter extends js.Object {
  val options: StringDictionary[js.Any] = js.native
  def connect(): Unit = js.native
  def disconnect(): Unit = js.native
  def passthroughRequest(pollyRequest: Request): js.Promise[Body] = js.native
}

object Adapter {
  @scala.inline
  def apply(
    connect: () => Unit,
    disconnect: () => Unit,
    options: StringDictionary[js.Any],
    passthroughRequest: Request => js.Promise[Body]
  ): Adapter = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect), disconnect = js.Any.fromFunction0(disconnect), options = options.asInstanceOf[js.Any], passthroughRequest = js.Any.fromFunction1(passthroughRequest))
    __obj.asInstanceOf[Adapter]
  }
  @scala.inline
  implicit class AdapterOps[Self <: Adapter] (val x: Self) extends AnyVal {
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
    def setConnect(value: () => Unit): Self = this.set("connect", js.Any.fromFunction0(value))
    @scala.inline
    def setDisconnect(value: () => Unit): Self = this.set("disconnect", js.Any.fromFunction0(value))
    @scala.inline
    def setOptions(value: StringDictionary[js.Any]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassthroughRequest(value: Request => js.Promise[Body]): Self = this.set("passthroughRequest", js.Any.fromFunction1(value))
  }
  
}

