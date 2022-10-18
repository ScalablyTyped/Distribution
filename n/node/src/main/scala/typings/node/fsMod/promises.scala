package typings.node.fsMod

import typings.node.NodeJS.ArrayBufferView
import typings.node.anon.MakeDirectoryOptionsrecur
import typings.node.anon.MakeDirectoryOptionsrecurMode
import typings.node.anon.ObjectEncodingOptionsAborEncoding
import typings.node.anon.ObjectEncodingOptionsmode
import typings.node.anon.ObjectEncodingOptionswith
import typings.node.anon.ObjectEncodingOptionswithEncoding
import typings.node.anon.StatOptionsbigintfalseund
import typings.node.anon.StatOptionsbiginttrue
import typings.node.anon.WatchOptionsencodingbuffe
import typings.node.anon.WithFileTypes
import typings.node.anon.encodingBufferEncodingfla
import typings.node.anon.encodingnullundefinedflag
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.fsPromisesMod.FileChangeInfo
import typings.node.fsPromisesMod.FileHandle
import typings.node.fsPromisesMod.FlagAndOpenMode
import typings.node.nodeColonstreamMod.Stream
import typings.node.nodeStrings.buffer_
import typings.std.AsyncIterable
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promises {
  
  @JSImport("fs", "promises")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Tests a user's permissions for the file or directory specified by `path`.
    * The `mode` argument is an optional integer that specifies the accessibility
    * checks to be performed. `mode` should be either the value `fs.constants.F_OK`or a mask consisting of the bitwise OR of any of `fs.constants.R_OK`,`fs.constants.W_OK`, and `fs.constants.X_OK`
    * (e.g.`fs.constants.W_OK | fs.constants.R_OK`). Check `File access constants` for
    * possible values of `mode`.
    *
    * If the accessibility check is successful, the promise is resolved with no
    * value. If any of the accessibility checks fail, the promise is rejected
    * with an [Error](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Error) object. The following example checks if the file`/etc/passwd` can be read and
    * written by the current process.
    *
    * ```js
    * import { access } from 'fs/promises';
    * import { constants } from 'fs';
    *
    * try {
    *   await access('/etc/passwd', constants.R_OK | constants.W_OK);
    *   console.log('can access');
    * } catch {
    *   console.error('cannot access');
    * }
    * ```
    *
    * Using `fsPromises.access()` to check for the accessibility of a file before
    * calling `fsPromises.open()` is not recommended. Doing so introduces a race
    * condition, since other processes may change the file's state between the two
    * calls. Instead, user code should open/read/write the file directly and handle
    * the error raised if the file is not accessible.
    * @since v10.0.0
    * @param [mode=fs.constants.F_OK]
    * @return Fulfills with `undefined` upon success.
    */
  inline def access(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def access(path: PathLike, mode: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronously append data to a file, creating the file if it does not yet
    * exist. `data` can be a string or a `Buffer`.
    *
    * If `options` is a string, then it specifies the `encoding`.
    *
    * The `mode` option only affects the newly created file. See `fs.open()` for more details.
    *
    * The `path` may be specified as a `FileHandle` that has been opened
    * for appending (using `fsPromises.open()`).
    * @since v10.0.0
    * @param path filename or {FileHandle}
    * @return Fulfills with `undefined` upon success.
    */
  inline def appendFile(path: PathLike, data: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def appendFile(path: PathLike, data: String, options: ObjectEncodingOptions & FlagAndOpenMode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def appendFile(path: PathLike, data: String, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def appendFile(path: PathLike, data: js.typedarray.Uint8Array): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def appendFile(path: PathLike, data: js.typedarray.Uint8Array, options: ObjectEncodingOptions & FlagAndOpenMode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def appendFile(path: PathLike, data: js.typedarray.Uint8Array, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def appendFile(path: FileHandle, data: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def appendFile(path: FileHandle, data: String, options: ObjectEncodingOptions & FlagAndOpenMode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def appendFile(path: FileHandle, data: String, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def appendFile(path: FileHandle, data: js.typedarray.Uint8Array): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def appendFile(path: FileHandle, data: js.typedarray.Uint8Array, options: ObjectEncodingOptions & FlagAndOpenMode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def appendFile(path: FileHandle, data: js.typedarray.Uint8Array, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Changes the permissions of a file.
    * @since v10.0.0
    * @return Fulfills with `undefined` upon success.
    */
  inline def chmod(path: PathLike, mode: Mode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("chmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Changes the ownership of a file.
    * @since v10.0.0
    * @return Fulfills with `undefined` upon success.
    */
  inline def chown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("chown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /* was `typeof fsConstants` */
  object constants {
    
    // File Copy Constants
    /** Constant for fs.copyFile. Flag indicating the destination file should not be overwritten if it already exists. */
    @JSImport("fs", "promises.constants.COPYFILE_EXCL")
    @js.native
    val COPYFILE_EXCL: Double = js.native
    
    /**
      * Constant for fs.copyFile. copy operation will attempt to create a copy-on-write reflink.
      * If the underlying platform does not support copy-on-write, then a fallback copy mechanism is used.
      */
    @JSImport("fs", "promises.constants.COPYFILE_FICLONE")
    @js.native
    val COPYFILE_FICLONE: Double = js.native
    
    /**
      * Constant for fs.copyFile. Copy operation will attempt to create a copy-on-write reflink.
      * If the underlying platform does not support copy-on-write, then the operation will fail with an error.
      */
    @JSImport("fs", "promises.constants.COPYFILE_FICLONE_FORCE")
    @js.native
    val COPYFILE_FICLONE_FORCE: Double = js.native
    
    // File Access Constants
    /** Constant for fs.access(). File is visible to the calling process. */
    @JSImport("fs", "promises.constants.F_OK")
    @js.native
    val F_OK: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that data will be appended to the end of the file. */
    @JSImport("fs", "promises.constants.O_APPEND")
    @js.native
    val O_APPEND: Double = js.native
    
    /** Constant for fs.open(). Flag indicating to create the file if it does not already exist. */
    @JSImport("fs", "promises.constants.O_CREAT")
    @js.native
    val O_CREAT: Double = js.native
    
    /** Constant for fs.open(). When set, an attempt will be made to minimize caching effects of file I/O. */
    @JSImport("fs", "promises.constants.O_DIRECT")
    @js.native
    val O_DIRECT: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that the open should fail if the path is not a directory. */
    @JSImport("fs", "promises.constants.O_DIRECTORY")
    @js.native
    val O_DIRECTORY: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O with write operations waiting for data integrity. */
    @JSImport("fs", "promises.constants.O_DSYNC")
    @js.native
    val O_DSYNC: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that opening a file should fail if the O_CREAT flag is set and the file already exists. */
    @JSImport("fs", "promises.constants.O_EXCL")
    @js.native
    val O_EXCL: Double = js.native
    
    /**
      * constant for fs.open().
      * Flag indicating reading accesses to the file system will no longer result in
      * an update to the atime information associated with the file.
      * This flag is available on Linux operating systems only.
      */
    @JSImport("fs", "promises.constants.O_NOATIME")
    @js.native
    val O_NOATIME: Double = js.native
    
    /**
      * Constant for fs.open(). Flag indicating that if path identifies a terminal device,
      * opening the path shall not cause that terminal to become the controlling terminal for the process
      * (if the process does not already have one).
      */
    @JSImport("fs", "promises.constants.O_NOCTTY")
    @js.native
    val O_NOCTTY: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that the open should fail if the path is a symbolic link. */
    @JSImport("fs", "promises.constants.O_NOFOLLOW")
    @js.native
    val O_NOFOLLOW: Double = js.native
    
    /** Constant for fs.open(). Flag indicating to open the file in nonblocking mode when possible. */
    @JSImport("fs", "promises.constants.O_NONBLOCK")
    @js.native
    val O_NONBLOCK: Double = js.native
    
    // File Open Constants
    /** Constant for fs.open(). Flag indicating to open a file for read-only access. */
    @JSImport("fs", "promises.constants.O_RDONLY")
    @js.native
    val O_RDONLY: Double = js.native
    
    /** Constant for fs.open(). Flag indicating to open a file for read-write access. */
    @JSImport("fs", "promises.constants.O_RDWR")
    @js.native
    val O_RDWR: Double = js.native
    
    /** Constant for fs.open(). Flag indicating to open the symbolic link itself rather than the resource it is pointing to. */
    @JSImport("fs", "promises.constants.O_SYMLINK")
    @js.native
    val O_SYMLINK: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O. */
    @JSImport("fs", "promises.constants.O_SYNC")
    @js.native
    val O_SYNC: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that if the file exists and is a regular file, and the file is opened successfully for write access, its length shall be truncated to zero. */
    @JSImport("fs", "promises.constants.O_TRUNC")
    @js.native
    val O_TRUNC: Double = js.native
    
    /** Constant for fs.open(). Flag indicating to open a file for write-only access. */
    @JSImport("fs", "promises.constants.O_WRONLY")
    @js.native
    val O_WRONLY: Double = js.native
    
    /** Constant for fs.access(). File can be read by the calling process. */
    @JSImport("fs", "promises.constants.R_OK")
    @js.native
    val R_OK: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a block-oriented device file. */
    @JSImport("fs", "promises.constants.S_IFBLK")
    @js.native
    val S_IFBLK: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a character-oriented device file. */
    @JSImport("fs", "promises.constants.S_IFCHR")
    @js.native
    val S_IFCHR: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a directory. */
    @JSImport("fs", "promises.constants.S_IFDIR")
    @js.native
    val S_IFDIR: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a FIFO/pipe. */
    @JSImport("fs", "promises.constants.S_IFIFO")
    @js.native
    val S_IFIFO: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a symbolic link. */
    @JSImport("fs", "promises.constants.S_IFLNK")
    @js.native
    val S_IFLNK: Double = js.native
    
    // File Type Constants
    /** Constant for fs.Stats mode property for determining a file's type. Bit mask used to extract the file type code. */
    @JSImport("fs", "promises.constants.S_IFMT")
    @js.native
    val S_IFMT: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a regular file. */
    @JSImport("fs", "promises.constants.S_IFREG")
    @js.native
    val S_IFREG: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a socket. */
    @JSImport("fs", "promises.constants.S_IFSOCK")
    @js.native
    val S_IFSOCK: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by group. */
    @JSImport("fs", "promises.constants.S_IRGRP")
    @js.native
    val S_IRGRP: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by others. */
    @JSImport("fs", "promises.constants.S_IROTH")
    @js.native
    val S_IROTH: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by owner. */
    @JSImport("fs", "promises.constants.S_IRUSR")
    @js.native
    val S_IRUSR: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by group. */
    @JSImport("fs", "promises.constants.S_IRWXG")
    @js.native
    val S_IRWXG: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by others. */
    @JSImport("fs", "promises.constants.S_IRWXO")
    @js.native
    val S_IRWXO: Double = js.native
    
    // File Mode Constants
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by owner. */
    @JSImport("fs", "promises.constants.S_IRWXU")
    @js.native
    val S_IRWXU: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by group. */
    @JSImport("fs", "promises.constants.S_IWGRP")
    @js.native
    val S_IWGRP: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by others. */
    @JSImport("fs", "promises.constants.S_IWOTH")
    @js.native
    val S_IWOTH: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by owner. */
    @JSImport("fs", "promises.constants.S_IWUSR")
    @js.native
    val S_IWUSR: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by group. */
    @JSImport("fs", "promises.constants.S_IXGRP")
    @js.native
    val S_IXGRP: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by others. */
    @JSImport("fs", "promises.constants.S_IXOTH")
    @js.native
    val S_IXOTH: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by owner. */
    @JSImport("fs", "promises.constants.S_IXUSR")
    @js.native
    val S_IXUSR: Double = js.native
    
    /**
      * When set, a memory file mapping is used to access the file. This flag
      * is available on Windows operating systems only. On other operating systems,
      * this flag is ignored.
      */
    @JSImport("fs", "promises.constants.UV_FS_O_FILEMAP")
    @js.native
    val UV_FS_O_FILEMAP: Double = js.native
    
    /** Constant for fs.access(). File can be written by the calling process. */
    @JSImport("fs", "promises.constants.W_OK")
    @js.native
    val W_OK: Double = js.native
    
    /** Constant for fs.access(). File can be executed by the calling process. */
    @JSImport("fs", "promises.constants.X_OK")
    @js.native
    val X_OK: Double = js.native
  }
  
  /**
    * Asynchronously copies `src` to `dest`. By default, `dest` is overwritten if it
    * already exists.
    *
    * No guarantees are made about the atomicity of the copy operation. If an
    * error occurs after the destination file has been opened for writing, an attempt
    * will be made to remove the destination.
    *
    * ```js
    * import { constants } from 'fs';
    * import { copyFile } from 'fs/promises';
    *
    * try {
    *   await copyFile('source.txt', 'destination.txt');
    *   console.log('source.txt was copied to destination.txt');
    * } catch {
    *   console.log('The file could not be copied');
    * }
    *
    * // By using COPYFILE_EXCL, the operation will fail if destination.txt exists.
    * try {
    *   await copyFile('source.txt', 'destination.txt', constants.COPYFILE_EXCL);
    *   console.log('source.txt was copied to destination.txt');
    * } catch {
    *   console.log('The file could not be copied');
    * }
    * ```
    * @since v10.0.0
    * @param src source filename to copy
    * @param dest destination filename of the copy operation
    * @param [mode=0] Optional modifiers that specify the behavior of the copy operation. It is possible to create a mask consisting of the bitwise OR of two or more values (e.g.
    * `fs.constants.COPYFILE_EXCL | fs.constants.COPYFILE_FICLONE`)
    * @return Fulfills with `undefined` upon success.
    */
  inline def copyFile(src: PathLike, dest: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def copyFile(src: PathLike, dest: PathLike, mode: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronously copies the entire directory structure from `src` to `dest`,
    * including subdirectories and files.
    *
    * When copying a directory to another directory, globs are not supported and
    * behavior is similar to `cp dir1/ dir2/`.
    * @since v16.7.0
    * @experimental
    * @param src source path to copy.
    * @param dest destination path to copy to.
    * @return Fulfills with `undefined` upon success.
    */
  inline def cp(source: String, destination: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def cp(source: String, destination: String, opts: CopyOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def cp(source: String, destination: URL): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def cp(source: String, destination: URL, opts: CopyOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def cp(source: URL, destination: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def cp(source: URL, destination: String, opts: CopyOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def cp(source: URL, destination: URL): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def cp(source: URL, destination: URL, opts: CopyOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Changes the permissions on a symbolic link.
    *
    * This method is only implemented on macOS.
    * @deprecated Since v10.0.0
    * @return Fulfills with `undefined` upon success.
    */
  inline def lchmod(path: PathLike, mode: Mode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lchmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Changes the ownership on a symbolic link.
    * @since v10.0.0
    * @return Fulfills with `undefined` upon success.
    */
  inline def lchown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lchown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Creates a new link from the `existingPath` to the `newPath`. See the POSIX [`link(2)`](http://man7.org/linux/man-pages/man2/link.2.html) documentation for more detail.
    * @since v10.0.0
    * @return Fulfills with `undefined` upon success.
    */
  inline def link(existingPath: PathLike, newPath: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(existingPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Equivalent to `fsPromises.stat()` unless `path` refers to a symbolic link,
    * in which case the link itself is stat-ed, not the file that it refers to.
    * Refer to the POSIX [`lstat(2)`](http://man7.org/linux/man-pages/man2/lstat.2.html) document for more detail.
    * @since v10.0.0
    * @return Fulfills with the {fs.Stats} object for the given symbolic link `path`.
    */
  inline def lstat(path: PathLike): js.Promise[typings.node.nodeColonfsMod.Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.node.nodeColonfsMod.Stats]]
  inline def lstat(path: PathLike, opts: StatOptionsbigintfalseund): js.Promise[typings.node.nodeColonfsMod.Stats] = (^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.nodeColonfsMod.Stats]]
  inline def lstat(path: PathLike, opts: StatOptionsbiginttrue): js.Promise[BigIntStats] = (^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BigIntStats]]
  inline def lstat(path: PathLike, opts: StatOptions): js.Promise[typings.node.nodeColonfsMod.Stats | BigIntStats] = (^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.nodeColonfsMod.Stats | BigIntStats]]
  
  /**
    * Changes the access and modification times of a file in the same way as `fsPromises.utimes()`, with the difference that if the path refers to a
    * symbolic link, then the link is not dereferenced: instead, the timestamps of
    * the symbolic link itself are changed.
    * @since v14.5.0, v12.19.0
    * @return Fulfills with `undefined` upon success.
    */
  inline def lutimes(path: PathLike, atime: TimeLike, mtime: TimeLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronous mkdir(2) - create a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
    * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
    */
  inline def mkdir(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  /**
    * Asynchronously creates a directory.
    *
    * The optional `options` argument can be an integer specifying `mode` (permission
    * and sticky bits), or an object with a `mode` property and a `recursive`property indicating whether parent directories should be created. Calling`fsPromises.mkdir()` when `path` is a directory
    * that exists results in a
    * rejection only when `recursive` is false.
    * @since v10.0.0
    * @return Upon success, fulfills with `undefined` if `recursive` is `false`, or the first directory path created if `recursive` is `true`.
    */
  inline def mkdir(path: PathLike, options: MakeDirectoryOptionsrecur): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  inline def mkdir(path: PathLike, options: MakeDirectoryOptionsrecurMode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def mkdir(path: PathLike, options: MakeDirectoryOptions): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  inline def mkdir(path: PathLike, options: Mode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Creates a unique temporary directory. A unique directory name is generated by
    * appending six random characters to the end of the provided `prefix`. Due to
    * platform inconsistencies, avoid trailing `X` characters in `prefix`. Some
    * platforms, notably the BSDs, can return more than six random characters, and
    * replace trailing `X` characters in `prefix` with random characters.
    *
    * The optional `options` argument can be a string specifying an encoding, or an
    * object with an `encoding` property specifying the character encoding to use.
    *
    * ```js
    * import { mkdtemp } from 'fs/promises';
    *
    * try {
    *   await mkdtemp(path.join(os.tmpdir(), 'foo-'));
    * } catch (err) {
    *   console.error(err);
    * }
    * ```
    *
    * The `fsPromises.mkdtemp()` method will append the six randomly selected
    * characters directly to the `prefix` string. For instance, given a directory`/tmp`, if the intention is to create a temporary directory _within_`/tmp`, the`prefix` must end with a trailing
    * platform-specific path separator
    * (`require('path').sep`).
    * @since v10.0.0
    * @return Fulfills with a string containing the filesystem path of the newly created temporary directory.
    */
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required `prefix` to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  inline def mkdtemp(prefix: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def mkdtemp(prefix: String, options: BufferEncoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required `prefix` to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  inline def mkdtemp(prefix: String, options: BufferEncodingOption): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def mkdtemp(prefix: String, options: ObjectEncodingOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  /**
    * Opens a `FileHandle`.
    *
    * Refer to the POSIX [`open(2)`](http://man7.org/linux/man-pages/man2/open.2.html) documentation for more detail.
    *
    * Some characters (`< > : " / \ | ? *`) are reserved under Windows as documented
    * by [Naming Files, Paths, and Namespaces](https://docs.microsoft.com/en-us/windows/desktop/FileIO/naming-a-file). Under NTFS, if the filename contains
    * a colon, Node.js will open a file system stream, as described by [this MSDN page](https://docs.microsoft.com/en-us/windows/desktop/FileIO/using-streams).
    * @since v10.0.0
    * @param [flags='r'] See `support of file system `flags``.
    * @param [mode=0o666] Sets the file mode (permission and sticky bits) if the file is created.
    * @return Fulfills with a {FileHandle} object.
    */
  inline def open(path: PathLike): js.Promise[FileHandle] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FileHandle]]
  inline def open(path: PathLike, flags: String): js.Promise[FileHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileHandle]]
  inline def open(path: PathLike, flags: String, mode: Mode): js.Promise[FileHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileHandle]]
  inline def open(path: PathLike, flags: Double): js.Promise[FileHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileHandle]]
  inline def open(path: PathLike, flags: Double, mode: Mode): js.Promise[FileHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileHandle]]
  inline def open(path: PathLike, flags: Unit, mode: Mode): js.Promise[FileHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileHandle]]
  
  /**
    * Asynchronously open a directory for iterative scanning. See the POSIX [`opendir(3)`](http://man7.org/linux/man-pages/man3/opendir.3.html) documentation for more detail.
    *
    * Creates an `fs.Dir`, which contains all further functions for reading from
    * and cleaning up the directory.
    *
    * The `encoding` option sets the encoding for the `path` while opening the
    * directory and subsequent read operations.
    *
    * Example using async iteration:
    *
    * ```js
    * import { opendir } from 'fs/promises';
    *
    * try {
    *   const dir = await opendir('./');
    *   for await (const dirent of dir)
    *     console.log(dirent.name);
    * } catch (err) {
    *   console.error(err);
    * }
    * ```
    *
    * When using the async iterator, the `fs.Dir` object will be automatically
    * closed after the iterator exits.
    * @since v12.12.0
    * @return Fulfills with an {fs.Dir}.
    */
  inline def opendir(path: PathLike): js.Promise[typings.node.nodeColonfsMod.Dir] = ^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.node.nodeColonfsMod.Dir]]
  inline def opendir(path: PathLike, options: OpenDirOptions): js.Promise[typings.node.nodeColonfsMod.Dir] = (^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.nodeColonfsMod.Dir]]
  
  /**
    * Asynchronously reads the entire contents of a file.
    *
    * If no encoding is specified (using `options.encoding`), the data is returned
    * as a `Buffer` object. Otherwise, the data will be a string.
    *
    * If `options` is a string, then it specifies the encoding.
    *
    * When the `path` is a directory, the behavior of `fsPromises.readFile()` is
    * platform-specific. On macOS, Linux, and Windows, the promise will be rejected
    * with an error. On FreeBSD, a representation of the directory's contents will be
    * returned.
    *
    * It is possible to abort an ongoing `readFile` using an `AbortSignal`. If a
    * request is aborted the promise returned is rejected with an `AbortError`:
    *
    * ```js
    * import { readFile } from 'fs/promises';
    *
    * try {
    *   const controller = new AbortController();
    *   const { signal } = controller;
    *   const promise = readFile(fileName, { signal });
    *
    *   // Abort the request before the promise settles.
    *   controller.abort();
    *
    *   await promise;
    * } catch (err) {
    *   // When a request is aborted - err is an AbortError
    *   console.error(err);
    * }
    * ```
    *
    * Aborting an ongoing request does not abort individual operating
    * system requests but rather the internal buffering `fs.readFile` performs.
    *
    * Any specified `FileHandle` has to support reading.
    * @since v10.0.0
    * @param path filename or `FileHandle`
    * @return Fulfills with the contents of the file.
    */
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
    * @param options An object that may contain an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  inline def readFile(path: PathLike): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def readFile(path: PathLike, options: ObjectEncodingOptionsAborEncoding): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
    * @param options An object that may contain an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  inline def readFile(path: PathLike, options: encodingBufferEncodingfla): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def readFile(path: PathLike, options: encodingnullundefinedflag): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def readFile(path: PathLike, options: BufferEncoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def readFile(path: FileHandle): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def readFile(path: FileHandle, options: ObjectEncodingOptionsAborEncoding): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
  inline def readFile(path: FileHandle, options: encodingBufferEncodingfla): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def readFile(path: FileHandle, options: encodingnullundefinedflag): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def readFile(path: FileHandle, options: BufferEncoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  /**
    * Reads the contents of a directory.
    *
    * The optional `options` argument can be a string specifying an encoding, or an
    * object with an `encoding` property specifying the character encoding to use for
    * the filenames. If the `encoding` is set to `'buffer'`, the filenames returned
    * will be passed as `Buffer` objects.
    *
    * If `options.withFileTypes` is set to `true`, the resolved array will contain `fs.Dirent` objects.
    *
    * ```js
    * import { readdir } from 'fs/promises';
    *
    * try {
    *   const files = await readdir(path);
    *   for (const file of files)
    *     console.log(file);
    * } catch (err) {
    *   console.error(err);
    * }
    * ```
    * @since v10.0.0
    * @return Fulfills with an array of the names of the files in the directory excluding `'.'` and `'..'`.
    */
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  inline def readdir(path: PathLike): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def readdir(path: PathLike, options: ObjectEncodingOptionswith): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options If called with `withFileTypes: true` the result data will be an array of Dirent.
    */
  inline def readdir(path: PathLike, options: ObjectEncodingOptionswithEncoding): js.Promise[js.Array[typings.node.nodeColonfsMod.Dirent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.node.nodeColonfsMod.Dirent]]]
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  inline def readdir(path: PathLike, options: WithFileTypes): js.Promise[js.Array[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Buffer]]]
  inline def readdir(path: PathLike, options: BufferEncoding): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def readdir_buffer(path: PathLike, options: buffer_): js.Promise[js.Array[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Buffer]]]
  
  /**
    * Reads the contents of the symbolic link referred to by `path`. See the POSIX [`readlink(2)`](http://man7.org/linux/man-pages/man2/readlink.2.html) documentation for more detail. The promise is
    * resolved with the`linkString` upon success.
    *
    * The optional `options` argument can be a string specifying an encoding, or an
    * object with an `encoding` property specifying the character encoding to use for
    * the link path returned. If the `encoding` is set to `'buffer'`, the link path
    * returned will be passed as a `Buffer` object.
    * @since v10.0.0
    * @return Fulfills with the `linkString` upon success.
    */
  /**
    * Asynchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  inline def readlink(path: PathLike): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def readlink(path: PathLike, options: String): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
  inline def readlink(path: PathLike, options: BufferEncoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  /**
    * Asynchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  inline def readlink(path: PathLike, options: BufferEncodingOption): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def readlink(path: PathLike, options: ObjectEncodingOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  /**
    * Determines the actual location of `path` using the same semantics as the`fs.realpath.native()` function.
    *
    * Only paths that can be converted to UTF8 strings are supported.
    *
    * The optional `options` argument can be a string specifying an encoding, or an
    * object with an `encoding` property specifying the character encoding to use for
    * the path. If the `encoding` is set to `'buffer'`, the path returned will be
    * passed as a `Buffer` object.
    *
    * On Linux, when Node.js is linked against musl libc, the procfs file system must
    * be mounted on `/proc` in order for this function to work. Glibc does not have
    * this restriction.
    * @since v10.0.0
    * @return Fulfills with the resolved path upon success.
    */
  /**
    * Asynchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  inline def realpath(path: PathLike): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def realpath(path: PathLike, options: BufferEncoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  /**
    * Asynchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  inline def realpath(path: PathLike, options: BufferEncodingOption): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def realpath(path: PathLike, options: ObjectEncodingOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  /**
    * Renames `oldPath` to `newPath`.
    * @since v10.0.0
    * @return Fulfills with `undefined` upon success.
    */
  inline def rename(oldPath: PathLike, newPath: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rename")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Removes files and directories (modeled on the standard POSIX `rm` utility).
    * @since v14.14.0
    * @return Fulfills with `undefined` upon success.
    */
  inline def rm(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def rm(path: PathLike, options: RmOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Removes the directory identified by `path`.
    *
    * Using `fsPromises.rmdir()` on a file (not a directory) results in the
    * promise being rejected with an `ENOENT` error on Windows and an `ENOTDIR`error on POSIX.
    *
    * To get a behavior similar to the `rm -rf` Unix command, use `fsPromises.rm()` with options `{ recursive: true, force: true }`.
    * @since v10.0.0
    * @return Fulfills with `undefined` upon success.
    */
  inline def rmdir(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def rmdir(path: PathLike, options: RmDirOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * @since v10.0.0
    * @return Fulfills with the {fs.Stats} object for the given `path`.
    */
  inline def stat(path: PathLike): js.Promise[typings.node.nodeColonfsMod.Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.node.nodeColonfsMod.Stats]]
  inline def stat(path: PathLike, opts: StatOptionsbigintfalseund): js.Promise[typings.node.nodeColonfsMod.Stats] = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.nodeColonfsMod.Stats]]
  inline def stat(path: PathLike, opts: StatOptionsbiginttrue): js.Promise[BigIntStats] = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BigIntStats]]
  inline def stat(path: PathLike, opts: StatOptions): js.Promise[typings.node.nodeColonfsMod.Stats | BigIntStats] = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.nodeColonfsMod.Stats | BigIntStats]]
  
  /**
    * Creates a symbolic link.
    *
    * The `type` argument is only used on Windows platforms and can be one of `'dir'`,`'file'`, or `'junction'`. Windows junction points require the destination path
    * to be absolute. When using `'junction'`, the `target` argument will
    * automatically be normalized to absolute path.
    * @since v10.0.0
    * @param [type='file']
    * @return Fulfills with `undefined` upon success.
    */
  inline def symlink(target: PathLike, path: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def symlink(target: PathLike, path: PathLike, `type`: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Truncates (shortens or extends the length) of the content at `path` to `len`bytes.
    * @since v10.0.0
    * @param [len=0]
    * @return Fulfills with `undefined` upon success.
    */
  inline def truncate(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def truncate(path: PathLike, len: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * If `path` refers to a symbolic link, then the link is removed without affecting
    * the file or directory to which that link refers. If the `path` refers to a file
    * path that is not a symbolic link, the file is deleted. See the POSIX [`unlink(2)`](http://man7.org/linux/man-pages/man2/unlink.2.html) documentation for more detail.
    * @since v10.0.0
    * @return Fulfills with `undefined` upon success.
    */
  inline def unlink(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Change the file system timestamps of the object referenced by `path`.
    *
    * The `atime` and `mtime` arguments follow these rules:
    *
    * * Values can be either numbers representing Unix epoch time, `Date`s, or a
    * numeric string like `'123456789.0'`.
    * * If the value can not be converted to a number, or is `NaN`, `Infinity` or`-Infinity`, an `Error` will be thrown.
    * @since v10.0.0
    * @return Fulfills with `undefined` upon success.
    */
  inline def utimes(path: PathLike, atime: TimeLike, mtime: TimeLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
    * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `persistent` is not supplied, the default of `true` is used.
    * If `recursive` is not supplied, the default of `false` is used.
    */
  inline def watch(filename: PathLike): AsyncIterable[FileChangeInfo[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[FileChangeInfo[String]]]
  inline def watch(filename: PathLike, options: String): AsyncIterable[FileChangeInfo[Buffer | String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[FileChangeInfo[Buffer | String]]]
  /**
    * Returns an async iterator that watches for changes on `filename`, where `filename`is either a file or a directory.
    *
    * ```js
    * const { watch } = require('fs/promises');
    *
    * const ac = new AbortController();
    * const { signal } = ac;
    * setTimeout(() => ac.abort(), 10000);
    *
    * (async () => {
    *   try {
    *     const watcher = watch(__filename, { signal });
    *     for await (const event of watcher)
    *       console.log(event);
    *   } catch (err) {
    *     if (err.name === 'AbortError')
    *       return;
    *     throw err;
    *   }
    * })();
    * ```
    *
    * On most platforms, `'rename'` is emitted whenever a filename appears or
    * disappears in the directory.
    *
    * All the `caveats` for `fs.watch()` also apply to `fsPromises.watch()`.
    * @since v15.9.0, v14.18.0
    * @return of objects with the properties:
    */
  inline def watch(filename: PathLike, options: WatchOptionsencodingbuffe): AsyncIterable[FileChangeInfo[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[FileChangeInfo[Buffer]]]
  inline def watch(filename: PathLike, options: BufferEncoding): AsyncIterable[FileChangeInfo[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[FileChangeInfo[String]]]
  /**
    * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
    * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `persistent` is not supplied, the default of `true` is used.
    * If `recursive` is not supplied, the default of `false` is used.
    */
  inline def watch(filename: PathLike, options: WatchOptions): AsyncIterable[FileChangeInfo[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[FileChangeInfo[String]]]
  
  inline def watch_buffer(filename: PathLike, options: buffer_): AsyncIterable[FileChangeInfo[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[FileChangeInfo[Buffer]]]
  
  /**
    * Asynchronously writes data to a file, replacing the file if it already exists.`data` can be a string, a buffer, an
    * [AsyncIterable](https://tc39.github.io/ecma262/#sec-asynciterable-interface) or
    * [Iterable](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols#The_iterable_protocol) object.
    *
    * The `encoding` option is ignored if `data` is a buffer.
    *
    * If `options` is a string, then it specifies the encoding.
    *
    * The `mode` option only affects the newly created file. See `fs.open()` for more details.
    *
    * Any specified `FileHandle` has to support writing.
    *
    * It is unsafe to use `fsPromises.writeFile()` multiple times on the same file
    * without waiting for the promise to be settled.
    *
    * Similarly to `fsPromises.readFile` \- `fsPromises.writeFile` is a convenience
    * method that performs multiple `write` calls internally to write the buffer
    * passed to it. For performance sensitive code consider using `fs.createWriteStream()` or `filehandle.createWriteStream()`.
    *
    * It is possible to use an `AbortSignal` to cancel an `fsPromises.writeFile()`.
    * Cancelation is "best effort", and some amount of data is likely still
    * to be written.
    *
    * ```js
    * import { writeFile } from 'fs/promises';
    * import { Buffer } from 'buffer';
    *
    * try {
    *   const controller = new AbortController();
    *   const { signal } = controller;
    *   const data = new Uint8Array(Buffer.from('Hello Node.js'));
    *   const promise = writeFile('message.txt', data, { signal });
    *
    *   // Abort the request before the promise settles.
    *   controller.abort();
    *
    *   await promise;
    * } catch (err) {
    *   // When a request is aborted - err is an AbortError
    *   console.error(err);
    * }
    * ```
    *
    * Aborting an ongoing request does not abort individual operating
    * system requests but rather the internal buffering `fs.writeFile` performs.
    * @since v10.0.0
    * @param file filename or `FileHandle`
    * @return Fulfills with `undefined` upon success.
    */
  inline def writeFile(file: PathLike, data: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(file: PathLike, data: String, options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(file: PathLike, data: String, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(file: PathLike, data: js.Iterable[ArrayBufferView | String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(file: PathLike, data: js.Iterable[String | ArrayBufferView], options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(file: PathLike, data: js.Iterable[String | ArrayBufferView], options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(file: PathLike, data: ArrayBufferView): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(file: PathLike, data: ArrayBufferView, options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(file: PathLike, data: ArrayBufferView, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(file: PathLike, data: Stream): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(file: PathLike, data: Stream, options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(file: PathLike, data: Stream, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(file: PathLike, data: AsyncIterable[ArrayBufferView | String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(file: PathLike, data: AsyncIterable[String | ArrayBufferView], options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(file: PathLike, data: AsyncIterable[String | ArrayBufferView], options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(file: FileHandle, data: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(file: FileHandle, data: String, options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(file: FileHandle, data: String, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(file: FileHandle, data: js.Iterable[ArrayBufferView | String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(file: FileHandle, data: js.Iterable[String | ArrayBufferView], options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(file: FileHandle, data: js.Iterable[String | ArrayBufferView], options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(file: FileHandle, data: ArrayBufferView): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(file: FileHandle, data: ArrayBufferView, options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(file: FileHandle, data: ArrayBufferView, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(file: FileHandle, data: Stream): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(file: FileHandle, data: Stream, options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(file: FileHandle, data: Stream, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(file: FileHandle, data: AsyncIterable[ArrayBufferView | String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(
    file: FileHandle,
    data: AsyncIterable[String | ArrayBufferView],
    options: ObjectEncodingOptionsmode
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(file: FileHandle, data: AsyncIterable[String | ArrayBufferView], options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
