package typings.node.inspectorMod.Profiler

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
  var endTime: Double
  /**
    * The list of profile nodes. First item is the root node.
    */
  var nodes: js.Array[ProfileNode]
  /**
    * Ids of samples top nodes.
    */
  var samples: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Profiling start timestamp in microseconds.
    */
  var startTime: Double
  /**
    * Time intervals between adjacent samples in microseconds. The first delta is relative to the profile startTime.
    */
  var timeDeltas: js.UndefOr[js.Array[Double]] = js.undefined
}

object Profile {
  @scala.inline
  def apply(
    endTime: Double,
    nodes: js.Array[ProfileNode],
    startTime: Double,
    samples: js.Array[Double] = null,
    timeDeltas: js.Array[Double] = null
  ): Profile = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    if (samples != null) __obj.updateDynamic("samples")(samples.asInstanceOf[js.Any])
    if (timeDeltas != null) __obj.updateDynamic("timeDeltas")(timeDeltas.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
}

