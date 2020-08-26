package typings.nodeSsdp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientOptions extends SsdpOptions {
  /** Bind sockets to each discovered interface explicitly instead of relying on the system. Might help with issues with multiple NICs. */
  var explicitSocketBind: js.UndefOr[Boolean] = js.native
  /** List of interfaces to explicitly bind. By default, bind to all available interfaces. */
  var interfaces: js.UndefOr[js.Array[String]] = js.native
  /**
    * When true socket.bind() will reuse the address, even if another process has already bound a socket on it.
    * @default true
    */
  var reuseAddr: js.UndefOr[Boolean] = js.native
}

object ClientOptions {
  @scala.inline
  def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
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
    def setExplicitSocketBind(value: Boolean): Self = this.set("explicitSocketBind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExplicitSocketBind: Self = this.set("explicitSocketBind", js.undefined)
    @scala.inline
    def setInterfacesVarargs(value: String*): Self = this.set("interfaces", js.Array(value :_*))
    @scala.inline
    def setInterfaces(value: js.Array[String]): Self = this.set("interfaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterfaces: Self = this.set("interfaces", js.undefined)
    @scala.inline
    def setReuseAddr(value: Boolean): Self = this.set("reuseAddr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReuseAddr: Self = this.set("reuseAddr", js.undefined)
  }
  
}

