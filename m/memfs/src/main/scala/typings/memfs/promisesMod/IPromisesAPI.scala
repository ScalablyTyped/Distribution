package typings.memfs.promisesMod

import typings.memfs.encodingMod.TDataOut
import typings.memfs.statsMod.TStatNumber
import typings.memfs.volumeMod.IAppendFileOptions
import typings.memfs.volumeMod.IMkdirOptions
import typings.memfs.volumeMod.IOptions
import typings.memfs.volumeMod.IReadFileOptions
import typings.memfs.volumeMod.IReaddirOptions
import typings.memfs.volumeMod.IRealpathOptions
import typings.memfs.volumeMod.IStatOptions
import typings.memfs.volumeMod.IWriteFileOptions
import typings.memfs.volumeMod.TData
import typings.memfs.volumeMod.TFlags
import typings.memfs.volumeMod.TFlagsCopy
import typings.memfs.volumeMod.TMode
import typings.memfs.volumeMod.TTime
import typings.node.fsMod.PathLike
import typings.node.fsMod.symlink.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPromisesAPI extends js.Object {
  var FileHandle: js.Any = js.native
  def access(path: PathLike): js.Promise[Unit] = js.native
  def access(path: PathLike, mode: Double): js.Promise[Unit] = js.native
  def appendFile(path: TFileHandle, data: TData): js.Promise[Unit] = js.native
  def appendFile(path: TFileHandle, data: TData, options: String): js.Promise[Unit] = js.native
  def appendFile(path: TFileHandle, data: TData, options: IAppendFileOptions): js.Promise[Unit] = js.native
  def chmod(path: PathLike, mode: TMode): js.Promise[Unit] = js.native
  def chown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = js.native
  def copyFile(src: PathLike, dest: PathLike): js.Promise[Unit] = js.native
  def copyFile(src: PathLike, dest: PathLike, flags: TFlagsCopy): js.Promise[Unit] = js.native
  def lchmod(path: PathLike, mode: TMode): js.Promise[Unit] = js.native
  def lchown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = js.native
  def link(existingPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
  def lstat(path: PathLike): js.Promise[typings.memfs.statsMod.default[TStatNumber]] = js.native
  def lstat(path: PathLike, options: IStatOptions): js.Promise[typings.memfs.statsMod.default[TStatNumber]] = js.native
  def mkdir(path: PathLike): js.Promise[Unit] = js.native
  def mkdir(path: PathLike, options: IMkdirOptions): js.Promise[Unit] = js.native
  def mkdir(path: PathLike, options: TMode): js.Promise[Unit] = js.native
  def mkdtemp(prefix: String): js.Promise[TDataOut] = js.native
  def mkdtemp(prefix: String, options: IOptions): js.Promise[TDataOut] = js.native
  def open(path: PathLike, flags: TFlags): js.Promise[FileHandle] = js.native
  def open(path: PathLike, flags: TFlags, mode: TMode): js.Promise[FileHandle] = js.native
  def readFile(id: TFileHandle): js.Promise[TDataOut] = js.native
  def readFile(id: TFileHandle, options: String): js.Promise[TDataOut] = js.native
  def readFile(id: TFileHandle, options: IReadFileOptions): js.Promise[TDataOut] = js.native
  def readdir(path: PathLike): js.Promise[js.Array[TDataOut | typings.memfs.direntMod.default]] = js.native
  def readdir(path: PathLike, options: String): js.Promise[js.Array[TDataOut | typings.memfs.direntMod.default]] = js.native
  def readdir(path: PathLike, options: IReaddirOptions): js.Promise[js.Array[TDataOut | typings.memfs.direntMod.default]] = js.native
  def readlink(path: PathLike): js.Promise[TDataOut] = js.native
  def readlink(path: PathLike, options: IOptions): js.Promise[TDataOut] = js.native
  def realpath(path: PathLike): js.Promise[TDataOut] = js.native
  def realpath(path: PathLike, options: String): js.Promise[TDataOut] = js.native
  def realpath(path: PathLike, options: IRealpathOptions): js.Promise[TDataOut] = js.native
  def rename(oldPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
  def rmdir(path: PathLike): js.Promise[Unit] = js.native
  def stat(path: PathLike): js.Promise[typings.memfs.statsMod.default[TStatNumber]] = js.native
  def stat(path: PathLike, options: IStatOptions): js.Promise[typings.memfs.statsMod.default[TStatNumber]] = js.native
  def symlink(target: PathLike, path: PathLike): js.Promise[Unit] = js.native
  def symlink(target: PathLike, path: PathLike, `type`: Type): js.Promise[Unit] = js.native
  def truncate(path: PathLike): js.Promise[Unit] = js.native
  def truncate(path: PathLike, len: Double): js.Promise[Unit] = js.native
  def unlink(path: PathLike): js.Promise[Unit] = js.native
  def utimes(path: PathLike, atime: TTime, mtime: TTime): js.Promise[Unit] = js.native
  def writeFile(id: TFileHandle, data: TData): js.Promise[Unit] = js.native
  def writeFile(id: TFileHandle, data: TData, options: IWriteFileOptions): js.Promise[Unit] = js.native
}

