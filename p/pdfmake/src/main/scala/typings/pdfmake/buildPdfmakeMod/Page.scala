package typings.pdfmake.buildPdfmakeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page extends js.Object {
  var items: js.Array[_]
  var pageSize: Pagesize
}

object Page {
  @scala.inline
  def apply(items: js.Array[_], pageSize: Pagesize): Page = {
    val __obj = js.Dynamic.literal(items = items, pageSize = pageSize)
  
    __obj.asInstanceOf[Page]
  }
}

