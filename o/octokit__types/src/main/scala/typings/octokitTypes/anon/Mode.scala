package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mode extends js.Object {
  var mode: String
  var path: String
  var sha: String
  var size: Double
  var `type`: String
  var url: String
}

object Mode {
  @scala.inline
  def apply(mode: String, path: String, sha: String, size: Double, `type`: String, url: String): Mode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
}

