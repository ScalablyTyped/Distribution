package typings.nodeSass.mod

import typings.node.Buffer
import typings.nodeSass.AnonDuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var css: Buffer
  var map: Buffer
  var stats: AnonDuration
}

object Result {
  @scala.inline
  def apply(css: Buffer, map: Buffer, stats: AnonDuration): Result = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

