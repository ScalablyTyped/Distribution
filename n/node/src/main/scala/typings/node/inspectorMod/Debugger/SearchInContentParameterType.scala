package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.ScriptId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchInContentParameterType extends js.Object {
  /**
    * If true, search is case sensitive.
    */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, treats string parameter as regex.
    */
  var isRegex: js.UndefOr[Boolean] = js.undefined
  /**
    * String to search for.
    */
  var query: java.lang.String
  /**
    * Id of the script to search in.
    */
  var scriptId: ScriptId
}

object SearchInContentParameterType {
  @scala.inline
  def apply(
    query: java.lang.String,
    scriptId: ScriptId,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    isRegex: js.UndefOr[Boolean] = js.undefined
  ): SearchInContentParameterType = {
    val __obj = js.Dynamic.literal(query = query, scriptId = scriptId)
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (!js.isUndefined(isRegex)) __obj.updateDynamic("isRegex")(isRegex)
    __obj.asInstanceOf[SearchInContentParameterType]
  }
}

