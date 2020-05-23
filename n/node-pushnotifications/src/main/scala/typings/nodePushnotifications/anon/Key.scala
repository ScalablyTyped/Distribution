package typings.nodePushnotifications.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  /**
    * The filename of the provider token key (as supplied by Apple) to load from disk, or a
    * Buffer/String containing the key data.
    */
  var key: js.UndefOr[Buffer | String] = js.undefined
  /** The ID of the key issued by Apple */
  var keyId: js.UndefOr[String] = js.undefined
  /** ID of the team associated with the provider token key */
  var teamId: js.UndefOr[String] = js.undefined
}

object Key {
  @scala.inline
  def apply(key: Buffer | String = null, keyId: String = null, teamId: String = null): Key = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keyId != null) __obj.updateDynamic("keyId")(keyId.asInstanceOf[js.Any])
    if (teamId != null) __obj.updateDynamic("teamId")(teamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}

