package typings
package mithrilLib.streamMod.StreamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stream[T] extends js.Object {
  /** A co-dependent stream that unregisters dependent streams when set to true. */
  @JSName("end")
  var end_Original: Stream[scala.Boolean] = js.native
  /** Returns the value of the stream. */
  def apply(): T = js.native
  /** Sets the value of the stream. */
  def apply(value: T): this.type = js.native
  /** Apply. */
  def ap[U](f: Stream[js.Function1[/* value */ T, U]]): Stream[U] = js.native
  /** Returns the value of the stream. */
  /** A co-dependent stream that unregisters dependent streams when set to true. */
  def end(): scala.Boolean = js.native
  /** Sets the value of the stream. */
  /** A co-dependent stream that unregisters dependent streams when set to true. */
  def end(value: scala.Boolean): this.type = js.native
  /** Creates a dependent stream whose value is set to the result of the callback function. */
  def map(f: js.Function1[/* current */ T, Stream[T] | T | scala.Unit]): Stream[T] = js.native
  /** Creates a dependent stream whose value is set to the result of the callback function. */
  @JSName("map")
  def map_U[U](f: js.Function1[/* current */ T, Stream[U] | U]): Stream[U] = js.native
  /** This method is functionally identical to stream. It exists to conform to Fantasy Land's Applicative specification. */
  def of(): Stream[T] = js.native
  def of(`val`: T): Stream[T] = js.native
  /** When a stream is passed as the argument to JSON.stringify(), the value of the stream is serialized. */
  def toJSON(): java.lang.String = js.native
}

