package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdGeneration extends js.Object {
  var connection: js.UndefOr[js.Object | Null] = js.native
  var idGeneration: js.UndefOr[String] = js.native
  var transform: js.UndefOr[js.Function | Null] = js.native
}

object IdGeneration {
  @scala.inline
  def apply(): IdGeneration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdGeneration]
  }
  @scala.inline
  implicit class IdGenerationOps[Self <: IdGeneration] (val x: Self) extends AnyVal {
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
    def setConnection(value: js.Object): Self = this.set("connection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnection: Self = this.set("connection", js.undefined)
    @scala.inline
    def setConnectionNull: Self = this.set("connection", null)
    @scala.inline
    def setIdGeneration(value: String): Self = this.set("idGeneration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdGeneration: Self = this.set("idGeneration", js.undefined)
    @scala.inline
    def setTransform(value: js.Function): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def setTransformNull: Self = this.set("transform", null)
  }
  
}

