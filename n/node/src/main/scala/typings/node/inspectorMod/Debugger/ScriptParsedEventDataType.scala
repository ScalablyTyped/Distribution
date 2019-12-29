package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.ExecutionContextId
import typings.node.inspectorMod.Runtime.ScriptId
import typings.node.inspectorMod.Runtime.StackTrace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptParsedEventDataType extends js.Object {
  /**
    * Length of the last line of the script.
    */
  var endColumn: Double
  /**
    * Last line of the script.
    */
  var endLine: Double
  /**
    * Embedder-specific auxiliary data.
    */
  var executionContextAuxData: js.UndefOr[js.Object] = js.undefined
  /**
    * Specifies script creation context.
    */
  var executionContextId: ExecutionContextId
  /**
    * True, if this script has sourceURL.
    */
  var hasSourceURL: js.UndefOr[Boolean] = js.undefined
  /**
    * Content hash of the script.
    */
  var hash: String
  /**
    * True, if this script is generated as a result of the live edit operation.
    * @experimental
    */
  var isLiveEdit: js.UndefOr[Boolean] = js.undefined
  /**
    * True, if this script is ES6 module.
    */
  var isModule: js.UndefOr[Boolean] = js.undefined
  /**
    * This script length.
    */
  var length: js.UndefOr[Double] = js.undefined
  /**
    * Identifier of the script parsed.
    */
  var scriptId: ScriptId
  /**
    * URL of source map associated with script (if any).
    */
  var sourceMapURL: js.UndefOr[String] = js.undefined
  /**
    * JavaScript top stack frame of where the script parsed event was triggered if available.
    * @experimental
    */
  var stackTrace: js.UndefOr[StackTrace] = js.undefined
  /**
    * Column offset of the script within the resource with given URL.
    */
  var startColumn: Double
  /**
    * Line offset of the script within the resource with given URL (for script tags).
    */
  var startLine: Double
  /**
    * URL or name of the script parsed (if any).
    */
  var url: String
}

object ScriptParsedEventDataType {
  @scala.inline
  def apply(
    endColumn: Double,
    endLine: Double,
    executionContextId: ExecutionContextId,
    hash: String,
    scriptId: ScriptId,
    startColumn: Double,
    startLine: Double,
    url: String,
    executionContextAuxData: js.Object = null,
    hasSourceURL: js.UndefOr[Boolean] = js.undefined,
    isLiveEdit: js.UndefOr[Boolean] = js.undefined,
    isModule: js.UndefOr[Boolean] = js.undefined,
    length: Int | Double = null,
    sourceMapURL: String = null,
    stackTrace: StackTrace = null
  ): ScriptParsedEventDataType = {
    val __obj = js.Dynamic.literal(endColumn = endColumn.asInstanceOf[js.Any], endLine = endLine.asInstanceOf[js.Any], executionContextId = executionContextId.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (executionContextAuxData != null) __obj.updateDynamic("executionContextAuxData")(executionContextAuxData.asInstanceOf[js.Any])
    if (!js.isUndefined(hasSourceURL)) __obj.updateDynamic("hasSourceURL")(hasSourceURL.asInstanceOf[js.Any])
    if (!js.isUndefined(isLiveEdit)) __obj.updateDynamic("isLiveEdit")(isLiveEdit.asInstanceOf[js.Any])
    if (!js.isUndefined(isModule)) __obj.updateDynamic("isModule")(isModule.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (sourceMapURL != null) __obj.updateDynamic("sourceMapURL")(sourceMapURL.asInstanceOf[js.Any])
    if (stackTrace != null) __obj.updateDynamic("stackTrace")(stackTrace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptParsedEventDataType]
  }
}

