package typings
package nodeDash7zLib.nodeDash7zMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSpec extends js.Object {
  var method: java.lang.String
  var path: java.lang.String
  var physicalSize: scala.Double
  var `type`: java.lang.String
}

object FileSpec {
  @scala.inline
  def apply(
    method: java.lang.String,
    path: java.lang.String,
    physicalSize: scala.Double,
    `type`: java.lang.String
  ): FileSpec = {
    val __obj = js.Dynamic.literal(method = method, path = path, physicalSize = physicalSize)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FileSpec]
  }
}

