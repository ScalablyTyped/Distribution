package typings.nodeDownloaderHelper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePaths extends js.Object {
   // modified path name
  var fileName: String
  var path: String
   // original path name
  var prevFileName: String
   // modified file name
  var prevPath: String
}

object FilePaths {
  @scala.inline
  def apply(fileName: String, path: String, prevFileName: String, prevPath: String): FilePaths = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], prevFileName = prevFileName.asInstanceOf[js.Any], prevPath = prevPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePaths]
  }
}

