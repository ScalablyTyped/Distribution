package typings.nextDashServer.ampMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithAmpConfig extends js.Object {
  var hybrid: Boolean
}

object WithAmpConfig {
  @scala.inline
  def apply(hybrid: Boolean): WithAmpConfig = {
    val __obj = js.Dynamic.literal(hybrid = hybrid)
  
    __obj.asInstanceOf[WithAmpConfig]
  }
}

