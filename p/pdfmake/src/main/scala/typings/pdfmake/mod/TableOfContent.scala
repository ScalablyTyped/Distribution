package typings.pdfmake.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableOfContent extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var title: Content
}

object TableOfContent {
  @scala.inline
  def apply(title: Content, id: String = null): TableOfContent = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableOfContent]
  }
}

