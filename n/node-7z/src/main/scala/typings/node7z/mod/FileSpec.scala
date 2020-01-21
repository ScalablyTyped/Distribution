package typings.node7z.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSpec extends js.Object {
  var method: String
  var path: String
  var physicalSize: Double
  var `type`: String
}

object FileSpec {
  @scala.inline
  def apply(method: String, path: String, physicalSize: Double, `type`: String): FileSpec = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], physicalSize = physicalSize.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSpec]
  }
}

