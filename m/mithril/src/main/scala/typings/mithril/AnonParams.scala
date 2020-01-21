package typings.mithril

import typings.mithril.mod.Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParams extends js.Object {
  var params: Params
  var path: String
}

object AnonParams {
  @scala.inline
  def apply(params: Params, path: String): AnonParams = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParams]
  }
}

