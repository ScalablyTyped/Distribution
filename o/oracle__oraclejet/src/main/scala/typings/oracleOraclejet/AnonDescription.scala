package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescription extends js.Object {
  var description: AnonToString | js.Function0[String] | String
}

object AnonDescription {
  @scala.inline
  def apply(description: AnonToString | js.Function0[String] | String): AnonDescription = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDescription]
  }
}

