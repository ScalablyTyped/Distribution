package typings.mz.childProcessMod

import typings.node.Buffer
import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.ExecFileOptions
import typings.node.childProcessMod.ExecFileOptionsWithStringEncoding
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/child_process", "execFile")
@js.native
object execFile extends js.Object {
  def apply(file: String): js.Promise[js.Tuple2[String, String]] = js.native
  def apply(
    file: String,
    args: js.UndefOr[js.Array[String] | ExecFileOptionsWithOtherEncoding | Null],
    callback: js.Function3[Error | Null, Buffer | (/* stdout */ String), Buffer | (/* stderr */ String), Unit]
  ): ChildProcess = js.native
  def apply(
    file: String,
    args: js.UndefOr[js.Array[String] | Null],
    options: js.UndefOr[ExecFileOptionsWithOtherEncoding | Null],
    callback: js.Function3[Error | Null, Buffer | String, Buffer | String, Unit]
  ): ChildProcess = js.native
  def apply(
    file: String,
    args: js.UndefOr[js.Array[String] | Null],
    options: ExecFileOptionsWithBufferEncoding
  ): js.Promise[js.Tuple2[Buffer, Buffer]] = js.native
  def apply(
    file: String,
    args: js.UndefOr[js.Array[String] | Null],
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[Error | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def apply(
    file: String,
    args: js.UndefOr[js.Array[String] | Null],
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def apply(
    file: String,
    args: js.UndefOr[js.Array[String] | Null],
    options: ExecFileOptions,
    callback: js.Function3[Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def apply(file: String, args: js.Array[String]): js.Promise[js.Tuple2[String, String]] = js.native
  def apply(file: String, args: js.Array[String], options: ExecFileOptionsWithOtherEncoding): js.Promise[js.Tuple2[String | Buffer, String | Buffer]] = js.native
  def apply(file: String, args: js.Array[String], options: ExecFileOptions): js.Promise[js.Tuple2[String, String]] = js.native
  def apply(file: String, args: js.Array[String], options: ExecFileOptionsWithStringEncoding): js.Promise[js.Tuple2[String, String]] = js.native
  def apply(file: String, args: Null, options: ExecFileOptionsWithOtherEncoding): js.Promise[js.Tuple2[String | Buffer, String | Buffer]] = js.native
  def apply(file: String, args: Null, options: ExecFileOptions): js.Promise[js.Tuple2[String, String]] = js.native
  def apply(file: String, args: Null, options: ExecFileOptionsWithStringEncoding): js.Promise[js.Tuple2[String, String]] = js.native
  def apply(
    file: String,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def apply(file: String, options: ExecFileOptionsWithBufferEncoding): js.Promise[js.Tuple2[Buffer, Buffer]] = js.native
  def apply(
    file: String,
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def apply(file: String, options: ExecFileOptionsWithOtherEncoding): js.Promise[js.Tuple2[String | Buffer, String | Buffer]] = js.native
  def apply(file: String, options: ExecFileOptions): js.Promise[js.Tuple2[String, String]] = js.native
  def apply(file: String, options: ExecFileOptionsWithStringEncoding): js.Promise[js.Tuple2[String, String]] = js.native
  def apply(
    file: String,
    // `options` can't be mixed into `args`
  // tslint:disable-next-line: unified-signatures
  options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def apply(
    file: String,
    // `options` can't be mixed into `args`
  // tslint:disable-next-line: unified-signatures
  options: ExecFileOptions,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
}

