package typings.naverDashWhale.whale.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookmarkReorderInfo extends js.Object {
  var childIds: js.Array[String]
}

object BookmarkReorderInfo {
  @scala.inline
  def apply(childIds: js.Array[String]): BookmarkReorderInfo = {
    val __obj = js.Dynamic.literal(childIds = childIds)
  
    __obj.asInstanceOf[BookmarkReorderInfo]
  }
}

