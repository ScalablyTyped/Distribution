package typings
package merge2Lib.merge2Mod.merge2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Merge2Stream
  extends nodeLib.NodeJSNs.ReadWriteStream {
  /**
           * @summary    Add more streams to an existing merged stream
           *
           * @param      args  streams to add
           *
           * @return     The merged stream
           */
  def add(args: merge2Lib.Streams*): Merge2Stream = js.native
  /**
           * @summary    It will emit 'queueDrain' when all streams merged.
           *             If you set end === false in options, this event give you a notice that
           *             you should add more streams to merge, or end the mergedStream.
           *
           * @param event The 'queueDrain' event
           *
           * @return     This stream
           */
  @JSName("on")
  def on_queueDrain(event: merge2Lib.merge2LibStrings.queueDrain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_queueDrain(event: merge2Lib.merge2LibStrings.queueDrain, listener: js.Function0[scala.Unit]): this.type = js.native
}

