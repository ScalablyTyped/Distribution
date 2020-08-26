package typings.nodeSsh.mod

import typings.nodeSsh.anon.ExecOptionsstreamboth
import typings.nodeSsh.anon.ExecOptionsstreamstdoutst
import typings.nodeSsh.anon.Local
import typings.nodeSsh.nodeSshStrings.exec
import typings.nodeSsh.nodeSshStrings.sftp
import typings.ssh2Streams.mod.TransferOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSH extends js.Object {
  def connect(givenConfig: ConfigGiven): js.Promise[this.type] = js.native
  def dispose(): Unit = js.native
  def exec(command: String): js.Promise[String] = js.native
  def exec(command: String, parameters: js.UndefOr[scala.Nothing], options: ExecOptionsstreamboth): js.Promise[ExecResult] = js.native
  def exec(command: String, parameters: js.UndefOr[scala.Nothing], options: ExecOptionsstreamstdoutst): js.Promise[String] = js.native
  def exec(command: String, parameters: js.Array[String]): js.Promise[String] = js.native
  def exec(command: String, parameters: js.Array[String], options: ExecOptionsstreamboth): js.Promise[ExecResult] = js.native
  def exec(command: String, parameters: js.Array[String], options: ExecOptionsstreamstdoutst): js.Promise[String] = js.native
  def execCommand(givenCommand: String): js.Promise[ExecResult] = js.native
  def execCommand(givenCommand: String, options: ExecOptions): js.Promise[ExecResult] = js.native
  def getFile(localFile: String, remoteFile: String): js.Promise[Unit] = js.native
  def getFile(
    localFile: String,
    remoteFile: String,
    givenSftp: js.UndefOr[scala.Nothing],
    givenOpts: TransferOptions
  ): js.Promise[Unit] = js.native
  def getFile(localFile: String, remoteFile: String, givenSftp: SFTP): js.Promise[Unit] = js.native
  def getFile(localFile: String, remoteFile: String, givenSftp: SFTP, givenOpts: TransferOptions): js.Promise[Unit] = js.native
  def mkdir(path: String): js.Promise[Unit] = js.native
  def mkdir(path: String, `type`: js.UndefOr[scala.Nothing], givenSftp: SFTP): js.Promise[Unit] = js.native
  @JSName("mkdir")
  def mkdir_exec(path: String, `type`: exec): js.Promise[Unit] = js.native
  @JSName("mkdir")
  def mkdir_sftp(path: String, `type`: sftp): js.Promise[Unit] = js.native
  @JSName("mkdir")
  def mkdir_sftp(path: String, `type`: sftp, givenSftp: SFTP): js.Promise[Unit] = js.native
  def putDirectory(localDirectory: String, remoteDirectory: String): js.Promise[Boolean] = js.native
  def putDirectory(localDirectory: String, remoteDirectory: String, givenConfig: PutDirectoryOptions): js.Promise[Boolean] = js.native
  def putFile(localFile: String, remoteFile: String): js.Promise[Unit] = js.native
  def putFile(
    localFile: String,
    remoteFile: String,
    givenSftp: js.UndefOr[scala.Nothing],
    givenOpts: TransferOptions
  ): js.Promise[Unit] = js.native
  def putFile(localFile: String, remoteFile: String, givenSftp: SFTP): js.Promise[Unit] = js.native
  def putFile(localFile: String, remoteFile: String, givenSftp: SFTP, givenOpts: TransferOptions): js.Promise[Unit] = js.native
  def putFiles(files: js.Array[Local]): js.Promise[Unit] = js.native
  def putFiles(files: js.Array[Local], givenConfig: PutFilesOptions): js.Promise[Unit] = js.native
  def requestSFTP(): js.Promise[SFTP] = js.native
  def requestShell(): js.Promise[Shell] = js.native
}

