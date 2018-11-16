package typings
package nodeLib.inspectorMod.ProfilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Coverage data for a JavaScript function.
         */

trait FunctionCoverage extends js.Object {
  /**
               * JavaScript function name.
               */
  var functionName: java.lang.String
  /**
               * Whether coverage data for this function has block granularity.
               */
  var isBlockCoverage: scala.Boolean
  /**
               * Source ranges inside the function with coverage data.
               */
  var ranges: js.Array[CoverageRange]
}

