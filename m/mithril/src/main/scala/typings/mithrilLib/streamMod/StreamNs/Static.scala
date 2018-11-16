package typings
package mithrilLib.streamMod.StreamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends js.Object {
  /** A special value that can be returned to stream callbacks to halt execution of downstreams. */
  val HALT: js.Any = js.native
  /** Creates a stream. */
  def apply[T](): Stream[T] = js.native
  /** Creates a stream. */
  def apply[T](value: T): Stream[T] = js.native
  /** Creates a computed stream that reactively updates if any of its upstreams are updated. */
  def combine[T](combiner: js.Function1[/* repeated */js.Any, T], streams: js.Array[Stream[_]]): Stream[T] = js.native
  /** Creates a stream whose value is the array of values from an array of streams. */
  def merge(streams: js.Array[Stream[_]]): Stream[js.Array[_]] = js.native
  /** Creates a new stream with the results of calling the function on every incoming stream with and accumulator and the incoming value. */
  def scan[T, U](fn: js.Function2[/* acc */ U, /* value */ T, U], acc: U, stream: Stream[T]): Stream[U] = js.native
  /** Takes an array of pairs of streams and scan functions and merges all those streams using the given functions into a single stream. */
  def scanMerge[U](pairs: js.Array[js.Tuple2[Stream[_], js.Function2[/* acc */ U, /* value */ _, U]]], acc: U): Stream[U] = js.native
  /** Takes an array of pairs of streams and scan functions and merges all those streams using the given functions into a single stream. */
  @JSName("scanMerge")
  def scanMerge_TU[T, U](pairs: js.Array[js.Tuple2[Stream[T], js.Function2[/* acc */ U, /* value */ T, U]]], acc: U): Stream[U] = js.native
}

