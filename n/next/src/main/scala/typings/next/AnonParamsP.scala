package typings.next

import typings.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParamsP[P /* <: ParsedUrlQuery */] extends js.Object {
  var params: P
}

object AnonParamsP {
  @scala.inline
  def apply[P /* <: ParsedUrlQuery */](params: P): AnonParamsP[P] = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParamsP[P]]
  }
}

