package typings.merge2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("merge2", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(args: Streams*): Merge2Stream = js.native
  /**
    * @summary        This function takes an arbitrary number of streams and returns a
    *                 Merge2Stream.
    *
    * @description    If a DuplexOption is specified, it has to be specified last in the
    *                 argument list
    *
    * @see            { @link https://github.com/teambition/merge2#api }
    *
    * @param          args  StreamTypes
    * @param          opts  Optional DuplexOption to be specified last
    *
    * @return         A merged duplex stream
    */
  def apply(a: Streams): Merge2Stream = js.native
  def apply(a: Streams, b: Streams): Merge2Stream = js.native
  def apply(a: Streams, b: Streams, c: Streams): Merge2Stream = js.native
  def apply(a: Streams, b: Streams, c: Streams, d: Streams): Merge2Stream = js.native
  def apply(a: Streams, b: Streams, c: Streams, d: Streams, e: Streams): Merge2Stream = js.native
  def apply(a: Streams, b: Streams, c: Streams, d: Streams, e: Streams, options: Options): Merge2Stream = js.native
  def apply(a: Streams, b: Streams, c: Streams, d: Streams, options: Options): Merge2Stream = js.native
  def apply(a: Streams, b: Streams, c: Streams, options: Options): Merge2Stream = js.native
  def apply(a: Streams, b: Streams, options: Options): Merge2Stream = js.native
  def apply(a: Streams, options: Options): Merge2Stream = js.native
}

