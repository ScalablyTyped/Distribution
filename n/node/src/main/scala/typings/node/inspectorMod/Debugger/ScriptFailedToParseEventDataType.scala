package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.ExecutionContextId
import typings.node.inspectorMod.Runtime.ScriptId
import typings.node.inspectorMod.Runtime.StackTrace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScriptFailedToParseEventDataType extends js.Object {
  /**
    * Length of the last line of the script.
    */
  var endColumn: Double = js.native
  /**
    * Last line of the script.
    */
  var endLine: Double = js.native
  /**
    * Embedder-specific auxiliary data.
    */
  var executionContextAuxData: js.UndefOr[js.Object] = js.native
  /**
    * Specifies script creation context.
    */
  var executionContextId: ExecutionContextId = js.native
  /**
    * True, if this script has sourceURL.
    */
  var hasSourceURL: js.UndefOr[Boolean] = js.native
  /**
    * Content hash of the script.
    */
  var hash: String = js.native
  /**
    * True, if this script is ES6 module.
    */
  var isModule: js.UndefOr[Boolean] = js.native
  /**
    * This script length.
    */
  var length: js.UndefOr[Double] = js.native
  /**
    * Identifier of the script parsed.
    */
  var scriptId: ScriptId = js.native
  /**
    * URL of source map associated with script (if any).
    */
  var sourceMapURL: js.UndefOr[String] = js.native
  /**
    * JavaScript top stack frame of where the script parsed event was triggered if available.
    * @experimental
    */
  var stackTrace: js.UndefOr[StackTrace] = js.native
  /**
    * Column offset of the script within the resource with given URL.
    */
  var startColumn: Double = js.native
  /**
    * Line offset of the script within the resource with given URL (for script tags).
    */
  var startLine: Double = js.native
  /**
    * URL or name of the script parsed (if any).
    */
  var url: String = js.native
}

object ScriptFailedToParseEventDataType {
  @scala.inline
  def apply(
    endColumn: Double,
    endLine: Double,
    executionContextId: ExecutionContextId,
    hash: String,
    scriptId: ScriptId,
    startColumn: Double,
    startLine: Double,
    url: String
  ): ScriptFailedToParseEventDataType = {
    val __obj = js.Dynamic.literal(endColumn = endColumn.asInstanceOf[js.Any], endLine = endLine.asInstanceOf[js.Any], executionContextId = executionContextId.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptFailedToParseEventDataType]
  }
  @scala.inline
  implicit class ScriptFailedToParseEventDataTypeOps[Self <: ScriptFailedToParseEventDataType] (val x: Self) extends AnyVal {
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
    def setEndColumn(value: Double): Self = this.set("endColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndLine(value: Double): Self = this.set("endLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecutionContextId(value: ExecutionContextId): Self = this.set("executionContextId", value.asInstanceOf[js.Any])
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setScriptId(value: ScriptId): Self = this.set("scriptId", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartColumn(value: Double): Self = this.set("startColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartLine(value: Double): Self = this.set("startLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecutionContextAuxData(value: js.Object): Self = this.set("executionContextAuxData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionContextAuxData: Self = this.set("executionContextAuxData", js.undefined)
    @scala.inline
    def setHasSourceURL(value: Boolean): Self = this.set("hasSourceURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasSourceURL: Self = this.set("hasSourceURL", js.undefined)
    @scala.inline
    def setIsModule(value: Boolean): Self = this.set("isModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsModule: Self = this.set("isModule", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setSourceMapURL(value: String): Self = this.set("sourceMapURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMapURL: Self = this.set("sourceMapURL", js.undefined)
    @scala.inline
    def setStackTrace(value: StackTrace): Self = this.set("stackTrace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackTrace: Self = this.set("stackTrace", js.undefined)
  }
  
}

