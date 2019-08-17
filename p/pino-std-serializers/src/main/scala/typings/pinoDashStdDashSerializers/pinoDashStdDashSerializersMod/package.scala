package typings.pinoDashStdDashSerializers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pinoDashStdDashSerializersMod {
  import typings.std.Record

  type CustomErrorSerializer = js.Function1[/* err */ SerializedError, Record[String, js.Any]]
  type CustomRequestSerializer = js.Function1[/* req */ SerializedRequest, Record[String, js.Any]]
  type CustomResponseSerializer = js.Function1[/* res */ SerializedResponse, Record[String, js.Any]]
}
