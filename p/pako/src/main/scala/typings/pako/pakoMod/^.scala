package typings.pako.pakoMod

import typings.pako.Anon_String
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pako", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def deflate(data: Data): Uint8Array = js.native
  def deflate(data: Data, options: DeflateFunctionOptions): Uint8Array = js.native
  def deflateRaw(data: Data): Uint8Array = js.native
  def deflateRaw(data: Data, options: DeflateFunctionOptions): Uint8Array = js.native
  /**
    * The same as deflate, but creates raw data, without wrapper (header and adler32 crc).
    */
  @JSName("deflateRaw")
  def deflateRaw_String(data: Data, options: DeflateFunctionOptions with Anon_String): String = js.native
  /**
    * Compress data with deflate algorithm and options.
    */
  @JSName("deflate")
  def deflate_String(data: Data, options: DeflateFunctionOptions with Anon_String): String = js.native
  def gzip(data: Data): Uint8Array = js.native
  def gzip(data: Data, options: DeflateFunctionOptions): Uint8Array = js.native
  /**
    * The same as deflate, but create gzip wrapper instead of deflate one.
    */
  @JSName("gzip")
  def gzip_String(data: Data, options: DeflateFunctionOptions with Anon_String): String = js.native
  def inflate(data: Data): Uint8Array = js.native
  def inflate(data: Data, options: InflateFunctionOptions): Uint8Array = js.native
  def inflateRaw(data: Data): Uint8Array = js.native
  def inflateRaw(data: Data, options: InflateFunctionOptions): Uint8Array = js.native
  /**
    * The same as inflate, but creates raw data, without wrapper (header and adler32 crc).
    */
  @JSName("inflateRaw")
  def inflateRaw_String(data: Data, options: InflateFunctionOptions with Anon_String): String = js.native
  /**
    * Decompress data with inflate/ungzip and options. Autodetect format via wrapper header
    * by default. That's why we don't provide separate ungzip method.
    */
  @JSName("inflate")
  def inflate_String(data: Data, options: InflateFunctionOptions with Anon_String): String = js.native
  def ungzip(data: Data): Uint8Array = js.native
  def ungzip(data: Data, options: InflateFunctionOptions): Uint8Array = js.native
  /**
    * Just shortcut to inflate, because it autodetects format by header.content. Done for convenience.
    */
  @JSName("ungzip")
  def ungzip_String(data: Data, options: InflateFunctionOptions with Anon_String): String = js.native
}

