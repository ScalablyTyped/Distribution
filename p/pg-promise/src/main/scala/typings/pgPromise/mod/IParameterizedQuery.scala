package typings.pgPromise.mod

import typings.pgPromise.pgPromiseStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IParameterizedQuery extends _QueryParam {
  var binary: js.UndefOr[Boolean] = js.native
  var rowMode: js.UndefOr[Unit | array] = js.native
  var text: js.UndefOr[String | QueryFile] = js.native
  var values: js.UndefOr[js.Array[_]] = js.native
}

object IParameterizedQuery {
  @scala.inline
  def apply(): IParameterizedQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IParameterizedQuery]
  }
  @scala.inline
  implicit class IParameterizedQueryOps[Self <: IParameterizedQuery] (val x: Self) extends AnyVal {
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
    def setRowMode(value: Unit | array): Self = this.set("rowMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowMode: Self = this.set("rowMode", js.undefined)
    @scala.inline
    def setText(value: String | QueryFile): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[_]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

