package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Starredat extends js.Object {
  var starred_at: String = js.native
  var user: Avatarurl = js.native
}

object Starredat {
  @scala.inline
  def apply(starred_at: String, user: Avatarurl): Starredat = {
    val __obj = js.Dynamic.literal(starred_at = starred_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Starredat]
  }
  @scala.inline
  implicit class StarredatOps[Self <: Starredat] (val x: Self) extends AnyVal {
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
    def setStarred_at(value: String): Self = this.set("starred_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: Avatarurl): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

