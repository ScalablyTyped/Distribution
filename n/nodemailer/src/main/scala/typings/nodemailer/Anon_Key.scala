package typings.nodemailer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var key: String
  var passphrase: String
}

object Anon_Key {
  @scala.inline
  def apply(key: String, passphrase: String): Anon_Key = {
    val __obj = js.Dynamic.literal(key = key, passphrase = passphrase)
  
    __obj.asInstanceOf[Anon_Key]
  }
}

