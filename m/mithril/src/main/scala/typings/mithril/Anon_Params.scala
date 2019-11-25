package typings.mithril

import typings.mithril.mithrilMod.Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Params extends js.Object {
  var params: Params
  var path: String
}

object Anon_Params {
  @scala.inline
  def apply(params: Params, path: String): Anon_Params = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Params]
  }
}

