package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateFileResponseCommitAuthor extends js.Object {
  var date: java.lang.String
  var email: java.lang.String
  var name: java.lang.String
}

object ReposCreateFileResponseCommitAuthor {
  @scala.inline
  def apply(date: java.lang.String, email: java.lang.String, name: java.lang.String): ReposCreateFileResponseCommitAuthor = {
    val __obj = js.Dynamic.literal(date = date, email = email, name = name)
  
    __obj.asInstanceOf[ReposCreateFileResponseCommitAuthor]
  }
}

