package typings.phantom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageId extends js.Object {
  var pageId: String
}

object PageId {
  @scala.inline
  def apply(pageId: String): PageId = {
    val __obj = js.Dynamic.literal(pageId = pageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageId]
  }
}

