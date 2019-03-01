package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaybeRevisionedDocument extends js.Object {
  var _rev: js.UndefOr[java.lang.String] = js.undefined
}

object MaybeRevisionedDocument {
  @scala.inline
  def apply(_rev: java.lang.String = null): MaybeRevisionedDocument = {
    val __obj = js.Dynamic.literal()
    if (_rev != null) __obj.updateDynamic("_rev")(_rev)
    __obj.asInstanceOf[MaybeRevisionedDocument]
  }
}

