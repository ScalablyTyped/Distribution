package typings
package officeDashJsDashPreviewLib.OfficeExtensionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about an error.
  */
trait DebugInfo extends js.Object {
  /** Error code string, such as "InvalidArgument". */
  var code: java.lang.String
  /** The object type and property or method name (or similar information), if available. */
  var errorLocation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * All statements in the batch request (including any potentially-sensitive information that was specified in the request), if available.
    *
    * These statements may not match the code exactly as written, but will be a close approximation.
    */
  var fullStatements: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Inner error, if applicable. */
  var innerError: js.UndefOr[DebugInfo | java.lang.String] = js.undefined
  /** The error message passed through from the host Office application. */
  var message: java.lang.String
  /**
    * The statement that caused the error, if available.
    *
    * This statement will never contain any potentially-sensitive data and may not match the code exactly as written, 
    * but will be a close approximation.
    */
  var statements: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The statements that closely precede and follow the statement that caused the error, if available.
    *
    * These statements will never contain any potentially-sensitive data and may not match the code exactly as written, 
    * but will be a close approximation.
    */
  var surroundingStatements: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object DebugInfo {
  @scala.inline
  def apply(
    code: java.lang.String,
    message: java.lang.String,
    errorLocation: java.lang.String = null,
    fullStatements: js.Array[java.lang.String] = null,
    innerError: DebugInfo | java.lang.String = null,
    statements: java.lang.String = null,
    surroundingStatements: js.Array[java.lang.String] = null
  ): DebugInfo = {
    val __obj = js.Dynamic.literal(code = code, message = message)
    if (errorLocation != null) __obj.updateDynamic("errorLocation")(errorLocation)
    if (fullStatements != null) __obj.updateDynamic("fullStatements")(fullStatements)
    if (innerError != null) __obj.updateDynamic("innerError")(innerError.asInstanceOf[js.Any])
    if (statements != null) __obj.updateDynamic("statements")(statements)
    if (surroundingStatements != null) __obj.updateDynamic("surroundingStatements")(surroundingStatements)
    __obj.asInstanceOf[DebugInfo]
  }
}

