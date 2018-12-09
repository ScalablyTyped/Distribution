package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryBuilderYieldingCount[QM /* <: Model */, RM]
  extends QueryBuilderBase[QM, RM, scala.Double]
     with Executable[scala.Double] {
  def throwIfNotFound(): this.type = js.native
}

