package typings
package nodeLib.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptFailedToParseEventDataType extends js.Object {
  /**
    * Length of the last line of the script.
    */
  var endColumn: scala.Double
  /**
    * Last line of the script.
    */
  var endLine: scala.Double
  /**
    * Embedder-specific auxiliary data.
    */
  var executionContextAuxData: js.UndefOr[js.Object] = js.undefined
  /**
    * Specifies script creation context.
    */
  var executionContextId: nodeLib.inspectorMod.RuntimeNs.ExecutionContextId
  /**
    * True, if this script has sourceURL.
    */
  var hasSourceURL: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Content hash of the script.
    */
  var hash: java.lang.String
  /**
    * True, if this script is ES6 module.
    */
  var isModule: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This script length.
    */
  var length: js.UndefOr[scala.Double] = js.undefined
  /**
    * Identifier of the script parsed.
    */
  var scriptId: nodeLib.inspectorMod.RuntimeNs.ScriptId
  /**
    * URL of source map associated with script (if any).
    */
  var sourceMapURL: js.UndefOr[java.lang.String] = js.undefined
  /**
    * JavaScript top stack frame of where the script parsed event was triggered if available.
    * @experimental
    */
  var stackTrace: js.UndefOr[nodeLib.inspectorMod.RuntimeNs.StackTrace] = js.undefined
  /**
    * Column offset of the script within the resource with given URL.
    */
  var startColumn: scala.Double
  /**
    * Line offset of the script within the resource with given URL (for script tags).
    */
  var startLine: scala.Double
  /**
    * URL or name of the script parsed (if any).
    */
  var url: java.lang.String
}

object ScriptFailedToParseEventDataType {
  @scala.inline
  def apply(
    endColumn: scala.Double,
    endLine: scala.Double,
    executionContextId: nodeLib.inspectorMod.RuntimeNs.ExecutionContextId,
    hash: java.lang.String,
    scriptId: nodeLib.inspectorMod.RuntimeNs.ScriptId,
    startColumn: scala.Double,
    startLine: scala.Double,
    url: java.lang.String,
    executionContextAuxData: js.Object = null,
    hasSourceURL: js.UndefOr[scala.Boolean] = js.undefined,
    isModule: js.UndefOr[scala.Boolean] = js.undefined,
    length: scala.Int | scala.Double = null,
    sourceMapURL: java.lang.String = null,
    stackTrace: nodeLib.inspectorMod.RuntimeNs.StackTrace = null
  ): ScriptFailedToParseEventDataType = {
    val __obj = js.Dynamic.literal(endColumn = endColumn, endLine = endLine, executionContextId = executionContextId, hash = hash, scriptId = scriptId, startColumn = startColumn, startLine = startLine, url = url)
    if (executionContextAuxData != null) __obj.updateDynamic("executionContextAuxData")(executionContextAuxData)
    if (!js.isUndefined(hasSourceURL)) __obj.updateDynamic("hasSourceURL")(hasSourceURL)
    if (!js.isUndefined(isModule)) __obj.updateDynamic("isModule")(isModule)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (sourceMapURL != null) __obj.updateDynamic("sourceMapURL")(sourceMapURL)
    if (stackTrace != null) __obj.updateDynamic("stackTrace")(stackTrace)
    __obj.asInstanceOf[ScriptFailedToParseEventDataType]
  }
}

