package typings.nodeForge.mod.pem

import typings.nodeForge.mod.Bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectPEM extends js.Object {
  var body: Bytes = js.native
  var contentDomain: js.UndefOr[js.Any] = js.native
  var dekInfo: js.UndefOr[js.Any] = js.native
  var headers: js.UndefOr[js.Array[_]] = js.native
  var procType: js.UndefOr[js.Any] = js.native
  var `type`: String = js.native
}

object ObjectPEM {
  @scala.inline
  def apply(body: Bytes, `type`: String): ObjectPEM = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectPEM]
  }
  @scala.inline
  implicit class ObjectPEMOps[Self <: ObjectPEM] (val x: Self) extends AnyVal {
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
    def setBody(value: Bytes): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentDomain(value: js.Any): Self = this.set("contentDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentDomain: Self = this.set("contentDomain", js.undefined)
    @scala.inline
    def setDekInfo(value: js.Any): Self = this.set("dekInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDekInfo: Self = this.set("dekInfo", js.undefined)
    @scala.inline
    def setHeadersVarargs(value: js.Any*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: js.Array[_]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setProcType(value: js.Any): Self = this.set("procType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcType: Self = this.set("procType", js.undefined)
  }
  
}

