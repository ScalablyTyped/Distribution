package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetContentsResponseItemLinks extends js.Object {
  var git: String
  var html: String
  var self: String
}

object ReposGetContentsResponseItemLinks {
  @scala.inline
  def apply(git: String, html: String, self: String): ReposGetContentsResponseItemLinks = {
    val __obj = js.Dynamic.literal(git = git, html = html, self = self)
  
    __obj.asInstanceOf[ReposGetContentsResponseItemLinks]
  }
}

