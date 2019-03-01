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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("physicalSize")(physicalSize)
    __obj.asInstanceOf[FileSpec]
  }
}

