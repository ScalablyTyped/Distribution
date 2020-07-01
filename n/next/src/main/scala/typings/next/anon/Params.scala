package typings.next.anon

import typings.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params[P /* <: ParsedUrlQuery */] extends js.Object {
  var params: P
}

object Params {
  @scala.inline
  def apply[/* <: typings.node.querystringMod.ParsedUrlQuery */ P](params: P): Params[P] = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params[P]]
  }
}

