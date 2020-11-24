package typings.memfs.promisesMod

import typings.memfs.encodingMod.TDataOut
import typings.memfs.statsMod.TStatNumber
import typings.memfs.volumeMod.IAppendFileOptions
import typings.memfs.volumeMod.IReadFileOptions
import typings.memfs.volumeMod.IStatOptions
import typings.memfs.volumeMod.IWriteFileOptions
import typings.memfs.volumeMod.TData
import typings.memfs.volumeMod.TMode
import typings.memfs.volumeMod.TTime
import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFileHandle extends js.Object {
  
  def appendFile(data: TData): js.Promise[Unit] = js.native
  def appendFile(data: TData, options: String): js.Promise[Unit] = js.native
  def appendFile(data: TData, options: IAppendFileOptions): js.Promise[Unit] = js.native
  
  def chmod(mode: TMode): js.Promise[Unit] = js.native
  
  def chown(uid: Double, gid: Double): js.Promise[Unit] = js.native
  
  def close(): js.Promise[Unit] = js.native
  
  def datasync(): js.Promise[Unit] = js.native
  
  var fd: Double = js.native
  
  def read(buffer: Buffer, offset: Double, length: Double, position: Double): js.Promise[TFileHandleReadResult] = js.native
  def read(buffer: Uint8Array, offset: Double, length: Double, position: Double): js.Promise[TFileHandleReadResult] = js.native
  
  def readFile(): js.Promise[TDataOut] = js.native
  def readFile(options: String): js.Promise[TDataOut] = js.native
  def readFile(options: IReadFileOptions): js.Promise[TDataOut] = js.native
  
  def stat(): js.Promise[typings.memfs.statsMod.default[TStatNumber]] = js.native
  def stat(options: IStatOptions): js.Promise[typings.memfs.statsMod.default[TStatNumber]] = js.native
  
  def truncate(): js.Promise[Unit] = js.native
  def truncate(len: Double): js.Promise[Unit] = js.native
  
  def utimes(atime: TTime, mtime: TTime): js.Promise[Unit] = js.native
  
  def write(buffer: Buffer): js.Promise[TFileHandleWriteResult] = js.native
  def write(
    buffer: Buffer,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[TFileHandleWriteResult] = js.native
  def write(buffer: Buffer, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[TFileHandleWriteResult] = js.native
  def write(buffer: Buffer, offset: js.UndefOr[scala.Nothing], length: Double, position: Double): js.Promise[TFileHandleWriteResult] = js.native
  def write(buffer: Buffer, offset: Double): js.Promise[TFileHandleWriteResult] = js.native
  def write(buffer: Buffer, offset: Double, length: js.UndefOr[scala.Nothing], position: Double): js.Promise[TFileHandleWriteResult] = js.native
  def write(buffer: Buffer, offset: Double, length: Double): js.Promise[TFileHandleWriteResult] = js.native
  def write(buffer: Buffer, offset: Double, length: Double, position: Double): js.Promise[TFileHandleWriteResult] = js.native
  def write(buffer: Uint8Array): js.Promise[TFileHandleWriteResult] = js.native
  def write(
    buffer: Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[TFileHandleWriteResult] = js.native
  def write(buffer: Uint8Array, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[TFileHandleWriteResult] = js.native
  def write(buffer: Uint8Array, offset: js.UndefOr[scala.Nothing], length: Double, position: Double): js.Promise[TFileHandleWriteResult] = js.native
  def write(buffer: Uint8Array, offset: Double): js.Promise[TFileHandleWriteResult] = js.native
  def write(buffer: Uint8Array, offset: Double, length: js.UndefOr[scala.Nothing], position: Double): js.Promise[TFileHandleWriteResult] = js.native
  def write(buffer: Uint8Array, offset: Double, length: Double): js.Promise[TFileHandleWriteResult] = js.native
  def write(buffer: Uint8Array, offset: Double, length: Double, position: Double): js.Promise[TFileHandleWriteResult] = js.native
  
  def writeFile(data: TData): js.Promise[Unit] = js.native
  def writeFile(data: TData, options: IWriteFileOptions): js.Promise[Unit] = js.native
}
