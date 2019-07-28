package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateFileResponseCommitAuthor extends js.Object {
  var date: String
  var email: String
  var name: String
}

object ReposCreateFileResponseCommitAuthor {
  @scala.inline
  def apply(date: String, email: String, name: String): ReposCreateFileResponseCommitAuthor = {
    val __obj = js.Dynamic.literal(date = date, email = email, name = name)
  
    __obj.asInstanceOf[ReposCreateFileResponseCommitAuthor]
  }
}

