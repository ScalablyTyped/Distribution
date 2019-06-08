package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateOrUpdateFileResponseContentLinks extends js.Object {
  var git: java.lang.String
  var html: java.lang.String
  var self: java.lang.String
}

object ReposCreateOrUpdateFileResponseContentLinks {
  @scala.inline
  def apply(git: java.lang.String, html: java.lang.String, self: java.lang.String): ReposCreateOrUpdateFileResponseContentLinks = {
    val __obj = js.Dynamic.literal(git = git, html = html, self = self)
  
    __obj.asInstanceOf[ReposCreateOrUpdateFileResponseContentLinks]
  }
}

