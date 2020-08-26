package typings.nodemailerDirectTransport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectOptions extends js.Object {
  /**
    * if true, the connection emits all traffic between client and server as 'log' events
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * optional hostname of the client, used for identifying to the server
    */
  var name: js.UndefOr[String] = js.native
}

object DirectOptions {
  @scala.inline
  def apply(): DirectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectOptions]
  }
  @scala.inline
  implicit class DirectOptionsOps[Self <: DirectOptions] (val x: Self) extends AnyVal {
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
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

