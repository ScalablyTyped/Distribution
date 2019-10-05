package typings.nodeDashForge.nodeDashForgeMod.util

import typings.nodeDashForge.nodeDashForgeMod.Bytes
import typings.nodeDashForge.nodeDashForgeMod.Encoding
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "util.createBuffer")
@js.native
object createBuffer extends js.Object {
  def apply(): ByteBuffer = js.native
  def apply(input: Bytes): ByteBuffer = js.native
  def apply(input: Bytes, encoding: Encoding): ByteBuffer = js.native
  def apply(input: ArrayBufferView): ByteBuffer = js.native
  def apply(input: ArrayBufferView, encoding: Encoding): ByteBuffer = js.native
  def apply(input: ByteStringBuffer): ByteBuffer = js.native
  def apply(input: ByteStringBuffer, encoding: Encoding): ByteBuffer = js.native
  def apply(input: ArrayBuffer): ByteBuffer = js.native
  def apply(input: ArrayBuffer, encoding: Encoding): ByteBuffer = js.native
}

