package typings
package papaparseLib.papaparseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("papaparse", "parse")
@js.native
object parse extends js.Object {
  def apply(input: java.lang.String): papaparseLib.papaparseMod.ParseResult = js.native
  def apply(input: java.lang.String, config: papaparseLib.papaparseMod.ParseConfig): papaparseLib.papaparseMod.ParseResult = js.native
  def apply(input: nodeLib.NodeJSNs.ReadableStream): papaparseLib.papaparseMod.ParseResult = js.native
  def apply(input: nodeLib.NodeJSNs.ReadableStream, config: papaparseLib.papaparseMod.ParseConfig): papaparseLib.papaparseMod.ParseResult = js.native
  def apply(input: stdLib.File): papaparseLib.papaparseMod.ParseResult = js.native
  def apply(input: stdLib.File, config: papaparseLib.papaparseMod.ParseConfig): papaparseLib.papaparseMod.ParseResult = js.native
  def apply(stream: papaparseLib.papaparseMod.NODE_STREAM_INPUT_TYPE): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def apply(
    stream: papaparseLib.papaparseMod.NODE_STREAM_INPUT_TYPE,
    config: papaparseLib.papaparseMod.ParseConfig
  ): nodeLib.NodeJSNs.ReadWriteStream = js.native
}

