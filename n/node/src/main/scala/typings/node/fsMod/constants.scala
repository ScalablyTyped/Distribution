package typings.node.fsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constants {
  
  // File Copy Constants
  /** Constant for fs.copyFile. Flag indicating the destination file should not be overwritten if it already exists. */
  @JSImport("fs", "constants.COPYFILE_EXCL")
  @js.native
  val COPYFILE_EXCL: Double = js.native
  
  /**
    * Constant for fs.copyFile. copy operation will attempt to create a copy-on-write reflink.
    * If the underlying platform does not support copy-on-write, then a fallback copy mechanism is used.
    */
  @JSImport("fs", "constants.COPYFILE_FICLONE")
  @js.native
  val COPYFILE_FICLONE: Double = js.native
  
  /**
    * Constant for fs.copyFile. Copy operation will attempt to create a copy-on-write reflink.
    * If the underlying platform does not support copy-on-write, then the operation will fail with an error.
    */
  @JSImport("fs", "constants.COPYFILE_FICLONE_FORCE")
  @js.native
  val COPYFILE_FICLONE_FORCE: Double = js.native
  
  // File Access Constants
  /** Constant for fs.access(). File is visible to the calling process. */
  @JSImport("fs", "constants.F_OK")
  @js.native
  val F_OK: Double = js.native
  
  /** Constant for fs.open(). Flag indicating that data will be appended to the end of the file. */
  @JSImport("fs", "constants.O_APPEND")
  @js.native
  val O_APPEND: Double = js.native
  
  /** Constant for fs.open(). Flag indicating to create the file if it does not already exist. */
  @JSImport("fs", "constants.O_CREAT")
  @js.native
  val O_CREAT: Double = js.native
  
  /** Constant for fs.open(). When set, an attempt will be made to minimize caching effects of file I/O. */
  @JSImport("fs", "constants.O_DIRECT")
  @js.native
  val O_DIRECT: Double = js.native
  
  /** Constant for fs.open(). Flag indicating that the open should fail if the path is not a directory. */
  @JSImport("fs", "constants.O_DIRECTORY")
  @js.native
  val O_DIRECTORY: Double = js.native
  
  /** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O with write operations waiting for data integrity. */
  @JSImport("fs", "constants.O_DSYNC")
  @js.native
  val O_DSYNC: Double = js.native
  
  /** Constant for fs.open(). Flag indicating that opening a file should fail if the O_CREAT flag is set and the file already exists. */
  @JSImport("fs", "constants.O_EXCL")
  @js.native
  val O_EXCL: Double = js.native
  
  /**
    * constant for fs.open().
    * Flag indicating reading accesses to the file system will no longer result in
    * an update to the atime information associated with the file.
    * This flag is available on Linux operating systems only.
    */
  @JSImport("fs", "constants.O_NOATIME")
  @js.native
  val O_NOATIME: Double = js.native
  
  /**
    * Constant for fs.open(). Flag indicating that if path identifies a terminal device,
    * opening the path shall not cause that terminal to become the controlling terminal for the process
    * (if the process does not already have one).
    */
  @JSImport("fs", "constants.O_NOCTTY")
  @js.native
  val O_NOCTTY: Double = js.native
  
  /** Constant for fs.open(). Flag indicating that the open should fail if the path is a symbolic link. */
  @JSImport("fs", "constants.O_NOFOLLOW")
  @js.native
  val O_NOFOLLOW: Double = js.native
  
  /** Constant for fs.open(). Flag indicating to open the file in nonblocking mode when possible. */
  @JSImport("fs", "constants.O_NONBLOCK")
  @js.native
  val O_NONBLOCK: Double = js.native
  
  // File Open Constants
  /** Constant for fs.open(). Flag indicating to open a file for read-only access. */
  @JSImport("fs", "constants.O_RDONLY")
  @js.native
  val O_RDONLY: Double = js.native
  
  /** Constant for fs.open(). Flag indicating to open a file for read-write access. */
  @JSImport("fs", "constants.O_RDWR")
  @js.native
  val O_RDWR: Double = js.native
  
  /** Constant for fs.open(). Flag indicating to open the symbolic link itself rather than the resource it is pointing to. */
  @JSImport("fs", "constants.O_SYMLINK")
  @js.native
  val O_SYMLINK: Double = js.native
  
  /** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O. */
  @JSImport("fs", "constants.O_SYNC")
  @js.native
  val O_SYNC: Double = js.native
  
  /** Constant for fs.open(). Flag indicating that if the file exists and is a regular file, and the file is opened successfully for write access, its length shall be truncated to zero. */
  @JSImport("fs", "constants.O_TRUNC")
  @js.native
  val O_TRUNC: Double = js.native
  
  /** Constant for fs.open(). Flag indicating to open a file for write-only access. */
  @JSImport("fs", "constants.O_WRONLY")
  @js.native
  val O_WRONLY: Double = js.native
  
  /** Constant for fs.access(). File can be read by the calling process. */
  @JSImport("fs", "constants.R_OK")
  @js.native
  val R_OK: Double = js.native
  
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a block-oriented device file. */
  @JSImport("fs", "constants.S_IFBLK")
  @js.native
  val S_IFBLK: Double = js.native
  
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a character-oriented device file. */
  @JSImport("fs", "constants.S_IFCHR")
  @js.native
  val S_IFCHR: Double = js.native
  
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a directory. */
  @JSImport("fs", "constants.S_IFDIR")
  @js.native
  val S_IFDIR: Double = js.native
  
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a FIFO/pipe. */
  @JSImport("fs", "constants.S_IFIFO")
  @js.native
  val S_IFIFO: Double = js.native
  
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a symbolic link. */
  @JSImport("fs", "constants.S_IFLNK")
  @js.native
  val S_IFLNK: Double = js.native
  
  // File Type Constants
  /** Constant for fs.Stats mode property for determining a file's type. Bit mask used to extract the file type code. */
  @JSImport("fs", "constants.S_IFMT")
  @js.native
  val S_IFMT: Double = js.native
  
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a regular file. */
  @JSImport("fs", "constants.S_IFREG")
  @js.native
  val S_IFREG: Double = js.native
  
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a socket. */
  @JSImport("fs", "constants.S_IFSOCK")
  @js.native
  val S_IFSOCK: Double = js.native
  
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by group. */
  @JSImport("fs", "constants.S_IRGRP")
  @js.native
  val S_IRGRP: Double = js.native
  
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by others. */
  @JSImport("fs", "constants.S_IROTH")
  @js.native
  val S_IROTH: Double = js.native
  
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by owner. */
  @JSImport("fs", "constants.S_IRUSR")
  @js.native
  val S_IRUSR: Double = js.native
  
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by group. */
  @JSImport("fs", "constants.S_IRWXG")
  @js.native
  val S_IRWXG: Double = js.native
  
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by others. */
  @JSImport("fs", "constants.S_IRWXO")
  @js.native
  val S_IRWXO: Double = js.native
  
  // File Mode Constants
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by owner. */
  @JSImport("fs", "constants.S_IRWXU")
  @js.native
  val S_IRWXU: Double = js.native
  
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by group. */
  @JSImport("fs", "constants.S_IWGRP")
  @js.native
  val S_IWGRP: Double = js.native
  
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by others. */
  @JSImport("fs", "constants.S_IWOTH")
  @js.native
  val S_IWOTH: Double = js.native
  
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by owner. */
  @JSImport("fs", "constants.S_IWUSR")
  @js.native
  val S_IWUSR: Double = js.native
  
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by group. */
  @JSImport("fs", "constants.S_IXGRP")
  @js.native
  val S_IXGRP: Double = js.native
  
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by others. */
  @JSImport("fs", "constants.S_IXOTH")
  @js.native
  val S_IXOTH: Double = js.native
  
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by owner. */
  @JSImport("fs", "constants.S_IXUSR")
  @js.native
  val S_IXUSR: Double = js.native
  
  /**
    * When set, a memory file mapping is used to access the file. This flag
    * is available on Windows operating systems only. On other operating systems,
    * this flag is ignored.
    */
  @JSImport("fs", "constants.UV_FS_O_FILEMAP")
  @js.native
  val UV_FS_O_FILEMAP: Double = js.native
  
  /** Constant for fs.access(). File can be written by the calling process. */
  @JSImport("fs", "constants.W_OK")
  @js.native
  val W_OK: Double = js.native
  
  /** Constant for fs.access(). File can be executed by the calling process. */
  @JSImport("fs", "constants.X_OK")
  @js.native
  val X_OK: Double = js.native
}
