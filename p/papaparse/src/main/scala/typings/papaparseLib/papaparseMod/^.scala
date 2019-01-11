package typings
package papaparseLib.papaparseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("papaparse", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BAD_DELIMETERS: js.Array[java.lang.String] = js.native
  var DefaultDelimiter: java.lang.String = js.native
  var LocalChunkSize: java.lang.String = js.native
  val NODE_STREAM_INPUT: /* 1 */ scala.Double = js.native
  val RECORD_SEP: java.lang.String = js.native
  var RemoteChunkSize: java.lang.String = js.native
  var SCRIPT_PATH: java.lang.String = js.native
  val UNIT_SEP: java.lang.String = js.native
  val WORKERS_SUPPORTED: scala.Boolean = js.native
  def parse(csvString: java.lang.String): papaparseLib.papaparseMod.ParseResult = js.native
  def parse(csvString: java.lang.String, config: papaparseLib.papaparseMod.ParseConfig): papaparseLib.papaparseMod.ParseResult = js.native
  def parse(file: stdLib.File): papaparseLib.papaparseMod.ParseResult = js.native
  def parse(file: stdLib.File, config: papaparseLib.papaparseMod.ParseConfig): papaparseLib.papaparseMod.ParseResult = js.native
  def parse(stream: nodeLib.NodeJSNs.ReadableStream): papaparseLib.papaparseMod.ParseResult = js.native
  def parse(stream: nodeLib.NodeJSNs.ReadableStream, config: papaparseLib.papaparseMod.ParseConfig): papaparseLib.papaparseMod.ParseResult = js.native
  def parse(stream: papaparseLib.papaparseLibNumbers.`1`): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def parse(stream: papaparseLib.papaparseLibNumbers.`1`, config: papaparseLib.papaparseMod.ParseConfig): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def unparse(data: js.Array[js.Array[_] | js.Object]): java.lang.String = js.native
  def unparse(data: js.Array[js.Array[_] | js.Object], config: papaparseLib.papaparseMod.UnparseConfig): java.lang.String = js.native
  def unparse(data: papaparseLib.papaparseMod.UnparseObject): java.lang.String = js.native
  def unparse(data: papaparseLib.papaparseMod.UnparseObject, config: papaparseLib.papaparseMod.UnparseConfig): java.lang.String = js.native
}

