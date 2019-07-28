package typings.plugapi.plugapiMod.UserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Default extends js.Object {
  var avatarID: String
  var language: String
  var username: String
}

object Default {
  @scala.inline
  def apply(avatarID: String, language: String, username: String): Default = {
    val __obj = js.Dynamic.literal(avatarID = avatarID, language = language, username = username)
  
    __obj.asInstanceOf[Default]
  }
}

