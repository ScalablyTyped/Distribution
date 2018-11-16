package typings
package nodeLib.inspectorMod.ProfilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Coverage data for a JavaScript script.
         */

trait ScriptCoverage extends js.Object {
  /**
               * Functions contained in the script that has coverage data.
               */
  var functions: js.Array[FunctionCoverage]
  /**
               * JavaScript script id.
               */
  var scriptId: nodeLib.inspectorMod.RuntimeNs.ScriptId
  /**
               * JavaScript script name or url.
               */
  var url: java.lang.String
}

