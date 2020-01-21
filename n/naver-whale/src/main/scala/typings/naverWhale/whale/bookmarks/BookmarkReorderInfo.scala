package typings.naverWhale.whale.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookmarkReorderInfo extends js.Object {
  var childIds: js.Array[String]
}

object BookmarkReorderInfo {
  @scala.inline
  def apply(childIds: js.Array[String]): BookmarkReorderInfo = {
    val __obj = js.Dynamic.literal(childIds = childIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BookmarkReorderInfo]
  }
}

