package typings.next.checkCustomRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rewrite extends js.Object {
  var destination: String
  var source: String
}

object Rewrite {
  @scala.inline
  def apply(destination: String, source: String): Rewrite = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rewrite]
  }
}

