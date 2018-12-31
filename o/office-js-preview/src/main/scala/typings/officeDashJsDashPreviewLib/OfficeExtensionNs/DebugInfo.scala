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

