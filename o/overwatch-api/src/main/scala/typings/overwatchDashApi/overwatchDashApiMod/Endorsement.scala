package typings.overwatchDashApi.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Endorsement extends js.Object {
  var rate: Double
  var value: Double
}

object Endorsement {
  @scala.inline
  def apply(rate: Double, value: Double): Endorsement = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Endorsement]
  }
}

