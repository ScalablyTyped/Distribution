package typings
package papaparseLib.papaparseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("papaparse", JSImport.Namespace)
@js.native
object papaparseModMembers extends js.Object {
  val BAD_DELIMETERS: js.Array[java.lang.String] = js.native
  var DefaultDelimiter: java.lang.String = js.native
  var LocalChunkSize: java.lang.String = js.native
  val NODE_STREAM_INPUT: /* 1 */ scala.Double = js.native
  val RECORD_SEP: java.lang.String = js.native
  var RemoteChunkSize: java.lang.String = js.native
  var SCRIPT_PATH: java.lang.String = js.native
  val UNIT_SEP: java.lang.String = js.native
  val WORKERS_SUPPORTED: scala.Boolean = js.native
  def parse(csvString: java.lang.String): ParseResult = js.native
  def parse(csvString: java.lang.String, config: ParseConfig): ParseResult = js.native
  def parse(file: stdLib.File): ParseResult = js.native
  def parse(file: stdLib.File, config: ParseConfig): ParseResult = js.native
  def parse(stream: nodeLib.NodeJSNs.ReadableStream): ParseResult = js.native
  def parse(stream: nodeLib.NodeJSNs.ReadableStream, config: ParseConfig): ParseResult = js.native
  def parse(stream: papaparseLib.papaparseLibNumbers.`1`): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def parse(stream: papaparseLib.papaparseLibNumbers.`1`, config: ParseConfig): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def unparse(data: js.Array[js.Array[_] | js.Object]): java.lang.String = js.native
  def unparse(data: js.Array[js.Array[_] | js.Object], config: UnparseConfig): java.lang.String = js.native
  def unparse(data: UnparseObject): java.lang.String = js.native
  def unparse(data: UnparseObject, config: UnparseConfig): java.lang.String = js.native
}

