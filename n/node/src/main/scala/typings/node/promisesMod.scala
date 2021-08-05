package typings.node

import typings.node.NodeJS.ArrayBufferView
import typings.node.anon.BaseEncodingOptionsflagOp
import typings.node.anon.BaseEncodingOptionsmodeMo
import typings.node.anon.BaseEncodingOptionswithFi
import typings.node.anon.BaseEncodingOptionswithFiEncoding
import typings.node.anon.BufferBytesWritten
import typings.node.anon.BytesWritten
import typings.node.anon.Encoding
import typings.node.anon.EncodingFlag
import typings.node.anon.Flag
import typings.node.anon.MakeDirectoryOptionsrecur
import typings.node.anon.MakeDirectoryOptionsrecurMode
import typings.node.fsMod.BaseEncodingOptions
import typings.node.fsMod.BufferEncodingOption
import typings.node.fsMod.Dir
import typings.node.fsMod.Dirent
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.Mode
import typings.node.fsMod.OpenDirOptions
import typings.node.fsMod.PathLike
import typings.node.fsMod.ReadVResult
import typings.node.fsMod.RmDirOptions
import typings.node.fsMod.RmOptions
import typings.node.fsMod.Stats
import typings.node.fsMod.WriteVResult
import typings.node.nodeStrings.buffer_
import typings.node.workerThreadsMod._TransferListItem
import typings.std.Date
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promisesMod {
  
  @JSImport("fs/promises", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Asynchronously tests a user's permissions for the file specified by path.
    * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  inline def access(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def access(path: PathLike, mode: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronously append data to a file, creating the file if it does not exist.
    * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
    * @param data The data to write. If something other than a `Buffer` or `Uint8Array` is provided, the value is coerced to a string.
    * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `mode` is not supplied, the default of `0o666` is used.
    * If `mode` is a string, it is parsed as an octal integer.
    * If `flag` is not supplied, the default of `'a'` is used.
    */
  inline def appendFile(path: PathLike, data: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def appendFile(path: PathLike, data: java.lang.String, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def appendFile(path: PathLike, data: java.lang.String, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def appendFile(path: PathLike, data: Uint8Array): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def appendFile(path: PathLike, data: Uint8Array, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def appendFile(path: PathLike, data: Uint8Array, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def appendFile(path: FileHandle, data: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def appendFile(path: FileHandle, data: java.lang.String, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def appendFile(path: FileHandle, data: java.lang.String, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def appendFile(path: FileHandle, data: Uint8Array): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def appendFile(path: FileHandle, data: Uint8Array, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def appendFile(path: FileHandle, data: Uint8Array, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronous chmod(2) - Change permissions of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  inline def chmod(path: PathLike, mode: Mode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("chmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronous chown(2) - Change ownership of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  inline def chown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("chown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronously copies `src` to `dest`. By default, `dest` is overwritten if it already exists.
    * Node.js makes no guarantees about the atomicity of the copy operation.
    * If an error occurs after the destination file has been opened for writing, Node.js will attempt
    * to remove the destination.
    * @param src A path to the source file.
    * @param dest A path to the destination file.
    * @param flags An optional integer that specifies the behavior of the copy operation. The only
    * supported flag is `fs.constants.COPYFILE_EXCL`, which causes the copy operation to fail if
    * `dest` already exists.
    */
  inline def copyFile(src: PathLike, dest: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def copyFile(src: PathLike, dest: PathLike, flags: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronous fchmod(2) - Change permissions of a file.
    * @param handle A `FileHandle`.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  inline def fchmod(handle: FileHandle, mode: Mode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("fchmod")(handle.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronous fchown(2) - Change ownership of a file.
    * @param handle A `FileHandle`.
    */
  inline def fchown(handle: FileHandle, uid: Double, gid: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("fchown")(handle.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronous fdatasync(2) - synchronize a file's in-core state with storage device.
    * @param handle A `FileHandle`.
    */
  inline def fdatasync(handle: FileHandle): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("fdatasync")(handle.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronous fstat(2) - Get file status.
    * @param handle A `FileHandle`.
    */
  inline def fstat(handle: FileHandle): js.Promise[Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(handle.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stats]]
  
  /**
    * Asynchronous fsync(2) - synchronize a file's in-core state with the underlying storage device.
    * @param handle A `FileHandle`.
    */
  inline def fsync(handle: FileHandle): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("fsync")(handle.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronous ftruncate(2) - Truncate a file to a specified length.
    * @param handle A `FileHandle`.
    * @param len If not specified, defaults to `0`.
    */
  inline def ftruncate(handle: FileHandle): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(handle.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def ftruncate(handle: FileHandle, len: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(handle.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronously change file timestamps of the file referenced by the supplied `FileHandle`.
    * @param handle A `FileHandle`.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  inline def futimes(handle: FileHandle, atime: java.lang.String, mtime: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(handle.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def futimes(handle: FileHandle, atime: java.lang.String, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(handle.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def futimes(handle: FileHandle, atime: java.lang.String, mtime: Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(handle.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def futimes(handle: FileHandle, atime: Double, mtime: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(handle.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def futimes(handle: FileHandle, atime: Double, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(handle.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def futimes(handle: FileHandle, atime: Double, mtime: Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(handle.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def futimes(handle: FileHandle, atime: Date, mtime: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(handle.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def futimes(handle: FileHandle, atime: Date, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(handle.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def futimes(handle: FileHandle, atime: Date, mtime: Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(handle.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronous lchmod(2) - Change permissions of a file. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  inline def lchmod(path: PathLike, mode: Mode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lchmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronous lchown(2) - Change ownership of a file. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  inline def lchown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lchown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronous link(2) - Create a new link (also known as a hard link) to an existing file.
    * @param existingPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  inline def link(existingPath: PathLike, newPath: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(existingPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronous lstat(2) - Get file status. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  inline def lstat(path: PathLike): js.Promise[Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stats]]
  
  /**
    * Changes the access and modification times of a file in the same way as `fsPromises.utimes()`,
    * with the difference that if the path refers to a symbolic link, then the link is not
    * dereferenced: instead, the timestamps of the symbolic link itself are changed.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  inline def lutimes(path: PathLike, atime: java.lang.String, mtime: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def lutimes(path: PathLike, atime: java.lang.String, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def lutimes(path: PathLike, atime: java.lang.String, mtime: Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def lutimes(path: PathLike, atime: Double, mtime: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def lutimes(path: PathLike, atime: Double, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def lutimes(path: PathLike, atime: Double, mtime: Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def lutimes(path: PathLike, atime: Date, mtime: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def lutimes(path: PathLike, atime: Date, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def lutimes(path: PathLike, atime: Date, mtime: Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronous mkdir(2) - create a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
    * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
    */
  inline def mkdir(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  /**
    * Asynchronous mkdir(2) - create a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
    * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
    */
  inline def mkdir(path: PathLike, options: MakeDirectoryOptionsrecur): js.Promise[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  inline def mkdir(path: PathLike, options: MakeDirectoryOptionsrecurMode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def mkdir(path: PathLike, options: MakeDirectoryOptions): js.Promise[js.UndefOr[java.lang.String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[java.lang.String]]]
  inline def mkdir(path: PathLike, options: Mode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required `prefix` to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  inline def mkdtemp(prefix: java.lang.String): js.Promise[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any]).asInstanceOf[js.Promise[java.lang.String]]
  inline def mkdtemp(prefix: java.lang.String, options: BufferEncoding): js.Promise[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  inline def mkdtemp(prefix: java.lang.String, options: BaseEncodingOptions): js.Promise[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required `prefix` to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  inline def mkdtemp(prefix: java.lang.String, options: BufferEncodingOption): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  /**
    * Asynchronous open(2) - open and possibly create a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not
    * supplied, defaults to `0o666`.
    */
  inline def open(path: PathLike, flags: java.lang.String): js.Promise[FileHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileHandle]]
  inline def open(path: PathLike, flags: java.lang.String, mode: Mode): js.Promise[FileHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileHandle]]
  inline def open(path: PathLike, flags: Double): js.Promise[FileHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileHandle]]
  inline def open(path: PathLike, flags: Double, mode: Mode): js.Promise[FileHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileHandle]]
  
  inline def opendir(path: java.lang.String): js.Promise[Dir] = ^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Dir]]
  inline def opendir(path: java.lang.String, options: OpenDirOptions): js.Promise[Dir] = (^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Dir]]
  
  /**
    * Asynchronously reads data from the file referenced by the supplied `FileHandle`.
    * @param handle A `FileHandle`.
    * @param buffer The buffer that the data will be written to.
    * @param offset The offset in the buffer at which to start writing.
    * @param length The number of bytes to read.
    * @param position The offset from the beginning of the file from which data should be read. If
    * `null`, data will be read from the current position.
    */
  inline def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer): js.Promise[typings.node.anon.Buffer[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.anon.Buffer[TBuffer]]]
  inline def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.anon.Buffer[TBuffer]]]
  inline def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.anon.Buffer[TBuffer]]]
  inline def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Double, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.anon.Buffer[TBuffer]]]
  inline def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Null, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.anon.Buffer[TBuffer]]]
  inline def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Unit, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.anon.Buffer[TBuffer]]]
  inline def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.anon.Buffer[TBuffer]]]
  inline def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Double, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.anon.Buffer[TBuffer]]]
  inline def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Null, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.anon.Buffer[TBuffer]]]
  inline def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Unit, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.anon.Buffer[TBuffer]]]
  inline def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Unit, length: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.anon.Buffer[TBuffer]]]
  inline def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Unit, length: Double, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.anon.Buffer[TBuffer]]]
  inline def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Unit, length: Null, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.anon.Buffer[TBuffer]]]
  inline def read[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Unit, length: Unit, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.anon.Buffer[TBuffer]]]
  
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
    * @param options An object that may contain an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  inline def readFile(path: PathLike): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def readFile(path: PathLike, options: BufferEncoding): js.Promise[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  inline def readFile(path: PathLike, options: BaseEncodingOptionsflagOp): js.Promise[java.lang.String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String | Buffer]]
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
    * @param options An object that may contain an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  inline def readFile(path: PathLike, options: EncodingFlag): js.Promise[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  inline def readFile(path: PathLike, options: Flag): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def readFile(path: FileHandle): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def readFile(path: FileHandle, options: BufferEncoding): js.Promise[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  inline def readFile(path: FileHandle, options: BaseEncodingOptionsflagOp): js.Promise[java.lang.String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String | Buffer]]
  inline def readFile(path: FileHandle, options: EncodingFlag): js.Promise[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  inline def readFile(path: FileHandle, options: Flag): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  inline def readdir(path: PathLike): js.Promise[js.Array[java.lang.String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
  inline def readdir(path: PathLike, options: BufferEncoding): js.Promise[js.Array[java.lang.String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
  inline def readdir(path: PathLike, options: BaseEncodingOptionswithFi): js.Promise[js.Array[java.lang.String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options If called with `withFileTypes: true` the result data will be an array of Dirent.
    */
  inline def readdir(path: PathLike, options: BaseEncodingOptionswithFiEncoding): js.Promise[js.Array[Dirent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Dirent]]]
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  inline def readdir(path: PathLike, options: Encoding): js.Promise[js.Array[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Buffer]]]
  
  inline def readdir_buffer(path: PathLike, options: buffer_): js.Promise[js.Array[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Buffer]]]
  
  /**
    * Asynchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  inline def readlink(path: PathLike): js.Promise[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[java.lang.String]]
  inline def readlink(path: PathLike, options: java.lang.String): js.Promise[java.lang.String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String | Buffer]]
  inline def readlink(path: PathLike, options: BufferEncoding): js.Promise[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  inline def readlink(path: PathLike, options: BaseEncodingOptions): js.Promise[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  /**
    * Asynchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  inline def readlink(path: PathLike, options: BufferEncodingOption): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  /**
    * Asynchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  inline def realpath(path: PathLike): js.Promise[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[java.lang.String]]
  inline def realpath(path: PathLike, options: BufferEncoding): js.Promise[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  inline def realpath(path: PathLike, options: BaseEncodingOptions): js.Promise[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  /**
    * Asynchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  inline def realpath(path: PathLike, options: BufferEncodingOption): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  /**
    * Asynchronous rename(2) - Change the name or location of a file or directory.
    * @param oldPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  inline def rename(oldPath: PathLike, newPath: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rename")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronously removes files and directories (modeled on the standard POSIX `rm` utility).
    */
  inline def rm(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def rm(path: PathLike, options: RmOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronous rmdir(2) - delete a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  inline def rmdir(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def rmdir(path: PathLike, options: RmDirOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronous stat(2) - Get file status.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  inline def stat(path: PathLike): js.Promise[Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stats]]
  
  /**
    * Asynchronous symlink(2) - Create a new symbolic link to an existing file.
    * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
    * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
    * @param type May be set to `'dir'`, `'file'`, or `'junction'` (default is `'file'`) and is only available on Windows (ignored on other platforms).
    * When using `'junction'`, the `target` argument will automatically be normalized to an absolute path.
    */
  inline def symlink(target: PathLike, path: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def symlink(target: PathLike, path: PathLike, `type`: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronous truncate(2) - Truncate a file to a specified length.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param len If not specified, defaults to `0`.
    */
  inline def truncate(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def truncate(path: PathLike, len: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronous unlink(2) - delete a name and possibly the file it refers to.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  inline def unlink(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronously change file timestamps of the file referenced by the supplied path.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  inline def utimes(path: PathLike, atime: java.lang.String, mtime: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def utimes(path: PathLike, atime: java.lang.String, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def utimes(path: PathLike, atime: java.lang.String, mtime: Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def utimes(path: PathLike, atime: Double, mtime: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def utimes(path: PathLike, atime: Double, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def utimes(path: PathLike, atime: Double, mtime: Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def utimes(path: PathLike, atime: Date, mtime: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def utimes(path: PathLike, atime: Date, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def utimes(path: PathLike, atime: Date, mtime: Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronously writes `string` to the file referenced by the supplied `FileHandle`.
    * It is unsafe to call `fsPromises.write()` multiple times on the same file without waiting for the `Promise`
    * to be resolved (or rejected). For this scenario, `fs.createWriteStream` is strongly recommended.
    * @param handle A `FileHandle`.
    * @param string A string to write.
    * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
    * @param encoding The expected string encoding.
    */
  inline def write(handle: FileHandle, string: java.lang.String): js.Promise[BufferBytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBytesWritten]]
  inline def write(handle: FileHandle, string: java.lang.String, position: Double): js.Promise[BufferBytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBytesWritten]]
  inline def write(handle: FileHandle, string: java.lang.String, position: Double, encoding: BufferEncoding): js.Promise[BufferBytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBytesWritten]]
  inline def write(handle: FileHandle, string: java.lang.String, position: Null, encoding: BufferEncoding): js.Promise[BufferBytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBytesWritten]]
  inline def write(handle: FileHandle, string: java.lang.String, position: Unit, encoding: BufferEncoding): js.Promise[BufferBytesWritten] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BufferBytesWritten]]
  /**
    * Asynchronously writes `buffer` to the file referenced by the supplied `FileHandle`.
    * It is unsafe to call `fsPromises.write()` multiple times on the same file without waiting for the `Promise`
    * to be resolved (or rejected). For this scenario, `fs.createWriteStream` is strongly recommended.
    * @param handle A `FileHandle`.
    * @param buffer The buffer that the data will be written to.
    * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
    * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
    * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
    */
  inline def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer): js.Promise[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten[TBuffer]]]
  inline def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double): js.Promise[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten[TBuffer]]]
  inline def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Double): js.Promise[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten[TBuffer]]]
  inline def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Double, position: Double): js.Promise[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten[TBuffer]]]
  inline def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Null, position: Double): js.Promise[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten[TBuffer]]]
  inline def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Unit, position: Double): js.Promise[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten[TBuffer]]]
  inline def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Double): js.Promise[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten[TBuffer]]]
  inline def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Double, position: Double): js.Promise[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten[TBuffer]]]
  inline def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Null, position: Double): js.Promise[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten[TBuffer]]]
  inline def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Unit, position: Double): js.Promise[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten[TBuffer]]]
  inline def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Unit, length: Double): js.Promise[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten[TBuffer]]]
  inline def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Unit, length: Double, position: Double): js.Promise[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten[TBuffer]]]
  inline def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Unit, length: Null, position: Double): js.Promise[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten[TBuffer]]]
  inline def write[TBuffer /* <: Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Unit, length: Unit, position: Double): js.Promise[BytesWritten[TBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(handle.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BytesWritten[TBuffer]]]
  
  /**
    * Asynchronously writes data to a file, replacing the file if it already exists.
    * It is unsafe to call `fsPromises.writeFile()` multiple times on the same file without waiting for the `Promise` to be resolved (or rejected).
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
    * @param data The data to write. If something other than a `Buffer` or `Uint8Array` is provided, the value is coerced to a string.
    * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `mode` is not supplied, the default of `0o666` is used.
    * If `mode` is a string, it is parsed as an octal integer.
    * If `flag` is not supplied, the default of `'w'` is used.
    */
  inline def writeFile(path: PathLike, data: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(path: PathLike, data: java.lang.String, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(path: PathLike, data: java.lang.String, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(path: PathLike, data: Uint8Array): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(path: PathLike, data: Uint8Array, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(path: PathLike, data: Uint8Array, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(path: FileHandle, data: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(path: FileHandle, data: java.lang.String, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(path: FileHandle, data: java.lang.String, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(path: FileHandle, data: Uint8Array): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(path: FileHandle, data: Uint8Array, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(path: FileHandle, data: Uint8Array, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @js.native
  trait FileHandle
    extends StObject
       with _TransferListItem {
    
    /**
      * Asynchronously append data to a file, creating the file if it does not exist. The underlying file will _not_ be closed automatically.
      * The `FileHandle` must have been opened for appending.
      * @param data The data to write. If something other than a `Buffer` or `Uint8Array` is provided, the value is coerced to a string.
      * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
      * If `encoding` is not supplied, the default of `'utf8'` is used.
      * If `mode` is not supplied, the default of `0o666` is used.
      * If `mode` is a string, it is parsed as an octal integer.
      * If `flag` is not supplied, the default of `'a'` is used.
      */
    def appendFile(data: java.lang.String): js.Promise[Unit] = js.native
    def appendFile(data: java.lang.String, options: BufferEncoding): js.Promise[Unit] = js.native
    def appendFile(data: java.lang.String, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
    def appendFile(data: Uint8Array): js.Promise[Unit] = js.native
    def appendFile(data: Uint8Array, options: BufferEncoding): js.Promise[Unit] = js.native
    def appendFile(data: Uint8Array, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous fchmod(2) - Change permissions of a file.
      * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
      */
    def chmod(mode: Mode): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous fchown(2) - Change ownership of a file.
      */
    def chown(uid: Double, gid: Double): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous close(2) - close a `FileHandle`.
      */
    def close(): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous fdatasync(2) - synchronize a file's in-core state with storage device.
      */
    def datasync(): js.Promise[Unit] = js.native
    
    /**
      * Gets the file descriptor for this file handle.
      */
    val fd: Double = js.native
    
    /**
      * Asynchronously reads data from the file.
      * The `FileHandle` must have been opened for reading.
      * @param buffer The buffer that the data will be written to.
      * @param offset The offset in the buffer at which to start writing.
      * @param length The number of bytes to read.
      * @param position The offset from the beginning of the file from which data should be read. If `null`, data will be read from the current position.
      */
    def read[TBuffer /* <: Uint8Array */](buffer: TBuffer): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    def read[TBuffer /* <: Uint8Array */](buffer: TBuffer, offset: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    def read[TBuffer /* <: Uint8Array */](buffer: TBuffer, offset: Double, length: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    def read[TBuffer /* <: Uint8Array */](buffer: TBuffer, offset: Double, length: Double, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    def read[TBuffer /* <: Uint8Array */](buffer: TBuffer, offset: Double, length: Null, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    def read[TBuffer /* <: Uint8Array */](buffer: TBuffer, offset: Double, length: Unit, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    def read[TBuffer /* <: Uint8Array */](buffer: TBuffer, offset: Null, length: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    def read[TBuffer /* <: Uint8Array */](buffer: TBuffer, offset: Null, length: Double, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    def read[TBuffer /* <: Uint8Array */](buffer: TBuffer, offset: Null, length: Null, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    def read[TBuffer /* <: Uint8Array */](buffer: TBuffer, offset: Null, length: Unit, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    def read[TBuffer /* <: Uint8Array */](buffer: TBuffer, offset: Unit, length: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    def read[TBuffer /* <: Uint8Array */](buffer: TBuffer, offset: Unit, length: Double, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    def read[TBuffer /* <: Uint8Array */](buffer: TBuffer, offset: Unit, length: Null, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    def read[TBuffer /* <: Uint8Array */](buffer: TBuffer, offset: Unit, length: Unit, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    
    /**
      * Asynchronously reads the entire contents of a file. The underlying file will _not_ be closed automatically.
      * The `FileHandle` must have been opened for reading.
      * @param options An object that may contain an optional flag.
      * If a flag is not provided, it defaults to `'r'`.
      */
    def readFile(): js.Promise[Buffer] = js.native
    def readFile(options: BufferEncoding): js.Promise[java.lang.String] = js.native
    def readFile(options: BaseEncodingOptionsflagOp): js.Promise[java.lang.String | Buffer] = js.native
    /**
      * Asynchronously reads the entire contents of a file. The underlying file will _not_ be closed automatically.
      * The `FileHandle` must have been opened for reading.
      * @param options An object that may contain an optional flag.
      * If a flag is not provided, it defaults to `'r'`.
      */
    def readFile(options: EncodingFlag): js.Promise[java.lang.String] = js.native
    def readFile(options: Flag): js.Promise[Buffer] = js.native
    
    /**
      * See `fs.readv` promisified version.
      */
    def readv(buffers: js.Array[ArrayBufferView]): js.Promise[ReadVResult] = js.native
    def readv(buffers: js.Array[ArrayBufferView], position: Double): js.Promise[ReadVResult] = js.native
    
    /**
      * Asynchronous fstat(2) - Get file status.
      */
    def stat(): js.Promise[Stats] = js.native
    
    /**
      * Asynchronous fsync(2) - synchronize a file's in-core state with the underlying storage device.
      */
    def sync(): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous ftruncate(2) - Truncate a file to a specified length.
      * @param len If not specified, defaults to `0`.
      */
    def truncate(): js.Promise[Unit] = js.native
    def truncate(len: Double): js.Promise[Unit] = js.native
    
    /**
      * Asynchronously change file timestamps of the file.
      * @param atime The last access time. If a string is provided, it will be coerced to number.
      * @param mtime The last modified time. If a string is provided, it will be coerced to number.
      */
    def utimes(atime: java.lang.String, mtime: java.lang.String): js.Promise[Unit] = js.native
    def utimes(atime: java.lang.String, mtime: Double): js.Promise[Unit] = js.native
    def utimes(atime: java.lang.String, mtime: Date): js.Promise[Unit] = js.native
    def utimes(atime: Double, mtime: java.lang.String): js.Promise[Unit] = js.native
    def utimes(atime: Double, mtime: Double): js.Promise[Unit] = js.native
    def utimes(atime: Double, mtime: Date): js.Promise[Unit] = js.native
    def utimes(atime: Date, mtime: java.lang.String): js.Promise[Unit] = js.native
    def utimes(atime: Date, mtime: Double): js.Promise[Unit] = js.native
    def utimes(atime: Date, mtime: Date): js.Promise[Unit] = js.native
    
    /**
      * Asynchronously writes `string` to the file.
      * The `FileHandle` must have been opened for writing.
      * It is unsafe to call `write()` multiple times on the same file without waiting for the `Promise`
      * to be resolved (or rejected). For this scenario, `fs.createWriteStream` is strongly recommended.
      * @param string A string to write.
      * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
      * @param encoding The expected string encoding.
      */
    def write(data: java.lang.String): js.Promise[BufferBytesWritten] = js.native
    def write(data: java.lang.String, position: Double): js.Promise[BufferBytesWritten] = js.native
    def write(data: java.lang.String, position: Double, encoding: BufferEncoding): js.Promise[BufferBytesWritten] = js.native
    def write(data: java.lang.String, position: Null, encoding: BufferEncoding): js.Promise[BufferBytesWritten] = js.native
    def write(data: java.lang.String, position: Unit, encoding: BufferEncoding): js.Promise[BufferBytesWritten] = js.native
    def write(data: Uint8Array): js.Promise[BufferBytesWritten] = js.native
    def write(data: Uint8Array, position: Double): js.Promise[BufferBytesWritten] = js.native
    def write(data: Uint8Array, position: Double, encoding: BufferEncoding): js.Promise[BufferBytesWritten] = js.native
    def write(data: Uint8Array, position: Null, encoding: BufferEncoding): js.Promise[BufferBytesWritten] = js.native
    def write(data: Uint8Array, position: Unit, encoding: BufferEncoding): js.Promise[BufferBytesWritten] = js.native
    /**
      * Asynchronously writes `buffer` to the file.
      * The `FileHandle` must have been opened for writing.
      * @param buffer The buffer that the data will be written to.
      * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
      * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
      * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
      */
    def write[TBuffer /* <: Uint8Array */](buffer: TBuffer): js.Promise[BytesWritten[TBuffer]] = js.native
    def write[TBuffer /* <: Uint8Array */](buffer: TBuffer, offset: Double): js.Promise[BytesWritten[TBuffer]] = js.native
    def write[TBuffer /* <: Uint8Array */](buffer: TBuffer, offset: Double, length: Double): js.Promise[BytesWritten[TBuffer]] = js.native
    def write[TBuffer /* <: Uint8Array */](buffer: TBuffer, offset: Double, length: Double, position: Double): js.Promise[BytesWritten[TBuffer]] = js.native
    def write[TBuffer /* <: Uint8Array */](buffer: TBuffer, offset: Double, length: Null, position: Double): js.Promise[BytesWritten[TBuffer]] = js.native
    def write[TBuffer /* <: Uint8Array */](buffer: TBuffer, offset: Double, length: Unit, position: Double): js.Promise[BytesWritten[TBuffer]] = js.native
    def write[TBuffer /* <: Uint8Array */](buffer: TBuffer, offset: Null, length: Double): js.Promise[BytesWritten[TBuffer]] = js.native
    def write[TBuffer /* <: Uint8Array */](buffer: TBuffer, offset: Null, length: Double, position: Double): js.Promise[BytesWritten[TBuffer]] = js.native
    def write[TBuffer /* <: Uint8Array */](buffer: TBuffer, offset: Null, length: Null, position: Double): js.Promise[BytesWritten[TBuffer]] = js.native
    def write[TBuffer /* <: Uint8Array */](buffer: TBuffer, offset: Null, length: Unit, position: Double): js.Promise[BytesWritten[TBuffer]] = js.native
    def write[TBuffer /* <: Uint8Array */](buffer: TBuffer, offset: Unit, length: Double): js.Promise[BytesWritten[TBuffer]] = js.native
    def write[TBuffer /* <: Uint8Array */](buffer: TBuffer, offset: Unit, length: Double, position: Double): js.Promise[BytesWritten[TBuffer]] = js.native
    def write[TBuffer /* <: Uint8Array */](buffer: TBuffer, offset: Unit, length: Null, position: Double): js.Promise[BytesWritten[TBuffer]] = js.native
    def write[TBuffer /* <: Uint8Array */](buffer: TBuffer, offset: Unit, length: Unit, position: Double): js.Promise[BytesWritten[TBuffer]] = js.native
    
    /**
      * Asynchronously writes data to a file, replacing the file if it already exists. The underlying file will _not_ be closed automatically.
      * The `FileHandle` must have been opened for writing.
      * It is unsafe to call `writeFile()` multiple times on the same file without waiting for the `Promise` to be resolved (or rejected).
      * @param data The data to write. If something other than a `Buffer` or `Uint8Array` is provided, the value is coerced to a string.
      * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
      * If `encoding` is not supplied, the default of `'utf8'` is used.
      * If `mode` is not supplied, the default of `0o666` is used.
      * If `mode` is a string, it is parsed as an octal integer.
      * If `flag` is not supplied, the default of `'w'` is used.
      */
    def writeFile(data: java.lang.String): js.Promise[Unit] = js.native
    def writeFile(data: java.lang.String, options: BufferEncoding): js.Promise[Unit] = js.native
    def writeFile(data: java.lang.String, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
    def writeFile(data: Uint8Array): js.Promise[Unit] = js.native
    def writeFile(data: Uint8Array, options: BufferEncoding): js.Promise[Unit] = js.native
    def writeFile(data: Uint8Array, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
    
    /**
      * See `fs.writev` promisified version.
      */
    def writev(buffers: js.Array[ArrayBufferView]): js.Promise[WriteVResult] = js.native
    def writev(buffers: js.Array[ArrayBufferView], position: Double): js.Promise[WriteVResult] = js.native
  }
}
