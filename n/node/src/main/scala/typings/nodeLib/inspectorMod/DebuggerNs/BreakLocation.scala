package typings
package nodeLib.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BreakLocation extends js.Object {
  /**
               * Column number in the script (0-based).
               */
  var columnNumber: js.UndefOr[scala.Double] = js.undefined
  /**
               * Line number in the script (0-based).
               */
  var lineNumber: scala.Double
  /**
               * Script identifier as reported in the `Debugger.scriptParsed`.
               */
  var scriptId: nodeLib.inspectorMod.RuntimeNs.ScriptId
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

