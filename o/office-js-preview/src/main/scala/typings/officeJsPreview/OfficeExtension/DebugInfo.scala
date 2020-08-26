package typings.officeJsPreview.OfficeExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about an error.
  */
@js.native
trait DebugInfo extends js.Object {
  /** Error code string, such as "InvalidArgument". */
  var code: String = js.native
  /** The object type and property or method name (or similar information), if available. */
  var errorLocation: js.UndefOr[String] = js.native
  /**
    * All statements in the batch request (including any potentially-sensitive information that was specified in the request), if available.
    *
    * These statements may not match the code exactly as written, but will be a close approximation.
    */
  var fullStatements: js.UndefOr[js.Array[String]] = js.native
  /** Inner error, if applicable. */
  var innerError: js.UndefOr[DebugInfo | String] = js.native
  /** The error message passed through from the host Office application. */
  var message: String = js.native
  /**
    * The statement that caused the error, if available.
    *
    * This statement will never contain any potentially-sensitive data and may not match the code exactly as written,
    * but will be a close approximation.
    */
  var statements: js.UndefOr[String] = js.native
  /**
    * The statements that closely precede and follow the statement that caused the error, if available.
    *
    * These statements will never contain any potentially-sensitive data and may not match the code exactly as written,
    * but will be a close approximation.
    */
  var surroundingStatements: js.UndefOr[js.Array[String]] = js.native
}

object DebugInfo {
  @scala.inline
  def apply(code: String, message: String): DebugInfo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugInfo]
  }
  @scala.inline
  implicit class DebugInfoOps[Self <: DebugInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorLocation(value: String): Self = this.set("errorLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorLocation: Self = this.set("errorLocation", js.undefined)
    @scala.inline
    def setFullStatementsVarargs(value: String*): Self = this.set("fullStatements", js.Array(value :_*))
    @scala.inline
    def setFullStatements(value: js.Array[String]): Self = this.set("fullStatements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullStatements: Self = this.set("fullStatements", js.undefined)
    @scala.inline
    def setInnerError(value: DebugInfo | String): Self = this.set("innerError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerError: Self = this.set("innerError", js.undefined)
    @scala.inline
    def setStatements(value: String): Self = this.set("statements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatements: Self = this.set("statements", js.undefined)
    @scala.inline
    def setSurroundingStatementsVarargs(value: String*): Self = this.set("surroundingStatements", js.Array(value :_*))
    @scala.inline
    def setSurroundingStatements(value: js.Array[String]): Self = this.set("surroundingStatements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSurroundingStatements: Self = this.set("surroundingStatements", js.undefined)
  }
  
}

