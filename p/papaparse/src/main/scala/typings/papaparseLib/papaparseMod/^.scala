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
  val NODE_STREAM_INPUT: papaparseLib.papaparseLibNumbers.`1` = js.native
  val RECORD_SEP: java.lang.String = js.native
  var RemoteChunkSize: java.lang.String = js.native
  var SCRIPT_PATH: java.lang.String = js.native
  val UNIT_SEP: java.lang.String = js.native
  val WORKERS_SUPPORTED: scala.Boolean = js.native
  def unparse(data: js.Array[js.Array[_] | js.Object]): java.lang.String = js.native
  def unparse(data: js.Array[js.Array[_] | js.Object], config: UnparseConfig): java.lang.String = js.native
  def unparse(data: UnparseObject): java.lang.String = js.native
  def unparse(data: UnparseObject, config: UnparseConfig): java.lang.String = js.native
}

