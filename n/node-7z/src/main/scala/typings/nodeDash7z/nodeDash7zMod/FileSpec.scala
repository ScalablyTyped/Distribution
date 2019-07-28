package typings.nodeDash7z.nodeDash7zMod

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
    val __obj = js.Dynamic.literal(method = method, path = path, physicalSize = physicalSize)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FileSpec]
  }
}

