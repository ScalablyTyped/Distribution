package typings.overwatchApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Quickplay extends js.Object {
  var competitive: String
  var quickplay: String
}

object Quickplay {
  @scala.inline
  def apply(competitive: String, quickplay: String): Quickplay = {
    val __obj = js.Dynamic.literal(competitive = competitive.asInstanceOf[js.Any], quickplay = quickplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quickplay]
  }
}

