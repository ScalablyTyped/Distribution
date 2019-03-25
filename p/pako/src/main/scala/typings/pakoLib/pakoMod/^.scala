package typings
package pakoLib.pakoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pako", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def deflate(data: pakoLib.pakoMod.PakoNs.Data): stdLib.Uint8Array = js.native
  /**
    * Compress data with deflate algorithm and options.
    */
  def deflate(
    data: pakoLib.pakoMod.PakoNs.Data,
    options: pakoLib.pakoMod.PakoNs.DeflateFunctionOptions with pakoLib.Anon_String
  ): java.lang.String = js.native
  def deflateRaw(data: pakoLib.pakoMod.PakoNs.Data): stdLib.Uint8Array = js.native
  /**
    * The same as deflate, but creates raw data, without wrapper (header and adler32 crc).
    */
  def deflateRaw(
    data: pakoLib.pakoMod.PakoNs.Data,
    options: pakoLib.pakoMod.PakoNs.DeflateFunctionOptions with pakoLib.Anon_String
  ): java.lang.String = js.native
  @JSName("deflateRaw")
  def deflateRaw_Uint8Array(data: pakoLib.pakoMod.PakoNs.Data, options: pakoLib.pakoMod.PakoNs.DeflateFunctionOptions): stdLib.Uint8Array = js.native
  @JSName("deflate")
  def deflate_Uint8Array(data: pakoLib.pakoMod.PakoNs.Data, options: pakoLib.pakoMod.PakoNs.DeflateFunctionOptions): stdLib.Uint8Array = js.native
  def gzip(data: pakoLib.pakoMod.PakoNs.Data): stdLib.Uint8Array = js.native
  /**
    * The same as deflate, but create gzip wrapper instead of deflate one.
    */
  def gzip(
    data: pakoLib.pakoMod.PakoNs.Data,
    options: pakoLib.pakoMod.PakoNs.DeflateFunctionOptions with pakoLib.Anon_String
  ): java.lang.String = js.native
  @JSName("gzip")
  def gzip_Uint8Array(data: pakoLib.pakoMod.PakoNs.Data, options: pakoLib.pakoMod.PakoNs.DeflateFunctionOptions): stdLib.Uint8Array = js.native
  def inflate(data: pakoLib.pakoMod.PakoNs.Data): stdLib.Uint8Array = js.native
  /**
    * Decompress data with inflate/ungzip and options. Autodetect format via wrapper header
    * by default. That's why we don't provide separate ungzip method.
    */
  def inflate(
    data: pakoLib.pakoMod.PakoNs.Data,
    options: pakoLib.pakoMod.PakoNs.InflateFunctionOptions with pakoLib.Anon_String
  ): java.lang.String = js.native
  def inflateRaw(data: pakoLib.pakoMod.PakoNs.Data): stdLib.Uint8Array = js.native
  /**
    * The same as inflate, but creates raw data, without wrapper (header and adler32 crc).
    */
  def inflateRaw(
    data: pakoLib.pakoMod.PakoNs.Data,
    options: pakoLib.pakoMod.PakoNs.InflateFunctionOptions with pakoLib.Anon_String
  ): java.lang.String = js.native
  @JSName("inflateRaw")
  def inflateRaw_Uint8Array(data: pakoLib.pakoMod.PakoNs.Data, options: pakoLib.pakoMod.PakoNs.InflateFunctionOptions): stdLib.Uint8Array = js.native
  @JSName("inflate")
  def inflate_Uint8Array(data: pakoLib.pakoMod.PakoNs.Data, options: pakoLib.pakoMod.PakoNs.InflateFunctionOptions): stdLib.Uint8Array = js.native
  def ungzip(data: pakoLib.pakoMod.PakoNs.Data): stdLib.Uint8Array = js.native
  /**
    * Just shortcut to inflate, because it autodetects format by header.content. Done for convenience.
    */
  def ungzip(
    data: pakoLib.pakoMod.PakoNs.Data,
    options: pakoLib.pakoMod.PakoNs.InflateFunctionOptions with pakoLib.Anon_String
  ): java.lang.String = js.native
  @JSName("ungzip")
  def ungzip_Uint8Array(data: pakoLib.pakoMod.PakoNs.Data, options: pakoLib.pakoMod.PakoNs.InflateFunctionOptions): stdLib.Uint8Array = js.native
}

