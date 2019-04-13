package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateCommitResponseAuthor extends js.Object {
  var date: java.lang.String
  var email: java.lang.String
  var name: java.lang.String
}

object GitCreateCommitResponseAuthor {
  @scala.inline
  def apply(date: java.lang.String, email: java.lang.String, name: java.lang.String): GitCreateCommitResponseAuthor = {
    val __obj = js.Dynamic.literal(date = date, email = email, name = name)
  
    __obj.asInstanceOf[GitCreateCommitResponseAuthor]
  }
}

