package typings.memfs.volumeMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import typings.memfs.anon.Bigint
import typings.memfs.anon.BigintThrowIfNoEntry
import typings.memfs.anon.ThrowIfNoEntry
import typings.memfs.anon.`0`
import typings.memfs.anon.`1`
import typings.memfs.anon.`2`
import typings.memfs.anon.`3`
import typings.memfs.anon.`4`
import typings.memfs.encodingMod.TDataOut
import typings.memfs.nodeMod.File
import typings.memfs.nodeMod.Link
import typings.memfs.nodeMod.Node
import typings.memfs.promisesMod.IPromisesAPI
import typings.memfs.statsMod.TStatNumber
import typings.memfs.statsMod.default
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.fsMod.PathLike
import typings.node.fsMod.symlink.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("memfs/lib/volume", "Volume")
@js.native
open class Volume () extends StObject {
  def this(props: js.Object) = this()
  
  var FSWatcher: Instantiable0[typings.memfs.volumeMod.FSWatcher] = js.native
  
  var ReadStream: Instantiable1[/* args (repeated) */ Any, IReadStream] = js.native
  
  var StatWatcher: Instantiable0[typings.memfs.volumeMod.StatWatcher] = js.native
  
  var WriteStream: Instantiable1[/* args (repeated) */ Any, IWriteStream] = js.native
  
  /* private */ var _toJSON: Any = js.native
  
  def access(path: PathLike, callback: TCallback[Unit]): Any = js.native
  def access(path: PathLike, mode: Double, callback: TCallback[Unit]): Any = js.native
  
  /* private */ var accessBase: Any = js.native
  
  def accessSync(path: PathLike): Unit = js.native
  def accessSync(path: PathLike, mode: Double): Unit = js.native
  
  def appendFile(id: TFileId, data: TData, callback: TCallback[Unit]): Any = js.native
  def appendFile(id: TFileId, data: TData, options: String, callback: TCallback[Unit]): Any = js.native
  def appendFile(id: TFileId, data: TData, options: IAppendFileOptions, callback: TCallback[Unit]): Any = js.native
  
  def appendFileSync(id: TFileId, data: TData): Unit = js.native
  def appendFileSync(id: TFileId, data: TData, options: String): Unit = js.native
  def appendFileSync(id: TFileId, data: TData, options: IAppendFileOptions): Unit = js.native
  
  def chmod(path: PathLike, mode: TMode, callback: TCallback[Unit]): Unit = js.native
  
  /* private */ var chmodBase: Any = js.native
  
  def chmodSync(path: PathLike, mode: TMode): Unit = js.native
  
  def chown(path: PathLike, uid: Double, gid: Double, callback: TCallback[Unit]): Unit = js.native
  
  /* private */ var chownBase: Any = js.native
  
  def chownSync(path: PathLike, uid: Double, gid: Double): Unit = js.native
  
  def close(fd: Double, callback: TCallback[Unit]): Unit = js.native
  
  /* private */ var closeFile: Any = js.native
  
  def closeSync(fd: Double): Unit = js.native
  
  def copyFile(src: PathLike, dest: PathLike, callback: TCallback[Unit]): Any = js.native
  def copyFile(src: PathLike, dest: PathLike, flags: TFlagsCopy, callback: TCallback[Unit]): Any = js.native
  
  /* private */ var copyFileBase: Any = js.native
  
  def copyFileSync(src: PathLike, dest: PathLike): Unit = js.native
  def copyFileSync(src: PathLike, dest: PathLike, flags: TFlagsCopy): Unit = js.native
  
  def createLink(): Link = js.native
  def createLink(parent: Link, name: String): Link = js.native
  def createLink(parent: Link, name: String, isDirectory: Boolean): Link = js.native
  def createLink(parent: Link, name: String, isDirectory: Boolean, perm: Double): Link = js.native
  def createLink(parent: Link, name: String, isDirectory: Unit, perm: Double): Link = js.native
  
  def createNode(): Node = js.native
  def createNode(isDirectory: Boolean): Node = js.native
  def createNode(isDirectory: Boolean, perm: Double): Node = js.native
  def createNode(isDirectory: Unit, perm: Double): Node = js.native
  
  def createReadStream(path: PathLike): IReadStream = js.native
  def createReadStream(path: PathLike, options: String): IReadStream = js.native
  def createReadStream(path: PathLike, options: IReadStreamOptions): IReadStream = js.native
  
  def createWriteStream(path: PathLike): IWriteStream = js.native
  def createWriteStream(path: PathLike, options: String): IWriteStream = js.native
  def createWriteStream(path: PathLike, options: IWriteStreamOptions): IWriteStream = js.native
  
  def deleteLink(link: Link): Boolean = js.native
  
  /* private */ var deleteNode: Any = js.native
  
  def exists(path: PathLike, callback: js.Function1[/* exists */ Boolean, Unit]): Unit = js.native
  
  /* private */ var existsBase: Any = js.native
  
  def existsSync(path: PathLike): Boolean = js.native
  
  def fchmod(fd: Double, mode: TMode, callback: TCallback[Unit]): Unit = js.native
  
  /* private */ var fchmodBase: Any = js.native
  
  def fchmodSync(fd: Double, mode: TMode): Unit = js.native
  
  def fchown(fd: Double, uid: Double, gid: Double, callback: TCallback[Unit]): Unit = js.native
  
  /* private */ var fchownBase: Any = js.native
  
  def fchownSync(fd: Double, uid: Double, gid: Double): Unit = js.native
  
  def fdatasync(fd: Double, callback: TCallback[Unit]): Unit = js.native
  
  /* private */ var fdatasyncBase: Any = js.native
  
  def fdatasyncSync(fd: Double): Unit = js.native
  
  var fds: NumberDictionary[File] = js.native
  
  def fromJSON(json: DirectoryJSON): Unit = js.native
  def fromJSON(json: DirectoryJSON, cwd: String): Unit = js.native
  
  def fromNestedJSON(json: NestedDirectoryJSON): Unit = js.native
  def fromNestedJSON(json: NestedDirectoryJSON, cwd: String): Unit = js.native
  
  def fstat(fd: Double, callback: TCallback[default[TStatNumber]]): Unit = js.native
  def fstat(fd: Double, options: IFStatOptions, callback: TCallback[default[TStatNumber]]): Unit = js.native
  
  /* private */ var fstatBase: Any = js.native
  
  def fstatSync(fd: Double): default[Double] = js.native
  def fstatSync(fd: Double, options: `3`): default[Double] = js.native
  def fstatSync(fd: Double, options: `4`): default[js.BigInt] = js.native
  
  def fsync(fd: Double, callback: TCallback[Unit]): Unit = js.native
  
  /* private */ var fsyncBase: Any = js.native
  
  def fsyncSync(fd: Double): Unit = js.native
  
  def ftruncate(fd: Double, callback: TCallback[Unit]): Any = js.native
  def ftruncate(fd: Double, len: Double, callback: TCallback[Unit]): Any = js.native
  
  /* private */ var ftruncateBase: Any = js.native
  
  def ftruncateSync(fd: Double): Unit = js.native
  def ftruncateSync(fd: Double, len: Double): Unit = js.native
  
  def futimes(fd: Double, atime: TTime, mtime: TTime, callback: TCallback[Unit]): Unit = js.native
  
  /* private */ var futimesBase: Any = js.native
  
  def futimesSync(fd: Double, atime: TTime, mtime: TTime): Unit = js.native
  
  def genRndStr(): Any = js.native
  
  /* private */ var getFileByFd: Any = js.native
  
  /* private */ var getFileByFdOrThrow: Any = js.native
  
  def getLink(steps: js.Array[String]): Link | Null = js.native
  
  /* private */ var getLinkAsDirOrThrow: Any = js.native
  
  def getLinkOrThrow(filename: String): Link = js.native
  def getLinkOrThrow(filename: String, funcName: String): Link = js.native
  
  /* private */ var getLinkParent: Any = js.native
  
  /* private */ var getLinkParentAsDirOrThrow: Any = js.native
  
  /* private */ var getNode: Any = js.native
  
  def getResolvedLink(filenameOrSteps: String): Link | Null = js.native
  def getResolvedLink(filenameOrSteps: js.Array[String]): Link | Null = js.native
  
  def getResolvedLinkOrThrow(filename: String): Link = js.native
  def getResolvedLinkOrThrow(filename: String, funcName: String): Link = js.native
  
  var ino: Double = js.native
  
  var inodes: NumberDictionary[Node] = js.native
  
  def lchmod(path: PathLike, mode: TMode, callback: TCallback[Unit]): Unit = js.native
  
  /* private */ var lchmodBase: Any = js.native
  
  def lchmodSync(path: PathLike, mode: TMode): Unit = js.native
  
  def lchown(path: PathLike, uid: Double, gid: Double, callback: TCallback[Unit]): Unit = js.native
  
  /* private */ var lchownBase: Any = js.native
  
  def lchownSync(path: PathLike, uid: Double, gid: Double): Unit = js.native
  
  def link(existingPath: PathLike, newPath: PathLike, callback: TCallback[Unit]): Unit = js.native
  
  /* private */ var linkBase: Any = js.native
  
  def linkSync(existingPath: PathLike, newPath: PathLike): Unit = js.native
  
  def lstat(path: PathLike, callback: TCallback[default[TStatNumber]]): Unit = js.native
  def lstat(path: PathLike, options: IStatOptions, callback: TCallback[default[TStatNumber]]): Unit = js.native
  
  /* private */ var lstatBase: Any = js.native
  
  def lstatSync(path: PathLike): default[Double] = js.native
  def lstatSync(path: PathLike, options: Bigint): default[Double] = js.native
  def lstatSync(path: PathLike, options: BigintThrowIfNoEntry): default[js.BigInt] = js.native
  def lstatSync(path: PathLike, options: ThrowIfNoEntry): default[Double] = js.native
  def lstatSync(path: PathLike, options: `0`): js.UndefOr[default[Double]] = js.native
  def lstatSync(path: PathLike, options: `1`): js.UndefOr[default[Double]] = js.native
  def lstatSync(path: PathLike, options: `2`): js.UndefOr[default[js.BigInt]] = js.native
  
  var maxFiles: Double = js.native
  
  def mkdir(path: PathLike, callback: TCallback[Unit]): Any = js.native
  def mkdir(path: PathLike, mode: IMkdirOptions, callback: TCallback[Unit]): Any = js.native
  def mkdir(path: PathLike, mode: TMode, callback: TCallback[Unit]): Any = js.native
  
  /* private */ var mkdirBase: Any = js.native
  
  def mkdirSync(path: PathLike): Unit = js.native
  def mkdirSync(path: PathLike, options: IMkdirOptions): Unit = js.native
  def mkdirSync(path: PathLike, options: TMode): Unit = js.native
  
  def mkdirp(path: PathLike, callback: TCallback[Unit]): Any = js.native
  def mkdirp(path: PathLike, mode: TMode, callback: TCallback[Unit]): Any = js.native
  
  /**
    * Creates directory tree recursively.
    * @param filename
    * @param modeNum
    */
  /* private */ var mkdirpBase: Any = js.native
  
  def mkdirpSync(path: PathLike): Unit = js.native
  def mkdirpSync(path: PathLike, mode: TMode): Unit = js.native
  
  def mkdtemp(prefix: String, callback: TCallback[Unit]): Any = js.native
  def mkdtemp(prefix: String, options: IOptions, callback: TCallback[Unit]): Any = js.native
  
  /* private */ var mkdtempBase: Any = js.native
  
  def mkdtempSync(prefix: String): TDataOut = js.native
  def mkdtempSync(prefix: String, options: IOptions): TDataOut = js.native
  
  def mountSync(mountpoint: String, json: DirectoryJSON): Unit = js.native
  
  /* private */ var newFdNumber: Any = js.native
  
  /* private */ var newInoNumber: Any = js.native
  
  def open(path: PathLike, flags: TFlags, /* ... */ callback: TCallback[Double]): Any = js.native
  def open(path: PathLike, flags: TFlags, mode: TMode, callback: TCallback[Double]): Any = js.native
  
  /* private */ var openBase: Any = js.native
  
  /* private */ var openFile: Any = js.native
  
  /* private */ var openFileOrGetById: Any = js.native
  
  var openFiles: Double = js.native
  
  /* private */ var openLink: Any = js.native
  
  def openSync(path: PathLike, flags: TFlags): Double = js.native
  def openSync(path: PathLike, flags: TFlags, mode: TMode): Double = js.native
  
  def promises: IPromisesAPI = js.native
  
  /* private */ var promisesApi: Any = js.native
  
  var props: typings.memfs.anon.File = js.native
  
  def read(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ js.UndefOr[js.Error | Null], 
      /* bytesRead */ js.UndefOr[Double], 
      /* buffer */ js.UndefOr[Buffer | js.typedarray.Uint8Array], 
      Unit
    ]
  ): Unit = js.native
  def read(
    fd: Double,
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ js.UndefOr[js.Error | Null], 
      /* bytesRead */ js.UndefOr[Double], 
      /* buffer */ js.UndefOr[Buffer | js.typedarray.Uint8Array], 
      Unit
    ]
  ): Unit = js.native
  
  /* private */ var readBase: Any = js.native
  
  def readFile(id: TFileId, callback: TCallback[TDataOut]): Any = js.native
  def readFile(id: TFileId, options: String, callback: TCallback[TDataOut]): Any = js.native
  def readFile(id: TFileId, options: IReadFileOptions, callback: TCallback[TDataOut]): Any = js.native
  
  /* private */ var readFileBase: Any = js.native
  
  def readFileSync(file: TFileId): TDataOut = js.native
  def readFileSync(file: TFileId, options: String): TDataOut = js.native
  def readFileSync(file: TFileId, options: IReadFileOptions): TDataOut = js.native
  
  def readSync(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double, length: Double, position: Double): Double = js.native
  def readSync(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): Double = js.native
  
  def readdir(path: PathLike, callback: TCallback[js.Array[TDataOut | typings.memfs.direntMod.default]]): Any = js.native
  def readdir(
    path: PathLike,
    options: String,
    callback: TCallback[js.Array[TDataOut | typings.memfs.direntMod.default]]
  ): Any = js.native
  def readdir(
    path: PathLike,
    options: IReaddirOptions,
    callback: TCallback[js.Array[TDataOut | typings.memfs.direntMod.default]]
  ): Any = js.native
  
  /* private */ var readdirBase: Any = js.native
  
  def readdirSync(path: PathLike): js.Array[TDataOut | typings.memfs.direntMod.default] = js.native
  def readdirSync(path: PathLike, options: String): js.Array[TDataOut | typings.memfs.direntMod.default] = js.native
  def readdirSync(path: PathLike, options: IReaddirOptions): js.Array[TDataOut | typings.memfs.direntMod.default] = js.native
  
  def readlink(path: PathLike, callback: TCallback[TDataOut]): Any = js.native
  def readlink(path: PathLike, options: IOptions, callback: TCallback[TDataOut]): Any = js.native
  
  /* private */ var readlinkBase: Any = js.native
  
  def readlinkSync(path: PathLike): TDataOut = js.native
  def readlinkSync(path: PathLike, options: IOptions): TDataOut = js.native
  
  def realpath(path: PathLike, callback: TCallback[TDataOut]): Any = js.native
  def realpath(path: PathLike, options: String, callback: TCallback[TDataOut]): Any = js.native
  def realpath(path: PathLike, options: IRealpathOptions, callback: TCallback[TDataOut]): Any = js.native
  
  /* private */ var realpathBase: Any = js.native
  
  def realpathSync(path: PathLike): TDataOut = js.native
  def realpathSync(path: PathLike, options: String): TDataOut = js.native
  def realpathSync(path: PathLike, options: IRealpathOptions): TDataOut = js.native
  
  var releasedFds: js.Array[Double] = js.native
  
  var releasedInos: js.Array[Double] = js.native
  
  def rename(oldPath: PathLike, newPath: PathLike, callback: TCallback[Unit]): Unit = js.native
  
  /* private */ var renameBase: Any = js.native
  
  def renameSync(oldPath: PathLike, newPath: PathLike): Unit = js.native
  
  def reset(): Unit = js.native
  
  def resolveSymlinks(link: Link): Link | Null = js.native
  
  def rm(path: PathLike, callback: TCallback[Unit]): Unit = js.native
  def rm(path: PathLike, options: IRmOptions, callback: TCallback[Unit]): Unit = js.native
  
  /* private */ var rmBase: Any = js.native
  
  def rmSync(path: PathLike): Unit = js.native
  def rmSync(path: PathLike, options: IRmOptions): Unit = js.native
  
  def rmdir(path: PathLike, callback: TCallback[Unit]): Any = js.native
  def rmdir(path: PathLike, options: IRmdirOptions, callback: TCallback[Unit]): Any = js.native
  
  /* private */ var rmdirBase: Any = js.native
  
  def rmdirSync(path: PathLike): Unit = js.native
  def rmdirSync(path: PathLike, options: IRmdirOptions): Unit = js.native
  
  var root: Link = js.native
  
  def stat(path: PathLike, callback: TCallback[default[TStatNumber]]): Unit = js.native
  def stat(path: PathLike, options: IStatOptions, callback: TCallback[default[TStatNumber]]): Unit = js.native
  
  /* private */ var statBase: Any = js.native
  
  def statSync(path: PathLike): default[Double] = js.native
  def statSync(path: PathLike, options: Bigint): default[Double] = js.native
  def statSync(path: PathLike, options: BigintThrowIfNoEntry): default[js.BigInt] = js.native
  def statSync(path: PathLike, options: ThrowIfNoEntry): default[Double] = js.native
  def statSync(path: PathLike, options: `0`): js.UndefOr[default[Double]] = js.native
  def statSync(path: PathLike, options: `1`): js.UndefOr[default[Double]] = js.native
  def statSync(path: PathLike, options: `2`): js.UndefOr[default[js.BigInt]] = js.native
  
  /* private */ var statWatchers: Any = js.native
  
  def symlink(target: PathLike, path: PathLike, callback: TCallback[Unit]): Any = js.native
  def symlink(target: PathLike, path: PathLike, `type`: Type, callback: TCallback[Unit]): Any = js.native
  
  /* private */ var symlinkBase: Any = js.native
  
  def symlinkSync(target: PathLike, path: PathLike): Unit = js.native
  def symlinkSync(target: PathLike, path: PathLike, `type`: Type): Unit = js.native
  
  def toJSON(): DirectoryJSON = js.native
  def toJSON(paths: js.Array[PathLike]): DirectoryJSON = js.native
  def toJSON(paths: js.Array[PathLike], json: js.Object): DirectoryJSON = js.native
  def toJSON(paths: js.Array[PathLike], json: js.Object, isRelative: Boolean): DirectoryJSON = js.native
  def toJSON(paths: js.Array[PathLike], json: Unit, isRelative: Boolean): DirectoryJSON = js.native
  def toJSON(paths: Unit, json: js.Object): DirectoryJSON = js.native
  def toJSON(paths: Unit, json: js.Object, isRelative: Boolean): DirectoryJSON = js.native
  def toJSON(paths: Unit, json: Unit, isRelative: Boolean): DirectoryJSON = js.native
  def toJSON(paths: PathLike): DirectoryJSON = js.native
  def toJSON(paths: PathLike, json: js.Object): DirectoryJSON = js.native
  def toJSON(paths: PathLike, json: js.Object, isRelative: Boolean): DirectoryJSON = js.native
  def toJSON(paths: PathLike, json: Unit, isRelative: Boolean): DirectoryJSON = js.native
  
  def truncate(id: TFileId, callback: TCallback[Unit]): Any = js.native
  def truncate(id: TFileId, len: Double, callback: TCallback[Unit]): Any = js.native
  
  /* private */ var truncateBase: Any = js.native
  
  def truncateSync(id: TFileId): Unit = js.native
  def truncateSync(id: TFileId, len: Double): Unit = js.native
  
  def unlink(path: PathLike, callback: TCallback[Unit]): Unit = js.native
  
  /* private */ var unlinkBase: Any = js.native
  
  def unlinkSync(path: PathLike): Unit = js.native
  
  def unwatchFile(path: PathLike): Unit = js.native
  def unwatchFile(
    path: PathLike,
    listener: js.Function2[/* curr */ default[TStatNumber], /* prev */ default[TStatNumber], Unit]
  ): Unit = js.native
  
  def utimes(path: PathLike, atime: TTime, mtime: TTime, callback: TCallback[Unit]): Unit = js.native
  
  /* private */ var utimesBase: Any = js.native
  
  def utimesSync(path: PathLike, atime: TTime, mtime: TTime): Unit = js.native
  
  def watch(path: PathLike): FSWatcher = js.native
  def watch(path: PathLike, options: String): FSWatcher = js.native
  def watch(
    path: PathLike,
    options: String,
    listener: js.Function2[/* eventType */ String, /* filename */ String, Unit]
  ): FSWatcher = js.native
  def watch(
    path: PathLike,
    options: Unit,
    listener: js.Function2[/* eventType */ String, /* filename */ String, Unit]
  ): FSWatcher = js.native
  def watch(path: PathLike, options: IWatchOptions): FSWatcher = js.native
  def watch(
    path: PathLike,
    options: IWatchOptions,
    listener: js.Function2[/* eventType */ String, /* filename */ String, Unit]
  ): FSWatcher = js.native
  
  def watchFile(
    path: PathLike,
    listener: js.Function2[/* curr */ default[TStatNumber], /* prev */ default[TStatNumber], Unit]
  ): StatWatcher = js.native
  def watchFile(
    path: PathLike,
    options: IWatchFileOptions,
    listener: js.Function2[/* curr */ default[TStatNumber], /* prev */ default[TStatNumber], Unit]
  ): StatWatcher = js.native
  
  /**
    * @todo This is not used anymore. Remove.
    */
  /* private */ var wrapAsync: Any = js.native
  
  def write(fd: Double, buffer: js.typedarray.Uint8Array, callback: js.Function1[/* repeated */ Any, Unit]): Any = js.native
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Double,
    callback: js.Function1[/* repeated */ Any, Unit]
  ): Any = js.native
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Double,
    length: Double,
    callback: js.Function1[/* repeated */ Any, Unit]
  ): Any = js.native
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function1[/* repeated */ Any, Unit]
  ): Any = js.native
  def write(fd: Double, buffer: Buffer, callback: js.Function1[/* repeated */ Any, Unit]): Any = js.native
  def write(fd: Double, buffer: Buffer, offset: Double, callback: js.Function1[/* repeated */ Any, Unit]): Any = js.native
  def write(
    fd: Double,
    buffer: Buffer,
    offset: Double,
    length: Double,
    callback: js.Function1[/* repeated */ Any, Unit]
  ): Any = js.native
  def write(
    fd: Double,
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function1[/* repeated */ Any, Unit]
  ): Any = js.native
  def write(fd: Double, str: String, callback: js.Function1[/* repeated */ Any, Unit]): Any = js.native
  def write(fd: Double, str: String, position: Double, callback: js.Function1[/* repeated */ Any, Unit]): Any = js.native
  def write(
    fd: Double,
    str: String,
    position: Double,
    encoding: BufferEncoding,
    callback: js.Function1[/* repeated */ Any, Unit]
  ): Any = js.native
  
  /* private */ var writeBase: Any = js.native
  
  def writeFile(id: TFileId, data: TData, callback: TCallback[Unit]): Any = js.native
  def writeFile(id: TFileId, data: TData, options: String, callback: TCallback[Unit]): Any = js.native
  def writeFile(id: TFileId, data: TData, options: IWriteFileOptions, callback: TCallback[Unit]): Any = js.native
  
  /* private */ var writeFileBase: Any = js.native
  
  def writeFileSync(id: TFileId, data: TData): Unit = js.native
  def writeFileSync(id: TFileId, data: TData, options: IWriteFileOptions): Unit = js.native
  
  def writeSync(fd: Double, buffer: js.typedarray.Uint8Array): Double = js.native
  def writeSync(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double): Double = js.native
  def writeSync(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double, length: Double): Double = js.native
  def writeSync(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double, length: Double, position: Double): Double = js.native
  def writeSync(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double, length: Unit, position: Double): Double = js.native
  def writeSync(fd: Double, buffer: js.typedarray.Uint8Array, offset: Unit, length: Double): Double = js.native
  def writeSync(fd: Double, buffer: js.typedarray.Uint8Array, offset: Unit, length: Double, position: Double): Double = js.native
  def writeSync(fd: Double, buffer: js.typedarray.Uint8Array, offset: Unit, length: Unit, position: Double): Double = js.native
  def writeSync(fd: Double, buffer: Buffer): Double = js.native
  def writeSync(fd: Double, buffer: Buffer, offset: Double): Double = js.native
  def writeSync(fd: Double, buffer: Buffer, offset: Double, length: Double): Double = js.native
  def writeSync(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): Double = js.native
  def writeSync(fd: Double, buffer: Buffer, offset: Double, length: Unit, position: Double): Double = js.native
  def writeSync(fd: Double, buffer: Buffer, offset: Unit, length: Double): Double = js.native
  def writeSync(fd: Double, buffer: Buffer, offset: Unit, length: Double, position: Double): Double = js.native
  def writeSync(fd: Double, buffer: Buffer, offset: Unit, length: Unit, position: Double): Double = js.native
  def writeSync(fd: Double, str: String): Double = js.native
  def writeSync(fd: Double, str: String, position: Double): Double = js.native
  def writeSync(fd: Double, str: String, position: Double, encoding: BufferEncoding): Double = js.native
  def writeSync(fd: Double, str: String, position: Unit, encoding: BufferEncoding): Double = js.native
}
/* static members */
object Volume {
  
  @JSImport("memfs/lib/volume", "Volume")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Global file descriptor counter. UNIX file descriptors start from 0 and go sequentially
    * up, so here, in order not to conflict with them, we choose some big number and descrease
    * the file descriptor of every new opened file.
    * @type {number}
    * @todo This should not be static, right?
    */
  @JSImport("memfs/lib/volume", "Volume.fd")
  @js.native
  def fd: Double = js.native
  inline def fd_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fd")(x.asInstanceOf[js.Any])
  
  inline def fromJSON(json: DirectoryJSON): Volume = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[Volume]
  inline def fromJSON(json: DirectoryJSON, cwd: String): Volume = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[Volume]
  
  inline def fromNestedJSON(json: NestedDirectoryJSON): Volume = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNestedJSON")(json.asInstanceOf[js.Any]).asInstanceOf[Volume]
  inline def fromNestedJSON(json: NestedDirectoryJSON, cwd: String): Volume = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNestedJSON")(json.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[Volume]
}
