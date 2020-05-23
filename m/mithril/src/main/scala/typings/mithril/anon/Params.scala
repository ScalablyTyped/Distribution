package typings.mithril.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  var params: typings.mithril.mod.Params
  var path: String
}

object Params {
  @scala.inline
  def apply(params: typings.mithril.mod.Params, path: String): Params = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}

