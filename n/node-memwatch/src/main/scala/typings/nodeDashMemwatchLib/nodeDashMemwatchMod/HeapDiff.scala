package typings
package nodeDashMemwatchLib.nodeDashMemwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Compare the state of your heap between two points in time, telling you what has been allocated, and what has been released.
 */

trait HeapDiff extends js.Object {
  /**
       * Compute the diff.
       */
  def end(): HeapDiffInformation
}

