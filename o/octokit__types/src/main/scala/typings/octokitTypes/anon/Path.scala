package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path extends js.Object {
  var count: Double
  var path: String
  var title: String
  var uniques: Double
}

object Path {
  @scala.inline
  def apply(count: Double, path: String, title: String, uniques: Double): Path = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uniques = uniques.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
}

