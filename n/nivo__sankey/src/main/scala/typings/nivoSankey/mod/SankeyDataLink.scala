package typings.nivoSankey.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SankeyDataLink extends js.Object {
  var source: String | Double
  var target: String | Double
}

object SankeyDataLink {
  @scala.inline
  def apply(source: String | Double, target: String | Double): SankeyDataLink = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[SankeyDataLink]
  }
}

