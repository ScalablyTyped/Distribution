package typings.nano.nanoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevisionedDocument extends js.Object {
  var _rev: String
}

object RevisionedDocument {
  @scala.inline
  def apply(_rev: String): RevisionedDocument = {
    val __obj = js.Dynamic.literal(_rev = _rev.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RevisionedDocument]
  }
}

