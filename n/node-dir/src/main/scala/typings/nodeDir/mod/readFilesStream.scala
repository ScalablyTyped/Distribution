package typings.nodeDir.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-dir", "readFilesStream")
@js.native
object readFilesStream extends js.Object {
  
  def apply(dir: String, options: Options, streamCallback: StreamCallback): Unit = js.native
  def apply(dir: String, options: Options, streamCallback: StreamCallback, finishedCallback: FinishedCallback): Unit = js.native
  def apply(dir: String, streamCallback: StreamCallback): Unit = js.native
  def apply(dir: String, streamCallback: StreamCallback, finishedCallback: FinishedCallback): Unit = js.native
}
