package typings
package officeDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtendedErrorLogging extends js.Object {
  /**
    * Determines whether to log additional error information upon failure.
    *
    * When this property is set to true, the error object will include a "debugInfo.fullStatements" property that lists all statements in the 
    * batch request, including all statements that precede and follow the point of failure.
    *
    * Setting this property to true will negatively impact performance and will log all statements in the batch request, including any statements 
    * that may contain potentially-sensitive data.
    * It is recommended that you only set this property to true during debugging and that you never log the value of 
    * error.debugInfo.fullStatements to an external database or analytics service.
    */
  var extendedErrorLogging: scala.Boolean
}

object Anon_ExtendedErrorLogging {
  @scala.inline
  def apply(extendedErrorLogging: scala.Boolean): Anon_ExtendedErrorLogging = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extendedErrorLogging")(extendedErrorLogging)
    __obj.asInstanceOf[Anon_ExtendedErrorLogging]
  }
}

