package typings.nodeHueApi.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-hue-api", "ApiError")
@js.native
class ApiError protected () extends Error {
  def this(error: js.Object) = this()
  var address: String = js.native
  var `type`: js.Any = js.native
}

