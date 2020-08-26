package typings.openfin.mainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntentMetadata extends js.Object {
  /**
    * The human-readable name of the intent.
    */
  var displayName: String = js.native
  /**
    * The machine readable name of the intent.
    */
  var name: String = js.native
}

object IntentMetadata {
  @scala.inline
  def apply(displayName: String, name: String): IntentMetadata = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentMetadata]
  }
  @scala.inline
  implicit class IntentMetadataOps[Self <: IntentMetadata] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

