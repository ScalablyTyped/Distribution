package typings
package multiDashProgressLib.multiDashProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("multi-progress", JSImport.Default)
@js.native
class default () extends MultiProgress {
  /**
       * Create a new @see MultiProgress with the given stream, or stderr by default
       * @param stream A stream to write the progress bars to
       */
  def this(stream: nodeLib.streamMod.Stream) = this()
}

