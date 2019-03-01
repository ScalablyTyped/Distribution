package typings
package opentracingLib.libMockUnderscoreTracerMockUnderscoreSpanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugInfo extends js.Object {
  var millis: js.Tuple3[scala.Double, scala.Double, scala.Double]
  var operation: java.lang.String
  var tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var uuid: java.lang.String
}

object DebugInfo {
  @scala.inline
  def apply(
    millis: js.Tuple3[scala.Double, scala.Double, scala.Double],
    operation: java.lang.String,
    uuid: java.lang.String,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): DebugInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("millis")(millis)
    __obj.updateDynamic("operation")(operation)
    __obj.updateDynamic("uuid")(uuid)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[DebugInfo]
  }
}

