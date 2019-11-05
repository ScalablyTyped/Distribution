package typings.ncp.ncpMod

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
    val __obj = js.Dynamic.literal(atime = atime, mode = mode, mtime = mtime, name = name)
  
    __obj.asInstanceOf[File]
  }
}

