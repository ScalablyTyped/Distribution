package typings.node.inspectorMod.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @experimental
  */
trait EntryPreview extends js.Object {
  /**
    * Preview of the key. Specified for map-like collection entries.
    */
  var key: js.UndefOr[ObjectPreview] = js.undefined
  /**
    * Preview of the value.
    */
  var value: ObjectPreview
}

object EntryPreview {
  @scala.inline
  def apply(value: ObjectPreview, key: ObjectPreview = null): EntryPreview = {
    val __obj = js.Dynamic.literal(value = value)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[EntryPreview]
  }
}

