package typings
package pinoDashStdDashSerializersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pinoDashStdDashSerializersMod {
  type CustomErrorSerializer = js.Function1[/* err */ SerializedError, stdLib.Record[java.lang.String, js.Any]]
  type CustomRequestSerializer = js.Function1[/* req */ SerializedRequest, stdLib.Record[java.lang.String, js.Any]]
  type CustomResponseSerializer = js.Function1[/* res */ SerializedResponse, stdLib.Record[java.lang.String, js.Any]]
}
