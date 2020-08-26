package typings.passportApple.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecodedIdToken
  extends /* key */ StringDictionary[js.Any] {
  var sub: String = js.native
}

object DecodedIdToken {
  @scala.inline
  def apply(sub: String): DecodedIdToken = {
    val __obj = js.Dynamic.literal(sub = sub.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodedIdToken]
  }
  @scala.inline
  implicit class DecodedIdTokenOps[Self <: DecodedIdToken] (val x: Self) extends AnyVal {
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
    def setSub(value: String): Self = this.set("sub", value.asInstanceOf[js.Any])
  }
  
}

