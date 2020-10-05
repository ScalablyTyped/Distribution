package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @experimental
  */
@js.native
trait EntryPreview extends js.Object {
  /**
    * Preview of the key. Specified for map-like collection entries.
    */
  var key: js.UndefOr[ObjectPreview] = js.native
  /**
    * Preview of the value.
    */
  var value: ObjectPreview = js.native
}

object EntryPreview {
  @scala.inline
  def apply(value: ObjectPreview): EntryPreview = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryPreview]
  }
  @scala.inline
  implicit class EntryPreviewOps[Self <: EntryPreview] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setValue(value: ObjectPreview): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: ObjectPreview): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
  
}

