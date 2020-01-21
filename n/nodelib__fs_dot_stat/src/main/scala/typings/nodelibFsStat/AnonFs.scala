package typings.nodelibFsStat

import typings.nodelibFsStat.fsMod.FileSystemAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFs extends js.Object {
  var fs: FileSystemAdapter
}

object AnonFs {
  @scala.inline
  def apply(fs: FileSystemAdapter): AnonFs = {
    val __obj = js.Dynamic.literal(fs = fs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFs]
  }
}

