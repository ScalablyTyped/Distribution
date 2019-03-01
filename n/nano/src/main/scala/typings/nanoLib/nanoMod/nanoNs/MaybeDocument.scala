package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaybeDocument
  extends MaybeIdentifiedDocument
     with MaybeRevisionedDocument

object MaybeDocument {
  @scala.inline
  def apply(_id: java.lang.String = null, _rev: java.lang.String = null): MaybeDocument = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_rev != null) __obj.updateDynamic("_rev")(_rev)
    __obj.asInstanceOf[MaybeDocument]
  }
}

