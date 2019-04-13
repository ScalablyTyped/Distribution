package typings
package openpgpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Comment extends js.Object {
  var comment: java.lang.String
  var email: java.lang.String
  var name: java.lang.String
}

object Anon_Comment {
  @scala.inline
  def apply(comment: java.lang.String, email: java.lang.String, name: java.lang.String): Anon_Comment = {
    val __obj = js.Dynamic.literal(comment = comment, email = email, name = name)
  
    __obj.asInstanceOf[Anon_Comment]
  }
}

