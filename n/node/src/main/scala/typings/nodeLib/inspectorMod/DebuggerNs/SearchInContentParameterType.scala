package typings
package nodeLib.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SearchInContentParameterType extends js.Object {
  /**
               * If true, search is case sensitive.
               */
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * If true, treats string parameter as regex.
               */
  var isRegex: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * String to search for.
               */
  var query: java.lang.String
  /**
               * Id of the script to search in.
               */
  var scriptId: nodeLib.inspectorMod.RuntimeNs.ScriptId
}

