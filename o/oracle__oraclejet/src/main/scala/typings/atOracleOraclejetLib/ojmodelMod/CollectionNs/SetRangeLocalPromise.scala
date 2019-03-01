package typings
package atOracleOraclejetLib.ojmodelMod.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait SetRangeLocalPromise extends js.Object {
  var count: scala.Double
  var models: js.Array[atOracleOraclejetLib.ojmodelMod.Model]
  var start: scala.Double
}

object SetRangeLocalPromise {
  @scala.inline
  def apply(count: scala.Double, models: js.Array[atOracleOraclejetLib.ojmodelMod.Model], start: scala.Double): SetRangeLocalPromise = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("models")(models)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[SetRangeLocalPromise]
  }
}

