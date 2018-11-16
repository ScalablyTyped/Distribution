package typings
package merge2Lib.merge2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("merge2", JSImport.Namespace)
@js.native
object merge2ModMembers extends js.Object {
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
  def apply(a: merge2Lib.Streams): merge2Lib.merge2Mod.merge2Ns.Merge2Stream = js.native
  def apply(a: merge2Lib.Streams, b: merge2Lib.Streams): merge2Lib.merge2Mod.merge2Ns.Merge2Stream = js.native
  def apply(a: merge2Lib.Streams, b: merge2Lib.Streams, c: merge2Lib.Streams): merge2Lib.merge2Mod.merge2Ns.Merge2Stream = js.native
  def apply(a: merge2Lib.Streams, b: merge2Lib.Streams, c: merge2Lib.Streams, d: merge2Lib.Streams): merge2Lib.merge2Mod.merge2Ns.Merge2Stream = js.native
  def apply(
    a: merge2Lib.Streams,
    b: merge2Lib.Streams,
    c: merge2Lib.Streams,
    d: merge2Lib.Streams,
    e: merge2Lib.Streams
  ): merge2Lib.merge2Mod.merge2Ns.Merge2Stream = js.native
  def apply(
    a: merge2Lib.Streams,
    b: merge2Lib.Streams,
    c: merge2Lib.Streams,
    d: merge2Lib.Streams,
    e: merge2Lib.Streams,
    options: merge2Lib.merge2Mod.merge2Ns.Options
  ): merge2Lib.merge2Mod.merge2Ns.Merge2Stream = js.native
  def apply(
    a: merge2Lib.Streams,
    b: merge2Lib.Streams,
    c: merge2Lib.Streams,
    d: merge2Lib.Streams,
    options: merge2Lib.merge2Mod.merge2Ns.Options
  ): merge2Lib.merge2Mod.merge2Ns.Merge2Stream = js.native
  def apply(
    a: merge2Lib.Streams,
    b: merge2Lib.Streams,
    c: merge2Lib.Streams,
    options: merge2Lib.merge2Mod.merge2Ns.Options
  ): merge2Lib.merge2Mod.merge2Ns.Merge2Stream = js.native
  def apply(a: merge2Lib.Streams, b: merge2Lib.Streams, options: merge2Lib.merge2Mod.merge2Ns.Options): merge2Lib.merge2Mod.merge2Ns.Merge2Stream = js.native
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
  def apply(a: merge2Lib.Streams, options: merge2Lib.merge2Mod.merge2Ns.Options): merge2Lib.merge2Mod.merge2Ns.Merge2Stream = js.native
  def apply(args: merge2Lib.Streams*): merge2Lib.merge2Mod.merge2Ns.Merge2Stream = js.native
}

