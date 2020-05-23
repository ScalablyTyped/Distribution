package typings.next.anon

import typings.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Paths[P /* <: ParsedUrlQuery */] extends js.Object {
  var fallback: Boolean
  var paths: js.Array[String | Params[P]]
}

object Paths {
  @scala.inline
  def apply[P](fallback: Boolean, paths: js.Array[String | Params[P]]): Paths[P] = {
    val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paths[P]]
  }
}

