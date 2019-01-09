package typings
package pakoLib.pakoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pako", JSImport.Namespace)
@js.native
object pakoModMembers extends js.Object {
  def deflate(data: pakoLib.pakoMod.PakoNs.Data): stdLib.Uint8Array = js.native
  def deflate(
    data: pakoLib.pakoMod.PakoNs.Data,
    options: pakoLib.pakoMod.PakoNs.DeflateOptions with pakoLib.Anon_String
  ): java.lang.String = js.native
  def deflateRaw(data: pakoLib.pakoMod.PakoNs.Data): stdLib.Uint8Array = js.native
  def deflateRaw(
    data: pakoLib.pakoMod.PakoNs.Data,
    options: pakoLib.pakoMod.PakoNs.DeflateOptions with pakoLib.Anon_String
  ): java.lang.String = js.native
  @JSName("deflateRaw")
  def deflateRaw_Uint8Array(data: pakoLib.pakoMod.PakoNs.Data, options: pakoLib.pakoMod.PakoNs.DeflateOptions): stdLib.Uint8Array = js.native
  @JSName("deflate")
  def deflate_Uint8Array(data: pakoLib.pakoMod.PakoNs.Data, options: pakoLib.pakoMod.PakoNs.DeflateOptions): stdLib.Uint8Array = js.native
  def gzip(data: pakoLib.pakoMod.PakoNs.Data): stdLib.Uint8Array = js.native
  def gzip(
    data: pakoLib.pakoMod.PakoNs.Data,
    options: pakoLib.pakoMod.PakoNs.DeflateOptions with pakoLib.Anon_String
  ): java.lang.String = js.native
  @JSName("gzip")
  def gzip_Uint8Array(data: pakoLib.pakoMod.PakoNs.Data, options: pakoLib.pakoMod.PakoNs.DeflateOptions): stdLib.Uint8Array = js.native
  def inflate(data: pakoLib.pakoMod.PakoNs.Data): stdLib.Uint8Array = js.native
  def inflate(
    data: pakoLib.pakoMod.PakoNs.Data,
    options: pakoLib.pakoMod.PakoNs.InflateOptions with pakoLib.Anon_String
  ): java.lang.String = js.native
  def inflateRaw(data: pakoLib.pakoMod.PakoNs.Data): stdLib.Uint8Array = js.native
  def inflateRaw(
    data: pakoLib.pakoMod.PakoNs.Data,
    options: pakoLib.pakoMod.PakoNs.InflateOptions with pakoLib.Anon_String
  ): java.lang.String = js.native
  @JSName("inflateRaw")
  def inflateRaw_Uint8Array(data: pakoLib.pakoMod.PakoNs.Data, options: pakoLib.pakoMod.PakoNs.InflateOptions): stdLib.Uint8Array = js.native
  @JSName("inflate")
  def inflate_Uint8Array(data: pakoLib.pakoMod.PakoNs.Data, options: pakoLib.pakoMod.PakoNs.InflateOptions): stdLib.Uint8Array = js.native
  def ungzip(data: pakoLib.pakoMod.PakoNs.Data): stdLib.Uint8Array = js.native
  def ungzip(
    data: pakoLib.pakoMod.PakoNs.Data,
    options: pakoLib.pakoMod.PakoNs.InflateOptions with pakoLib.Anon_String
  ): java.lang.String = js.native
  @JSName("ungzip")
  def ungzip_Uint8Array(data: pakoLib.pakoMod.PakoNs.Data, options: pakoLib.pakoMod.PakoNs.InflateOptions): stdLib.Uint8Array = js.native
}

