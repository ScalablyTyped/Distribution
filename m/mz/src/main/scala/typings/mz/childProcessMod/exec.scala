package typings.mz.childProcessMod

import typings.mz.anon.encodingBufferEncodingExe
import typings.mz.anon.encodingbuffernullundefin
import typings.mz.anon.encodingstringnullExecOpt
import typings.node.Buffer
import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.ExecException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/child_process", "exec")
@js.native
object exec extends js.Object {
  def apply(command: String): js.Promise[js.Tuple2[String, String]] = js.native
  def apply(
    command: String,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def apply(
    command: String,
    options: js.UndefOr[Null | encodingBufferEncodingExe | encodingstringnullExecOpt],
    callback: js.Function3[
      ExecException | Null, 
      Buffer | (/* stdout */ String), 
      Buffer | (/* stderr */ String), 
      Unit
    ]
  ): ChildProcess = js.native
  def apply(command: String, options: encodingBufferEncodingExe): js.Promise[js.Tuple2[String, String]] = js.native
  def apply(command: String, options: encodingbuffernullundefin): js.Promise[js.Tuple2[Buffer, Buffer]] = js.native
  def apply(
    command: String,
    options: encodingbuffernullundefin,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def apply(command: String, options: encodingstringnullExecOpt): js.Promise[js.Tuple2[String | Buffer, String | Buffer]] = js.native
}

