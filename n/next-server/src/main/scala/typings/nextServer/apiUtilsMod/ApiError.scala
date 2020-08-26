package typings.nextServer.apiUtilsMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/dist/server/api-utils", "ApiError")
@js.native
class ApiError protected () extends Error {
  def this(statusCode: Double, message: String) = this()
  val statusCode: Double = js.native
}

