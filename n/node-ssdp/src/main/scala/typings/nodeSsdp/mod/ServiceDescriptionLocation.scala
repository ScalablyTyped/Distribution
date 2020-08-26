package typings.nodeSsdp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceDescriptionLocation extends js.Object {
  /**
    * Location path.
    */
  var path: String = js.native
  /**
    * Location port.
    */
  var port: Double = js.native
  /**
    * Location protocol.
    * @default 'http://'
    */
  var protocol: js.UndefOr[String] = js.native
}

object ServiceDescriptionLocation {
  @scala.inline
  def apply(path: String, port: Double): ServiceDescriptionLocation = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceDescriptionLocation]
  }
  @scala.inline
  implicit class ServiceDescriptionLocationOps[Self <: ServiceDescriptionLocation] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
  }
  
}

