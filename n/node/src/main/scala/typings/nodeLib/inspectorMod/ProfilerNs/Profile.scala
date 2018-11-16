package typings
package nodeLib.inspectorMod.ProfilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Profile.
         */

trait Profile extends js.Object {
  /**
               * Profiling end timestamp in microseconds.
               */
  var endTime: scala.Double
  /**
               * The list of profile nodes. First item is the root node.
               */
  var nodes: js.Array[ProfileNode]
  /**
               * Ids of samples top nodes.
               */
  var samples: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
               * Profiling start timestamp in microseconds.
               */
  var startTime: scala.Double
  /**
               * Time intervals between adjacent samples in microseconds. The first delta is relative to the
               * profile startTime.
               */
  var timeDeltas: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

