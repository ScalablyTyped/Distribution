package typings.mongodb.anon

import typings.mongodb.mod.ClientSession
import typings.mongodb.mod.ReadPreferenceOrMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadPreference extends js.Object {
  var readPreference: ReadPreferenceOrMode = js.native
  var session: js.UndefOr[ClientSession] = js.native
}

object ReadPreference {
  @scala.inline
  def apply(readPreference: ReadPreferenceOrMode): ReadPreference = {
    val __obj = js.Dynamic.literal(readPreference = readPreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadPreference]
  }
  @scala.inline
  implicit class ReadPreferenceOps[Self <: ReadPreference] (val x: Self) extends AnyVal {
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
    def setReadPreference(value: ReadPreferenceOrMode): Self = this.set("readPreference", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: ClientSession): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
  }
  
}

