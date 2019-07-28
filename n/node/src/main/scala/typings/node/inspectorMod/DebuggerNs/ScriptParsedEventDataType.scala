package typings.node.inspectorMod.DebuggerNs

import typings.node.inspectorMod.RuntimeNs.ExecutionContextId
import typings.node.inspectorMod.RuntimeNs.ScriptId
import typings.node.inspectorMod.RuntimeNs.StackTrace
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
  var hash: java.lang.String
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
  var sourceMapURL: js.UndefOr[java.lang.String] = js.undefined
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
  var url: java.lang.String
}

object ScriptParsedEventDataType {
  @scala.inline
  def apply(
    endColumn: Double,
    endLine: Double,
    executionContextId: ExecutionContextId,
    hash: java.lang.String,
    scriptId: ScriptId,
    startColumn: Double,
    startLine: Double,
    url: java.lang.String,
    executionContextAuxData: js.Object = null,
    hasSourceURL: js.UndefOr[Boolean] = js.undefined,
    isLiveEdit: js.UndefOr[Boolean] = js.undefined,
    isModule: js.UndefOr[Boolean] = js.undefined,
    length: Int | Double = null,
    sourceMapURL: java.lang.String = null,
    stackTrace: StackTrace = null
  ): ScriptParsedEventDataType = {
    val __obj = js.Dynamic.literal(endColumn = endColumn, endLine = endLine, executionContextId = executionContextId, hash = hash, scriptId = scriptId, startColumn = startColumn, startLine = startLine, url = url)
    if (executionContextAuxData != null) __obj.updateDynamic("executionContextAuxData")(executionContextAuxData)
    if (!js.isUndefined(hasSourceURL)) __obj.updateDynamic("hasSourceURL")(hasSourceURL)
    if (!js.isUndefined(isLiveEdit)) __obj.updateDynamic("isLiveEdit")(isLiveEdit)
    if (!js.isUndefined(isModule)) __obj.updateDynamic("isModule")(isModule)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (sourceMapURL != null) __obj.updateDynamic("sourceMapURL")(sourceMapURL)
    if (stackTrace != null) __obj.updateDynamic("stackTrace")(stackTrace)
    __obj.asInstanceOf[ScriptParsedEventDataType]
  }
}

