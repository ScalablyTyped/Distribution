package typings.nodeDashMailjet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email extends js.Object {
  var Email: String
  var Name: String
}

object Anon_Email {
  @scala.inline
  def apply(Email: String, Name: String): Anon_Email = {
    val __obj = js.Dynamic.literal(Email = Email, Name = Name)
  
    __obj.asInstanceOf[Anon_Email]
  }
}

