package typings
package nodeLib.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", JSImport.Namespace)
@js.native
object fsModMembers extends js.Object {
  /**
       * Asynchronously tests a user's permissions for the file specified by path.
       * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def access(path: PathLike, callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]): scala.Unit = js.native
  /**
       * Asynchronously tests a user's permissions for the file specified by path.
       * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def access(
    path: PathLike,
    mode: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously tests a user's permissions for the file specified by path.
       * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def access(
    path: PathLike,
    mode: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronously tests a user's permissions for the file specified by path.
       * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def accessSync(path: PathLike): scala.Unit = js.native
  /**
       * Synchronously tests a user's permissions for the file specified by path.
       * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def accessSync(path: PathLike, mode: scala.Double): scala.Unit = js.native
  /**
       * Asynchronously append data to a file, creating the file if it does not exist.
       * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
       */
  def appendFile(
    file: PathLike,
    data: js.Any,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously append data to a file, creating the file if it does not exist.
       * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
       * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `mode` is not supplied, the default of `0o666` is used.
       * If `mode` is a string, it is parsed as an octal integer.
       * If `flag` is not supplied, the default of `'a'` is used.
       */
  def appendFile(
    file: PathLike,
    data: js.Any,
    options: WriteFileOptions,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously append data to a file, creating the file if it does not exist.
       * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
       */
  def appendFile(
    file: scala.Double,
    data: js.Any,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously append data to a file, creating the file if it does not exist.
       * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
       * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `mode` is not supplied, the default of `0o666` is used.
       * If `mode` is a string, it is parsed as an octal integer.
       * If `flag` is not supplied, the default of `'a'` is used.
       */
  def appendFile(
    file: scala.Double,
    data: js.Any,
    options: WriteFileOptions,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronously append data to a file, creating the file if it does not exist.
       * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
       * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `mode` is not supplied, the default of `0o666` is used.
       * If `mode` is a string, it is parsed as an octal integer.
       * If `flag` is not supplied, the default of `'a'` is used.
       */
  def appendFileSync(file: PathLike, data: js.Any): scala.Unit = js.native
  /**
       * Synchronously append data to a file, creating the file if it does not exist.
       * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
       * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `mode` is not supplied, the default of `0o666` is used.
       * If `mode` is a string, it is parsed as an octal integer.
       * If `flag` is not supplied, the default of `'a'` is used.
       */
  def appendFileSync(file: PathLike, data: js.Any, options: WriteFileOptions): scala.Unit = js.native
  /**
       * Synchronously append data to a file, creating the file if it does not exist.
       * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
       * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `mode` is not supplied, the default of `0o666` is used.
       * If `mode` is a string, it is parsed as an octal integer.
       * If `flag` is not supplied, the default of `'a'` is used.
       */
  def appendFileSync(file: scala.Double, data: js.Any): scala.Unit = js.native
  /**
       * Synchronously append data to a file, creating the file if it does not exist.
       * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
       * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `mode` is not supplied, the default of `0o666` is used.
       * If `mode` is a string, it is parsed as an octal integer.
       * If `flag` is not supplied, the default of `'a'` is used.
       */
  def appendFileSync(file: scala.Double, data: js.Any, options: WriteFileOptions): scala.Unit = js.native
  /**
       * Asynchronous chmod(2) - Change permissions of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
       */
  def chmod(
    path: PathLike,
    mode: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous chmod(2) - Change permissions of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
       */
  def chmod(
    path: PathLike,
    mode: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronous chmod(2) - Change permissions of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
       */
  def chmodSync(path: PathLike, mode: java.lang.String): scala.Unit = js.native
  /**
       * Synchronous chmod(2) - Change permissions of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
       */
  def chmodSync(path: PathLike, mode: scala.Double): scala.Unit = js.native
  /**
       * Asynchronous chown(2) - Change ownership of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def chown(
    path: PathLike,
    uid: scala.Double,
    gid: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronous chown(2) - Change ownership of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def chownSync(path: PathLike, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  /**
       * Asynchronous close(2) - close a file descriptor.
       * @param fd A file descriptor.
       */
  def close(fd: scala.Double, callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]): scala.Unit = js.native
  /**
       * Synchronous close(2) - close a file descriptor.
       * @param fd A file descriptor.
       */
  def closeSync(fd: scala.Double): scala.Unit = js.native
  /**
       * Asynchronously copies src to dest. By default, dest is overwritten if it already exists.
       * No arguments other than a possible exception are given to the callback function.
       * Node.js makes no guarantees about the atomicity of the copy operation.
       * If an error occurs after the destination file has been opened for writing, Node.js will attempt
       * to remove the destination.
       * @param src A path to the source file.
       * @param dest A path to the destination file.
       */
  def copyFile(
    src: PathLike,
    dest: PathLike,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously copies src to dest. By default, dest is overwritten if it already exists.
       * No arguments other than a possible exception are given to the callback function.
       * Node.js makes no guarantees about the atomicity of the copy operation.
       * If an error occurs after the destination file has been opened for writing, Node.js will attempt
       * to remove the destination.
       * @param src A path to the source file.
       * @param dest A path to the destination file.
       * @param flags An integer that specifies the behavior of the copy operation. The only supported flag is fs.constants.COPYFILE_EXCL, which causes the copy operation to fail if dest already exists.
       */
  def copyFile(
    src: PathLike,
    dest: PathLike,
    flags: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronously copies src to dest. By default, dest is overwritten if it already exists.
       * Node.js makes no guarantees about the atomicity of the copy operation.
       * If an error occurs after the destination file has been opened for writing, Node.js will attempt
       * to remove the destination.
       * @param src A path to the source file.
       * @param dest A path to the destination file.
       * @param flags An optional integer that specifies the behavior of the copy operation.
       * The only supported flag is fs.constants.COPYFILE_EXCL, which causes the copy operation to fail if dest already exists.
       */
  def copyFileSync(src: PathLike, dest: PathLike): scala.Unit = js.native
  /**
       * Synchronously copies src to dest. By default, dest is overwritten if it already exists.
       * Node.js makes no guarantees about the atomicity of the copy operation.
       * If an error occurs after the destination file has been opened for writing, Node.js will attempt
       * to remove the destination.
       * @param src A path to the source file.
       * @param dest A path to the destination file.
       * @param flags An optional integer that specifies the behavior of the copy operation.
       * The only supported flag is fs.constants.COPYFILE_EXCL, which causes the copy operation to fail if dest already exists.
       */
  def copyFileSync(src: PathLike, dest: PathLike, flags: scala.Double): scala.Unit = js.native
  /**
       * Returns a new `ReadStream` object.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def createReadStream(path: PathLike): ReadStream = js.native
  /**
       * Returns a new `ReadStream` object.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def createReadStream(path: PathLike, options: java.lang.String): ReadStream = js.native
  /**
       * Returns a new `ReadStream` object.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def createReadStream(path: PathLike, options: nodeLib.Anon_AutoClose): ReadStream = js.native
  /**
       * Returns a new `WriteStream` object.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def createWriteStream(path: PathLike): WriteStream = js.native
  /**
       * Returns a new `WriteStream` object.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def createWriteStream(path: PathLike, options: java.lang.String): WriteStream = js.native
  /**
       * Returns a new `WriteStream` object.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def createWriteStream(path: PathLike, options: nodeLib.Anon_AutoCloseFlags): WriteStream = js.native
  /**
       * Asynchronously tests whether or not the given path exists by checking with the file system.
       * @deprecated
       * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def exists(path: PathLike, callback: js.Function1[/* exists */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  /**
       * Synchronously tests whether or not the given path exists by checking with the file system.
       * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def existsSync(path: PathLike): scala.Boolean = js.native
  /**
       * Asynchronous fchmod(2) - Change permissions of a file.
       * @param fd A file descriptor.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
       */
  def fchmod(
    fd: scala.Double,
    mode: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous fchmod(2) - Change permissions of a file.
       * @param fd A file descriptor.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
       */
  def fchmod(
    fd: scala.Double,
    mode: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronous fchmod(2) - Change permissions of a file.
       * @param fd A file descriptor.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
       */
  def fchmodSync(fd: scala.Double, mode: java.lang.String): scala.Unit = js.native
  /**
       * Synchronous fchmod(2) - Change permissions of a file.
       * @param fd A file descriptor.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
       */
  def fchmodSync(fd: scala.Double, mode: scala.Double): scala.Unit = js.native
  /**
       * Asynchronous fchown(2) - Change ownership of a file.
       * @param fd A file descriptor.
       */
  def fchown(
    fd: scala.Double,
    uid: scala.Double,
    gid: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronous fchown(2) - Change ownership of a file.
       * @param fd A file descriptor.
       */
  def fchownSync(fd: scala.Double, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  /**
       * Asynchronous fdatasync(2) - synchronize a file's in-core state with storage device.
       * @param fd A file descriptor.
       */
  def fdatasync(fd: scala.Double, callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]): scala.Unit = js.native
  /**
       * Synchronous fdatasync(2) - synchronize a file's in-core state with storage device.
       * @param fd A file descriptor.
       */
  def fdatasyncSync(fd: scala.Double): scala.Unit = js.native
  /**
       * Asynchronous fstat(2) - Get file status.
       * @param fd A file descriptor.
       */
  def fstat(
    fd: scala.Double,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* stats */ Stats, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronous fstat(2) - Get file status.
       * @param fd A file descriptor.
       */
  def fstatSync(fd: scala.Double): Stats = js.native
  /**
       * Asynchronous fsync(2) - synchronize a file's in-core state with the underlying storage device.
       * @param fd A file descriptor.
       */
  def fsync(fd: scala.Double, callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]): scala.Unit = js.native
  /**
       * Synchronous fsync(2) - synchronize a file's in-core state with the underlying storage device.
       * @param fd A file descriptor.
       */
  def fsyncSync(fd: scala.Double): scala.Unit = js.native
  /**
       * Asynchronous ftruncate(2) - Truncate a file to a specified length.
       * @param fd A file descriptor.
       */
  def ftruncate(fd: scala.Double, callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]): scala.Unit = js.native
  /**
       * Asynchronous ftruncate(2) - Truncate a file to a specified length.
       * @param fd A file descriptor.
       * @param len If not specified, defaults to `0`.
       */
  def ftruncate(
    fd: scala.Double,
    len: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous ftruncate(2) - Truncate a file to a specified length.
       * @param fd A file descriptor.
       * @param len If not specified, defaults to `0`.
       */
  def ftruncate(
    fd: scala.Double,
    len: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous ftruncate(2) - Truncate a file to a specified length.
       * @param fd A file descriptor.
       * @param len If not specified, defaults to `0`.
       */
  def ftruncate(
    fd: scala.Double,
    len: scala.Null,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronous ftruncate(2) - Truncate a file to a specified length.
       * @param fd A file descriptor.
       * @param len If not specified, defaults to `0`.
       */
  def ftruncateSync(fd: scala.Double): scala.Unit = js.native
  /**
       * Synchronous ftruncate(2) - Truncate a file to a specified length.
       * @param fd A file descriptor.
       * @param len If not specified, defaults to `0`.
       */
  def ftruncateSync(fd: scala.Double, len: scala.Double): scala.Unit = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimes(
    fd: scala.Double,
    atime: java.lang.String,
    mtime: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimes(
    fd: scala.Double,
    atime: java.lang.String,
    mtime: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimes(
    fd: scala.Double,
    atime: java.lang.String,
    mtime: stdLib.Date,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimes(
    fd: scala.Double,
    atime: scala.Double,
    mtime: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimes(
    fd: scala.Double,
    atime: scala.Double,
    mtime: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimes(
    fd: scala.Double,
    atime: scala.Double,
    mtime: stdLib.Date,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimes(
    fd: scala.Double,
    atime: stdLib.Date,
    mtime: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimes(
    fd: scala.Double,
    atime: stdLib.Date,
    mtime: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimes(
    fd: scala.Double,
    atime: stdLib.Date,
    mtime: stdLib.Date,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimesSync(fd: scala.Double, atime: java.lang.String, mtime: java.lang.String): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimesSync(fd: scala.Double, atime: java.lang.String, mtime: scala.Double): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimesSync(fd: scala.Double, atime: java.lang.String, mtime: stdLib.Date): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimesSync(fd: scala.Double, atime: scala.Double, mtime: java.lang.String): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimesSync(fd: scala.Double, atime: scala.Double, mtime: scala.Double): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimesSync(fd: scala.Double, atime: scala.Double, mtime: stdLib.Date): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimesSync(fd: scala.Double, atime: stdLib.Date, mtime: java.lang.String): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimesSync(fd: scala.Double, atime: stdLib.Date, mtime: scala.Double): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimesSync(fd: scala.Double, atime: stdLib.Date, mtime: stdLib.Date): scala.Unit = js.native
  /**
       * Asynchronous lchmod(2) - Change permissions of a file. Does not dereference symbolic links.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
       */
  def lchmod(
    path: PathLike,
    mode: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous lchmod(2) - Change permissions of a file. Does not dereference symbolic links.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
       */
  def lchmod(
    path: PathLike,
    mode: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronous lchmod(2) - Change permissions of a file. Does not dereference symbolic links.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
       */
  def lchmodSync(path: PathLike, mode: java.lang.String): scala.Unit = js.native
  /**
       * Synchronous lchmod(2) - Change permissions of a file. Does not dereference symbolic links.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
       */
  def lchmodSync(path: PathLike, mode: scala.Double): scala.Unit = js.native
  /**
       * Asynchronous lchown(2) - Change ownership of a file. Does not dereference symbolic links.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def lchown(
    path: PathLike,
    uid: scala.Double,
    gid: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronous lchown(2) - Change ownership of a file. Does not dereference symbolic links.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def lchownSync(path: PathLike, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  /**
       * Asynchronous link(2) - Create a new link (also known as a hard link) to an existing file.
       * @param existingPath A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def link(
    existingPath: PathLike,
    newPath: PathLike,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronous link(2) - Create a new link (also known as a hard link) to an existing file.
       * @param existingPath A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def linkSync(existingPath: PathLike, newPath: PathLike): scala.Unit = js.native
  /**
       * Asynchronous lstat(2) - Get file status. Does not dereference symbolic links.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def lstat(
    path: PathLike,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* stats */ Stats, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronous lstat(2) - Get file status. Does not dereference symbolic links.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def lstatSync(path: PathLike): Stats = js.native
  /**
       * Asynchronous mkdir(2) - create a directory with a mode of `0o777`.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def mkdir(path: PathLike, callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]): scala.Unit = js.native
  /**
       * Asynchronous mkdir(2) - create a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
       * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
       */
  def mkdir(
    path: PathLike,
    options: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous mkdir(2) - create a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
       * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
       */
  def mkdir(
    path: PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous mkdir(2) - create a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
       * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
       */
  def mkdir(
    path: PathLike,
    options: MakeDirectoryOptions,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous mkdir(2) - create a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
       * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
       */
  def mkdir(
    path: PathLike,
    options: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous mkdir(2) - create a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
       * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
       */
  def mkdir(
    path: PathLike,
    options: scala.Null,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronous mkdir(2) - create a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
       * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
       */
  def mkdirSync(path: PathLike): scala.Unit = js.native
  /**
       * Synchronous mkdir(2) - create a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
       * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
       */
  def mkdirSync(path: PathLike, options: java.lang.String): scala.Unit = js.native
  /**
       * Synchronous mkdir(2) - create a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
       * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
       */
  def mkdirSync(path: PathLike, options: MakeDirectoryOptions): scala.Unit = js.native
  /**
       * Synchronous mkdir(2) - create a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
       * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
       */
  def mkdirSync(path: PathLike, options: scala.Double): scala.Unit = js.native
  /**
       * Asynchronously creates a unique temporary directory.
       * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
       */
  def mkdtemp(
    prefix: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* folder */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously creates a unique temporary directory.
       * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def mkdtemp(
    prefix: java.lang.String,
    options: nodeLib.BufferEncoding | js.UndefOr[scala.Nothing],
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      nodeLib.Buffer | (/* folder */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously creates a unique temporary directory.
       * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def mkdtemp(
    prefix: java.lang.String,
    options: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* folder */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously creates a unique temporary directory.
       * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def mkdtemp(
    prefix: java.lang.String,
    options: nodeLib.Anon_EncodingBufferEncodingNull,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* folder */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously creates a unique temporary directory.
       * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def mkdtemp(
    prefix: java.lang.String,
    options: nodeLib.Anon_EncodingBuffer_1560675869,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* folder */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously creates a unique temporary directory.
       * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def mkdtemp(
    prefix: java.lang.String,
    options: nodeLib.Anon_EncodingStringNull,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* folder */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously creates a unique temporary directory.
       * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def mkdtemp(
    prefix: java.lang.String,
    options: scala.Null,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      nodeLib.Buffer | (/* folder */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Synchronously creates a unique temporary directory.
       * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def mkdtempSync(prefix: java.lang.String): java.lang.String | nodeLib.Buffer = js.native
  /**
       * Synchronously creates a unique temporary directory.
       * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def mkdtempSync(prefix: java.lang.String, options: java.lang.String): java.lang.String | nodeLib.Buffer = js.native
  /**
       * Synchronously creates a unique temporary directory.
       * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def mkdtempSync(prefix: java.lang.String, options: nodeLib.Anon_EncodingBufferEncodingNull): java.lang.String = js.native
  /**
       * Synchronously creates a unique temporary directory.
       * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def mkdtempSync(prefix: java.lang.String, options: nodeLib.Anon_EncodingBuffer_1560675869): nodeLib.Buffer = js.native
  /**
       * Synchronously creates a unique temporary directory.
       * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def mkdtempSync(prefix: java.lang.String, options: nodeLib.Anon_EncodingStringNull): java.lang.String | nodeLib.Buffer = js.native
  /**
       * Synchronously creates a unique temporary directory.
       * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def mkdtempSync(prefix: java.lang.String, options: nodeLib.BufferEncoding): java.lang.String = js.native
  /**
       * Synchronously creates a unique temporary directory.
       * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  @JSName("mkdtempSync")
  def mkdtempSync_String(prefix: java.lang.String): java.lang.String = js.native
  /**
       * Synchronously creates a unique temporary directory.
       * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  @JSName("mkdtempSync")
  def mkdtempSync_buffer(prefix: java.lang.String, options: nodeLib.nodeLibStrings.buffer): nodeLib.Buffer = js.native
  /**
       * Asynchronously creates a unique temporary directory.
       * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  @JSName("mkdtemp")
  def mkdtemp_buffer(
    prefix: java.lang.String,
    options: nodeLib.nodeLibStrings.buffer,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* folder */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous open(2) - open and possibly create a file. If the file is created, its mode will be `0o666`.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def open(
    path: PathLike,
    flags: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* fd */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous open(2) - open and possibly create a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
       */
  def open(
    path: PathLike,
    flags: java.lang.String,
    mode: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* fd */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous open(2) - open and possibly create a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
       */
  def open(
    path: PathLike,
    flags: java.lang.String,
    mode: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* fd */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous open(2) - open and possibly create a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
       */
  def open(
    path: PathLike,
    flags: java.lang.String,
    mode: scala.Double,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* fd */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous open(2) - open and possibly create a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
       */
  def open(
    path: PathLike,
    flags: java.lang.String,
    mode: scala.Null,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* fd */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous open(2) - open and possibly create a file. If the file is created, its mode will be `0o666`.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def open(
    path: PathLike,
    flags: scala.Double,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* fd */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous open(2) - open and possibly create a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
       */
  def open(
    path: PathLike,
    flags: scala.Double,
    mode: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* fd */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous open(2) - open and possibly create a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
       */
  def open(
    path: PathLike,
    flags: scala.Double,
    mode: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* fd */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous open(2) - open and possibly create a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
       */
  def open(
    path: PathLike,
    flags: scala.Double,
    mode: scala.Double,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* fd */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous open(2) - open and possibly create a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
       */
  def open(
    path: PathLike,
    flags: scala.Double,
    mode: scala.Null,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* fd */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronous open(2) - open and possibly create a file, returning a file descriptor..
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
       */
  def openSync(path: PathLike, flags: java.lang.String): scala.Double = js.native
  /**
       * Synchronous open(2) - open and possibly create a file, returning a file descriptor..
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
       */
  def openSync(path: PathLike, flags: java.lang.String, mode: java.lang.String): scala.Double = js.native
  /**
       * Synchronous open(2) - open and possibly create a file, returning a file descriptor..
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
       */
  def openSync(path: PathLike, flags: java.lang.String, mode: scala.Double): scala.Double = js.native
  /**
       * Synchronous open(2) - open and possibly create a file, returning a file descriptor..
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
       */
  def openSync(path: PathLike, flags: scala.Double): scala.Double = js.native
  /**
       * Synchronous open(2) - open and possibly create a file, returning a file descriptor..
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
       */
  def openSync(path: PathLike, flags: scala.Double, mode: java.lang.String): scala.Double = js.native
  /**
       * Synchronous open(2) - open and possibly create a file, returning a file descriptor..
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
       */
  def openSync(path: PathLike, flags: scala.Double, mode: scala.Double): scala.Double = js.native
  /**
       * Asynchronously reads data from the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param buffer The buffer that the data will be written to.
       * @param offset The offset in the buffer at which to start writing.
       * @param length The number of bytes to read.
       * @param position The offset from the beginning of the file from which data should be read. If `null`, data will be read from the current position.
       */
  def read[TBuffer /* <: BinaryData */](fd: scala.Double, buffer: TBuffer, offset: scala.Double, length: scala.Double): scala.Unit = js.native
  /**
       * Asynchronously reads data from the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param buffer The buffer that the data will be written to.
       * @param offset The offset in the buffer at which to start writing.
       * @param length The number of bytes to read.
       * @param position The offset from the beginning of the file from which data should be read. If `null`, data will be read from the current position.
       */
  def read[TBuffer /* <: BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): scala.Unit = js.native
  /**
       * Asynchronously reads data from the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param buffer The buffer that the data will be written to.
       * @param offset The offset in the buffer at which to start writing.
       * @param length The number of bytes to read.
       * @param position The offset from the beginning of the file from which data should be read. If `null`, data will be read from the current position.
       */
  def read[TBuffer /* <: BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* bytesRead */ scala.Double, 
      /* buffer */ TBuffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously reads data from the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param buffer The buffer that the data will be written to.
       * @param offset The offset in the buffer at which to start writing.
       * @param length The number of bytes to read.
       * @param position The offset from the beginning of the file from which data should be read. If `null`, data will be read from the current position.
       */
  def read[TBuffer /* <: BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* bytesRead */ scala.Double, 
      /* buffer */ TBuffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       */
  def readFile(
    path: PathLike,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFile(
    path: PathLike,
    options: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      nodeLib.Buffer | (/* data */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options An object that may contain an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFile(
    path: PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      (/* data */ nodeLib.Buffer) | java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFile(
    path: PathLike,
    options: nodeLib.Anon_EncodingFlagStringNull,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* data */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFile(
    path: PathLike,
    options: nodeLib.Anon_EncodingFlagString,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options An object that may contain an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFile(
    path: PathLike,
    options: nodeLib.Anon_EncodingFlag,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options An object that may contain an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFile(
    path: PathLike,
    options: scala.Null,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      (/* data */ nodeLib.Buffer) | java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       */
  def readFile(
    path: scala.Double,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFile(
    path: scala.Double,
    options: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      nodeLib.Buffer | (/* data */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options An object that may contain an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFile(
    path: scala.Double,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      (/* data */ nodeLib.Buffer) | java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFile(
    path: scala.Double,
    options: nodeLib.Anon_EncodingFlagStringNull,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* data */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFile(
    path: scala.Double,
    options: nodeLib.Anon_EncodingFlagString,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options An object that may contain an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFile(
    path: scala.Double,
    options: nodeLib.Anon_EncodingFlag,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options An object that may contain an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFile(
    path: scala.Double,
    options: scala.Null,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      (/* data */ nodeLib.Buffer) | java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Synchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFileSync(path: PathLike): java.lang.String | nodeLib.Buffer = js.native
  /**
       * Synchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFileSync(path: PathLike, options: java.lang.String): java.lang.String | nodeLib.Buffer = js.native
  /**
       * Synchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options An object that may contain an optional flag. If a flag is not provided, it defaults to `'r'`.
       */
  def readFileSync(path: PathLike, options: nodeLib.Anon_EncodingFlag): nodeLib.Buffer = js.native
  /**
       * Synchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFileSync(path: PathLike, options: nodeLib.Anon_EncodingFlagString): java.lang.String = js.native
  /**
       * Synchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFileSync(path: PathLike, options: nodeLib.Anon_EncodingFlagStringNull): java.lang.String | nodeLib.Buffer = js.native
  /**
       * Synchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFileSync(path: scala.Double): java.lang.String | nodeLib.Buffer = js.native
  /**
       * Synchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFileSync(path: scala.Double, options: java.lang.String): java.lang.String | nodeLib.Buffer = js.native
  /**
       * Synchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options An object that may contain an optional flag. If a flag is not provided, it defaults to `'r'`.
       */
  def readFileSync(path: scala.Double, options: nodeLib.Anon_EncodingFlag): nodeLib.Buffer = js.native
  /**
       * Synchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFileSync(path: scala.Double, options: nodeLib.Anon_EncodingFlagString): java.lang.String = js.native
  /**
       * Synchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFileSync(path: scala.Double, options: nodeLib.Anon_EncodingFlagStringNull): java.lang.String | nodeLib.Buffer = js.native
  /**
       * Synchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options An object that may contain an optional flag. If a flag is not provided, it defaults to `'r'`.
       */
  @JSName("readFileSync")
  def readFileSync_Buffer(path: PathLike): nodeLib.Buffer = js.native
  /**
       * Synchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options An object that may contain an optional flag. If a flag is not provided, it defaults to `'r'`.
       */
  @JSName("readFileSync")
  def readFileSync_Buffer(path: scala.Double): nodeLib.Buffer = js.native
  /**
       * Synchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  @JSName("readFileSync")
  def readFileSync_String(path: PathLike, options: java.lang.String): java.lang.String = js.native
  /**
       * Synchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  @JSName("readFileSync")
  def readFileSync_String(path: scala.Double, options: java.lang.String): java.lang.String = js.native
  /**
       * Synchronously reads data from the file referenced by the supplied file descriptor, returning the number of bytes read.
       * @param fd A file descriptor.
       * @param buffer The buffer that the data will be written to.
       * @param offset The offset in the buffer at which to start writing.
       * @param length The number of bytes to read.
       * @param position The offset from the beginning of the file from which data should be read. If `null`, data will be read from the current position.
       */
  def readSync(fd: scala.Double, buffer: BinaryData, offset: scala.Double, length: scala.Double): scala.Double = js.native
  /**
       * Synchronously reads data from the file referenced by the supplied file descriptor, returning the number of bytes read.
       * @param fd A file descriptor.
       * @param buffer The buffer that the data will be written to.
       * @param offset The offset in the buffer at which to start writing.
       * @param length The number of bytes to read.
       * @param position The offset from the beginning of the file from which data should be read. If `null`, data will be read from the current position.
       */
  def readSync(
    fd: scala.Double,
    buffer: BinaryData,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): scala.Double = js.native
  /**
       * Asynchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def readdir(
    path: PathLike,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* files */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readdir(
    path: PathLike,
    options: nodeLib.BufferEncoding | js.UndefOr[scala.Nothing],
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      (/* files */ js.Array[java.lang.String]) | js.Array[nodeLib.Buffer], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readdir(
    path: PathLike,
    options: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* files */ js.Array[java.lang.String] | js.Array[nodeLib.Buffer], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readdir(
    path: PathLike,
    options: nodeLib.Anon_WithFileTypesFalseEncoding,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* files */ js.Array[java.lang.String] | js.Array[nodeLib.Buffer], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readdir(
    path: PathLike,
    options: nodeLib.Anon_WithFileTypesFalse,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* files */ js.Array[nodeLib.Buffer], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options If called with `withFileTypes: true` the result data will be an array of Dirent.
       */
  def readdir(
    path: PathLike,
    options: nodeLib.Anon_WithFileTypesTrue,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* files */ js.Array[Dirent], scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readdir(
    path: PathLike,
    options: nodeLib.Anon_WithFileTypes,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* files */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readdir(
    path: PathLike,
    options: scala.Null,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      (/* files */ js.Array[java.lang.String]) | js.Array[nodeLib.Buffer], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Synchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readdirSync(path: PathLike): js.Array[java.lang.String] = js.native
  /**
       * Synchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readdirSync(path: PathLike, options: java.lang.String): js.Array[java.lang.String] | js.Array[nodeLib.Buffer] = js.native
  /**
       * Synchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readdirSync(path: PathLike, options: nodeLib.Anon_WithFileTypes): js.Array[java.lang.String] = js.native
  /**
       * Synchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readdirSync(path: PathLike, options: nodeLib.Anon_WithFileTypesFalse): js.Array[nodeLib.Buffer] = js.native
  /**
       * Synchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readdirSync(path: PathLike, options: nodeLib.Anon_WithFileTypesFalseEncoding): js.Array[java.lang.String] | js.Array[nodeLib.Buffer] = js.native
  /**
       * Asynchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options If called with `withFileTypes: true` the result data will be an array of Dirent.
       */
  def readdirSync(path: PathLike, options: nodeLib.Anon_WithFileTypesTrue): js.Array[Dirent] = js.native
  /**
       * Synchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readdirSync(path: PathLike, options: nodeLib.BufferEncoding): js.Array[java.lang.String] = js.native
  /**
       * Synchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  @JSName("readdirSync")
  def `readdirSync_<union>`(path: PathLike): js.Array[java.lang.String] | js.Array[nodeLib.Buffer] = js.native
  /**
       * Synchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  @JSName("readdirSync")
  def readdirSync_buffer(path: PathLike, options: nodeLib.nodeLibStrings.buffer): js.Array[nodeLib.Buffer] = js.native
  /**
       * Asynchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  @JSName("readdir")
  def readdir_buffer(
    path: PathLike,
    options: nodeLib.nodeLibStrings.buffer,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* files */ js.Array[nodeLib.Buffer], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous readlink(2) - read value of a symbolic link.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def readlink(
    path: PathLike,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* linkString */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous readlink(2) - read value of a symbolic link.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readlink(
    path: PathLike,
    options: nodeLib.BufferEncoding | js.UndefOr[scala.Nothing],
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      nodeLib.Buffer | (/* linkString */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous readlink(2) - read value of a symbolic link.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readlink(
    path: PathLike,
    options: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* linkString */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous readlink(2) - read value of a symbolic link.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readlink(
    path: PathLike,
    options: nodeLib.Anon_EncodingBufferEncodingNull,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* linkString */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous readlink(2) - read value of a symbolic link.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readlink(
    path: PathLike,
    options: nodeLib.Anon_EncodingBuffer_1560675869,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* linkString */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous readlink(2) - read value of a symbolic link.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readlink(
    path: PathLike,
    options: nodeLib.Anon_EncodingStringNull,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* linkString */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous readlink(2) - read value of a symbolic link.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readlink(
    path: PathLike,
    options: scala.Null,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      nodeLib.Buffer | (/* linkString */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Synchronous readlink(2) - read value of a symbolic link.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readlinkSync(path: PathLike): java.lang.String | nodeLib.Buffer = js.native
  /**
       * Synchronous readlink(2) - read value of a symbolic link.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readlinkSync(path: PathLike, options: java.lang.String): java.lang.String | nodeLib.Buffer = js.native
  /**
       * Synchronous readlink(2) - read value of a symbolic link.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readlinkSync(path: PathLike, options: nodeLib.Anon_EncodingBufferEncodingNull): java.lang.String = js.native
  /**
       * Synchronous readlink(2) - read value of a symbolic link.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readlinkSync(path: PathLike, options: nodeLib.Anon_EncodingBuffer_1560675869): nodeLib.Buffer = js.native
  /**
       * Synchronous readlink(2) - read value of a symbolic link.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readlinkSync(path: PathLike, options: nodeLib.Anon_EncodingStringNull): java.lang.String | nodeLib.Buffer = js.native
  /**
       * Synchronous readlink(2) - read value of a symbolic link.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readlinkSync(path: PathLike, options: nodeLib.BufferEncoding): java.lang.String = js.native
  /**
       * Synchronous readlink(2) - read value of a symbolic link.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  @JSName("readlinkSync")
  def readlinkSync_String(path: PathLike): java.lang.String = js.native
  /**
       * Synchronous readlink(2) - read value of a symbolic link.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  @JSName("readlinkSync")
  def readlinkSync_buffer(path: PathLike, options: nodeLib.nodeLibStrings.buffer): nodeLib.Buffer = js.native
  /**
       * Asynchronous readlink(2) - read value of a symbolic link.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  @JSName("readlink")
  def readlink_buffer(
    path: PathLike,
    options: nodeLib.nodeLibStrings.buffer,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* linkString */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous realpath(3) - return the canonicalized absolute pathname.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def realpath(
    path: PathLike,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* resolvedPath */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous realpath(3) - return the canonicalized absolute pathname.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def realpath(
    path: PathLike,
    options: nodeLib.BufferEncoding | js.UndefOr[scala.Nothing],
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      nodeLib.Buffer | (/* resolvedPath */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous realpath(3) - return the canonicalized absolute pathname.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def realpath(
    path: PathLike,
    options: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* resolvedPath */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous realpath(3) - return the canonicalized absolute pathname.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def realpath(
    path: PathLike,
    options: nodeLib.Anon_EncodingBufferEncodingNull,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* resolvedPath */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous realpath(3) - return the canonicalized absolute pathname.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def realpath(
    path: PathLike,
    options: nodeLib.Anon_EncodingBuffer_1560675869,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* resolvedPath */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous realpath(3) - return the canonicalized absolute pathname.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def realpath(
    path: PathLike,
    options: nodeLib.Anon_EncodingStringNull,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* resolvedPath */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous realpath(3) - return the canonicalized absolute pathname.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def realpath(
    path: PathLike,
    options: scala.Null,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      nodeLib.Buffer | (/* resolvedPath */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Synchronous realpath(3) - return the canonicalized absolute pathname.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def realpathSync(path: PathLike): java.lang.String | nodeLib.Buffer = js.native
  /**
       * Synchronous realpath(3) - return the canonicalized absolute pathname.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def realpathSync(path: PathLike, options: java.lang.String): java.lang.String | nodeLib.Buffer = js.native
  /**
       * Synchronous realpath(3) - return the canonicalized absolute pathname.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def realpathSync(path: PathLike, options: nodeLib.Anon_EncodingBufferEncodingNull): java.lang.String = js.native
  /**
       * Synchronous realpath(3) - return the canonicalized absolute pathname.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def realpathSync(path: PathLike, options: nodeLib.Anon_EncodingBuffer_1560675869): nodeLib.Buffer = js.native
  /**
       * Synchronous realpath(3) - return the canonicalized absolute pathname.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def realpathSync(path: PathLike, options: nodeLib.Anon_EncodingStringNull): java.lang.String | nodeLib.Buffer = js.native
  /**
       * Synchronous realpath(3) - return the canonicalized absolute pathname.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def realpathSync(path: PathLike, options: nodeLib.BufferEncoding): java.lang.String = js.native
  /**
       * Synchronous realpath(3) - return the canonicalized absolute pathname.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  @JSName("realpathSync")
  def realpathSync_String(path: PathLike): java.lang.String = js.native
  /**
       * Synchronous realpath(3) - return the canonicalized absolute pathname.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  @JSName("realpathSync")
  def realpathSync_buffer(path: PathLike, options: nodeLib.nodeLibStrings.buffer): nodeLib.Buffer = js.native
  /**
       * Asynchronous realpath(3) - return the canonicalized absolute pathname.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  @JSName("realpath")
  def realpath_buffer(
    path: PathLike,
    options: nodeLib.nodeLibStrings.buffer,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* resolvedPath */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous rename(2) - Change the name or location of a file or directory.
       * @param oldPath A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def rename(
    oldPath: PathLike,
    newPath: PathLike,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronous rename(2) - Change the name or location of a file or directory.
       * @param oldPath A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def renameSync(oldPath: PathLike, newPath: PathLike): scala.Unit = js.native
  /**
       * Asynchronous rmdir(2) - delete a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def rmdir(path: PathLike, callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]): scala.Unit = js.native
  /**
       * Synchronous rmdir(2) - delete a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def rmdirSync(path: PathLike): scala.Unit = js.native
  /**
       * Asynchronous stat(2) - Get file status.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def stat(
    path: PathLike,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* stats */ Stats, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronous stat(2) - Get file status.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def statSync(path: PathLike): Stats = js.native
  /**
       * Asynchronous symlink(2) - Create a new symbolic link to an existing file.
       * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
       * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
       */
  def symlink(
    target: PathLike,
    path: PathLike,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous symlink(2) - Create a new symbolic link to an existing file.
       * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
       * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
       * @param type May be set to `'dir'`, `'file'`, or `'junction'` (default is `'file'`) and is only available on Windows (ignored on other platforms).
       * When using `'junction'`, the `target` argument will automatically be normalized to an absolute path.
       */
  def symlink(
    target: PathLike,
    path: PathLike,
    `type`: nodeLib.fsMod.symlinkNs.Type | js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous symlink(2) - Create a new symbolic link to an existing file.
       * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
       * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
       * @param type May be set to `'dir'`, `'file'`, or `'junction'` (default is `'file'`) and is only available on Windows (ignored on other platforms).
       * When using `'junction'`, the `target` argument will automatically be normalized to an absolute path.
       */
  def symlink(
    target: PathLike,
    path: PathLike,
    `type`: scala.Null,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronous symlink(2) - Create a new symbolic link to an existing file.
       * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
       * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
       * @param type May be set to `'dir'`, `'file'`, or `'junction'` (default is `'file'`) and is only available on Windows (ignored on other platforms).
       * When using `'junction'`, the `target` argument will automatically be normalized to an absolute path.
       */
  def symlinkSync(target: PathLike, path: PathLike): scala.Unit = js.native
  /**
       * Synchronous symlink(2) - Create a new symbolic link to an existing file.
       * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
       * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
       * @param type May be set to `'dir'`, `'file'`, or `'junction'` (default is `'file'`) and is only available on Windows (ignored on other platforms).
       * When using `'junction'`, the `target` argument will automatically be normalized to an absolute path.
       */
  def symlinkSync(target: PathLike, path: PathLike, `type`: nodeLib.fsMod.symlinkNs.Type): scala.Unit = js.native
  /**
       * Asynchronous truncate(2) - Truncate a file to a specified length.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def truncate(path: PathLike, callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]): scala.Unit = js.native
  /**
       * Asynchronous truncate(2) - Truncate a file to a specified length.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param len If not specified, defaults to `0`.
       */
  def truncate(
    path: PathLike,
    len: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous truncate(2) - Truncate a file to a specified length.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param len If not specified, defaults to `0`.
       */
  def truncate(
    path: PathLike,
    len: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous truncate(2) - Truncate a file to a specified length.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param len If not specified, defaults to `0`.
       */
  def truncate(
    path: PathLike,
    len: scala.Null,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronous truncate(2) - Truncate a file to a specified length.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param len If not specified, defaults to `0`.
       */
  def truncateSync(path: PathLike): scala.Unit = js.native
  /**
       * Synchronous truncate(2) - Truncate a file to a specified length.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param len If not specified, defaults to `0`.
       */
  def truncateSync(path: PathLike, len: scala.Double): scala.Unit = js.native
  /**
       * Asynchronous unlink(2) - delete a name and possibly the file it refers to.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def unlink(path: PathLike, callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]): scala.Unit = js.native
  /**
       * Synchronous unlink(2) - delete a name and possibly the file it refers to.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def unlinkSync(path: PathLike): scala.Unit = js.native
  /**
       * Stop watching for changes on `filename`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def unwatchFile(filename: PathLike): scala.Unit = js.native
  /**
       * Stop watching for changes on `filename`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def unwatchFile(filename: PathLike, listener: js.Function2[/* curr */ Stats, /* prev */ Stats, scala.Unit]): scala.Unit = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimes(
    path: PathLike,
    atime: java.lang.String,
    mtime: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimes(
    path: PathLike,
    atime: java.lang.String,
    mtime: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimes(
    path: PathLike,
    atime: java.lang.String,
    mtime: stdLib.Date,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimes(
    path: PathLike,
    atime: scala.Double,
    mtime: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimes(
    path: PathLike,
    atime: scala.Double,
    mtime: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimes(
    path: PathLike,
    atime: scala.Double,
    mtime: stdLib.Date,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimes(
    path: PathLike,
    atime: stdLib.Date,
    mtime: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimes(
    path: PathLike,
    atime: stdLib.Date,
    mtime: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimes(
    path: PathLike,
    atime: stdLib.Date,
    mtime: stdLib.Date,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimesSync(path: PathLike, atime: java.lang.String, mtime: java.lang.String): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimesSync(path: PathLike, atime: java.lang.String, mtime: scala.Double): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimesSync(path: PathLike, atime: java.lang.String, mtime: stdLib.Date): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimesSync(path: PathLike, atime: scala.Double, mtime: java.lang.String): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimesSync(path: PathLike, atime: scala.Double, mtime: scala.Double): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimesSync(path: PathLike, atime: scala.Double, mtime: stdLib.Date): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimesSync(path: PathLike, atime: stdLib.Date, mtime: java.lang.String): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimesSync(path: PathLike, atime: stdLib.Date, mtime: scala.Double): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimesSync(path: PathLike, atime: stdLib.Date, mtime: stdLib.Date): scala.Unit = js.native
  /**
       * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `persistent` is not supplied, the default of `true` is used.
       * If `recursive` is not supplied, the default of `false` is used.
       */
  /**
       * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def watch(filename: PathLike): FSWatcher = js.native
  /**
       * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def watch(
    filename: PathLike,
    listener: js.Function2[/* event */ java.lang.String, /* filename */ java.lang.String, _]
  ): FSWatcher = js.native
  /**
       * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `persistent` is not supplied, the default of `true` is used.
       * If `recursive` is not supplied, the default of `false` is used.
       */
  def watch(
    filename: PathLike,
    options: nodeLib.BufferEncoding | js.UndefOr[scala.Nothing],
    listener: js.Function2[/* event */ java.lang.String, /* filename */ java.lang.String, scala.Unit]
  ): FSWatcher = js.native
  /**
       * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `persistent` is not supplied, the default of `true` is used.
       * If `recursive` is not supplied, the default of `false` is used.
       */
  def watch(filename: PathLike, options: java.lang.String): FSWatcher = js.native
  /**
       * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `persistent` is not supplied, the default of `true` is used.
       * If `recursive` is not supplied, the default of `false` is used.
       */
  def watch(
    filename: PathLike,
    options: java.lang.String,
    listener: js.Function2[
      /* event */ java.lang.String, 
      /* filename */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): FSWatcher = js.native
  /**
       * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `persistent` is not supplied, the default of `true` is used.
       * If `recursive` is not supplied, the default of `false` is used.
       */
  def watch(filename: PathLike, options: nodeLib.Anon_Recursive): FSWatcher = js.native
  /**
       * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `persistent` is not supplied, the default of `true` is used.
       * If `recursive` is not supplied, the default of `false` is used.
       */
  def watch(filename: PathLike, options: nodeLib.Anon_RecursivePersistent): FSWatcher = js.native
  /**
       * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `persistent` is not supplied, the default of `true` is used.
       * If `recursive` is not supplied, the default of `false` is used.
       */
  def watch(filename: PathLike, options: nodeLib.Anon_RecursivePersistentEncoding): FSWatcher = js.native
  /**
       * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `persistent` is not supplied, the default of `true` is used.
       * If `recursive` is not supplied, the default of `false` is used.
       */
  def watch(
    filename: PathLike,
    options: nodeLib.Anon_RecursivePersistentEncoding,
    listener: js.Function2[
      /* event */ java.lang.String, 
      /* filename */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): FSWatcher = js.native
  /**
       * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `persistent` is not supplied, the default of `true` is used.
       * If `recursive` is not supplied, the default of `false` is used.
       */
  def watch(
    filename: PathLike,
    options: nodeLib.Anon_RecursivePersistent,
    listener: js.Function2[/* event */ java.lang.String, /* filename */ nodeLib.Buffer, scala.Unit]
  ): FSWatcher = js.native
  /**
       * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `persistent` is not supplied, the default of `true` is used.
       * If `recursive` is not supplied, the default of `false` is used.
       */
  def watch(
    filename: PathLike,
    options: nodeLib.Anon_Recursive,
    listener: js.Function2[/* event */ java.lang.String, /* filename */ java.lang.String, scala.Unit]
  ): FSWatcher = js.native
  /**
       * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `persistent` is not supplied, the default of `true` is used.
       * If `recursive` is not supplied, the default of `false` is used.
       */
  def watch(filename: PathLike, options: nodeLib.BufferEncoding): FSWatcher = js.native
  /**
       * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `persistent` is not supplied, the default of `true` is used.
       * If `recursive` is not supplied, the default of `false` is used.
       */
  def watch(
    filename: PathLike,
    options: scala.Null,
    listener: js.Function2[
      /* event */ java.lang.String, 
      nodeLib.Buffer | (/* filename */ java.lang.String), 
      scala.Unit
    ]
  ): FSWatcher = js.native
  /**
       * Watch for changes on `filename`. The callback `listener` will be called each time the file is accessed.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def watchFile(filename: PathLike, listener: js.Function2[/* curr */ Stats, /* prev */ Stats, scala.Unit]): scala.Unit = js.native
  /**
       * Watch for changes on `filename`. The callback `listener` will be called each time the file is accessed.
       */
  def watchFile(
    filename: PathLike,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[/* curr */ Stats, /* prev */ Stats, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Watch for changes on `filename`. The callback `listener` will be called each time the file is accessed.
       */
  def watchFile(
    filename: PathLike,
    options: nodeLib.Anon_Persistent,
    listener: js.Function2[/* curr */ Stats, /* prev */ Stats, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `persistent` is not supplied, the default of `true` is used.
       * If `recursive` is not supplied, the default of `false` is used.
       */
  @JSName("watch")
  def watch_buffer(filename: PathLike, options: nodeLib.nodeLibStrings.buffer): FSWatcher = js.native
  /**
       * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `persistent` is not supplied, the default of `true` is used.
       * If `recursive` is not supplied, the default of `false` is used.
       */
  @JSName("watch")
  def watch_buffer(
    filename: PathLike,
    options: nodeLib.nodeLibStrings.buffer,
    listener: js.Function2[/* event */ java.lang.String, /* filename */ nodeLib.Buffer, scala.Unit]
  ): FSWatcher = js.native
  /**
       * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       */
  def write(
    fd: scala.Double,
    string: js.Any,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       */
  def write(
    fd: scala.Double,
    string: js.Any,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       * @param encoding The expected string encoding.
       */
  def write(
    fd: scala.Double,
    string: js.Any,
    position: js.UndefOr[scala.Nothing],
    encoding: java.lang.String,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       * @param encoding The expected string encoding.
       */
  def write(
    fd: scala.Double,
    string: js.Any,
    position: js.UndefOr[scala.Nothing],
    encoding: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       * @param encoding The expected string encoding.
       */
  def write(
    fd: scala.Double,
    string: js.Any,
    position: js.UndefOr[scala.Nothing],
    encoding: scala.Null,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       */
  def write(
    fd: scala.Double,
    string: js.Any,
    position: scala.Double,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       * @param encoding The expected string encoding.
       */
  def write(
    fd: scala.Double,
    string: js.Any,
    position: scala.Double,
    encoding: java.lang.String,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       * @param encoding The expected string encoding.
       */
  def write(
    fd: scala.Double,
    string: js.Any,
    position: scala.Double,
    encoding: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       * @param encoding The expected string encoding.
       */
  def write(
    fd: scala.Double,
    string: js.Any,
    position: scala.Double,
    encoding: scala.Null,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       */
  def write(
    fd: scala.Double,
    string: js.Any,
    position: scala.Null,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       * @param encoding The expected string encoding.
       */
  def write(
    fd: scala.Double,
    string: js.Any,
    position: scala.Null,
    encoding: java.lang.String,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       * @param encoding The expected string encoding.
       */
  def write(
    fd: scala.Double,
    string: js.Any,
    position: scala.Null,
    encoding: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       * @param encoding The expected string encoding.
       */
  def write(
    fd: scala.Double,
    string: js.Any,
    position: scala.Null,
    encoding: scala.Null,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       */
  def write[TBuffer /* <: BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ TBuffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       */
  def write[TBuffer /* <: BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ TBuffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       */
  def write[TBuffer /* <: BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ TBuffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       */
  def write[TBuffer /* <: BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: js.UndefOr[scala.Double | scala.Null],
    length: js.UndefOr[scala.Double | scala.Null],
    position: js.UndefOr[scala.Double | scala.Null],
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ TBuffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       */
  def write[TBuffer /* <: BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ TBuffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       */
  def write[TBuffer /* <: BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ TBuffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       */
  def write[TBuffer /* <: BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ TBuffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       */
  def write[TBuffer /* <: BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ TBuffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       */
  def write[TBuffer /* <: BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ TBuffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       */
  def write[TBuffer /* <: BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ TBuffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       */
  def write[TBuffer /* <: BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ TBuffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       */
  def write[TBuffer /* <: BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ TBuffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       */
  def write[TBuffer /* <: BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ TBuffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       */
  def write[TBuffer /* <: BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ TBuffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes data to a file, replacing the file if it already exists.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
       */
  def writeFile(
    path: PathLike,
    data: js.Any,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes data to a file, replacing the file if it already exists.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
       * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `mode` is not supplied, the default of `0o666` is used.
       * If `mode` is a string, it is parsed as an octal integer.
       * If `flag` is not supplied, the default of `'w'` is used.
       */
  def writeFile(
    path: PathLike,
    data: js.Any,
    options: WriteFileOptions,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes data to a file, replacing the file if it already exists.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
       */
  def writeFile(
    path: scala.Double,
    data: js.Any,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes data to a file, replacing the file if it already exists.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
       * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `mode` is not supplied, the default of `0o666` is used.
       * If `mode` is a string, it is parsed as an octal integer.
       * If `flag` is not supplied, the default of `'w'` is used.
       */
  def writeFile(
    path: scala.Double,
    data: js.Any,
    options: WriteFileOptions,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronously writes data to a file, replacing the file if it already exists.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
       * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `mode` is not supplied, the default of `0o666` is used.
       * If `mode` is a string, it is parsed as an octal integer.
       * If `flag` is not supplied, the default of `'w'` is used.
       */
  def writeFileSync(path: PathLike, data: js.Any): scala.Unit = js.native
  /**
       * Synchronously writes data to a file, replacing the file if it already exists.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
       * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `mode` is not supplied, the default of `0o666` is used.
       * If `mode` is a string, it is parsed as an octal integer.
       * If `flag` is not supplied, the default of `'w'` is used.
       */
  def writeFileSync(path: PathLike, data: js.Any, options: WriteFileOptions): scala.Unit = js.native
  /**
       * Synchronously writes data to a file, replacing the file if it already exists.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
       * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `mode` is not supplied, the default of `0o666` is used.
       * If `mode` is a string, it is parsed as an octal integer.
       * If `flag` is not supplied, the default of `'w'` is used.
       */
  def writeFileSync(path: scala.Double, data: js.Any): scala.Unit = js.native
  /**
       * Synchronously writes data to a file, replacing the file if it already exists.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
       * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `mode` is not supplied, the default of `0o666` is used.
       * If `mode` is a string, it is parsed as an octal integer.
       * If `flag` is not supplied, the default of `'w'` is used.
       */
  def writeFileSync(path: scala.Double, data: js.Any, options: WriteFileOptions): scala.Unit = js.native
  /**
       * Synchronously writes `buffer` to the file referenced by the supplied file descriptor, returning the number of bytes written.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       */
  def writeSync(fd: scala.Double, buffer: BinaryData): scala.Double = js.native
  /**
       * Synchronously writes `buffer` to the file referenced by the supplied file descriptor, returning the number of bytes written.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       */
  def writeSync(fd: scala.Double, buffer: BinaryData, offset: scala.Double): scala.Double = js.native
  /**
       * Synchronously writes `buffer` to the file referenced by the supplied file descriptor, returning the number of bytes written.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       */
  def writeSync(fd: scala.Double, buffer: BinaryData, offset: scala.Double, length: scala.Double): scala.Double = js.native
  /**
       * Synchronously writes `buffer` to the file referenced by the supplied file descriptor, returning the number of bytes written.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       */
  def writeSync(
    fd: scala.Double,
    buffer: BinaryData,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): scala.Double = js.native
  /**
       * Synchronously writes `buffer` to the file referenced by the supplied file descriptor, returning the number of bytes written.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       */
  def writeSync(
    fd: scala.Double,
    buffer: BinaryData,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double
  ): scala.Double = js.native
  /**
       * Synchronously writes `buffer` to the file referenced by the supplied file descriptor, returning the number of bytes written.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       */
  def writeSync(fd: scala.Double, buffer: BinaryData, offset: scala.Null, length: scala.Double): scala.Double = js.native
  /**
       * Synchronously writes `buffer` to the file referenced by the supplied file descriptor, returning the number of bytes written.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       */
  def writeSync(
    fd: scala.Double,
    buffer: BinaryData,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double
  ): scala.Double = js.native
  /**
       * Synchronously writes `buffer` to the file referenced by the supplied file descriptor, returning the number of bytes written.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       */
  def writeSync(
    fd: scala.Double,
    buffer: BinaryData,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double
  ): scala.Double = js.native
  /**
       * Synchronously writes `string` to the file referenced by the supplied file descriptor, returning the number of bytes written.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       * @param encoding The expected string encoding.
       */
  def writeSync(fd: scala.Double, string: js.Any): scala.Double = js.native
  /**
       * Synchronously writes `string` to the file referenced by the supplied file descriptor, returning the number of bytes written.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       * @param encoding The expected string encoding.
       */
  def writeSync(fd: scala.Double, string: js.Any, position: scala.Double): scala.Double = js.native
  /**
       * Synchronously writes `string` to the file referenced by the supplied file descriptor, returning the number of bytes written.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       * @param encoding The expected string encoding.
       */
  def writeSync(fd: scala.Double, string: js.Any, position: scala.Double, encoding: java.lang.String): scala.Double = js.native
  /**
       * Synchronously writes `string` to the file referenced by the supplied file descriptor, returning the number of bytes written.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       * @param encoding The expected string encoding.
       */
  def writeSync(fd: scala.Double, string: js.Any, position: scala.Null, encoding: java.lang.String): scala.Double = js.native
}

