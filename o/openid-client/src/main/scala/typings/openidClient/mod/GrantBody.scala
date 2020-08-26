package typings.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrantBody
  extends /* key */ StringDictionary[js.Any] {
  var grant_type: String = js.native
}

object GrantBody {
  @scala.inline
  def apply(grant_type: String): GrantBody = {
    val __obj = js.Dynamic.literal(grant_type = grant_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrantBody]
  }
  @scala.inline
  implicit class GrantBodyOps[Self <: GrantBody] (val x: Self) extends AnyVal {
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
    def setGrant_type(value: String): Self = this.set("grant_type", value.asInstanceOf[js.Any])
  }
  
}

