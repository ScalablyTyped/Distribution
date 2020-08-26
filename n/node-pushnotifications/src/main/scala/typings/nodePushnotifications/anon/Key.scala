package typings.nodePushnotifications.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Key extends js.Object {
  /**
    * The filename of the provider token key (as supplied by Apple) to load from disk, or a
    * Buffer/String containing the key data.
    */
  var key: js.UndefOr[Buffer | String] = js.native
  /** The ID of the key issued by Apple */
  var keyId: js.UndefOr[String] = js.native
  /** ID of the team associated with the provider token key */
  var teamId: js.UndefOr[String] = js.native
}

object Key {
  @scala.inline
  def apply(): Key = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Key]
  }
  @scala.inline
  implicit class KeyOps[Self <: Key] (val x: Self) extends AnyVal {
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
    def setKey(value: Buffer | String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setKeyId(value: String): Self = this.set("keyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyId: Self = this.set("keyId", js.undefined)
    @scala.inline
    def setTeamId(value: String): Self = this.set("teamId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeamId: Self = this.set("teamId", js.undefined)
  }
  
}

