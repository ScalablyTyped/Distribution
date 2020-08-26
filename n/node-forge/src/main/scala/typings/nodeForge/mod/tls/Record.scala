package typings.nodeForge.mod.tls

import typings.nodeForge.mod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Record extends js.Object {
  var fragment: ByteBuffer = js.native
  var length: Double = js.native
  var ready: js.UndefOr[Boolean] = js.native
  var `type`: ContentType = js.native
  var version: ProtocolVersion = js.native
}

object Record {
  @scala.inline
  def apply(fragment: ByteBuffer, length: Double, `type`: ContentType, version: ProtocolVersion): Record = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Record]
  }
  @scala.inline
  implicit class RecordOps[Self <: Record] (val x: Self) extends AnyVal {
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
    def setFragment(value: ByteBuffer): Self = this.set("fragment", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ContentType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: ProtocolVersion): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setReady(value: Boolean): Self = this.set("ready", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
  }
  
}

