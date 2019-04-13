package typings
package plugapiLib.plugapiMod.UserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Default extends js.Object {
  var avatarID: java.lang.String
  var language: java.lang.String
  var username: java.lang.String
}

object Default {
  @scala.inline
  def apply(avatarID: java.lang.String, language: java.lang.String, username: java.lang.String): Default = {
    val __obj = js.Dynamic.literal(avatarID = avatarID, language = language, username = username)
  
    __obj.asInstanceOf[Default]
  }
}

