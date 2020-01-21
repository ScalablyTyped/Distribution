package typings.ncp.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  /** Accessed time */
  var atime: Date
  var mode: Double
  /** Modified time */
  var mtime: Date
  var name: String
}

object File {
  @scala.inline
  def apply(atime: Date, mode: Double, mtime: Date, name: String): File = {
    val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[File]
  }
}

