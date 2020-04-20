package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 描述文件状态的对象 */
trait Stats extends js.Object {
  /** 文件最近一次被存取或被执行的时间，UNIX 时间戳，对应 POSIX stat.st_atime */
  var lastAccessedTime: Double
  /** 文件最后一次被修改的时间，UNIX 时间戳，对应 POSIX stat.st_mtime */
  var lastModifiedTime: Double
  /** 文件的类型和存取的权限，对应 POSIX stat.st_mode */
  var mode: String
  /** 文件大小，单位：B，对应 POSIX stat.st_size */
  var size: Double
  /** [boolean Stats.isDirectory()](Stats.isDirectory.md)
    *
    * 判断当前文件是否一个目录 */
  def isDirectory(): Boolean
  /** [boolean Stats.isFile()](Stats.isFile.md)
    *
    * 判断当前文件是否一个普通文件 */
  def isFile(): Boolean
}

object Stats {
  @scala.inline
  def apply(
    isDirectory: () => Boolean,
    isFile: () => Boolean,
    lastAccessedTime: Double,
    lastModifiedTime: Double,
    mode: String,
    size: Double
  ): Stats = {
    val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction0(isDirectory), isFile = js.Any.fromFunction0(isFile), lastAccessedTime = lastAccessedTime.asInstanceOf[js.Any], lastModifiedTime = lastModifiedTime.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
}

