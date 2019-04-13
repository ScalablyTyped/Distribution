package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteFileResponseCommitAuthor extends js.Object {
  var date: java.lang.String
  var email: java.lang.String
  var name: java.lang.String
}

object ReposDeleteFileResponseCommitAuthor {
  @scala.inline
  def apply(date: java.lang.String, email: java.lang.String, name: java.lang.String): ReposDeleteFileResponseCommitAuthor = {
    val __obj = js.Dynamic.literal(date = date, email = email, name = name)
  
    __obj.asInstanceOf[ReposDeleteFileResponseCommitAuthor]
  }
}

