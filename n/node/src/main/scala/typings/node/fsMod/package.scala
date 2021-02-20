package typings.node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object fsMod {
  
  type Mode = scala.Double | java.lang.String
  
  type NoParamCallback = js.Function1[/* err */ typings.node.NodeJS.ErrnoException | scala.Null, scala.Unit]
  
  type OpenMode = scala.Double | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.node.Buffer
    - typings.node.urlMod.URL_
  */
  type PathLike = typings.node.fsMod._PathLike | java.lang.String
  
  type WriteFileOptions = typings.node.anon.BaseEncodingOptionsmodeMoEncoding | java.lang.String | scala.Null
  
  @scala.inline
  def access(path: typings.node.fsMod.PathLike, callback: typings.node.fsMod.NoParamCallback): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def access(
    path: typings.node.fsMod.PathLike,
    mode: js.UndefOr[scala.Nothing],
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def access(
    path: typings.node.fsMod.PathLike,
    mode: scala.Double,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def accessSync(path: typings.node.fsMod.PathLike): scala.Unit = typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("accessSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def accessSync(path: typings.node.fsMod.PathLike, mode: scala.Double): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("accessSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def appendFile(file: scala.Double, data: java.lang.String, callback: typings.node.fsMod.NoParamCallback): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFile(
    file: scala.Double,
    data: java.lang.String,
    options: typings.node.fsMod.WriteFileOptions,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFile(file: scala.Double, data: typings.std.Uint8Array, callback: typings.node.fsMod.NoParamCallback): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFile(
    file: scala.Double,
    data: typings.std.Uint8Array,
    options: typings.node.fsMod.WriteFileOptions,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFile(
    file: typings.node.fsMod.PathLike,
    data: java.lang.String,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFile(
    file: typings.node.fsMod.PathLike,
    data: java.lang.String,
    options: typings.node.fsMod.WriteFileOptions,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFile(
    file: typings.node.fsMod.PathLike,
    data: typings.std.Uint8Array,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFile(
    file: typings.node.fsMod.PathLike,
    data: typings.std.Uint8Array,
    options: typings.node.fsMod.WriteFileOptions,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def appendFileSync(file: scala.Double, data: java.lang.String): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFileSync(file: scala.Double, data: java.lang.String, options: typings.node.fsMod.WriteFileOptions): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFileSync(file: scala.Double, data: typings.std.Uint8Array): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFileSync(file: scala.Double, data: typings.std.Uint8Array, options: typings.node.fsMod.WriteFileOptions): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFileSync(file: typings.node.fsMod.PathLike, data: java.lang.String): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFileSync(
    file: typings.node.fsMod.PathLike,
    data: java.lang.String,
    options: typings.node.fsMod.WriteFileOptions
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFileSync(file: typings.node.fsMod.PathLike, data: typings.std.Uint8Array): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFileSync(
    file: typings.node.fsMod.PathLike,
    data: typings.std.Uint8Array,
    options: typings.node.fsMod.WriteFileOptions
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def chmod(
    path: typings.node.fsMod.PathLike,
    mode: typings.node.fsMod.Mode,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("chmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def chmodSync(path: typings.node.fsMod.PathLike, mode: typings.node.fsMod.Mode): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("chmodSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def chown(
    path: typings.node.fsMod.PathLike,
    uid: scala.Double,
    gid: scala.Double,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("chown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def chownSync(path: typings.node.fsMod.PathLike, uid: scala.Double, gid: scala.Double): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("chownSync")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def close(fd: scala.Double, callback: typings.node.fsMod.NoParamCallback): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("close")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def closeSync(fd: scala.Double): scala.Unit = typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("closeSync")(fd.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def copyFile(
    src: typings.node.fsMod.PathLike,
    dest: typings.node.fsMod.PathLike,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def copyFile(
    src: typings.node.fsMod.PathLike,
    dest: typings.node.fsMod.PathLike,
    flags: scala.Double,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def copyFileSync(src: typings.node.fsMod.PathLike, dest: typings.node.fsMod.PathLike): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("copyFileSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def copyFileSync(src: typings.node.fsMod.PathLike, dest: typings.node.fsMod.PathLike, flags: scala.Double): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("copyFileSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def createReadStream(path: typings.node.fsMod.PathLike): typings.node.fsMod.ReadStream = typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.ReadStream]
  @scala.inline
  def createReadStream(path: typings.node.fsMod.PathLike, options: java.lang.String): typings.node.fsMod.ReadStream = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.ReadStream]
  @scala.inline
  def createReadStream(path: typings.node.fsMod.PathLike, options: typings.node.anon.AutoClose): typings.node.fsMod.ReadStream = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.ReadStream]
  
  @scala.inline
  def createWriteStream(path: typings.node.fsMod.PathLike): typings.node.fsMod.WriteStream = typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.WriteStream]
  @scala.inline
  def createWriteStream(path: typings.node.fsMod.PathLike, options: java.lang.String): typings.node.fsMod.WriteStream = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.WriteStream]
  @scala.inline
  def createWriteStream(path: typings.node.fsMod.PathLike, options: typings.node.anon.EmitClose): typings.node.fsMod.WriteStream = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.WriteStream]
  
  @scala.inline
  def exists(path: typings.node.fsMod.PathLike, callback: js.Function1[/* exists */ scala.Boolean, scala.Unit]): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("exists")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def existsSync(path: typings.node.fsMod.PathLike): scala.Boolean = typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("existsSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def fchmod(fd: scala.Double, mode: typings.node.fsMod.Mode, callback: typings.node.fsMod.NoParamCallback): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fchmod")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fchmodSync(fd: scala.Double, mode: typings.node.fsMod.Mode): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fchmodSync")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fchown(
    fd: scala.Double,
    uid: scala.Double,
    gid: scala.Double,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fchown")(fd.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fchownSync(fd: scala.Double, uid: scala.Double, gid: scala.Double): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fchownSync")(fd.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fdatasync(fd: scala.Double, callback: typings.node.fsMod.NoParamCallback): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fdatasync")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fdatasyncSync(fd: scala.Double): scala.Unit = typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fdatasyncSync")(fd.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fstat(
    fd: scala.Double,
    callback: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* stats */ typings.node.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fstatSync(fd: scala.Double): typings.node.fsMod.Stats = typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.Stats]
  
  @scala.inline
  def fsync(fd: scala.Double, callback: typings.node.fsMod.NoParamCallback): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fsync")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fsyncSync(fd: scala.Double): scala.Unit = typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fsyncSync")(fd.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ftruncate(fd: scala.Double, callback: typings.node.fsMod.NoParamCallback): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ftruncate(fd: scala.Double, len: js.UndefOr[scala.Nothing], callback: typings.node.fsMod.NoParamCallback): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ftruncate(fd: scala.Double, len: scala.Double, callback: typings.node.fsMod.NoParamCallback): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ftruncate(fd: scala.Double, len: scala.Null, callback: typings.node.fsMod.NoParamCallback): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ftruncateSync(fd: scala.Double): scala.Unit = typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("ftruncateSync")(fd.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def ftruncateSync(fd: scala.Double, len: scala.Double): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("ftruncateSync")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def futimes(
    fd: scala.Double,
    atime: java.lang.String,
    mtime: java.lang.String,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimes(
    fd: scala.Double,
    atime: java.lang.String,
    mtime: scala.Double,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimes(
    fd: scala.Double,
    atime: java.lang.String,
    mtime: typings.std.Date,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimes(
    fd: scala.Double,
    atime: scala.Double,
    mtime: java.lang.String,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimes(
    fd: scala.Double,
    atime: scala.Double,
    mtime: scala.Double,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimes(
    fd: scala.Double,
    atime: scala.Double,
    mtime: typings.std.Date,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimes(
    fd: scala.Double,
    atime: typings.std.Date,
    mtime: java.lang.String,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimes(
    fd: scala.Double,
    atime: typings.std.Date,
    mtime: scala.Double,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimes(
    fd: scala.Double,
    atime: typings.std.Date,
    mtime: typings.std.Date,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def futimesSync(fd: scala.Double, atime: java.lang.String, mtime: java.lang.String): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimesSync(fd: scala.Double, atime: java.lang.String, mtime: scala.Double): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimesSync(fd: scala.Double, atime: java.lang.String, mtime: typings.std.Date): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimesSync(fd: scala.Double, atime: scala.Double, mtime: java.lang.String): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimesSync(fd: scala.Double, atime: scala.Double, mtime: scala.Double): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimesSync(fd: scala.Double, atime: scala.Double, mtime: typings.std.Date): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimesSync(fd: scala.Double, atime: typings.std.Date, mtime: java.lang.String): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimesSync(fd: scala.Double, atime: typings.std.Date, mtime: scala.Double): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimesSync(fd: scala.Double, atime: typings.std.Date, mtime: typings.std.Date): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def lchmod(
    path: typings.node.fsMod.PathLike,
    mode: typings.node.fsMod.Mode,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lchmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def lchmodSync(path: typings.node.fsMod.PathLike, mode: typings.node.fsMod.Mode): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lchmodSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def lchown(
    path: typings.node.fsMod.PathLike,
    uid: scala.Double,
    gid: scala.Double,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lchown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def lchownSync(path: typings.node.fsMod.PathLike, uid: scala.Double, gid: scala.Double): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lchownSync")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def link(
    existingPath: typings.node.fsMod.PathLike,
    newPath: typings.node.fsMod.PathLike,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("link")(existingPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def linkSync(existingPath: typings.node.fsMod.PathLike, newPath: typings.node.fsMod.PathLike): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("linkSync")(existingPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def lstat(
    path: typings.node.fsMod.PathLike,
    callback: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* stats */ typings.node.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def lstatSync(path: typings.node.fsMod.PathLike): typings.node.fsMod.Stats = typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lstatSync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.Stats]
  
  @scala.inline
  def lutimes(
    path: typings.node.fsMod.PathLike,
    atime: java.lang.String,
    mtime: java.lang.String,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimes(
    path: typings.node.fsMod.PathLike,
    atime: java.lang.String,
    mtime: scala.Double,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimes(
    path: typings.node.fsMod.PathLike,
    atime: java.lang.String,
    mtime: typings.std.Date,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimes(
    path: typings.node.fsMod.PathLike,
    atime: scala.Double,
    mtime: java.lang.String,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimes(
    path: typings.node.fsMod.PathLike,
    atime: scala.Double,
    mtime: scala.Double,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimes(
    path: typings.node.fsMod.PathLike,
    atime: scala.Double,
    mtime: typings.std.Date,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimes(
    path: typings.node.fsMod.PathLike,
    atime: typings.std.Date,
    mtime: java.lang.String,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimes(
    path: typings.node.fsMod.PathLike,
    atime: typings.std.Date,
    mtime: scala.Double,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimes(
    path: typings.node.fsMod.PathLike,
    atime: typings.std.Date,
    mtime: typings.std.Date,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def lutimesSync(path: typings.node.fsMod.PathLike, atime: java.lang.String, mtime: java.lang.String): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimesSync(path: typings.node.fsMod.PathLike, atime: java.lang.String, mtime: scala.Double): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimesSync(path: typings.node.fsMod.PathLike, atime: java.lang.String, mtime: typings.std.Date): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimesSync(path: typings.node.fsMod.PathLike, atime: scala.Double, mtime: java.lang.String): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimesSync(path: typings.node.fsMod.PathLike, atime: scala.Double, mtime: scala.Double): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimesSync(path: typings.node.fsMod.PathLike, atime: scala.Double, mtime: typings.std.Date): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimesSync(path: typings.node.fsMod.PathLike, atime: typings.std.Date, mtime: java.lang.String): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimesSync(path: typings.node.fsMod.PathLike, atime: typings.std.Date, mtime: scala.Double): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimesSync(path: typings.node.fsMod.PathLike, atime: typings.std.Date, mtime: typings.std.Date): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def mkdir(path: typings.node.fsMod.PathLike, callback: typings.node.fsMod.NoParamCallback): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdir(
    path: typings.node.fsMod.PathLike,
    options: js.UndefOr[typings.node.fsMod.Mode],
    callback: js.Function2[
      typings.node.NodeJS.ErrnoException | scala.Null, 
      js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdir(
    path: typings.node.fsMod.PathLike,
    options: js.UndefOr[typings.node.fsMod.Mode],
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdir(
    path: typings.node.fsMod.PathLike,
    options: scala.Null,
    callback: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* path */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdir(
    path: typings.node.fsMod.PathLike,
    options: scala.Null,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdir(
    path: typings.node.fsMod.PathLike,
    options: typings.node.anon.MakeDirectoryOptionsrecurMode,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdir(
    path: typings.node.fsMod.PathLike,
    options: typings.node.anon.MakeDirectoryOptionsrecur,
    callback: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* path */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdir(
    path: typings.node.fsMod.PathLike,
    options: typings.node.fsMod.MakeDirectoryOptions,
    callback: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* path */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def mkdirSync(path: typings.node.fsMod.PathLike): js.UndefOr[java.lang.String] = typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[java.lang.String]]
  @scala.inline
  def mkdirSync(path: typings.node.fsMod.PathLike, options: typings.node.anon.MakeDirectoryOptionsrecur): java.lang.String = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def mkdirSync(path: typings.node.fsMod.PathLike, options: typings.node.anon.MakeDirectoryOptionsrecurMode): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdirSync(path: typings.node.fsMod.PathLike, options: typings.node.fsMod.MakeDirectoryOptions): js.UndefOr[java.lang.String] = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String]]
  @scala.inline
  def mkdirSync(path: typings.node.fsMod.PathLike, options: typings.node.fsMod.Mode): js.UndefOr[java.lang.String] = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String]]
  
  @scala.inline
  def mkdirSync_Unit(path: typings.node.fsMod.PathLike): scala.Unit = typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdirSync_Unit(path: typings.node.fsMod.PathLike, options: typings.node.fsMod.Mode): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def mkdtemp(
    prefix: java.lang.String,
    callback: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* folder */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdtemp(
    prefix: java.lang.String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[
      typings.node.NodeJS.ErrnoException | scala.Null, 
      typings.node.Buffer | (/* folder */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdtemp(
    prefix: java.lang.String,
    options: java.lang.String,
    callback: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* folder */ java.lang.String | typings.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdtemp(
    prefix: java.lang.String,
    options: scala.Null,
    callback: js.Function2[
      typings.node.NodeJS.ErrnoException | scala.Null, 
      typings.node.Buffer | (/* folder */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdtemp(
    prefix: java.lang.String,
    options: typings.node.BufferEncoding,
    callback: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* folder */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdtemp(
    prefix: java.lang.String,
    options: typings.node.anon.`2`,
    callback: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* folder */ typings.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdtemp(
    prefix: java.lang.String,
    options: typings.node.fsMod.BaseEncodingOptions,
    callback: js.Function2[
      typings.node.NodeJS.ErrnoException | scala.Null, 
      typings.node.Buffer | (/* folder */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdtemp(
    prefix: java.lang.String,
    options: typings.node.nodeStrings.buffer_,
    callback: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* folder */ typings.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def mkdtempSync(prefix: java.lang.String): java.lang.String = typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def mkdtempSync(prefix: java.lang.String, options: java.lang.String): java.lang.String | typings.node.Buffer = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | typings.node.Buffer]
  @scala.inline
  def mkdtempSync(prefix: java.lang.String, options: typings.node.BufferEncoding): java.lang.String = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def mkdtempSync(prefix: java.lang.String, options: typings.node.fsMod.BaseEncodingOptions): java.lang.String = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def mkdtempSync(prefix: java.lang.String, options: typings.node.fsMod.BufferEncodingOption): typings.node.Buffer = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
  
  @scala.inline
  def mkdtempSync_Union(prefix: java.lang.String): java.lang.String | typings.node.Buffer = typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | typings.node.Buffer]
  @scala.inline
  def mkdtempSync_Union(prefix: java.lang.String, options: typings.node.fsMod.BaseEncodingOptions): java.lang.String | typings.node.Buffer = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | typings.node.Buffer]
  
  @scala.inline
  def open(
    path: typings.node.fsMod.PathLike,
    flags: typings.node.fsMod.OpenMode,
    callback: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* fd */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def open(
    path: typings.node.fsMod.PathLike,
    flags: typings.node.fsMod.OpenMode,
    mode: js.UndefOr[typings.node.fsMod.Mode],
    callback: js.Function2[typings.node.NodeJS.ErrnoException | scala.Null, /* fd */ scala.Double, scala.Unit]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def open(
    path: typings.node.fsMod.PathLike,
    flags: typings.node.fsMod.OpenMode,
    mode: scala.Null,
    callback: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* fd */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def openSync(path: typings.node.fsMod.PathLike, flags: typings.node.fsMod.OpenMode): scala.Double = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def openSync(
    path: typings.node.fsMod.PathLike,
    flags: typings.node.fsMod.OpenMode,
    mode: typings.node.fsMod.Mode
  ): scala.Double = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def opendir(
    path: java.lang.String,
    cb: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* dir */ typings.node.fsMod.Dir, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def opendir(
    path: java.lang.String,
    options: typings.node.fsMod.OpenDirOptions,
    cb: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* dir */ typings.node.fsMod.Dir, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def opendirSync(path: java.lang.String): typings.node.fsMod.Dir = typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("opendirSync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.Dir]
  @scala.inline
  def opendirSync(path: java.lang.String, options: typings.node.fsMod.OpenDirOptions): typings.node.fsMod.Dir = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("opendirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.Dir]
  
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def readFile(
    path: scala.Double,
    callback: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* data */ typings.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: scala.Double,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[
      typings.node.NodeJS.ErrnoException | scala.Null, 
      (/* data */ typings.node.Buffer) | java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: scala.Double,
    options: java.lang.String,
    callback: js.Function2[
      typings.node.NodeJS.ErrnoException | scala.Null, 
      typings.node.Buffer | (/* data */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: scala.Double,
    options: scala.Null,
    callback: js.Function2[
      typings.node.NodeJS.ErrnoException | scala.Null, 
      (/* data */ typings.node.Buffer) | java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: scala.Double,
    options: typings.node.anon.BaseEncodingOptionsflagst,
    callback: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* data */ java.lang.String | typings.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: scala.Double,
    options: typings.node.anon.EncodingBufferEncoding,
    callback: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* data */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: scala.Double,
    options: typings.node.anon.`3`,
    callback: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* data */ typings.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: typings.node.fsMod.PathLike,
    callback: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* data */ typings.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: typings.node.fsMod.PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[
      typings.node.NodeJS.ErrnoException | scala.Null, 
      (/* data */ typings.node.Buffer) | java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: typings.node.fsMod.PathLike,
    options: java.lang.String,
    callback: js.Function2[
      typings.node.NodeJS.ErrnoException | scala.Null, 
      typings.node.Buffer | (/* data */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: typings.node.fsMod.PathLike,
    options: scala.Null,
    callback: js.Function2[
      typings.node.NodeJS.ErrnoException | scala.Null, 
      (/* data */ typings.node.Buffer) | java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: typings.node.fsMod.PathLike,
    options: typings.node.anon.BaseEncodingOptionsflagst,
    callback: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* data */ java.lang.String | typings.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: typings.node.fsMod.PathLike,
    options: typings.node.anon.EncodingBufferEncoding,
    callback: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* data */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: typings.node.fsMod.PathLike,
    options: typings.node.anon.`3`,
    callback: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* data */ typings.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def readFileSync(path: scala.Double): java.lang.String | typings.node.Buffer = typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | typings.node.Buffer]
  @scala.inline
  def readFileSync(path: scala.Double, options: typings.node.BufferEncoding): java.lang.String = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def readFileSync(path: scala.Double, options: typings.node.anon.BaseEncodingOptionsflagst): java.lang.String | typings.node.Buffer = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | typings.node.Buffer]
  @scala.inline
  def readFileSync(path: scala.Double, options: typings.node.anon.EncodingBufferEncoding): java.lang.String = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def readFileSync(path: scala.Double, options: typings.node.anon.`3`): typings.node.Buffer = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
  @scala.inline
  def readFileSync(path: typings.node.fsMod.PathLike): java.lang.String | typings.node.Buffer = typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | typings.node.Buffer]
  @scala.inline
  def readFileSync(path: typings.node.fsMod.PathLike, options: typings.node.BufferEncoding): java.lang.String = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def readFileSync(path: typings.node.fsMod.PathLike, options: typings.node.anon.BaseEncodingOptionsflagst): java.lang.String | typings.node.Buffer = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | typings.node.Buffer]
  @scala.inline
  def readFileSync(path: typings.node.fsMod.PathLike, options: typings.node.anon.EncodingBufferEncoding): java.lang.String = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def readFileSync(path: typings.node.fsMod.PathLike, options: typings.node.anon.`3`): typings.node.Buffer = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
  
  @scala.inline
  def readFileSync_Buffer(path: scala.Double): typings.node.Buffer = typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.Buffer]
  @scala.inline
  def readFileSync_Buffer(path: typings.node.fsMod.PathLike): typings.node.Buffer = typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.Buffer]
  
  @scala.inline
  def readFileSync_Union(path: scala.Double, options: typings.node.BufferEncoding): java.lang.String | typings.node.Buffer = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | typings.node.Buffer]
  @scala.inline
  def readFileSync_Union(path: typings.node.fsMod.PathLike, options: typings.node.BufferEncoding): java.lang.String | typings.node.Buffer = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | typings.node.Buffer]
  
  @scala.inline
  def readSync(fd: scala.Double, buffer: typings.node.NodeJS.ArrayBufferView): scala.Double = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def readSync(
    fd: scala.Double,
    buffer: typings.node.NodeJS.ArrayBufferView,
    offset: scala.Double,
    length: scala.Double
  ): scala.Double = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def readSync(
    fd: scala.Double,
    buffer: typings.node.NodeJS.ArrayBufferView,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): scala.Double = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def readSync(
    fd: scala.Double,
    buffer: typings.node.NodeJS.ArrayBufferView,
    opts: typings.node.fsMod.ReadSyncOptions
  ): scala.Double = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def readdir(
    path: typings.node.fsMod.PathLike,
    callback: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* files */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readdir(
    path: typings.node.fsMod.PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[
      typings.node.NodeJS.ErrnoException | scala.Null, 
      /* files */ js.Array[typings.node.Buffer | java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readdir(
    path: typings.node.fsMod.PathLike,
    options: scala.Null,
    callback: js.Function2[
      typings.node.NodeJS.ErrnoException | scala.Null, 
      /* files */ js.Array[typings.node.Buffer | java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readdir(
    path: typings.node.fsMod.PathLike,
    options: typings.node.BufferEncoding,
    callback: js.Function2[
      typings.node.NodeJS.ErrnoException | scala.Null, 
      /* files */ js.Array[typings.node.Buffer | java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readdir(
    path: typings.node.fsMod.PathLike,
    options: typings.node.anon.BaseEncodingOptionswithFiEncoding,
    callback: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* files */ js.Array[typings.node.fsMod.Dirent], 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readdir(
    path: typings.node.fsMod.PathLike,
    options: typings.node.anon.BaseEncodingOptionswithFi,
    callback: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* files */ js.Array[typings.node.Buffer | java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readdir(
    path: typings.node.fsMod.PathLike,
    options: typings.node.anon.Encoding,
    callback: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* files */ js.Array[typings.node.Buffer], 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readdir(
    path: typings.node.fsMod.PathLike,
    options: typings.node.anon.WithFileTypes,
    callback: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* files */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readdir(
    path: typings.node.fsMod.PathLike,
    options: typings.node.nodeStrings.buffer_,
    callback: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* files */ js.Array[typings.node.Buffer], 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def readdirSync(path: typings.node.fsMod.PathLike): js.Array[java.lang.String] = typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def readdirSync(path: typings.node.fsMod.PathLike, options: typings.node.BufferEncoding): js.Array[java.lang.String] = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def readdirSync(path: typings.node.fsMod.PathLike, options: typings.node.anon.BaseEncodingOptionswithFi): js.Array[typings.node.Buffer | java.lang.String] = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.node.Buffer | java.lang.String]]
  @scala.inline
  def readdirSync(path: typings.node.fsMod.PathLike, options: typings.node.anon.BaseEncodingOptionswithFiEncoding): js.Array[typings.node.fsMod.Dirent] = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.node.fsMod.Dirent]]
  @scala.inline
  def readdirSync(path: typings.node.fsMod.PathLike, options: typings.node.anon.Encoding): js.Array[typings.node.Buffer] = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.node.Buffer]]
  @scala.inline
  def readdirSync(path: typings.node.fsMod.PathLike, options: typings.node.anon.WithFileTypes): js.Array[java.lang.String] = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def readdirSync_buffer(path: typings.node.fsMod.PathLike, options: typings.node.nodeStrings.buffer_): js.Array[typings.node.Buffer] = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.node.Buffer]]
  
  @scala.inline
  def readlink(
    path: typings.node.fsMod.PathLike,
    callback: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* linkString */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readlink(
    path: typings.node.fsMod.PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[
      typings.node.NodeJS.ErrnoException | scala.Null, 
      typings.node.Buffer | (/* linkString */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readlink(
    path: typings.node.fsMod.PathLike,
    options: java.lang.String,
    callback: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* linkString */ java.lang.String | typings.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readlink(
    path: typings.node.fsMod.PathLike,
    options: scala.Null,
    callback: js.Function2[
      typings.node.NodeJS.ErrnoException | scala.Null, 
      typings.node.Buffer | (/* linkString */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readlink(
    path: typings.node.fsMod.PathLike,
    options: typings.node.BufferEncoding,
    callback: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* linkString */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readlink(
    path: typings.node.fsMod.PathLike,
    options: typings.node.fsMod.BaseEncodingOptions,
    callback: js.Function2[
      typings.node.NodeJS.ErrnoException | scala.Null, 
      typings.node.Buffer | (/* linkString */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readlink(
    path: typings.node.fsMod.PathLike,
    options: typings.node.fsMod.BufferEncodingOption,
    callback: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* linkString */ typings.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def readlinkSync(path: typings.node.fsMod.PathLike): java.lang.String = typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def readlinkSync(path: typings.node.fsMod.PathLike, options: java.lang.String): java.lang.String | typings.node.Buffer = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | typings.node.Buffer]
  @scala.inline
  def readlinkSync(path: typings.node.fsMod.PathLike, options: typings.node.BufferEncoding): java.lang.String = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def readlinkSync(path: typings.node.fsMod.PathLike, options: typings.node.fsMod.BaseEncodingOptions): java.lang.String = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def readlinkSync(path: typings.node.fsMod.PathLike, options: typings.node.fsMod.BufferEncodingOption): typings.node.Buffer = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
  
  @scala.inline
  def readlinkSync_Union(path: typings.node.fsMod.PathLike): java.lang.String | typings.node.Buffer = typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | typings.node.Buffer]
  @scala.inline
  def readlinkSync_Union(path: typings.node.fsMod.PathLike, options: typings.node.fsMod.BaseEncodingOptions): java.lang.String | typings.node.Buffer = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | typings.node.Buffer]
  
  @scala.inline
  def readv(
    fd: scala.Double,
    buffers: js.Array[typings.node.NodeJS.ArrayBufferView],
    cb: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffers */ js.Array[typings.node.NodeJS.ArrayBufferView], 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readv")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readv(
    fd: scala.Double,
    buffers: js.Array[typings.node.NodeJS.ArrayBufferView],
    position: scala.Double,
    cb: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffers */ js.Array[typings.node.NodeJS.ArrayBufferView], 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readv")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def readvSync(fd: scala.Double, buffers: js.Array[typings.node.NodeJS.ArrayBufferView]): scala.Double = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readvSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def readvSync(fd: scala.Double, buffers: js.Array[typings.node.NodeJS.ArrayBufferView], position: scala.Double): scala.Double = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readvSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def rename(
    oldPath: typings.node.fsMod.PathLike,
    newPath: typings.node.fsMod.PathLike,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("rename")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def renameSync(oldPath: typings.node.fsMod.PathLike, newPath: typings.node.fsMod.PathLike): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("renameSync")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def rm(path: typings.node.fsMod.PathLike, callback: typings.node.fsMod.NoParamCallback): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def rm(
    path: typings.node.fsMod.PathLike,
    options: typings.node.fsMod.RmOptions,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def rmSync(path: typings.node.fsMod.PathLike): scala.Unit = typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("rmSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def rmSync(path: typings.node.fsMod.PathLike, options: typings.node.fsMod.RmOptions): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("rmSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def rmdir(path: typings.node.fsMod.PathLike, callback: typings.node.fsMod.NoParamCallback): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def rmdir(
    path: typings.node.fsMod.PathLike,
    options: typings.node.fsMod.RmDirOptions,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def rmdirSync(path: typings.node.fsMod.PathLike): scala.Unit = typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("rmdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def rmdirSync(path: typings.node.fsMod.PathLike, options: typings.node.fsMod.RmDirOptions): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("rmdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def stat(
    path: typings.node.fsMod.PathLike,
    callback: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* stats */ typings.node.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def stat(
    path: typings.node.fsMod.PathLike,
    options: typings.node.fsMod.BigIntOptions,
    callback: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* stats */ typings.node.fsMod.BigIntStats, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def stat(
    path: typings.node.fsMod.PathLike,
    options: typings.node.fsMod.StatOptions,
    callback: js.Function2[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* stats */ typings.node.fsMod.Stats | typings.node.fsMod.BigIntStats, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def statSync(path: typings.node.fsMod.PathLike): typings.node.fsMod.Stats = typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("statSync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.Stats]
  @scala.inline
  def statSync(path: typings.node.fsMod.PathLike, options: typings.node.fsMod.BigIntOptions): typings.node.fsMod.BigIntStats = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("statSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.BigIntStats]
  @scala.inline
  def statSync(path: typings.node.fsMod.PathLike, options: typings.node.fsMod.StatOptions): typings.node.fsMod.Stats | typings.node.fsMod.BigIntStats = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("statSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.Stats | typings.node.fsMod.BigIntStats]
  
  @scala.inline
  def symlinkSync(target: typings.node.fsMod.PathLike, path: typings.node.fsMod.PathLike): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("symlinkSync")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def symlinkSync(
    target: typings.node.fsMod.PathLike,
    path: typings.node.fsMod.PathLike,
    `type`: typings.node.fsMod.symlink.Type
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("symlinkSync")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def truncate(path: typings.node.fsMod.PathLike, callback: typings.node.fsMod.NoParamCallback): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def truncate(
    path: typings.node.fsMod.PathLike,
    len: js.UndefOr[scala.Nothing],
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def truncate(path: typings.node.fsMod.PathLike, len: scala.Double, callback: typings.node.fsMod.NoParamCallback): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def truncate(path: typings.node.fsMod.PathLike, len: scala.Null, callback: typings.node.fsMod.NoParamCallback): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def truncateSync(path: typings.node.fsMod.PathLike): scala.Unit = typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("truncateSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def truncateSync(path: typings.node.fsMod.PathLike, len: scala.Double): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("truncateSync")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def unlink(path: typings.node.fsMod.PathLike, callback: typings.node.fsMod.NoParamCallback): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def unlinkSync(path: typings.node.fsMod.PathLike): scala.Unit = typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("unlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def unwatchFile(filename: typings.node.fsMod.PathLike): scala.Unit = typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("unwatchFile")(filename.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def unwatchFile(
    filename: typings.node.fsMod.PathLike,
    listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, scala.Unit]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("unwatchFile")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def utimes(
    path: typings.node.fsMod.PathLike,
    atime: java.lang.String,
    mtime: java.lang.String,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimes(
    path: typings.node.fsMod.PathLike,
    atime: java.lang.String,
    mtime: scala.Double,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimes(
    path: typings.node.fsMod.PathLike,
    atime: java.lang.String,
    mtime: typings.std.Date,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimes(
    path: typings.node.fsMod.PathLike,
    atime: scala.Double,
    mtime: java.lang.String,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimes(
    path: typings.node.fsMod.PathLike,
    atime: scala.Double,
    mtime: scala.Double,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimes(
    path: typings.node.fsMod.PathLike,
    atime: scala.Double,
    mtime: typings.std.Date,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimes(
    path: typings.node.fsMod.PathLike,
    atime: typings.std.Date,
    mtime: java.lang.String,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimes(
    path: typings.node.fsMod.PathLike,
    atime: typings.std.Date,
    mtime: scala.Double,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimes(
    path: typings.node.fsMod.PathLike,
    atime: typings.std.Date,
    mtime: typings.std.Date,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def utimesSync(path: typings.node.fsMod.PathLike, atime: java.lang.String, mtime: java.lang.String): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimesSync(path: typings.node.fsMod.PathLike, atime: java.lang.String, mtime: scala.Double): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimesSync(path: typings.node.fsMod.PathLike, atime: java.lang.String, mtime: typings.std.Date): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimesSync(path: typings.node.fsMod.PathLike, atime: scala.Double, mtime: java.lang.String): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimesSync(path: typings.node.fsMod.PathLike, atime: scala.Double, mtime: scala.Double): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimesSync(path: typings.node.fsMod.PathLike, atime: scala.Double, mtime: typings.std.Date): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimesSync(path: typings.node.fsMod.PathLike, atime: typings.std.Date, mtime: java.lang.String): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimesSync(path: typings.node.fsMod.PathLike, atime: typings.std.Date, mtime: scala.Double): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimesSync(path: typings.node.fsMod.PathLike, atime: typings.std.Date, mtime: typings.std.Date): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def watch(filename: typings.node.fsMod.PathLike): typings.node.fsMod.FSWatcher = typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.FSWatcher]
  @scala.inline
  def watch(
    filename: typings.node.fsMod.PathLike,
    listener: js.Function2[/* event */ java.lang.String, /* filename */ java.lang.String, _]
  ): typings.node.fsMod.FSWatcher = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.FSWatcher]
  @scala.inline
  def watch(
    filename: typings.node.fsMod.PathLike,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[/* event */ java.lang.String, /* filename */ java.lang.String, scala.Unit]
  ): typings.node.fsMod.FSWatcher = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.FSWatcher]
  @scala.inline
  def watch(filename: typings.node.fsMod.PathLike, options: java.lang.String): typings.node.fsMod.FSWatcher = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.FSWatcher]
  @scala.inline
  def watch(
    filename: typings.node.fsMod.PathLike,
    options: java.lang.String,
    listener: js.Function2[
      /* event */ java.lang.String, 
      /* filename */ java.lang.String | typings.node.Buffer, 
      scala.Unit
    ]
  ): typings.node.fsMod.FSWatcher = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.FSWatcher]
  @scala.inline
  def watch(
    filename: typings.node.fsMod.PathLike,
    options: scala.Null,
    listener: js.Function2[
      /* event */ java.lang.String, 
      typings.node.Buffer | (/* filename */ java.lang.String), 
      scala.Unit
    ]
  ): typings.node.fsMod.FSWatcher = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.FSWatcher]
  @scala.inline
  def watch(filename: typings.node.fsMod.PathLike, options: typings.node.BufferEncoding): typings.node.fsMod.FSWatcher = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.FSWatcher]
  @scala.inline
  def watch(
    filename: typings.node.fsMod.PathLike,
    options: typings.node.BufferEncoding,
    listener: js.Function2[/* event */ java.lang.String, /* filename */ java.lang.String, scala.Unit]
  ): typings.node.fsMod.FSWatcher = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.FSWatcher]
  @scala.inline
  def watch(filename: typings.node.fsMod.PathLike, options: typings.node.anon.Persistent): typings.node.fsMod.FSWatcher = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.FSWatcher]
  @scala.inline
  def watch(
    filename: typings.node.fsMod.PathLike,
    options: typings.node.anon.Persistent,
    listener: js.Function2[
      /* event */ java.lang.String, 
      typings.node.Buffer | (/* filename */ java.lang.String), 
      scala.Unit
    ]
  ): typings.node.fsMod.FSWatcher = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.FSWatcher]
  @scala.inline
  def watch(filename: typings.node.fsMod.PathLike, options: typings.node.anon.Recursive): typings.node.fsMod.FSWatcher = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.FSWatcher]
  @scala.inline
  def watch(
    filename: typings.node.fsMod.PathLike,
    options: typings.node.anon.Recursive,
    listener: js.Function2[/* event */ java.lang.String, /* filename */ typings.node.Buffer, scala.Unit]
  ): typings.node.fsMod.FSWatcher = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.FSWatcher]
  
  @scala.inline
  def watchFile(
    filename: typings.node.fsMod.PathLike,
    listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, scala.Unit]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def watchFile(
    filename: typings.node.fsMod.PathLike,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, scala.Unit]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def watchFile(
    filename: typings.node.fsMod.PathLike,
    options: typings.node.anon.Interval,
    listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, scala.Unit]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def watch_buffer(filename: typings.node.fsMod.PathLike, options: typings.node.nodeStrings.buffer_): typings.node.fsMod.FSWatcher = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.FSWatcher]
  @scala.inline
  def watch_buffer(
    filename: typings.node.fsMod.PathLike,
    options: typings.node.nodeStrings.buffer_,
    listener: js.Function2[/* event */ java.lang.String, /* filename */ typings.node.Buffer, scala.Unit]
  ): typings.node.fsMod.FSWatcher = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.FSWatcher]
  
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: scala.Double,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: scala.Double,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: scala.Null,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: scala.Null,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.DataView,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: scala.Double,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: scala.Double,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: scala.Null,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: scala.Null,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float32Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: scala.Double,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: scala.Double,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: scala.Null,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: scala.Null,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Float64Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: scala.Double,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: scala.Double,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: scala.Null,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: scala.Null,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int16Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: scala.Double,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: scala.Double,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: scala.Null,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: scala.Null,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int32Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: scala.Double,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: scala.Double,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: scala.Null,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: scala.Null,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Int8Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: scala.Double,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: scala.Double,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: scala.Null,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: scala.Null,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint16Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: scala.Double,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: scala.Double,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: scala.Null,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: scala.Null,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint32Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: scala.Double,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: scala.Double,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: scala.Null,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: scala.Null,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: scala.Null,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: scala.Null,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: typings.std.Uint8ClampedArray,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ typings.std.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: js.UndefOr[scala.Nothing],
    encoding: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: js.UndefOr[scala.Nothing],
    encoding: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: js.UndefOr[scala.Nothing],
    encoding: typings.node.BufferEncoding,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: scala.Double,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: scala.Double,
    encoding: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: scala.Double,
    encoding: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: scala.Double,
    encoding: typings.node.BufferEncoding,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: scala.Null,
    encoding: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: scala.Null,
    encoding: scala.Null,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: scala.Null,
    encoding: typings.node.BufferEncoding,
    callback: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def writeFile(path: scala.Double, data: java.lang.String, callback: typings.node.fsMod.NoParamCallback): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFile(
    path: scala.Double,
    data: java.lang.String,
    options: typings.node.fsMod.WriteFileOptions,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFile(
    path: scala.Double,
    data: typings.node.NodeJS.ArrayBufferView,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFile(
    path: scala.Double,
    data: typings.node.NodeJS.ArrayBufferView,
    options: typings.node.fsMod.WriteFileOptions,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFile(
    path: typings.node.fsMod.PathLike,
    data: java.lang.String,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFile(
    path: typings.node.fsMod.PathLike,
    data: java.lang.String,
    options: typings.node.fsMod.WriteFileOptions,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFile(
    path: typings.node.fsMod.PathLike,
    data: typings.node.NodeJS.ArrayBufferView,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFile(
    path: typings.node.fsMod.PathLike,
    data: typings.node.NodeJS.ArrayBufferView,
    options: typings.node.fsMod.WriteFileOptions,
    callback: typings.node.fsMod.NoParamCallback
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def writeFileSync(path: scala.Double, data: java.lang.String): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFileSync(path: scala.Double, data: java.lang.String, options: typings.node.fsMod.WriteFileOptions): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFileSync(path: scala.Double, data: typings.node.NodeJS.ArrayBufferView): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFileSync(
    path: scala.Double,
    data: typings.node.NodeJS.ArrayBufferView,
    options: typings.node.fsMod.WriteFileOptions
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFileSync(path: typings.node.fsMod.PathLike, data: java.lang.String): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFileSync(
    path: typings.node.fsMod.PathLike,
    data: java.lang.String,
    options: typings.node.fsMod.WriteFileOptions
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFileSync(path: typings.node.fsMod.PathLike, data: typings.node.NodeJS.ArrayBufferView): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFileSync(
    path: typings.node.fsMod.PathLike,
    data: typings.node.NodeJS.ArrayBufferView,
    options: typings.node.fsMod.WriteFileOptions
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def writeSync(fd: scala.Double, buffer: typings.node.NodeJS.ArrayBufferView): scala.Double = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typings.node.NodeJS.ArrayBufferView,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double
  ): scala.Double = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typings.node.NodeJS.ArrayBufferView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double
  ): scala.Double = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typings.node.NodeJS.ArrayBufferView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double
  ): scala.Double = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typings.node.NodeJS.ArrayBufferView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double
  ): scala.Double = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(fd: scala.Double, buffer: typings.node.NodeJS.ArrayBufferView, offset: scala.Double): scala.Double = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typings.node.NodeJS.ArrayBufferView,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double
  ): scala.Double = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typings.node.NodeJS.ArrayBufferView,
    offset: scala.Double,
    length: scala.Double
  ): scala.Double = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typings.node.NodeJS.ArrayBufferView,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): scala.Double = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typings.node.NodeJS.ArrayBufferView,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double
  ): scala.Double = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typings.node.NodeJS.ArrayBufferView,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double
  ): scala.Double = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typings.node.NodeJS.ArrayBufferView,
    offset: scala.Null,
    length: scala.Double
  ): scala.Double = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typings.node.NodeJS.ArrayBufferView,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double
  ): scala.Double = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: typings.node.NodeJS.ArrayBufferView,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double
  ): scala.Double = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(fd: scala.Double, string: java.lang.String): scala.Double = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    string: java.lang.String,
    position: js.UndefOr[scala.Nothing],
    encoding: typings.node.BufferEncoding
  ): scala.Double = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(fd: scala.Double, string: java.lang.String, position: scala.Double): scala.Double = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    string: java.lang.String,
    position: scala.Double,
    encoding: typings.node.BufferEncoding
  ): scala.Double = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    string: java.lang.String,
    position: scala.Null,
    encoding: typings.node.BufferEncoding
  ): scala.Double = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def writev(
    fd: scala.Double,
    buffers: js.Array[typings.node.NodeJS.ArrayBufferView],
    cb: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesWritten */ scala.Double, 
      /* buffers */ js.Array[typings.node.NodeJS.ArrayBufferView], 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writev")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writev(
    fd: scala.Double,
    buffers: js.Array[typings.node.NodeJS.ArrayBufferView],
    position: scala.Double,
    cb: js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesWritten */ scala.Double, 
      /* buffers */ js.Array[typings.node.NodeJS.ArrayBufferView], 
      scala.Unit
    ]
  ): scala.Unit = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writev")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def writevSync(fd: scala.Double, buffers: js.Array[typings.node.NodeJS.ArrayBufferView]): scala.Double = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writevSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writevSync(fd: scala.Double, buffers: js.Array[typings.node.NodeJS.ArrayBufferView], position: scala.Double): scala.Double = (typings.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writevSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
}
