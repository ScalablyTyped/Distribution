package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Oid extends js.Object {
  var oid: String = js.native
  var path: String = js.native
  var ref_name: String = js.native
  var size: Double = js.native
}

object Oid {
  @scala.inline
  def apply(oid: String, path: String, ref_name: String, size: Double): Oid = {
    val __obj = js.Dynamic.literal(oid = oid.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], ref_name = ref_name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Oid]
  }
  @scala.inline
  implicit class OidOps[Self <: Oid] (val x: Self) extends AnyVal {
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
    def setOid(value: String): Self = this.set("oid", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setRef_name(value: String): Self = this.set("ref_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

