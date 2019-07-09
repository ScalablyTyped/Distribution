package typings
package npmDashRunLib.npmDashRunMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecFunction extends js.Object {
  def apply(command: java.lang.String): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def apply(
    command: java.lang.String,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def apply(
    command: java.lang.String,
    options: nodeLib.Anon_EncodingNull with nodeLib.childUnderscoreProcessMod.ExecOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def apply(
    command: java.lang.String,
    options: nodeLib.Anon_Encoding with nodeLib.childUnderscoreProcessMod.ExecOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def apply(
    command: java.lang.String,
    options: nodeLib.Anon_Buffer with nodeLib.childUnderscoreProcessMod.ExecOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def apply(
    command: java.lang.String,
    options: nodeLib.Anon_EncodingString with nodeLib.childUnderscoreProcessMod.ExecOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def apply(
    command: java.lang.String,
    options: nodeLib.Anon_EncodingNull with nodeLib.childUnderscoreProcessMod.ExecOptions,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | nodeLib.Buffer, 
      /* stderr */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def apply(
    command: java.lang.String,
    options: nodeLib.Anon_Buffer with nodeLib.childUnderscoreProcessMod.ExecOptions,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ nodeLib.Buffer, 
      /* stderr */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def apply(
    command: java.lang.String,
    options: nodeLib.Anon_EncodingString with nodeLib.childUnderscoreProcessMod.ExecOptions,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | nodeLib.Buffer, 
      /* stderr */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def apply(
    command: java.lang.String,
    options: nodeLib.Anon_Encoding with nodeLib.childUnderscoreProcessMod.ExecOptions,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def apply(
    command: java.lang.String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | nodeLib.Buffer, 
      /* stderr */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def apply(command: java.lang.String, options: nodeLib.childUnderscoreProcessMod.ExecOptions): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def apply(
    command: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecOptions,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def apply(
    command: java.lang.String,
    options: scala.Null,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | nodeLib.Buffer, 
      /* stderr */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def __promisify__(command: java.lang.String): nodeLib.childUnderscoreProcessMod.PromiseWithChild[nodeLib.Anon_Stderr] = js.native
  def __promisify__(
    command: java.lang.String,
    options: nodeLib.Anon_Encoding with nodeLib.childUnderscoreProcessMod.ExecOptions
  ): nodeLib.childUnderscoreProcessMod.PromiseWithChild[nodeLib.Anon_Stderr] = js.native
  def __promisify__(
    command: java.lang.String,
    options: nodeLib.Anon_EncodingNull with nodeLib.childUnderscoreProcessMod.ExecOptions
  ): nodeLib.childUnderscoreProcessMod.PromiseWithChild[nodeLib.Anon_StderrStdoutBuffer] = js.native
  def __promisify__(
    command: java.lang.String,
    options: nodeLib.Anon_Buffer with nodeLib.childUnderscoreProcessMod.ExecOptions
  ): nodeLib.childUnderscoreProcessMod.PromiseWithChild[nodeLib.Anon_StderrStdout] = js.native
  def __promisify__(command: java.lang.String, options: nodeLib.childUnderscoreProcessMod.ExecOptions): nodeLib.childUnderscoreProcessMod.PromiseWithChild[nodeLib.Anon_Stderr] = js.native
}

