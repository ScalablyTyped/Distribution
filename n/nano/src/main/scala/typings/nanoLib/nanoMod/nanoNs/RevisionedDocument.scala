package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevisionedDocument extends js.Object {
  var _rev: java.lang.String
}

object RevisionedDocument {
  @scala.inline
  def apply(_rev: java.lang.String): RevisionedDocument = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_rev")(_rev)
    __obj.asInstanceOf[RevisionedDocument]
  }
}

