package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document
  extends IdentifiedDocument
     with RevisionedDocument

object Document {
  @scala.inline
  def apply(_id: java.lang.String, _rev: java.lang.String): Document = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_id")(_id)
    __obj.updateDynamic("_rev")(_rev)
    __obj.asInstanceOf[Document]
  }
}

