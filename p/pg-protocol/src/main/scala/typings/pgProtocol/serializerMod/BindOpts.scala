package typings.pgProtocol.serializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindOpts extends js.Object {
  var binary: js.UndefOr[Boolean] = js.native
  var portal: js.UndefOr[String] = js.native
  var statement: js.UndefOr[String] = js.native
  var values: js.UndefOr[js.Array[_]] = js.native
}

object BindOpts {
  @scala.inline
  def apply(): BindOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindOpts]
  }
  @scala.inline
  implicit class BindOptsOps[Self <: BindOpts] (val x: Self) extends AnyVal {
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
    def setBinary(value: Boolean): Self = this.set("binary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinary: Self = this.set("binary", js.undefined)
    @scala.inline
    def setPortal(value: String): Self = this.set("portal", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePortal: Self = this.set("portal", js.undefined)
    @scala.inline
    def setStatement(value: String): Self = this.set("statement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatement: Self = this.set("statement", js.undefined)
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[_]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

