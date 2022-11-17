package typings.node.fsMod

import typings.node.NodeJS.ArrayBufferView
import typings.node.NodeJS.ErrnoException
import typings.node.anon.Encoding
import typings.node.anon.EncodingFlag
import typings.node.anon.EncodingWithFileTypes
import typings.node.anon.Flag
import typings.node.anon.MakeDirectoryOptionsrecur
import typings.node.anon.MakeDirectoryOptionsrecurMode
import typings.node.anon.ObjectEncodingOptionsAbor
import typings.node.anon.ObjectEncodingOptionsflag
import typings.node.anon.ObjectEncodingOptionsflagEncoding
import typings.node.anon.ObjectEncodingOptionswith
import typings.node.anon.ObjectEncodingOptionswithEncoding
import typings.node.anon.StatOptionsbigintfalseund
import typings.node.anon.StatOptionsbiginttrue
import typings.node.anon.WatchFileOptionsbigintfal
import typings.node.anon.WatchFileOptionsbiginttru
import typings.node.anon.WatchOptionsencodingbuffe
import typings.node.anon.WithFileTypes
import typings.node.anon.encodingBufferEncodingflaEncoding
import typings.node.anon.encodingnullundefinedflagEncoding
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.fsMod.^
import typings.node.fsMod.symlink.Type
import typings.node.nodeColonurlMod.URL
import typings.std.BigInt64Array
import typings.std.BigUint64Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def access(path: PathLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def access(path: PathLike, mode: Double, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def access(path: PathLike, mode: Unit, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def accessSync(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("accessSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def accessSync(path: PathLike, mode: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("accessSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def appendFile(file: PathOrFileDescriptor, data: String, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def appendFile(file: PathOrFileDescriptor, data: js.typedarray.Uint8Array, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def appendFile(path: PathOrFileDescriptor, data: String, options: WriteFileOptions, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def appendFile(
  path: PathOrFileDescriptor,
  data: js.typedarray.Uint8Array,
  options: WriteFileOptions,
  callback: NoParamCallback
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def appendFileSync(path: PathOrFileDescriptor, data: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def appendFileSync(path: PathOrFileDescriptor, data: String, options: WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def appendFileSync(path: PathOrFileDescriptor, data: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def appendFileSync(path: PathOrFileDescriptor, data: js.typedarray.Uint8Array, options: WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def chmod(path: PathLike, mode: Mode, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def chmodSync(path: PathLike, mode: Mode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chmodSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def chown(path: PathLike, uid: Double, gid: Double, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def chownSync(path: PathLike, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chownSync")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def close(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def close(fd: Double, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("close")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def closeSync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def copyFile(src: PathLike, dest: PathLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def copyFile(src: PathLike, dest: PathLike, mode: Double, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def copyFileSync(src: PathLike, dest: PathLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFileSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def copyFileSync(src: PathLike, dest: PathLike, mode: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFileSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def cp(source: String, destination: String, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cp(
  source: String,
  destination: String,
  opts: CopyOptions,
  callback: js.Function1[/* err */ ErrnoException | Null, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cp(source: String, destination: URL, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cp(
  source: String,
  destination: URL,
  opts: CopyOptions,
  callback: js.Function1[/* err */ ErrnoException | Null, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cp(source: URL, destination: String, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cp(
  source: URL,
  destination: String,
  opts: CopyOptions,
  callback: js.Function1[/* err */ ErrnoException | Null, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cp(source: URL, destination: URL, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cp(
  source: URL,
  destination: URL,
  opts: CopyOptions,
  callback: js.Function1[/* err */ ErrnoException | Null, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def cpSync(source: String, destination: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cpSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cpSync(source: String, destination: String, opts: CopySyncOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cpSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cpSync(source: String, destination: URL): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cpSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cpSync(source: String, destination: URL, opts: CopySyncOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cpSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cpSync(source: URL, destination: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cpSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cpSync(source: URL, destination: String, opts: CopySyncOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cpSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cpSync(source: URL, destination: URL): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cpSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cpSync(source: URL, destination: URL, opts: CopySyncOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cpSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def createReadStream(path: PathLike): ReadStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any]).asInstanceOf[ReadStream]
inline def createReadStream(path: PathLike, options: BufferEncoding): ReadStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadStream]
inline def createReadStream(path: PathLike, options: ReadStreamOptions): ReadStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadStream]

inline def createWriteStream(path: PathLike): WriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any]).asInstanceOf[WriteStream]
inline def createWriteStream(path: PathLike, options: BufferEncoding): WriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WriteStream]
inline def createWriteStream(path: PathLike, options: StreamOptions): WriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WriteStream]

inline def exists(path: PathLike, callback: js.Function1[/* exists */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exists")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def existsSync(path: PathLike): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("existsSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def fchmod(fd: Double, mode: Mode, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchmod")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def fchmodSync(fd: Double, mode: Mode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchmodSync")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def fchown(fd: Double, uid: Double, gid: Double, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchown")(fd.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def fchownSync(fd: Double, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchownSync")(fd.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def fdatasync(fd: Double, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fdatasync")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def fdatasyncSync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fdatasyncSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def fstat(fd: Double, callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def fstat(
  fd: Double,
  options: Unit,
  callback: js.Function2[ErrnoException | Null, BigIntStats | (/* stats */ Stats), Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def fstat(
  fd: Double,
  options: StatOptionsbigintfalseund,
  callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def fstat(
  fd: Double,
  options: StatOptionsbiginttrue,
  callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ BigIntStats, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def fstat(
  fd: Double,
  options: StatOptions,
  callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats | BigIntStats, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def fstatSync(fd: Double): Stats | BigIntStats = ^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Stats | BigIntStats]
inline def fstatSync(fd: Double, options: StatOptionsbigintfalseund): Stats = (^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Stats]
inline def fstatSync(fd: Double, options: StatOptionsbiginttrue): BigIntStats = (^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BigIntStats]
inline def fstatSync(fd: Double, options: StatOptions): Stats | BigIntStats = (^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Stats | BigIntStats]

inline def fstatSync_Stats(fd: Double): Stats = ^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Stats]

inline def fsync(fd: Double, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fsync")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def fsyncSync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fsyncSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def ftruncate(fd: Double, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ftruncate(fd: Double, len: Double, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ftruncate(fd: Double, len: Null, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ftruncate(fd: Double, len: Unit, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ftruncateSync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ftruncateSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def ftruncateSync(fd: Double, len: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ftruncateSync")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def futimes(fd: Double, atime: TimeLike, mtime: TimeLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def futimesSync(fd: Double, atime: TimeLike, mtime: TimeLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def lchmod(path: PathLike, mode: Mode, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def lchmodSync(path: PathLike, mode: Mode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchmodSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def lchown(path: PathLike, uid: Double, gid: Double, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def lchownSync(path: PathLike, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchownSync")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def link(existingPath: PathLike, newPath: PathLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(existingPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def linkSync(existingPath: PathLike, newPath: PathLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("linkSync")(existingPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def lstat(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def lstat(
  path: PathLike,
  options: Unit,
  callback: js.Function2[ErrnoException | Null, BigIntStats | (/* stats */ Stats), Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def lstat(
  path: PathLike,
  options: StatOptionsbigintfalseund,
  callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def lstat(
  path: PathLike,
  options: StatOptionsbiginttrue,
  callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ BigIntStats, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def lstat(
  path: PathLike,
  options: StatOptions,
  callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats | BigIntStats, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def lstatSync: StatSyncFn = ^.asInstanceOf[js.Dynamic].selectDynamic("lstatSync").asInstanceOf[StatSyncFn]

inline def lutimes(path: PathLike, atime: TimeLike, mtime: TimeLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def lutimesSync(path: PathLike, atime: TimeLike, mtime: TimeLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def mkdir(path: PathLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def mkdir(
  path: PathLike,
  options: Null,
  callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def mkdir(path: PathLike, options: Null, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def mkdir(
  path: PathLike,
  options: Unit,
  callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def mkdir(path: PathLike, options: Unit, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def mkdir(path: PathLike, options: MakeDirectoryOptionsrecurMode, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def mkdir(
  path: PathLike,
  options: MakeDirectoryOptionsrecur,
  callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def mkdir(
  path: PathLike,
  options: MakeDirectoryOptions,
  callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def mkdir(
  path: PathLike,
  options: Mode,
  callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def mkdir(path: PathLike, options: Mode, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def mkdirSync(path: PathLike): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
inline def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecur): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
inline def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def mkdirSync(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
inline def mkdirSync(path: PathLike, options: Mode): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]

inline def mkdirSync_Unit(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def mkdirSync_Unit(path: PathLike, options: Mode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def mkdtemp(prefix: String, callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def mkdtemp(
  prefix: String,
  options: "buffer",
  callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ Buffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def mkdtemp(
  prefix: String,
  options: Encoding,
  callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ Buffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def mkdtemp(
  prefix: String,
  options: EncodingOption,
  callback: js.Function2[ErrnoException | Null, Buffer | (/* folder */ String), Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def mkdtempSync(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]
inline def mkdtempSync(prefix: String, options: EncodingOption): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]

inline def mkdtempSync_Buffer(prefix: String, options: BufferEncodingOption): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]

inline def mkdtempSync_Union(prefix: String): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any]).asInstanceOf[String | Buffer]
inline def mkdtempSync_Union(prefix: String, options: EncodingOption): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]

inline def open(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def open(
  path: PathLike,
  flags: Unit,
  callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def open(
  path: PathLike,
  flags: Unit,
  mode: Null,
  callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def open(
  path: PathLike,
  flags: Unit,
  mode: Unit,
  callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def open(
  path: PathLike,
  flags: Unit,
  mode: Mode,
  callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def open(
  path: PathLike,
  flags: OpenMode,
  callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def open(
  path: PathLike,
  flags: OpenMode,
  mode: Null,
  callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def open(
  path: PathLike,
  flags: OpenMode,
  mode: Unit,
  callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def open(
  path: PathLike,
  flags: OpenMode,
  mode: Mode,
  callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def openSync(path: PathLike, flags: OpenMode): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def openSync(path: PathLike, flags: OpenMode, mode: Mode): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def opendir(path: PathLike, cb: js.Function2[/* err */ ErrnoException | Null, /* dir */ Dir, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def opendir(
  path: PathLike,
  options: OpenDirOptions,
  cb: js.Function2[/* err */ ErrnoException | Null, /* dir */ Dir, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def opendirSync(path: PathLike): Dir = ^.asInstanceOf[js.Dynamic].applyDynamic("opendirSync")(path.asInstanceOf[js.Any]).asInstanceOf[Dir]
inline def opendirSync(path: PathLike, options: OpenDirOptions): Dir = (^.asInstanceOf[js.Dynamic].applyDynamic("opendirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Dir]

inline def read(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Double,
  length: Double,
  position: ReadPosition,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Double,
  length: Double,
  position: ReadPosition,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Double,
  length: Double,
  position: ReadPosition,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Double,
  length: Double,
  position: ReadPosition,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Double,
  length: Double,
  position: ReadPosition,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Double,
  length: Double,
  position: ReadPosition,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Double,
  length: Double,
  position: ReadPosition,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Double,
  length: Double,
  position: ReadPosition,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Double,
  length: Double,
  position: ReadPosition,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  length: Double,
  position: ReadPosition,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: BigInt64Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: BigInt64Array,
  offset: Double,
  length: Double,
  position: ReadPosition,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: BigUint64Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  buffer: BigUint64Array,
  offset: Double,
  length: Double,
  position: ReadPosition,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read(
  fd: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffer */ ArrayBufferView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def read[TBuffer /* <: ArrayBufferView */](
  fd: Double,
  options: ReadAsyncOptions[TBuffer],
  callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ TBuffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def readFile(
  path: PathOrFileDescriptor,
  callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readFile(
  path: PathOrFileDescriptor,
  options: Null,
  callback: js.Function2[ErrnoException | Null, (/* data */ Buffer) | String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readFile(
  path: PathOrFileDescriptor,
  options: Unit,
  callback: js.Function2[ErrnoException | Null, (/* data */ Buffer) | String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readFile(
  path: PathOrFileDescriptor,
  options: ObjectEncodingOptionsflag,
  callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String | Buffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readFile(
  path: PathOrFileDescriptor,
  options: encodingBufferEncodingflaEncoding,
  callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readFile(
  path: PathOrFileDescriptor,
  options: encodingnullundefinedflagEncoding,
  callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readFile(
  path: PathOrFileDescriptor,
  options: BufferEncoding,
  callback: js.Function2[ErrnoException | Null, Buffer | (/* data */ String), Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def readFileSync(path: PathOrFileDescriptor): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[String | Buffer]
inline def readFileSync(path: PathOrFileDescriptor, options: EncodingFlag): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
inline def readFileSync(path: PathOrFileDescriptor, options: Flag): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
inline def readFileSync(path: PathOrFileDescriptor, options: ObjectEncodingOptionsflagEncoding): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
inline def readFileSync(path: PathOrFileDescriptor, options: BufferEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]

inline def readFileSync_Buffer(path: PathOrFileDescriptor): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[Buffer]

inline def readFileSync_Union(path: PathOrFileDescriptor, options: BufferEncoding): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]

inline def readSync(fd: Double, buffer: ArrayBufferView): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def readSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def readSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double, position: ReadPosition): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def readSync(fd: Double, buffer: ArrayBufferView, opts: ReadSyncOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def readdir(
  path: PathLike,
  callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[String], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readdir(
  path: PathLike,
  options: "buffer" | BufferEncoding,
  callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readdir(
  path: PathLike,
  options: Null,
  callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readdir(
  path: PathLike,
  options: Unit,
  callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readdir(
  path: PathLike,
  options: EncodingWithFileTypes,
  callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[String], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readdir(
  path: PathLike,
  options: ObjectEncodingOptionswithEncoding,
  callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Dirent], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readdir(
  path: PathLike,
  options: ObjectEncodingOptionswith,
  callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readdir(
  path: PathLike,
  options: WithFileTypes,
  callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def readdirSync(path: PathLike): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
@scala.annotation.targetName("readdirSync_buffer")
inline def readdirSync(path: PathLike, options: "buffer"): js.Array[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer]]
inline def readdirSync(path: PathLike, options: EncodingWithFileTypes): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
inline def readdirSync(path: PathLike, options: ObjectEncodingOptionswith): js.Array[Buffer | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer | String]]
inline def readdirSync(path: PathLike, options: ObjectEncodingOptionswithEncoding): js.Array[Dirent] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Dirent]]
inline def readdirSync(path: PathLike, options: WithFileTypes): js.Array[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer]]
inline def readdirSync(path: PathLike, options: BufferEncoding): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]

inline def readlink(
  path: PathLike,
  callback: js.Function2[/* err */ ErrnoException | Null, /* linkString */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readlink(
  path: PathLike,
  options: BufferEncodingOption | EncodingOption,
  callback: js.Function2[ErrnoException | Null, (/* linkString */ Buffer) | (/* linkString */ String), Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def readlinkSync(path: PathLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[String]
inline def readlinkSync(path: PathLike, options: EncodingOption): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]

inline def readlinkSync_Buffer(path: PathLike, options: BufferEncodingOption): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]

inline def readlinkSync_Union(path: PathLike): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[String | Buffer]
inline def readlinkSync_Union(path: PathLike, options: EncodingOption): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]

inline def readv(
  fd: Double,
  buffers: js.Array[ArrayBufferView],
  cb: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffers */ js.Array[ArrayBufferView], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readv")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def readv(
  fd: Double,
  buffers: js.Array[ArrayBufferView],
  position: Double,
  cb: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesRead */ Double, 
  /* buffers */ js.Array[ArrayBufferView], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readv")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def readvSync(fd: Double, buffers: js.Array[ArrayBufferView]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readvSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def readvSync(fd: Double, buffers: js.Array[ArrayBufferView], position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readvSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def rename(oldPath: PathLike, newPath: PathLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rename")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def renameSync(oldPath: PathLike, newPath: PathLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renameSync")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def rm(path: PathLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def rm(path: PathLike, options: RmOptions, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def rmSync(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rmSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def rmSync(path: PathLike, options: RmOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rmSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def rmdir(path: PathLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def rmdir(path: PathLike, options: RmDirOptions, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def rmdirSync(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rmdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def rmdirSync(path: PathLike, options: RmDirOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rmdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def stat(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def stat(
  path: PathLike,
  options: Unit,
  callback: js.Function2[ErrnoException | Null, BigIntStats | (/* stats */ Stats), Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def stat(
  path: PathLike,
  options: StatOptionsbigintfalseund,
  callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def stat(
  path: PathLike,
  options: StatOptionsbiginttrue,
  callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ BigIntStats, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def stat(
  path: PathLike,
  options: StatOptions,
  callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats | BigIntStats, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def statSync: StatSyncFn = ^.asInstanceOf[js.Dynamic].selectDynamic("statSync").asInstanceOf[StatSyncFn]

inline def symlinkSync(target: PathLike, path: PathLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symlinkSync")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def symlinkSync(target: PathLike, path: PathLike, `type`: Type): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symlinkSync")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def truncate(path: PathLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def truncate(path: PathLike, len: Double, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def truncate(path: PathLike, len: Null, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def truncate(path: PathLike, len: Unit, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def truncateSync(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("truncateSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def truncateSync(path: PathLike, len: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("truncateSync")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def unlink(path: PathLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def unlinkSync(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def unwatchFile(filename: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unwatchFile")(filename.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def unwatchFile(filename: PathLike, listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unwatchFile")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def utimes(path: PathLike, atime: TimeLike, mtime: TimeLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def utimesSync(path: PathLike, atime: TimeLike, mtime: TimeLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def watch(filename: PathLike): FSWatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any]).asInstanceOf[FSWatcher]
inline def watch(filename: PathLike, listener: WatchListener[String]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
@scala.annotation.targetName("watch_buffer")
inline def watch(filename: PathLike, options: "buffer"): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
@scala.annotation.targetName("watch_buffer")
inline def watch(filename: PathLike, options: "buffer", listener: WatchListener[Buffer]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
inline def watch(filename: PathLike, options: BufferEncoding | String): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
inline def watch(filename: PathLike, options: BufferEncoding | String, listener: WatchListener[Buffer | String]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
inline def watch(filename: PathLike, options: Null, listener: WatchListener[String]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
inline def watch(filename: PathLike, options: Unit, listener: WatchListener[String]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
inline def watch(filename: PathLike, options: WatchOptionsencodingbuffe): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
inline def watch(filename: PathLike, options: WatchOptionsencodingbuffe, listener: WatchListener[Buffer]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
inline def watch(filename: PathLike, options: WatchOptions): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
inline def watch(filename: PathLike, options: WatchOptions, listener: WatchListener[Buffer | String]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]

inline def watchFile(filename: PathLike, listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]): StatWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[StatWatcher]
inline def watchFile(
  filename: PathLike,
  options: Unit,
  listener: js.Function2[
  (/* curr */ BigIntStats) | (/* curr */ Stats), 
  (/* prev */ BigIntStats) | (/* prev */ Stats), 
  Unit
]
): StatWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[StatWatcher]
inline def watchFile(
  filename: PathLike,
  options: WatchFileOptionsbigintfal,
  listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]
): StatWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[StatWatcher]
inline def watchFile(
  filename: PathLike,
  options: WatchFileOptionsbiginttru,
  listener: js.Function2[/* curr */ BigIntStats, /* prev */ BigIntStats, Unit]
): StatWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[StatWatcher]

inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Double,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Double,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Double,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Double,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Double,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Double,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Double,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Double,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Double,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Double,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Null,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Null,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Null,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Null,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Null,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Null,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Null,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Null,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Null,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Null,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Null,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Null,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Unit,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Unit,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Unit,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Unit,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Unit,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Unit,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Unit,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Unit,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Unit,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Unit,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Unit,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.DataView,
  offset: Unit,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.DataView, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Double,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Double,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Double,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Double,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Double,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Double,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Double,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Double,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Double,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Double,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Null,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Null,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Null,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Null,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Null,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Null,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Null,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Null,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Null,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Null,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Null,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Null,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Unit,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Unit,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Unit,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Unit,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Unit,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Unit,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Unit,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Unit,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Unit,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Unit,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Unit,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float32Array,
  offset: Unit,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Double,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Double,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Double,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Double,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Double,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Double,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Double,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Double,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Double,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Double,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Null,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Null,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Null,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Null,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Null,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Null,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Null,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Null,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Null,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Null,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Null,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Null,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Unit,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Unit,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Unit,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Unit,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Unit,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Unit,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Unit,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Unit,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Unit,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Unit,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Unit,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Float64Array,
  offset: Unit,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Float64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Double,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Double,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Double,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Double,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Double,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Double,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Double,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Double,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Double,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Double,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Null,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Null,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Null,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Null,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Null,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Null,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Null,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Null,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Null,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Null,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Null,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Null,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Unit,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Unit,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Unit,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Unit,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Unit,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Unit,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Unit,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Unit,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Unit,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Unit,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Unit,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int16Array,
  offset: Unit,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Double,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Double,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Double,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Double,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Double,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Double,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Double,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Double,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Double,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Double,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Null,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Null,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Null,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Null,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Null,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Null,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Null,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Null,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Null,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Null,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Null,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Null,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Unit,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Unit,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Unit,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Unit,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Unit,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Unit,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Unit,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Unit,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Unit,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Unit,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Unit,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int32Array,
  offset: Unit,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Double,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Double,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Double,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Double,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Double,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Double,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Double,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Double,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Double,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Double,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Null,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Null,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Null,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Null,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Null,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Null,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Null,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Null,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Null,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Null,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Null,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Null,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Unit,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Unit,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Unit,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Unit,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Unit,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Unit,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Unit,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Unit,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Unit,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Unit,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Unit,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Int8Array,
  offset: Unit,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Int8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Double,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Double,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Double,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Double,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Double,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Double,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Double,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Double,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Double,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Double,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Null,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Null,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Null,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Null,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Null,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Null,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Null,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Null,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Null,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Null,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Null,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Null,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Unit,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Unit,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Unit,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Unit,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Unit,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Unit,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Unit,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Unit,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Unit,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Unit,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Unit,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint16Array,
  offset: Unit,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint16Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Double,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Double,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Double,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Double,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Double,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Double,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Double,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Double,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Double,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Double,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Null,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Null,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Null,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Null,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Null,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Null,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Null,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Null,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Null,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Null,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Null,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Null,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Unit,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Unit,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Unit,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Unit,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Unit,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Unit,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Unit,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Unit,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Unit,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Unit,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Unit,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint32Array,
  offset: Unit,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint32Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Double,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Double,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Double,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Double,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Double,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Double,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Double,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Double,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Double,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Double,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Null,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Null,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Null,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Null,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Null,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Null,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Null,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Null,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Null,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Null,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Null,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Null,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Unit,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Unit,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Unit,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Unit,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Unit,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Unit,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Unit,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Unit,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Unit,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Unit,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Unit,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8Array,
  offset: Unit,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Double,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Null,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Null,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Null,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Null,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Null,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Null,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Null,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Null,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Null,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Null,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Null,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Null,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Unit,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Unit,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Unit,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Unit,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Unit,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Unit,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Unit,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Unit,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Unit,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Unit,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Unit,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: js.typedarray.Uint8ClampedArray,
  offset: Unit,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ js.typedarray.Uint8ClampedArray, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Double,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Double,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Double,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Double,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Double,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Double,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Double,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Double,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Double,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Double,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Null,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Null,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Null,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Null,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Null,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Null,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Null,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Null,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Null,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Null,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Null,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Null,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Unit,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Unit,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Unit,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Unit,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Unit,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Unit,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Unit,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Unit,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Unit,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Unit,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Unit,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigInt64Array,
  offset: Unit,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigInt64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Double,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Double,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Double,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Double,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Double,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Double,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Double,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Double,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Double,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Double,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Double,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Double,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Null,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Null,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Null,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Null,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Null,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Null,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Null,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Null,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Null,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Null,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Null,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Null,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Unit,
  length: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Unit,
  length: Double,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Unit,
  length: Double,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Unit,
  length: Double,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Unit,
  length: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Unit,
  length: Null,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Unit,
  length: Null,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Unit,
  length: Null,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Unit,
  length: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Unit,
  length: Unit,
  position: Double,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Unit,
  length: Unit,
  position: Null,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  buffer: BigUint64Array,
  offset: Unit,
  length: Unit,
  position: Unit,
  callback: js.Function3[
  /* err */ ErrnoException | Null, 
  /* written */ Double, 
  /* buffer */ BigUint64Array, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  string: String,
  callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  string: String,
  position: Double,
  callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  string: String,
  position: Double,
  encoding: Null,
  callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  string: String,
  position: Double,
  encoding: Unit,
  callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  string: String,
  position: Double,
  encoding: BufferEncoding,
  callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  string: String,
  position: Null,
  callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  string: String,
  position: Null,
  encoding: Null,
  callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  string: String,
  position: Null,
  encoding: Unit,
  callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  string: String,
  position: Null,
  encoding: BufferEncoding,
  callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  string: String,
  position: Unit,
  callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  string: String,
  position: Unit,
  encoding: Null,
  callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  string: String,
  position: Unit,
  encoding: Unit,
  callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def write(
  fd: Double,
  string: String,
  position: Unit,
  encoding: BufferEncoding,
  callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def writeFile(file: PathOrFileDescriptor, data: String, options: WriteFileOptions, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeFile(
  file: PathOrFileDescriptor,
  data: ArrayBufferView,
  options: WriteFileOptions,
  callback: NoParamCallback
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeFile(path: PathOrFileDescriptor, data: String, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeFile(path: PathOrFileDescriptor, data: ArrayBufferView, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def writeFileSync(file: PathOrFileDescriptor, data: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeFileSync(file: PathOrFileDescriptor, data: String, options: WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeFileSync(file: PathOrFileDescriptor, data: ArrayBufferView): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeFileSync(file: PathOrFileDescriptor, data: ArrayBufferView, options: WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def writeSync(fd: Double, buffer: ArrayBufferView): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Null, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Unit, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Null, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Unit, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Double, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Null, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Unit, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(fd: Double, string: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(fd: Double, string: String, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(fd: Double, string: String, position: Double, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(fd: Double, string: String, position: Null, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writeSync(fd: Double, string: String, position: Unit, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def writev(
  fd: Double,
  buffers: js.Array[ArrayBufferView],
  cb: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesWritten */ Double, 
  /* buffers */ js.Array[ArrayBufferView], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writev")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writev(
  fd: Double,
  buffers: js.Array[ArrayBufferView],
  position: Double,
  cb: js.Function3[
  /* err */ ErrnoException | Null, 
  /* bytesWritten */ Double, 
  /* buffers */ js.Array[ArrayBufferView], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writev")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def writevSync(fd: Double, buffers: js.Array[ArrayBufferView]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writevSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def writevSync(fd: Double, buffers: js.Array[ArrayBufferView], position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writevSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]

type BufferEncodingOption = "buffer" | Encoding

type EncodingOption = js.UndefOr[ObjectEncodingOptions | BufferEncoding | Null]

type Mode = Double | String

type NoParamCallback = js.Function1[/* err */ ErrnoException | Null, Unit]

type OpenMode = Double | String

type PathLike = String | Buffer | URL

type PathOrFileDescriptor = PathLike | Double

type ReadPosition = Double | js.BigInt

type TimeLike = String | Double | js.Date

type WatchEventType = "rename" | "change"

type WatchListener[T] = js.Function2[/* event */ WatchEventType, /* filename */ T, Unit]

type WriteFileOptions = ObjectEncodingOptionsAbor | BufferEncoding | Null
