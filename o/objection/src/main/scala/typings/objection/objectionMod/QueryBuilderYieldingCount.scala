package typings.objection.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryBuilderYieldingCount[QM /* <: Model */, RM]
  extends QueryBuilderBase[QM, RM, Double]
     with Executable[Double] {
  def throwIfNotFound(): this.type = js.native
}

