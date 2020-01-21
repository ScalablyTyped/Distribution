package typings.officeJsPreview.OfficeExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about an error.
  */
trait DebugInfo extends js.Object {
  /** Error code string, such as "InvalidArgument". */
  var code: String
  /** The object type and property or method name (or similar information), if available. */
  var errorLocation: js.UndefOr[String] = js.undefined
  /**
    * All statements in the batch request (including any potentially-sensitive information that was specified in the request), if available.
    *
    * These statements may not match the code exactly as written, but will be a close approximation.
    */
  var fullStatements: js.UndefOr[js.Array[String]] = js.undefined
  /** Inner error, if applicable. */
  var innerError: js.UndefOr[DebugInfo | String] = js.undefined
  /** The error message passed through from the host Office application. */
  var message: String
  /**
    * The statement that caused the error, if available.
    *
    * This statement will never contain any potentially-sensitive data and may not match the code exactly as written, 
    * but will be a close approximation.
    */
  var statements: js.UndefOr[String] = js.undefined
  /**
    * The statements that closely precede and follow the statement that caused the error, if available.
    *
    * These statements will never contain any potentially-sensitive data and may not match the code exactly as written, 
    * but will be a close approximation.
    */
  var surroundingStatements: js.UndefOr[js.Array[String]] = js.undefined
}

object DebugInfo {
  @scala.inline
  def apply(
    code: String,
    message: String,
    errorLocation: String = null,
    fullStatements: js.Array[String] = null,
    innerError: DebugInfo | String = null,
    statements: String = null,
    surroundingStatements: js.Array[String] = null
  ): DebugInfo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    if (errorLocation != null) __obj.updateDynamic("errorLocation")(errorLocation.asInstanceOf[js.Any])
    if (fullStatements != null) __obj.updateDynamic("fullStatements")(fullStatements.asInstanceOf[js.Any])
    if (innerError != null) __obj.updateDynamic("innerError")(innerError.asInstanceOf[js.Any])
    if (statements != null) __obj.updateDynamic("statements")(statements.asInstanceOf[js.Any])
    if (surroundingStatements != null) __obj.updateDynamic("surroundingStatements")(surroundingStatements.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugInfo]
  }
}

