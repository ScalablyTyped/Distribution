package typings.openfin.mainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntentMetadata extends js.Object {
  /**
    * The human-readable name of the intent.
    */
  var displayName: String
  /**
    * The machine readable name of the intent.
    */
  var name: String
}

object IntentMetadata {
  @scala.inline
  def apply(displayName: String, name: String): IntentMetadata = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentMetadata]
  }
}

