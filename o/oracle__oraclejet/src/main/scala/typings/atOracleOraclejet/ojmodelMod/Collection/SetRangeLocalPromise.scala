package typings.atOracleOraclejet.ojmodelMod.Collection

import typings.atOracleOraclejet.ojmodelMod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait SetRangeLocalPromise extends js.Object {
  var count: Double
  var models: js.Array[Model]
  var start: Double
}

object SetRangeLocalPromise {
  @scala.inline
  def apply(count: Double, models: js.Array[Model], start: Double): SetRangeLocalPromise = {
    val __obj = js.Dynamic.literal(count = count, models = models, start = start)
  
    __obj.asInstanceOf[SetRangeLocalPromise]
  }
}

