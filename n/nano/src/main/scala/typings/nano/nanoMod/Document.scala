package typings.nano.nanoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document
  extends IdentifiedDocument
     with RevisionedDocument

object Document {
  @scala.inline
  def apply(_id: String, _rev: String): Document = {
    val __obj = js.Dynamic.literal(_id = _id, _rev = _rev)
  
    __obj.asInstanceOf[Document]
  }
}

