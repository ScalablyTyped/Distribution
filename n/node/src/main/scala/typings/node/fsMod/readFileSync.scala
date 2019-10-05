package typings.node.fsMod

import typings.node.Anon_EncodingFlag
import typings.node.Anon_EncodingFlagNull
import typings.node.Anon_EncodingFlagString
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "readFileSync")
@js.native
object readFileSync extends js.Object {
  def apply(path: Double): Buffer = js.native
  def apply(path: Double, options: java.lang.String): java.lang.String | Buffer = js.native
  def apply(path: Double, options: Anon_EncodingFlag): Buffer = js.native
  def apply(path: Double, options: Anon_EncodingFlagNull): java.lang.String | Buffer = js.native
  def apply(path: Double, options: Anon_EncodingFlagString): java.lang.String = js.native
  /**
    * Synchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options An object that may contain an optional flag. If a flag is not provided, it defaults to `'r'`.
    */
  def apply(path: PathLike): Buffer = js.native
  def apply(path: PathLike, options: java.lang.String): java.lang.String | Buffer = js.native
  def apply(path: PathLike, options: Anon_EncodingFlag): Buffer = js.native
  def apply(path: PathLike, options: Anon_EncodingFlagNull): java.lang.String | Buffer = js.native
  /**
    * Synchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  def apply(path: PathLike, options: Anon_EncodingFlagString): java.lang.String = js.native
}

