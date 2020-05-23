package typings.node.anon

import typings.node.utilMod.InspectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var options: InspectOptions
}

object Options {
  @scala.inline
  def apply(options: InspectOptions): Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

