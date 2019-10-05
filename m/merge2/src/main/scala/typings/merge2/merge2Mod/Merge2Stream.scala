package typings.merge2.merge2Mod

import typings.merge2.merge2Strings.queueDrain
import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Merge2Stream extends ReadWriteStream {
  /**
    * @summary    Add more streams to an existing merged stream
    *
    * @param      args  streams to add
    *
    * @return     The merged stream
    */
  def add(args: Streams*): Merge2Stream = js.native
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
  def on_queueDrain(event: queueDrain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_queueDrain(event: queueDrain, listener: js.Function0[Unit]): this.type = js.native
}

