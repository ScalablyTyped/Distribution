package typings.multiProgress.mod

import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("multi-progress", JSImport.Namespace)
@js.native
/**
  * Create a new @see MultiProgress with the given stream, or stderr by default
  * @param stream A stream to write the progress bars to
  */
class ^ () extends MultiProgress {
  def this(stream: Stream) = this()
}

