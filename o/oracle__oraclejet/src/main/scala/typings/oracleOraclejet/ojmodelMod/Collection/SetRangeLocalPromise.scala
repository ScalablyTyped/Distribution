package typings.oracleOraclejet.ojmodelMod.Collection

import typings.oracleOraclejet.ojmodelMod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait SetRangeLocalPromise extends js.Object {
  var count: Double = js.native
  var models: js.Array[Model] = js.native
  var start: Double = js.native
}

object SetRangeLocalPromise {
  @scala.inline
  def apply(count: Double, models: js.Array[Model], start: Double): SetRangeLocalPromise = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], models = models.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRangeLocalPromise]
  }
  @scala.inline
  implicit class SetRangeLocalPromiseOps[Self <: SetRangeLocalPromise] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelsVarargs(value: Model*): Self = this.set("models", js.Array(value :_*))
    @scala.inline
    def setModels(value: js.Array[Model]): Self = this.set("models", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

