package typings.next

import typings.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParams extends js.Object {
  var params: ParsedUrlQuery
}

object AnonParams {
  @scala.inline
  def apply(params: ParsedUrlQuery): AnonParams = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParams]
  }
}

