package typings.next.apiUtilsMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("next/dist/next-server/server/api-utils", "ApiError")
@js.native
class ApiError protected () extends Error {
  def this(statusCode: Double, message: String) = this()
  
  val statusCode: Double = js.native
}
