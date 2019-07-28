package typings.papaparse.papaparseMod

import typings.papaparse.papaparseNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("papaparse", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BAD_DELIMETERS: js.Array[String] = js.native
  var DefaultDelimiter: String = js.native
  var LocalChunkSize: String = js.native
  val NODE_STREAM_INPUT: `1` = js.native
  val RECORD_SEP: String = js.native
  var RemoteChunkSize: String = js.native
  var SCRIPT_PATH: String = js.native
  val UNIT_SEP: String = js.native
  val WORKERS_SUPPORTED: Boolean = js.native
  def unparse(data: js.Array[js.Array[_] | js.Object]): String = js.native
  def unparse(data: js.Array[js.Array[_] | js.Object], config: UnparseConfig): String = js.native
  def unparse(data: UnparseObject): String = js.native
  def unparse(data: UnparseObject, config: UnparseConfig): String = js.native
}

